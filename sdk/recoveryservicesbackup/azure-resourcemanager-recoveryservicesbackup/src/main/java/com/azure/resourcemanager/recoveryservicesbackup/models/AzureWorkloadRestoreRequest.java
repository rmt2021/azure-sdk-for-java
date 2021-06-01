// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** AzureWorkload-specific restore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureWorkloadRestoreRequest.class)
@JsonTypeName("AzureWorkloadRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadPointInTimeRestoreRequest",
        value = AzureWorkloadPointInTimeRestoreRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSAPHanaRestoreRequest", value = AzureWorkloadSapHanaRestoreRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadSQLRestoreRequest", value = AzureWorkloadSqlRestoreRequest.class)
})
@Fluent
public class AzureWorkloadRestoreRequest extends RestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadRestoreRequest.class);

    /*
     * Type of this recovery.
     */
    @JsonProperty(value = "recoveryType")
    private RecoveryType recoveryType;

    /*
     * Fully qualified ARM ID of the VM on which workload that was running is
     * being recovered.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * Workload specific property bag.
     */
    @JsonProperty(value = "propertyBag")
    private Map<String, String> propertyBag;

    /*
     * Details of target database
     */
    @JsonProperty(value = "targetInfo")
    private TargetRestoreInfo targetInfo;

    /*
     * Defines whether the current recovery mode is file restore or database
     * restore
     */
    @JsonProperty(value = "recoveryMode")
    private RecoveryMode recoveryMode;

    /**
     * Get the recoveryType property: Type of this recovery.
     *
     * @return the recoveryType value.
     */
    public RecoveryType recoveryType() {
        return this.recoveryType;
    }

    /**
     * Set the recoveryType property: Type of this recovery.
     *
     * @param recoveryType the recoveryType value to set.
     * @return the AzureWorkloadRestoreRequest object itself.
     */
    public AzureWorkloadRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        this.recoveryType = recoveryType;
        return this;
    }

    /**
     * Get the sourceResourceId property: Fully qualified ARM ID of the VM on which workload that was running is being
     * recovered.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: Fully qualified ARM ID of the VM on which workload that was running is being
     * recovered.
     *
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the AzureWorkloadRestoreRequest object itself.
     */
    public AzureWorkloadRestoreRequest withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the propertyBag property: Workload specific property bag.
     *
     * @return the propertyBag value.
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set the propertyBag property: Workload specific property bag.
     *
     * @param propertyBag the propertyBag value to set.
     * @return the AzureWorkloadRestoreRequest object itself.
     */
    public AzureWorkloadRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

    /**
     * Get the targetInfo property: Details of target database.
     *
     * @return the targetInfo value.
     */
    public TargetRestoreInfo targetInfo() {
        return this.targetInfo;
    }

    /**
     * Set the targetInfo property: Details of target database.
     *
     * @param targetInfo the targetInfo value to set.
     * @return the AzureWorkloadRestoreRequest object itself.
     */
    public AzureWorkloadRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }

    /**
     * Get the recoveryMode property: Defines whether the current recovery mode is file restore or database restore.
     *
     * @return the recoveryMode value.
     */
    public RecoveryMode recoveryMode() {
        return this.recoveryMode;
    }

    /**
     * Set the recoveryMode property: Defines whether the current recovery mode is file restore or database restore.
     *
     * @param recoveryMode the recoveryMode value to set.
     * @return the AzureWorkloadRestoreRequest object itself.
     */
    public AzureWorkloadRestoreRequest withRecoveryMode(RecoveryMode recoveryMode) {
        this.recoveryMode = recoveryMode;
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
        if (targetInfo() != null) {
            targetInfo().validate();
        }
    }
}