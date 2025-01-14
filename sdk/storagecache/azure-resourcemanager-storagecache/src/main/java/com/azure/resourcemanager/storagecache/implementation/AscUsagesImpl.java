// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.AscUsagesClient;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceUsageInner;
import com.azure.resourcemanager.storagecache.models.AscUsages;
import com.azure.resourcemanager.storagecache.models.ResourceUsage;

public final class AscUsagesImpl implements AscUsages {
    private static final ClientLogger LOGGER = new ClientLogger(AscUsagesImpl.class);

    private final AscUsagesClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public AscUsagesImpl(
        AscUsagesClient innerClient, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceUsage> list(String location) {
        PagedIterable<ResourceUsageInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new ResourceUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceUsage> list(String location, Context context) {
        PagedIterable<ResourceUsageInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new ResourceUsageImpl(inner1, this.manager()));
    }

    private AscUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }
}
