// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfigResource;
import java.util.Collections;
import java.util.Map;

public final class BackupResourceConfigResourceImpl implements BackupResourceConfigResource {
    private BackupResourceConfigResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    BackupResourceConfigResourceImpl(
        BackupResourceConfigResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public BackupResourceConfig properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public BackupResourceConfigResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}