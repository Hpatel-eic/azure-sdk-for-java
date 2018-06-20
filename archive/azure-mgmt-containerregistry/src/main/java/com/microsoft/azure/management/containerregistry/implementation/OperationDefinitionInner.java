/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.implementation;

import com.microsoft.azure.management.containerregistry.OperationDisplayDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of a container registry operation.
 */
public class OperationDefinitionInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display information for the container registry operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplayDefinition display;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display value.
     *
     * @return the display value
     */
    public OperationDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     * @return the OperationDefinitionInner object itself.
     */
    public OperationDefinitionInner withDisplay(OperationDisplayDefinition display) {
        this.display = display;
        return this;
    }

}