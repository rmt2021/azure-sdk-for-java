// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage properties of a server. */
@Fluent
public final class Storage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Storage.class);

    /*
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "storageSizeGB")
    private Integer storageSizeGB;

    /**
     * Get the storageSizeGB property: Max storage allowed for a server.
     *
     * @return the storageSizeGB value.
     */
    public Integer storageSizeGB() {
        return this.storageSizeGB;
    }

    /**
     * Set the storageSizeGB property: Max storage allowed for a server.
     *
     * @param storageSizeGB the storageSizeGB value to set.
     * @return the Storage object itself.
     */
    public Storage withStorageSizeGB(Integer storageSizeGB) {
        this.storageSizeGB = storageSizeGB;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}