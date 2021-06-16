// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.administration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DataFeedIngestionProgress model. */
@Immutable
public final class DataFeedIngestionProgress {
    /*
     * the timestamp of latest success ingestion job.
     * null indicates not available
     */
    @JsonProperty(value = "latestSuccessTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime latestSuccessTimestamp;

    /*
     * the timestamp of latest ingestion job with status update.
     * null indicates not available
     */
    @JsonProperty(value = "latestActiveTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime latestActiveTimestamp;

    /**
     * Get the latestSuccessTimestamp property: the timestamp of latest success ingestion job. null indicates not
     * available.
     *
     * @return the latestSuccessTimestamp value.
     */
    public OffsetDateTime getLatestSuccessTimestamp() {
        return this.latestSuccessTimestamp;
    }

    /**
     * Get the latestActiveTimestamp property: the timestamp of latest ingestion job with status update. null indicates
     * not available.
     *
     * @return the latestActiveTimestamp value.
     */
    public OffsetDateTime getLatestActiveTimestamp() {
        return this.latestActiveTimestamp;
    }
}