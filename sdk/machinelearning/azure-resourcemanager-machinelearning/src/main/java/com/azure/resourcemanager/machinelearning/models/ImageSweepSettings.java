// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Model sweeping and hyperparameter sweeping related settings. */
@Fluent
public final class ImageSweepSettings {
    /*
     * Type of early termination policy.
     */
    @JsonProperty(value = "earlyTermination")
    private EarlyTerminationPolicy earlyTermination;

    /*
     * [Required] Limit settings for model sweeping and hyperparameter
     * sweeping.
     */
    @JsonProperty(value = "limits", required = true)
    private ImageSweepLimitSettings limits;

    /*
     * [Required] Type of the hyperparameter sampling algorithms.
     */
    @JsonProperty(value = "samplingAlgorithm", required = true)
    private SamplingAlgorithmType samplingAlgorithm;

    /**
     * Get the earlyTermination property: Type of early termination policy.
     *
     * @return the earlyTermination value.
     */
    public EarlyTerminationPolicy earlyTermination() {
        return this.earlyTermination;
    }

    /**
     * Set the earlyTermination property: Type of early termination policy.
     *
     * @param earlyTermination the earlyTermination value to set.
     * @return the ImageSweepSettings object itself.
     */
    public ImageSweepSettings withEarlyTermination(EarlyTerminationPolicy earlyTermination) {
        this.earlyTermination = earlyTermination;
        return this;
    }

    /**
     * Get the limits property: [Required] Limit settings for model sweeping and hyperparameter sweeping.
     *
     * @return the limits value.
     */
    public ImageSweepLimitSettings limits() {
        return this.limits;
    }

    /**
     * Set the limits property: [Required] Limit settings for model sweeping and hyperparameter sweeping.
     *
     * @param limits the limits value to set.
     * @return the ImageSweepSettings object itself.
     */
    public ImageSweepSettings withLimits(ImageSweepLimitSettings limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Get the samplingAlgorithm property: [Required] Type of the hyperparameter sampling algorithms.
     *
     * @return the samplingAlgorithm value.
     */
    public SamplingAlgorithmType samplingAlgorithm() {
        return this.samplingAlgorithm;
    }

    /**
     * Set the samplingAlgorithm property: [Required] Type of the hyperparameter sampling algorithms.
     *
     * @param samplingAlgorithm the samplingAlgorithm value to set.
     * @return the ImageSweepSettings object itself.
     */
    public ImageSweepSettings withSamplingAlgorithm(SamplingAlgorithmType samplingAlgorithm) {
        this.samplingAlgorithm = samplingAlgorithm;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (earlyTermination() != null) {
            earlyTermination().validate();
        }
        if (limits() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property limits in model ImageSweepSettings"));
        } else {
            limits().validate();
        }
        if (samplingAlgorithm() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property samplingAlgorithm in model ImageSweepSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageSweepSettings.class);
}
