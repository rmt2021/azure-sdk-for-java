// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.BackupLongTermRetentionPolicyInner;
import com.azure.resourcemanager.sql.models.LongTermRetentionPolicyName;

/** Samples for BackupLongTermRetentionPolicies CreateOrUpdate. */
public final class BackupLongTermRetentionPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/LongTermRetentionPolicyCreateOrUpdate.json
     */
    /**
     * Sample code: Create or update the long term retention policy for the database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateTheLongTermRetentionPolicyForTheDatabase(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getBackupLongTermRetentionPolicies()
            .createOrUpdate(
                "resourceGroup",
                "testserver",
                "testDatabase",
                LongTermRetentionPolicyName.DEFAULT,
                new BackupLongTermRetentionPolicyInner()
                    .withWeeklyRetention("P1M")
                    .withMonthlyRetention("P1Y")
                    .withYearlyRetention("P5Y")
                    .withWeekOfYear(5),
                Context.NONE);
    }
}
