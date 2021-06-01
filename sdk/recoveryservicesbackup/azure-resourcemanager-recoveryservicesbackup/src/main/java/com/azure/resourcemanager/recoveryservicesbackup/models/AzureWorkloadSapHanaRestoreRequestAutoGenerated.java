// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** AzureWorkload SAP Hana-specific restore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureWorkloadSapHanaRestoreRequestAutoGenerated.class)
@JsonTypeName("AzureWorkloadSAPHanaRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadSAPHanaPointInTimeRestoreRequest",
        value = AzureWorkloadSapHanaPointInTimeRestoreRequestAutoGenerated.class)
})
@Immutable
public class AzureWorkloadSapHanaRestoreRequestAutoGenerated extends AzureWorkloadRestoreRequestAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureWorkloadSapHanaRestoreRequestAutoGenerated.class);

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequestAutoGenerated withTargetVirtualMachineId(String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
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
    }
}