// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains full package downloads. */
@Fluent
public final class PackageDownloadsSensorFull {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PackageDownloadsSensorFull.class);

    /*
     * Contains all ISO full versions for the sensor
     */
    @JsonProperty(value = "iso", access = JsonProperty.Access.WRITE_ONLY)
    private List<PackageDownloadInfo> iso;

    /*
     * Contains all OVF (virtual machine) full versions for the sensor
     */
    @JsonProperty(value = "ovf")
    private PackageDownloadsSensorFullOvf ovf;

    /**
     * Get the iso property: Contains all ISO full versions for the sensor.
     *
     * @return the iso value.
     */
    public List<PackageDownloadInfo> iso() {
        return this.iso;
    }

    /**
     * Get the ovf property: Contains all OVF (virtual machine) full versions for the sensor.
     *
     * @return the ovf value.
     */
    public PackageDownloadsSensorFullOvf ovf() {
        return this.ovf;
    }

    /**
     * Set the ovf property: Contains all OVF (virtual machine) full versions for the sensor.
     *
     * @param ovf the ovf value to set.
     * @return the PackageDownloadsSensorFull object itself.
     */
    public PackageDownloadsSensorFull withOvf(PackageDownloadsSensorFullOvf ovf) {
        this.ovf = ovf;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (iso() != null) {
            iso().forEach(e -> e.validate());
        }
        if (ovf() != null) {
            ovf().validate();
        }
    }
}