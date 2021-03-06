/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User identity details.
 */
public class UserIdentityContractInner {
    /**
     * Identity provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Identifier value within provider.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get identity provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set identity provider name.
     *
     * @param provider the provider value to set
     * @return the UserIdentityContractInner object itself.
     */
    public UserIdentityContractInner withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get identifier value within provider.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set identifier value within provider.
     *
     * @param id the id value to set
     * @return the UserIdentityContractInner object itself.
     */
    public UserIdentityContractInner withId(String id) {
        this.id = id;
        return this;
    }

}
