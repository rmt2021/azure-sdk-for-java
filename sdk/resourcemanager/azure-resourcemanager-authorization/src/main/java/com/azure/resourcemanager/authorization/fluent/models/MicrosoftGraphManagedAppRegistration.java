// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * managedAppRegistration The ManagedAppEntity is the base entity type for all other entity types under app management
 * workflow.
 */
@Fluent
public final class MicrosoftGraphManagedAppRegistration extends MicrosoftGraphEntity {
    /*
     * The identifier for a mobile app.
     */
    @JsonProperty(value = "appIdentifier")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> appIdentifier;

    /*
     * App version
     */
    @JsonProperty(value = "applicationVersion")
    private String applicationVersion;

    /*
     * Date and time of creation
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * Host device name
     */
    @JsonProperty(value = "deviceName")
    private String deviceName;

    /*
     * App management SDK generated tag, which helps relate apps hosted on the
     * same device. Not guaranteed to relate apps in all conditions.
     */
    @JsonProperty(value = "deviceTag")
    private String deviceTag;

    /*
     * Host device type
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /*
     * Zero or more reasons an app registration is flagged. E.g. app running on
     * rooted device
     */
    @JsonProperty(value = "flaggedReasons")
    private List<MicrosoftGraphManagedAppFlaggedReason> flaggedReasons;

    /*
     * Date and time of last the app synced with management service.
     */
    @JsonProperty(value = "lastSyncDateTime")
    private OffsetDateTime lastSyncDateTime;

    /*
     * App management SDK version
     */
    @JsonProperty(value = "managementSdkVersion")
    private String managementSdkVersion;

    /*
     * Operating System version
     */
    @JsonProperty(value = "platformVersion")
    private String platformVersion;

    /*
     * The user Id to who this app registration belongs.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /*
     * Version of the entity.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Zero or more policys already applied on the registered app when it last
     * synchronized with managment service.
     */
    @JsonProperty(value = "appliedPolicies")
    private List<MicrosoftGraphManagedAppPolicy> appliedPolicies;

    /*
     * Zero or more policies admin intended for the app as of now.
     */
    @JsonProperty(value = "intendedPolicies")
    private List<MicrosoftGraphManagedAppPolicy> intendedPolicies;

    /*
     * Zero or more long running operations triggered on the app registration.
     */
    @JsonProperty(value = "operations")
    private List<MicrosoftGraphManagedAppOperation> operations;

    /*
     * The ManagedAppEntity is the base entity type for all other entity types
     * under app management workflow.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the appIdentifier property: The identifier for a mobile app.
     *
     * @return the appIdentifier value.
     */
    public Map<String, Object> appIdentifier() {
        return this.appIdentifier;
    }

    /**
     * Set the appIdentifier property: The identifier for a mobile app.
     *
     * @param appIdentifier the appIdentifier value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withAppIdentifier(Map<String, Object> appIdentifier) {
        this.appIdentifier = appIdentifier;
        return this;
    }

    /**
     * Get the applicationVersion property: App version.
     *
     * @return the applicationVersion value.
     */
    public String applicationVersion() {
        return this.applicationVersion;
    }

    /**
     * Set the applicationVersion property: App version.
     *
     * @param applicationVersion the applicationVersion value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time of creation.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time of creation.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the deviceName property: Host device name.
     *
     * @return the deviceName value.
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Set the deviceName property: Host device name.
     *
     * @param deviceName the deviceName value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Get the deviceTag property: App management SDK generated tag, which helps relate apps hosted on the same device.
     * Not guaranteed to relate apps in all conditions.
     *
     * @return the deviceTag value.
     */
    public String deviceTag() {
        return this.deviceTag;
    }

    /**
     * Set the deviceTag property: App management SDK generated tag, which helps relate apps hosted on the same device.
     * Not guaranteed to relate apps in all conditions.
     *
     * @param deviceTag the deviceTag value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    /**
     * Get the deviceType property: Host device type.
     *
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: Host device type.
     *
     * @param deviceType the deviceType value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the flaggedReasons property: Zero or more reasons an app registration is flagged. E.g. app running on rooted
     * device.
     *
     * @return the flaggedReasons value.
     */
    public List<MicrosoftGraphManagedAppFlaggedReason> flaggedReasons() {
        return this.flaggedReasons;
    }

