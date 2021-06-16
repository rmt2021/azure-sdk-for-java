// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ApiType. */
public final class ApiType extends ExpandableStringEnum<ApiType> {
    /** Static value MongoDB for ApiType. */
    public static final ApiType MONGO_DB = fromString("MongoDB");

    /** Static value Gremlin for ApiType. */
    public static final ApiType GREMLIN = fromString("Gremlin");

    /** Static value Cassandra for ApiType. */
    public static final ApiType CASSANDRA = fromString("Cassandra");

    /** Static value Table for ApiType. */
    public static final ApiType TABLE = fromString("Table");

    /** Static value Sql for ApiType. */
    public static final ApiType SQL = fromString("Sql");

    /** Static value GremlinV2 for ApiType. */
    public static final ApiType GREMLIN_V2 = fromString("GremlinV2");

    /**
     * Creates or finds a ApiType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApiType.
     */
    @JsonCreator
    public static ApiType fromString(String name) {
        return fromString(name, ApiType.class);
    }

    /** @return known ApiType values. */
    public static Collection<ApiType> values() {
        return values(ApiType.class);
    }
}