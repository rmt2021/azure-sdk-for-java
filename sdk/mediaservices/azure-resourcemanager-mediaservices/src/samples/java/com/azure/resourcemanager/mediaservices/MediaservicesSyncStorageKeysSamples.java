// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.models.SyncStorageKeysInput;

/** Samples for Mediaservices SyncStorageKeys. */
public final class MediaservicesSyncStorageKeysSamples {
    /**
     * Sample code: Synchronizes Storage Account Keys.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void synchronizesStorageAccountKeys(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .mediaservices()
            .syncStorageKeysWithResponse(
                "contoso", "contososports", new SyncStorageKeysInput().withId("contososportsstore"), Context.NONE);
    }
}