    /**
     * Set the flaggedReasons property: Zero or more reasons an app registration is flagged. E.g. app running on rooted
     * device.
     *
     * @param flaggedReasons the flaggedReasons value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withFlaggedReasons(
        List<MicrosoftGraphManagedAppFlaggedReason> flaggedReasons) {
        this.flaggedReasons = flaggedReasons;
        return this;
    }

    /**
     * Get the lastSyncDateTime property: Date and time of last the app synced with management service.
     *
     * @return the lastSyncDateTime value.
     */
    public OffsetDateTime lastSyncDateTime() {
        return this.lastSyncDateTime;
    }

    /**
     * Set the lastSyncDateTime property: Date and time of last the app synced with management service.
     *
     * @param lastSyncDateTime the lastSyncDateTime value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withLastSyncDateTime(OffsetDateTime lastSyncDateTime) {
        this.lastSyncDateTime = lastSyncDateTime;
        return this;
    }

    /**
     * Get the managementSdkVersion property: App management SDK version.
     *
     * @return the managementSdkVersion value.
     */
    public String managementSdkVersion() {
        return this.managementSdkVersion;
    }

    /**
     * Set the managementSdkVersion property: App management SDK version.
     *
     * @param managementSdkVersion the managementSdkVersion value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withManagementSdkVersion(String managementSdkVersion) {
        this.managementSdkVersion = managementSdkVersion;
        return this;
    }

    /**
     * Get the platformVersion property: Operating System version.
     *
     * @return the platformVersion value.
     */
    public String platformVersion() {
        return this.platformVersion;
    }

    /**
     * Set the platformVersion property: Operating System version.
     *
     * @param platformVersion the platformVersion value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * Get the userId property: The user Id to who this app registration belongs.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: The user Id to who this app registration belongs.
     *
     * @param userId the userId value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the version property: Version of the entity.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the entity.
     *
     * @param version the version value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the appliedPolicies property: Zero or more policys already applied on the registered app when it last
     * synchronized with managment service.
     *
     * @return the appliedPolicies value.
     */
    public List<MicrosoftGraphManagedAppPolicy> appliedPolicies() {
        return this.appliedPolicies;
    }

    /**
     * Set the appliedPolicies property: Zero or more policys already applied on the registered app when it last
     * synchronized with managment service.
     *
     * @param appliedPolicies the appliedPolicies value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withAppliedPolicies(
        List<MicrosoftGraphManagedAppPolicy> appliedPolicies) {
        this.appliedPolicies = appliedPolicies;
        return this;
    }

    /**
     * Get the intendedPolicies property: Zero or more policies admin intended for the app as of now.
     *
     * @return the intendedPolicies value.
     */
    public List<MicrosoftGraphManagedAppPolicy> intendedPolicies() {
        return this.intendedPolicies;
    }

    /**
     * Set the intendedPolicies property: Zero or more policies admin intended for the app as of now.
     *
     * @param intendedPolicies the intendedPolicies value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withIntendedPolicies(
        List<MicrosoftGraphManagedAppPolicy> intendedPolicies) {
        this.intendedPolicies = intendedPolicies;
        return this;
    }

    /**
     * Get the operations property: Zero or more long running operations triggered on the app registration.
     *
     * @return the operations value.
     */
    public List<MicrosoftGraphManagedAppOperation> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: Zero or more long running operations triggered on the app registration.
     *
     * @param operations the operations value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withOperations(List<MicrosoftGraphManagedAppOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Get the additionalProperties property: The ManagedAppEntity is the base entity type for all other entity types
     * under app management workflow.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The ManagedAppEntity is the base entity type for all other entity types
     * under app management workflow.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphManagedAppRegistration object itself.
     */
    public MicrosoftGraphManagedAppRegistration withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphManagedAppRegistration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (appliedPolicies() != null) {
            appliedPolicies().forEach(e -> e.validate());
        }
        if (intendedPolicies() != null) {
            intendedPolicies().forEach(e -> e.validate());
        }
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
    }
}
