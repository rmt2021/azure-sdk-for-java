// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TokenInformationInner;

/** An immutable client-side representation of TokenInformation. */
public interface TokenInformation {
    /**
     * Gets the token property: Token value.
     *
     * @return the token value.
     */
    String token();

    /**
     * Gets the expiryTimeInUtcTicks property: Expiry time of token.
     *
     * @return the expiryTimeInUtcTicks value.
     */
    Long expiryTimeInUtcTicks();

    /**
     * Gets the securityPin property: Security PIN.
     *
     * @return the securityPin value.
     */
    String securityPin();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TokenInformationInner object.
     *
     * @return the inner object.
     */
    TokenInformationInner innerModel();
}