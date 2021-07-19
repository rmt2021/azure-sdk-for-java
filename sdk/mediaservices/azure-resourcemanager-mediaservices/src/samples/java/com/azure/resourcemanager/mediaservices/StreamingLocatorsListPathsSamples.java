// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingLocators ListPaths. */
public final class StreamingLocatorsListPathsSamples {
    /**
     * Sample code: List Paths which has streaming paths only.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listPathsWhichHasStreamingPathsOnly(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .streamingLocators()
            .listPathsWithResponse("contoso", "contosomedia", "secureStreamingLocator", Context.NONE);
    }

    /**
     * Sample code: List Paths which has streaming paths and download paths.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void listPathsWhichHasStreamingPathsAndDownloadPaths(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .streamingLocators()
            .listPathsWithResponse("contoso", "contosomedia", "clearStreamingLocator", Context.NONE);
    }
}