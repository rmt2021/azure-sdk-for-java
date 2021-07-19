// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotAlerts Get. */
public final class IotAlertsGetSamples {
    /**
     * Sample code: Get IoT Alert.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getIoTAlert(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotAlerts()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myGroup/providers/Microsoft.Devices/IotHubs/myIotHub",
                "903e76ff-17eb-4bac-ac8a-2bc31ab68fd8",
                Context.NONE);
    }
}