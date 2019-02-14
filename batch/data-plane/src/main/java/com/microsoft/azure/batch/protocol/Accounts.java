/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol;

import com.microsoft.azure.batch.protocol.models.AccountListNodeAgentSkusHeaders;
import com.microsoft.azure.batch.protocol.models.AccountListNodeAgentSkusNextOptions;
import com.microsoft.azure.batch.protocol.models.AccountListNodeAgentSkusOptions;
import com.microsoft.azure.batch.protocol.models.AccountListPoolNodeCountsHeaders;
import com.microsoft.azure.batch.protocol.models.AccountListPoolNodeCountsNextOptions;
import com.microsoft.azure.batch.protocol.models.AccountListPoolNodeCountsOptions;
import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.azure.batch.protocol.models.NodeAgentSku;
import com.microsoft.azure.batch.protocol.models.PoolNodeCounts;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Accounts.
 */
public interface Accounts {
    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeAgentSku&gt; object if successful.
     */
    PagedList<NodeAgentSku> listNodeAgentSkus();

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeAgentSku>> listNodeAgentSkusAsync(final ListOperationCallback<NodeAgentSku> serviceCallback);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<Page<NodeAgentSku>> listNodeAgentSkusAsync();

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeAgentSku>, AccountListNodeAgentSkusHeaders>> listNodeAgentSkusWithServiceResponseAsync();
    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param accountListNodeAgentSkusOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeAgentSku&gt; object if successful.
     */
    PagedList<NodeAgentSku> listNodeAgentSkus(final AccountListNodeAgentSkusOptions accountListNodeAgentSkusOptions);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param accountListNodeAgentSkusOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeAgentSku>> listNodeAgentSkusAsync(final AccountListNodeAgentSkusOptions accountListNodeAgentSkusOptions, final ListOperationCallback<NodeAgentSku> serviceCallback);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param accountListNodeAgentSkusOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<Page<NodeAgentSku>> listNodeAgentSkusAsync(final AccountListNodeAgentSkusOptions accountListNodeAgentSkusOptions);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param accountListNodeAgentSkusOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeAgentSku>, AccountListNodeAgentSkusHeaders>> listNodeAgentSkusWithServiceResponseAsync(final AccountListNodeAgentSkusOptions accountListNodeAgentSkusOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PoolNodeCounts&gt; object if successful.
     */
    PagedList<PoolNodeCounts> listPoolNodeCounts();

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PoolNodeCounts>> listPoolNodeCountsAsync(final ListOperationCallback<PoolNodeCounts> serviceCallback);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<Page<PoolNodeCounts>> listPoolNodeCountsAsync();

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<PoolNodeCounts>, AccountListPoolNodeCountsHeaders>> listPoolNodeCountsWithServiceResponseAsync();
    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param accountListPoolNodeCountsOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PoolNodeCounts&gt; object if successful.
     */
    PagedList<PoolNodeCounts> listPoolNodeCounts(final AccountListPoolNodeCountsOptions accountListPoolNodeCountsOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param accountListPoolNodeCountsOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PoolNodeCounts>> listPoolNodeCountsAsync(final AccountListPoolNodeCountsOptions accountListPoolNodeCountsOptions, final ListOperationCallback<PoolNodeCounts> serviceCallback);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param accountListPoolNodeCountsOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<Page<PoolNodeCounts>> listPoolNodeCountsAsync(final AccountListPoolNodeCountsOptions accountListPoolNodeCountsOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param accountListPoolNodeCountsOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<PoolNodeCounts>, AccountListPoolNodeCountsHeaders>> listPoolNodeCountsWithServiceResponseAsync(final AccountListPoolNodeCountsOptions accountListPoolNodeCountsOptions);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeAgentSku&gt; object if successful.
     */
    PagedList<NodeAgentSku> listNodeAgentSkusNext(final String nextPageLink);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeAgentSku>> listNodeAgentSkusNextAsync(final String nextPageLink, final ServiceFuture<List<NodeAgentSku>> serviceFuture, final ListOperationCallback<NodeAgentSku> serviceCallback);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<Page<NodeAgentSku>> listNodeAgentSkusNextAsync(final String nextPageLink);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeAgentSku>, AccountListNodeAgentSkusHeaders>> listNodeAgentSkusNextWithServiceResponseAsync(final String nextPageLink);
    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListNodeAgentSkusNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NodeAgentSku&gt; object if successful.
     */
    PagedList<NodeAgentSku> listNodeAgentSkusNext(final String nextPageLink, final AccountListNodeAgentSkusNextOptions accountListNodeAgentSkusNextOptions);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListNodeAgentSkusNextOptions Additional parameters for the operation
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<NodeAgentSku>> listNodeAgentSkusNextAsync(final String nextPageLink, final AccountListNodeAgentSkusNextOptions accountListNodeAgentSkusNextOptions, final ServiceFuture<List<NodeAgentSku>> serviceFuture, final ListOperationCallback<NodeAgentSku> serviceCallback);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListNodeAgentSkusNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<Page<NodeAgentSku>> listNodeAgentSkusNextAsync(final String nextPageLink, final AccountListNodeAgentSkusNextOptions accountListNodeAgentSkusNextOptions);

    /**
     * Lists all node agent SKUs supported by the Azure Batch service.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListNodeAgentSkusNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NodeAgentSku&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<NodeAgentSku>, AccountListNodeAgentSkusHeaders>> listNodeAgentSkusNextWithServiceResponseAsync(final String nextPageLink, final AccountListNodeAgentSkusNextOptions accountListNodeAgentSkusNextOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PoolNodeCounts&gt; object if successful.
     */
    PagedList<PoolNodeCounts> listPoolNodeCountsNext(final String nextPageLink);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PoolNodeCounts>> listPoolNodeCountsNextAsync(final String nextPageLink, final ServiceFuture<List<PoolNodeCounts>> serviceFuture, final ListOperationCallback<PoolNodeCounts> serviceCallback);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<Page<PoolNodeCounts>> listPoolNodeCountsNextAsync(final String nextPageLink);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<PoolNodeCounts>, AccountListPoolNodeCountsHeaders>> listPoolNodeCountsNextWithServiceResponseAsync(final String nextPageLink);
    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListPoolNodeCountsNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws BatchErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PoolNodeCounts&gt; object if successful.
     */
    PagedList<PoolNodeCounts> listPoolNodeCountsNext(final String nextPageLink, final AccountListPoolNodeCountsNextOptions accountListPoolNodeCountsNextOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListPoolNodeCountsNextOptions Additional parameters for the operation
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PoolNodeCounts>> listPoolNodeCountsNextAsync(final String nextPageLink, final AccountListPoolNodeCountsNextOptions accountListPoolNodeCountsNextOptions, final ServiceFuture<List<PoolNodeCounts>> serviceFuture, final ListOperationCallback<PoolNodeCounts> serviceCallback);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListPoolNodeCountsNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<Page<PoolNodeCounts>> listPoolNodeCountsNextAsync(final String nextPageLink, final AccountListPoolNodeCountsNextOptions accountListPoolNodeCountsNextOptions);

    /**
     * Gets the number of nodes in each state, grouped by pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param accountListPoolNodeCountsNextOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PoolNodeCounts&gt; object
     */
    Observable<ServiceResponseWithHeaders<Page<PoolNodeCounts>, AccountListPoolNodeCountsHeaders>> listPoolNodeCountsNextWithServiceResponseAsync(final String nextPageLink, final AccountListPoolNodeCountsNextOptions accountListPoolNodeCountsNextOptions);

}
