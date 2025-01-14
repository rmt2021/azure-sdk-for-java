// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluent.models.PolicyAssignmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of policy assignments. */
@Fluent
public final class PolicyAssignmentListResult {
    /*
     * An array of policy assignments.
     */
    @JsonProperty(value = "value")
    private List<PolicyAssignmentInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of policy assignments.
     *
     * @return the value value.
     */
    public List<PolicyAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of policy assignments.
     *
     * @param value the value value to set.
     * @return the PolicyAssignmentListResult object itself.
     */
    public PolicyAssignmentListResult withValue(List<PolicyAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the PolicyAssignmentListResult object itself.
     */
    public PolicyAssignmentListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
