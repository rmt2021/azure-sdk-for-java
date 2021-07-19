// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for AdaptiveApplicationControls List. */
public final class AdaptiveApplicationControlsListSamples {
    /**
     * Sample code: Gets a list of application control groups of machines for the subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getsAListOfApplicationControlGroupsOfMachinesForTheSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.adaptiveApplicationControls().listWithResponse(true, false, Context.NONE);
    }
}