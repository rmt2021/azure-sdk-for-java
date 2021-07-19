// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** vulnerability assessment rule metadata details. */
@Fluent
public final class VaRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaRule.class);

    /*
     * The rule Id.
     */
    @JsonProperty(value = "ruleId")
    private String ruleId;

    /*
     * The rule severity.
     */
    @JsonProperty(value = "severity")
    private RuleSeverity severity;

    /*
     * The rule category.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The rule type.
     */
    @JsonProperty(value = "ruleType")
    private RuleType ruleType;

    /*
     * The rule title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The rule description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The rule rationale.
     */
    @JsonProperty(value = "rationale")
    private String rationale;

    /*
     * The rule query details.
     */
    @JsonProperty(value = "queryCheck")
    private QueryCheck queryCheck;

    /*
     * The benchmark references.
     */
    @JsonProperty(value = "benchmarkReferences")
    private List<BenchmarkReference> benchmarkReferences;

    /**
     * Get the ruleId property: The rule Id.
     *
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: The rule Id.
     *
     * @param ruleId the ruleId value to set.
     * @return the VaRule object itself.
     */
    public VaRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the severity property: The rule severity.
     *
     * @return the severity value.
     */
    public RuleSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The rule severity.
     *
     * @param severity the severity value to set.
     * @return the VaRule object itself.
     */
    public VaRule withSeverity(RuleSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the category property: The rule category.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The rule category.
     *
     * @param category the category value to set.
     * @return the VaRule object itself.
     */
    public VaRule withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the ruleType property: The rule type.
     *
     * @return the ruleType value.
     */
    public RuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: The rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the VaRule object itself.
     */
    public VaRule withRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the title property: The rule title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The rule title.
     *
     * @param title the title value to set.
     * @return the VaRule object itself.
     */
    public VaRule withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: The rule description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The rule description.
     *
     * @param description the description value to set.
     * @return the VaRule object itself.
     */
    public VaRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rationale property: The rule rationale.
     *
     * @return the rationale value.
     */
    public String rationale() {
        return this.rationale;
    }

    /**
     * Set the rationale property: The rule rationale.
     *
     * @param rationale the rationale value to set.
     * @return the VaRule object itself.
     */
    public VaRule withRationale(String rationale) {
        this.rationale = rationale;
        return this;
    }

    /**
     * Get the queryCheck property: The rule query details.
     *
     * @return the queryCheck value.
     */
    public QueryCheck queryCheck() {
        return this.queryCheck;
    }

    /**
     * Set the queryCheck property: The rule query details.
     *
     * @param queryCheck the queryCheck value to set.
     * @return the VaRule object itself.
     */
    public VaRule withQueryCheck(QueryCheck queryCheck) {
        this.queryCheck = queryCheck;
        return this;
    }

    /**
     * Get the benchmarkReferences property: The benchmark references.
     *
     * @return the benchmarkReferences value.
     */
    public List<BenchmarkReference> benchmarkReferences() {
        return this.benchmarkReferences;
    }

    /**
     * Set the benchmarkReferences property: The benchmark references.
     *
     * @param benchmarkReferences the benchmarkReferences value to set.
     * @return the VaRule object itself.
     */
    public VaRule withBenchmarkReferences(List<BenchmarkReference> benchmarkReferences) {
        this.benchmarkReferences = benchmarkReferences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryCheck() != null) {
            queryCheck().validate();
        }
        if (benchmarkReferences() != null) {
            benchmarkReferences().forEach(e -> e.validate());
        }
    }
}