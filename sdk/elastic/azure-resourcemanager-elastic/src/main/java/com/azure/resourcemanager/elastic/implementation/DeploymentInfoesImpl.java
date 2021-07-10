// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.DeploymentInfoesClient;
import com.azure.resourcemanager.elastic.fluent.models.DeploymentInfoResponseInner;
import com.azure.resourcemanager.elastic.models.DeploymentInfoResponse;
import com.azure.resourcemanager.elastic.models.DeploymentInfoes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DeploymentInfoesImpl implements DeploymentInfoes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentInfoesImpl.class);

    private final DeploymentInfoesClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public DeploymentInfoesImpl(
        DeploymentInfoesClient innerClient, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DeploymentInfoResponse list(String resourceGroupName, String monitorName) {
        DeploymentInfoResponseInner inner = this.serviceClient().list(resourceGroupName, monitorName);
        if (inner != null) {
            return new DeploymentInfoResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentInfoResponse> listWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<DeploymentInfoResponseInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentInfoResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DeploymentInfoesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}