// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JobState. */
public final class JobState extends ExpandableStringEnum<JobState> {
    /** Static value Canceled for JobState. */
    public static final JobState CANCELED = fromString("Canceled");

    /** Static value Canceling for JobState. */
    public static final JobState CANCELING = fromString("Canceling");

    /** Static value Error for JobState. */
    public static final JobState ERROR = fromString("Error");

    /** Static value Finished for JobState. */
    public static final JobState FINISHED = fromString("Finished");

    /** Static value Processing for JobState. */
    public static final JobState PROCESSING = fromString("Processing");

    /** Static value Queued for JobState. */
    public static final JobState QUEUED = fromString("Queued");

    /** Static value Scheduled for JobState. */
    public static final JobState SCHEDULED = fromString("Scheduled");

    /**
     * Creates or finds a JobState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobState.
     */
    @JsonCreator
    public static JobState fromString(String name) {
        return fromString(name, JobState.class);
    }

    /**
     * Gets known JobState values.
     *
     * @return known JobState values.
     */
    public static Collection<JobState> values() {
        return values(JobState.class);
    }
}
