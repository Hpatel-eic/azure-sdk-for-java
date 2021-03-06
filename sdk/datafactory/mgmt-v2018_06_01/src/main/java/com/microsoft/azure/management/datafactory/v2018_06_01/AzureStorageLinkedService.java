/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * The storage account linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureStorageLinkedService.class)
@JsonTypeName("AzureStorage")
@JsonFlatten
public class AzureStorageLinkedService extends LinkedServiceInner {
    /**
     * The connection string. It is mutually exclusive with sasUri property.
     * Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /**
     * SAS URI of the Azure Storage resource. It is mutually exclusive with
     * connectionString property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.sasUri")
    private Object sasUri;

    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "typeProperties.sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Get the connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value
     */
    public AzureKeyVaultSecretReference accountKey() {
        return this.accountKey;
    }

    /**
     * Set the Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get sAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value
     */
    public Object sasUri() {
        return this.sasUri;
    }

    /**
     * Set sAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value
     */
    public AzureKeyVaultSecretReference sasToken() {
        return this.sasToken;
    }

    /**
     * Set the Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
