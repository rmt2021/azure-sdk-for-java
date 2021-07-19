// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.IotDefenderSettingsListInner;
import com.azure.resourcemanager.security.fluent.models.IotDefenderSettingsModelInner;
import com.azure.resourcemanager.security.models.IotDefenderSettingsList;
import com.azure.resourcemanager.security.models.IotDefenderSettingsModel;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class IotDefenderSettingsListImpl implements IotDefenderSettingsList {
    private IotDefenderSettingsListInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    IotDefenderSettingsListImpl(
        IotDefenderSettingsListInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<IotDefenderSettingsModel> value() {
        List<IotDefenderSettingsModelInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new IotDefenderSettingsModelImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public IotDefenderSettingsListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}