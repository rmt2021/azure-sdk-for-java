// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupStatusResponseInner;

/** An immutable client-side representation of BackupStatusResponse. */
public interface BackupStatusResponse {
    /**
     * Gets the protectionStatus property: Specifies whether the container is registered or not.
     *
     * @return the protectionStatus value.
     */
    ProtectionStatus protectionStatus();

    /**
     * Gets the vaultId property: Specifies the arm resource id of the vault.
     *
     * @return the vaultId value.
     */
    String vaultId();

    /**
     * Gets the fabricName property: Specifies the fabric name - Azure or AD.
     *
     * @return the fabricName value.
     */
    FabricName fabricName();

    /**
     * Gets the containerName property: Specifies the product specific container name. E.g.
     * iaasvmcontainer;iaasvmcontainer;csname;vmname.
     *
     * @return the containerName value.
     */
    String containerName();

    /**
     * Gets the protectedItemName property: Specifies the product specific ds name. E.g.
     * vm;iaasvmcontainer;csname;vmname.
     *
     * @return the protectedItemName value.
     */
    String protectedItemName();

    /**
     * Gets the errorCode property: ErrorCode in case of intent failed.
     *
     * @return the errorCode value.
     */
    String errorCode();

    /**
     * Gets the errorMessage property: ErrorMessage in case of intent failed.
     *
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * Gets the policyName property: Specifies the policy name which is used for protection.
     *
     * @return the policyName value.
     */
    String policyName();

    /**
     * Gets the registrationStatus property: Container registration status.
     *
     * @return the registrationStatus value.
     */
    String registrationStatus();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupStatusResponseInner object.
     *
     * @return the inner object.
     */
    BackupStatusResponseInner innerModel();
}