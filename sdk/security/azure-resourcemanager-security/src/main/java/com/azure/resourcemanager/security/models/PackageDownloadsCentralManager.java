// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** All downloads for Central Manager. */
@Immutable
public final class PackageDownloadsCentralManager {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PackageDownloadsCentralManager.class);

    /*
     * Contains full package downloads
     */
    @JsonProperty(value = "full", access = JsonProperty.Access.WRITE_ONLY)
    private PackageDownloadsCentralManagerFull full;

    /*
     * Central Manager upgrade package downloads (on existing installations)
     */
    @JsonProperty(value = "upgrade", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpgradePackageDownloadInfo> upgrade;

    /**
     * Get the full property: Contains full package downloads.
     *
     * @return the full value.
     */
    public PackageDownloadsCentralManagerFull full() {
        return this.full;
    }

    /**
     * Get the upgrade property: Central Manager upgrade package downloads (on existing installations).
     *
     * @return the upgrade value.
     */
    public List<UpgradePackageDownloadInfo> upgrade() {
        return this.upgrade;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (full() != null) {
            full().validate();
        }
        if (upgrade() != null) {
            upgrade().forEach(e -> e.validate());
        }
    }
}