// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.AccountInner;
import com.azure.resourcemanager.cognitiveservices.models.Account;
import com.azure.resourcemanager.cognitiveservices.models.AccountProperties;
import com.azure.resourcemanager.cognitiveservices.models.ApiKeys;
import com.azure.resourcemanager.cognitiveservices.models.Identity;
import com.azure.resourcemanager.cognitiveservices.models.RegenerateKeyParameters;
import com.azure.resourcemanager.cognitiveservices.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class AccountImpl implements Account, Account.Definition, Account.Update {
    private AccountInner innerObject;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String location() {
        return this.innerModel().location();
    }

    public AccountProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    public AccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Account create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, this.innerModel(), Context.NONE);
        return this;
    }

    public Account create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, this.innerModel(), context);
        return this;
    }

    AccountImpl(String name, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = new AccountInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
    }

    public AccountImpl update() {
        return this;
    }

    public Account apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, this.innerModel(), Context.NONE);
        return this;
    }

    public Account apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, this.innerModel(), context);
        return this;
    }

    AccountImpl(
        AccountInner innerObject, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
    }

    public Account refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public Account refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public ApiKeys listKeys() {
        return serviceManager.accounts().listKeys(resourceGroupName, accountName);
    }

    public Response<ApiKeys> listKeysWithResponse(Context context) {
        return serviceManager.accounts().listKeysWithResponse(resourceGroupName, accountName, context);
    }

    public ApiKeys regenerateKey(RegenerateKeyParameters parameters) {
        return serviceManager.accounts().regenerateKey(resourceGroupName, accountName, parameters);
    }

    public Response<ApiKeys> regenerateKeyWithResponse(RegenerateKeyParameters parameters, Context context) {
        return serviceManager.accounts().regenerateKeyWithResponse(resourceGroupName, accountName, parameters, context);
    }

    public AccountImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AccountImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AccountImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AccountImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public AccountImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public AccountImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public AccountImpl withProperties(AccountProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}