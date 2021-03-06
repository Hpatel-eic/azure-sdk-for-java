/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupWorkloadItems;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.WorkloadItemResource;

class BackupWorkloadItemsImpl extends WrapperImpl<BackupWorkloadItemsInner> implements BackupWorkloadItems {
    private final RecoveryServicesManager manager;

    BackupWorkloadItemsImpl(RecoveryServicesManager manager) {
        super(manager.inner().backupWorkloadItems());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private WorkloadItemResourceImpl wrapModel(WorkloadItemResourceInner inner) {
        return  new WorkloadItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<WorkloadItemResource> listAsync(final String vaultName, final String resourceGroupName, final String fabricName, final String containerName) {
        BackupWorkloadItemsInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName, fabricName, containerName)
        .flatMapIterable(new Func1<Page<WorkloadItemResourceInner>, Iterable<WorkloadItemResourceInner>>() {
            @Override
            public Iterable<WorkloadItemResourceInner> call(Page<WorkloadItemResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkloadItemResourceInner, WorkloadItemResource>() {
            @Override
            public WorkloadItemResource call(WorkloadItemResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
