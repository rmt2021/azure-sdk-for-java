// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for PriceSheet GetByBillingPeriod. */
public final class PriceSheetGetByBillingPeriodSamples {
    /**
     * Sample code: PriceSheetForBillingPeriod.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void priceSheetForBillingPeriod(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager.priceSheets().getByBillingPeriodWithResponse("201801", null, null, null, Context.NONE);
    }

    /**
     * Sample code: PriceSheetExpand.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void priceSheetExpand(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .priceSheets()
            .getByBillingPeriodWithResponse("201801", "meterDetails", null, null, Context.NONE);
    }
}