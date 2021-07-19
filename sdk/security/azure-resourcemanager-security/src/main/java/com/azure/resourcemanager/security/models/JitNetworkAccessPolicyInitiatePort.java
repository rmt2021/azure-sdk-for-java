// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The JitNetworkAccessPolicyInitiatePort model. */
@Fluent
public final class JitNetworkAccessPolicyInitiatePort {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JitNetworkAccessPolicyInitiatePort.class);

    /*
     * The number property.
     */
    @JsonProperty(value = "number", required = true)
    private int number;

    /*
     * Source of the allowed traffic. If omitted, the request will be for the
     * source IP address of the initiate request.
     */
    @JsonProperty(value = "allowedSourceAddressPrefix")
    private String allowedSourceAddressPrefix;

    /*
     * The time to close the request in UTC
     */
    @JsonProperty(value = "endTimeUtc", required = true)
    private OffsetDateTime endTimeUtc;

    /**
     * Get the number property: The number property.
     *
     * @return the number value.
     */
    public int number() {
        return this.number;
    }

    /**
     * Set the number property: The number property.
     *
     * @param number the number value to set.
     * @return the JitNetworkAccessPolicyInitiatePort object itself.
     */
    public JitNetworkAccessPolicyInitiatePort withNumber(int number) {
        this.number = number;
        return this;
    }

    /**
     * Get the allowedSourceAddressPrefix property: Source of the allowed traffic. If omitted, the request will be for
     * the source IP address of the initiate request.
     *
     * @return the allowedSourceAddressPrefix value.
     */
    public String allowedSourceAddressPrefix() {
        return this.allowedSourceAddressPrefix;
    }

    /**
     * Set the allowedSourceAddressPrefix property: Source of the allowed traffic. If omitted, the request will be for
     * the source IP address of the initiate request.
     *
     * @param allowedSourceAddressPrefix the allowedSourceAddressPrefix value to set.
     * @return the JitNetworkAccessPolicyInitiatePort object itself.
     */
    public JitNetworkAccessPolicyInitiatePort withAllowedSourceAddressPrefix(String allowedSourceAddressPrefix) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        return this;
    }

    /**
     * Get the endTimeUtc property: The time to close the request in UTC.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Set the endTimeUtc property: The time to close the request in UTC.
     *
     * @param endTimeUtc the endTimeUtc value to set.
     * @return the JitNetworkAccessPolicyInitiatePort object itself.
     */
    public JitNetworkAccessPolicyInitiatePort withEndTimeUtc(OffsetDateTime endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endTimeUtc() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endTimeUtc in model JitNetworkAccessPolicyInitiatePort"));
        }
    }
}