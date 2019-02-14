/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for changing the size of a pool.
 */
public class PoolResizeParameter {
    /**
     * The desired number of dedicated compute nodes in the pool.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of low-priority compute nodes in the pool.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * The timeout for allocation of compute nodes to the pool or removal of
     * compute nodes from the pool.
     * The default value is 15 minutes. The minimum value is 5 minutes. If you
     * specify a value less than 5 minutes, the Batch service returns an error;
     * if you are calling the REST API directly, the HTTP status code is 400
     * (Bad Request).
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * Determines what to do with a node and its running task(s) if the pool
     * size is decreasing.
     * The default value is requeue. Possible values include: 'requeue',
     * 'terminate', 'taskCompletion', 'retainedData'.
     */
    @JsonProperty(value = "nodeDeallocationOption")
    private ComputeNodeDeallocationOption nodeDeallocationOption;

    /**
     * Get the targetDedicatedNodes value.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the targetDedicatedNodes value.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the PoolResizeParameter object itself.
     */
    public PoolResizeParameter withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the targetLowPriorityNodes value.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the targetLowPriorityNodes value.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the PoolResizeParameter object itself.
     */
    public PoolResizeParameter withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the default value is 15 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service returns an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the PoolResizeParameter object itself.
     */
    public PoolResizeParameter withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @return the nodeDeallocationOption value
     */
    public ComputeNodeDeallocationOption nodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the default value is requeue. Possible values include: 'requeue', 'terminate', 'taskCompletion', 'retainedData'.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     * @return the PoolResizeParameter object itself.
     */
    public PoolResizeParameter withNodeDeallocationOption(ComputeNodeDeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }

}
