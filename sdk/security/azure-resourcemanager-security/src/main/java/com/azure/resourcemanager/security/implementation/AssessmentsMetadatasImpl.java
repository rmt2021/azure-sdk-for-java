// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AssessmentsMetadatasClient;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataInner;
import com.azure.resourcemanager.security.models.AssessmentsMetadatas;
import com.azure.resourcemanager.security.models.SecurityAssessmentMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AssessmentsMetadatasImpl implements AssessmentsMetadatas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssessmentsMetadatasImpl.class);

    private final AssessmentsMetadatasClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AssessmentsMetadatasImpl(
        AssessmentsMetadatasClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityAssessmentMetadata> list() {
        PagedIterable<SecurityAssessmentMetadataInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAssessmentMetadata> list(Context context) {
        PagedIterable<SecurityAssessmentMetadataInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataImpl(inner1, this.manager()));
    }

    public SecurityAssessmentMetadata get(String assessmentMetadataName) {
        SecurityAssessmentMetadataInner inner = this.serviceClient().get(assessmentMetadataName);
        if (inner != null) {
            return new SecurityAssessmentMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityAssessmentMetadata> getWithResponse(String assessmentMetadataName, Context context) {
        Response<SecurityAssessmentMetadataInner> inner =
            this.serviceClient().getWithResponse(assessmentMetadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityAssessmentMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SecurityAssessmentMetadata> listBySubscription() {
        PagedIterable<SecurityAssessmentMetadataInner> inner = this.serviceClient().listBySubscription();
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityAssessmentMetadata> listBySubscription(Context context) {
        PagedIterable<SecurityAssessmentMetadataInner> inner = this.serviceClient().listBySubscription(context);
        return Utils.mapPage(inner, inner1 -> new SecurityAssessmentMetadataImpl(inner1, this.manager()));
    }

    public SecurityAssessmentMetadata getInSubscription(String assessmentMetadataName) {
        SecurityAssessmentMetadataInner inner = this.serviceClient().getInSubscription(assessmentMetadataName);
        if (inner != null) {
            return new SecurityAssessmentMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityAssessmentMetadata> getInSubscriptionWithResponse(
        String assessmentMetadataName, Context context) {
        Response<SecurityAssessmentMetadataInner> inner =
            this.serviceClient().getInSubscriptionWithResponse(assessmentMetadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityAssessmentMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteInSubscription(String assessmentMetadataName) {
        this.serviceClient().deleteInSubscription(assessmentMetadataName);
    }

    public Response<Void> deleteInSubscriptionWithResponse(String assessmentMetadataName, Context context) {
        return this.serviceClient().deleteInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    public SecurityAssessmentMetadata getInSubscriptionById(String id) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.getInSubscriptionWithResponse(assessmentMetadataName, Context.NONE).getValue();
    }

    public Response<SecurityAssessmentMetadata> getInSubscriptionByIdWithResponse(String id, Context context) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.getInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    public void deleteInSubscriptionById(String id) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        this.deleteInSubscriptionWithResponse(assessmentMetadataName, Context.NONE).getValue();
    }

    public Response<Void> deleteInSubscriptionByIdWithResponse(String id, Context context) {
        String assessmentMetadataName = Utils.getValueFromIdByName(id, "assessmentMetadata");
        if (assessmentMetadataName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'assessmentMetadata'.", id)));
        }
        return this.deleteInSubscriptionWithResponse(assessmentMetadataName, context);
    }

    private AssessmentsMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public SecurityAssessmentMetadataImpl define(String name) {
        return new SecurityAssessmentMetadataImpl(name, this.manager());
    }
}