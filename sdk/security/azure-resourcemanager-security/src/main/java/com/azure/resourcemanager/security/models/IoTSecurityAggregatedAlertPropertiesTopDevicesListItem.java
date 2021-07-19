// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IoTSecurityAggregatedAlertPropertiesTopDevicesListItem model. */
@Immutable
public final class IoTSecurityAggregatedAlertPropertiesTopDevicesListItem {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(IoTSecurityAggregatedAlertPropertiesTopDevicesListItem.class);

    /*
     * Name of the device.
     */
    @JsonProperty(value = "deviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceId;

    /*
     * Number of alerts raised for this device.
     */
    @JsonProperty(value = "alertsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long alertsCount;

    /*
     * Most recent time this alert was raised for this device, on this day.
     */
    @JsonProperty(value = "lastOccurrence", access = JsonProperty.Access.WRITE_ONLY)
    private String lastOccurrence;

    /**
     * Get the deviceId property: Name of the device.
     *
     * @return the deviceId value.
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Get the alertsCount property: Number of alerts raised for this device.
     *
     * @return the alertsCount value.
     */
    public Long alertsCount() {
        return this.alertsCount;
    }

    /**
     * Get the lastOccurrence property: Most recent time this alert was raised for this device, on this day.
     *
     * @return the lastOccurrence value.
     */
    public String lastOccurrence() {
        return this.lastOccurrence;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}