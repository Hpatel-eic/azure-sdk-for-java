// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity.rntbd;

import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.CorruptedFrameException;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;

import static com.azure.cosmos.implementation.directconnectivity.rntbd.RntbdConstants.RntbdHeader;
import static com.azure.cosmos.implementation.guava27.Strings.lenientFormat;
import static com.google.common.base.Preconditions.checkNotNull;

@SuppressWarnings("UnstableApiUsage")
abstract class RntbdTokenStream<T extends Enum<T> & RntbdHeader> {

    final ByteBuf in;
    final Short2ObjectMap<T> headers;
    final Short2ObjectMap<RntbdToken> tokens;

    RntbdTokenStream(final ImmutableSet<T> headers, final Short2ObjectMap<T> ids, final ByteBuf in) {

        checkNotNull(headers, "headers");
        checkNotNull(ids, "ids");
        checkNotNull(in, "in");

        this.tokens = new Short2ObjectOpenHashMap<>(headers.size());
        for(T h: headers) {
            this.tokens.put(h.id(), RntbdToken.create(h));
        }

        this.headers = ids;
        this.in = in.retain();
    }

    final int computeCount() {

        int count = 0;

        for (final RntbdToken token : this.tokens.values()) {
            if (token.isPresent()) {
                ++count;
            }
        }

        return count;
    }

    final int computeLength() {

        int total = 0;

        for (final RntbdToken token : this.tokens.values()) {
            total += token.computeLength();
        }

        return total;
    }

    static <T extends RntbdTokenStream<?>> T decode(final T stream) {

        final ByteBuf in = stream.in;

        while (in.readableBytes() > 0) {

            final short id = in.readShortLE();
            final RntbdTokenType type = RntbdTokenType.fromId(in.readByte());

            RntbdToken token = stream.tokens.get(id);

            if (token == null) {
                token = RntbdToken.create(new UndefinedHeader(id, type));
            }

            token.decode(in);
        }

        for (final RntbdToken token : stream.tokens.values()) {
            if (!token.isPresent() && token.isRequired()) {
                final String message = lenientFormat("Required header not found on token stream: %s", token);
                throw new CorruptedFrameException(message);
            }
        }

        return stream;
    }

    final void encode(final ByteBuf out) {
        for (final RntbdToken token : this.tokens.values()) {
            token.encode(out);
        }
    }

    final RntbdToken get(final T header) {
        return this.tokens.get(header.id());
    }

    final void releaseBuffers() {
        for (final RntbdToken token : this.tokens.values()) {
            token.releaseBuffer();
        }
        in.release();
    }

    private static final class UndefinedHeader implements RntbdHeader {

        private final short id;
        private final RntbdTokenType type;

        UndefinedHeader(final short id, final RntbdTokenType type) {
            this.id = id;
            this.type = type;
        }

        @Override
        public boolean isRequired() {
            return false;
        }

        @Override
        public short id() {
            return this.id;
        }

        @Override
        public String name() {
            return "Undefined";
        }

        @Override
        public RntbdTokenType type() {
            return this.type;
        }
    }
}
