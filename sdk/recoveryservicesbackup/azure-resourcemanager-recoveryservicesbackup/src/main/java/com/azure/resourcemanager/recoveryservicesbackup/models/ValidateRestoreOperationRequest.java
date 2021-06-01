// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** AzureRestoreValidation request. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = ValidateRestoreOperationRequest.class)
@JsonTypeName("ValidateRestoreOperationRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "ValidateIaasVMRestoreOperationRequest",
        value = ValidateIaasVMRestoreOperationRequest.class)
})
@Fluent
public class ValidateRestoreOperationRequest extends ValidateOperationRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateRestoreOperationRequest.class);

    /*
     * Sets restore request to be validated
     */
    @JsonProperty(value = "restoreRequest")
    private RestoreRequest restoreRequest;

    /**
     * Get the restoreRequest property: Sets restore request to be validated.
     *
     * @return the restoreRequest value.
     */
    public RestoreRequest restoreRequest() {
        return this.restoreRequest;
    }

    /**
     * Set the restoreRequest property: Sets restore request to be validated.
     *
     * @param restoreRequest the restoreRequest value to set.
     * @return the ValidateRestoreOperationRequest object itself.
     */
    public ValidateRestoreOperationRequest withRestoreRequest(RestoreRequest restoreRequest) {
        this.restoreRequest = restoreRequest;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (restoreRequest() != null) {
            restoreRequest().validate();
        }
    }
}