// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The current state of a private endpoint connection. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionState.class);

    /*
     * The status of a private endpoint connection
     */
    @JsonProperty(value = "status", required = true)
    private PrivateLinkServiceConnectionStatus status;

    /*
     * The description for the current state of a private endpoint connection
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Actions required for a private endpoint connection
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get the status property: The status of a private endpoint connection.
     *
     * @return the status value.
     */
    public PrivateLinkServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of a private endpoint connection.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateLinkServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The description for the current state of a private endpoint connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the current state of a private endpoint connection.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionRequired property: Actions required for a private endpoint connection.
     *
     * @return the actionRequired value.
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set the actionRequired property: Actions required for a private endpoint connection.
     *
     * @param actionRequired the actionRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status in model PrivateLinkServiceConnectionState"));
        }
    }
}