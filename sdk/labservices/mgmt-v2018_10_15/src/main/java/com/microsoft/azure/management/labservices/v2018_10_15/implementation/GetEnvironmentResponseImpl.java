/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import com.microsoft.azure.management.labservices.v2018_10_15.GetEnvironmentResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.labservices.v2018_10_15.EnvironmentDetails;

class GetEnvironmentResponseImpl extends WrapperImpl<GetEnvironmentResponseInner> implements GetEnvironmentResponse {
    private final LabServicesManager manager;
    GetEnvironmentResponseImpl(GetEnvironmentResponseInner inner, LabServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LabServicesManager manager() {
        return this.manager;
    }

    @Override
    public EnvironmentDetails environment() {
        return this.inner().environment();
    }

}
