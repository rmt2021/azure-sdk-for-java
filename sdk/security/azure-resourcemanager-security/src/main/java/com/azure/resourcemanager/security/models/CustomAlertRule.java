// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A custom alert rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = CustomAlertRule.class)
@JsonTypeName("CustomAlertRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ThresholdCustomAlertRule", value = ThresholdCustomAlertRule.class),
    @JsonSubTypes.Type(name = "ListCustomAlertRule", value = ListCustomAlertRule.class)
})
@Fluent
public class CustomAlertRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomAlertRule.class);

    /*
     * The display name of the custom alert.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The description of the custom alert.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Status of the custom alert.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Get the displayName property: The display name of the custom alert.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description of the custom alert.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the isEnabled property: Status of the custom alert.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Status of the custom alert.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the CustomAlertRule object itself.
     */
    public CustomAlertRule withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
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