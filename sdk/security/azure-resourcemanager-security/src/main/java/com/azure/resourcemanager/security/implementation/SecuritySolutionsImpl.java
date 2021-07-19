// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SecuritySolutionsClient;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionInner;
import com.azure.resourcemanager.security.models.SecuritySolution;
import com.azure.resourcemanager.security.models.SecuritySolutions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SecuritySolutionsImpl implements SecuritySolutions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecuritySolutionsImpl.class);

    private final SecuritySolutionsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SecuritySolutionsImpl(
        SecuritySolutionsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecuritySolution> list() {
        PagedIterable<SecuritySolutionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecuritySolutionImpl(inner1, this.manager()));
    }

    public PagedIterable<SecuritySolution> list(Context context) {
        PagedIterable<SecuritySolutionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SecuritySolutionImpl(inner1, this.manager()));
    }

    public SecuritySolution get(String resourceGroupName, String ascLocation, String securitySolutionName) {
        SecuritySolutionInner inner = this.serviceClient().get(resourceGroupName, ascLocation, securitySolutionName);
        if (inner != null) {
            return new SecuritySolutionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecuritySolution> getWithResponse(
        String resourceGroupName, String ascLocation, String securitySolutionName, Context context) {
        Response<SecuritySolutionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, ascLocation, securitySolutionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecuritySolutionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SecuritySolutionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}