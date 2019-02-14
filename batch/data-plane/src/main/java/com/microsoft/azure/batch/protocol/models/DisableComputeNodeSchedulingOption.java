/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DisableComputeNodeSchedulingOption.
 */
public enum DisableComputeNodeSchedulingOption {
    /** Terminate running task processes and requeue the tasks. The tasks may run again on other compute nodes, or when task scheduling is re-enabled on this node. Enter offline state as soon as tasks have been terminated. */
    REQUEUE("requeue"),

    /** Terminate running tasks. The tasks will be completed with failureInfo indicating that they were terminated, and will not run again. Enter offline state as soon as tasks have been terminated. */
    TERMINATE("terminate"),

    /** Allow currently running tasks to complete. Schedule no new tasks while waiting. Enter offline state when all tasks have completed. */
    TASK_COMPLETION("taskcompletion");

    /** The actual serialized value for a DisableComputeNodeSchedulingOption instance. */
    private String value;

    DisableComputeNodeSchedulingOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DisableComputeNodeSchedulingOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DisableComputeNodeSchedulingOption object, or null if unable to parse.
     */
    @JsonCreator
    public static DisableComputeNodeSchedulingOption fromString(String value) {
        DisableComputeNodeSchedulingOption[] items = DisableComputeNodeSchedulingOption.values();
        for (DisableComputeNodeSchedulingOption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
