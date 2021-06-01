// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemOperationStatusesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemOperationStatuses;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectedItemOperationStatusesImpl implements ProtectedItemOperationStatuses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectedItemOperationStatusesImpl.class);

    private final ProtectedItemOperationStatusesClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectedItemOperationStatusesImpl(
        ProtectedItemOperationStatusesClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus get(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId) {
        OperationStatusInner inner =
            this
                .serviceClient()
                .get(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationStatus> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId,
        Context context) {
        Response<OperationStatusInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProtectedItemOperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}