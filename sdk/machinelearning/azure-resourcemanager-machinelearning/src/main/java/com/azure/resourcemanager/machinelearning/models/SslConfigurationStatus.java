// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SslConfigurationStatus. */
public final class SslConfigurationStatus extends ExpandableStringEnum<SslConfigurationStatus> {
    /** Static value Disabled for SslConfigurationStatus. */
    public static final SslConfigurationStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for SslConfigurationStatus. */
    public static final SslConfigurationStatus ENABLED = fromString("Enabled");

    /** Static value Auto for SslConfigurationStatus. */
    public static final SslConfigurationStatus AUTO = fromString("Auto");

    /**
     * Creates or finds a SslConfigurationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslConfigurationStatus.
     */
    @JsonCreator
    public static SslConfigurationStatus fromString(String name) {
        return fromString(name, SslConfigurationStatus.class);
    }

    /**
     * Gets known SslConfigurationStatus values.
     *
     * @return known SslConfigurationStatus values.
     */
    public static Collection<SslConfigurationStatus> values() {
        return values(SslConfigurationStatus.class);
    }
}
