// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Optional set of properties to configure geo replication for this database. */
@Fluent
public final class DatabasePropertiesGeoReplication {
    /*
     * Name for the group of linked database resources
     */
    @JsonProperty(value = "groupNickname")
    private String groupNickname;

    /*
     * List of database resources to link with this database
     */
    @JsonProperty(value = "linkedDatabases")
    private List<LinkedDatabase> linkedDatabases;

    /**
     * Get the groupNickname property: Name for the group of linked database resources.
     *
     * @return the groupNickname value.
     */
    public String groupNickname() {
        return this.groupNickname;
    }

    /**
     * Set the groupNickname property: Name for the group of linked database resources.
     *
     * @param groupNickname the groupNickname value to set.
     * @return the DatabasePropertiesGeoReplication object itself.
     */
    public DatabasePropertiesGeoReplication withGroupNickname(String groupNickname) {
        this.groupNickname = groupNickname;
        return this;
    }

    /**
     * Get the linkedDatabases property: List of database resources to link with this database.
     *
     * @return the linkedDatabases value.
     */
    public List<LinkedDatabase> linkedDatabases() {
        return this.linkedDatabases;
    }

    /**
     * Set the linkedDatabases property: List of database resources to link with this database.
     *
     * @param linkedDatabases the linkedDatabases value to set.
     * @return the DatabasePropertiesGeoReplication object itself.
     */
    public DatabasePropertiesGeoReplication withLinkedDatabases(List<LinkedDatabase> linkedDatabases) {
        this.linkedDatabases = linkedDatabases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedDatabases() != null) {
            linkedDatabases().forEach(e -> e.validate());
        }
    }
}
