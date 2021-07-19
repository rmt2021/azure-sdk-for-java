// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents an alert sync setting. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AlertSyncSettings")
@JsonFlatten
@Fluent
public class AlertSyncSettings extends SettingInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertSyncSettings.class);

    /*
     * Is the alert sync setting enabled
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Is the alert sync setting enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is the alert sync setting enabled.
     *
     * @param enabled the enabled value to set.
     * @return the AlertSyncSettings object itself.
     */
    public AlertSyncSettings withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
    }
}