
package com.interview.assist.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "job",
    "applicant",
    "analytics",
    "appliedOnMillis",
    "locale"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("id")
    private String id;
    @JsonProperty("job")
    private Job job;
    @JsonProperty("applicant")
    private Applicant applicant;
    @JsonProperty("analytics")
    private Analytics analytics;
    @JsonProperty("appliedOnMillis")
    private Long appliedOnMillis;
    @JsonProperty("locale")
    private String locale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param analytics
     * @param id
     * @param job
     * @param locale
     * @param appliedOnMillis
     * @param applicant
     */
    public Example(String id, Job job, Applicant applicant, Analytics analytics, Long appliedOnMillis, String locale) {
        super();
        this.id = id;
        this.job = job;
        this.applicant = applicant;
        this.analytics = analytics;
        this.appliedOnMillis = appliedOnMillis;
        this.locale = locale;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Example withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("job")
    public Job getJob() {
        return job;
    }

    @JsonProperty("job")
    public void setJob(Job job) {
        this.job = job;
    }

    public Example withJob(Job job) {
        this.job = job;
        return this;
    }

    @JsonProperty("applicant")
    public Applicant getApplicant() {
        return applicant;
    }

    @JsonProperty("applicant")
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Example withApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }

    @JsonProperty("analytics")
    public Analytics getAnalytics() {
        return analytics;
    }

    @JsonProperty("analytics")
    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public Example withAnalytics(Analytics analytics) {
        this.analytics = analytics;
        return this;
    }

    @JsonProperty("appliedOnMillis")
    public Long getAppliedOnMillis() {
        return appliedOnMillis;
    }

    @JsonProperty("appliedOnMillis")
    public void setAppliedOnMillis(Long appliedOnMillis) {
        this.appliedOnMillis = appliedOnMillis;
    }

    public Example withAppliedOnMillis(Long appliedOnMillis) {
        this.appliedOnMillis = appliedOnMillis;
        return this;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Example withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("job");
        sb.append('=');
        sb.append(((this.job == null)?"<null>":this.job));
        sb.append(',');
        sb.append("applicant");
        sb.append('=');
        sb.append(((this.applicant == null)?"<null>":this.applicant));
        sb.append(',');
        sb.append("analytics");
        sb.append('=');
        sb.append(((this.analytics == null)?"<null>":this.analytics));
        sb.append(',');
        sb.append("appliedOnMillis");
        sb.append('=');
        sb.append(((this.appliedOnMillis == null)?"<null>":this.appliedOnMillis));
        sb.append(',');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null)?"<null>":this.locale));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.analytics == null)? 0 :this.analytics.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.job == null)? 0 :this.job.hashCode()));
        result = ((result* 31)+((this.locale == null)? 0 :this.locale.hashCode()));
        result = ((result* 31)+((this.appliedOnMillis == null)? 0 :this.appliedOnMillis.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return ((((((((this.analytics == rhs.analytics)||((this.analytics!= null)&&this.analytics.equals(rhs.analytics)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.job == rhs.job)||((this.job!= null)&&this.job.equals(rhs.job))))&&((this.locale == rhs.locale)||((this.locale!= null)&&this.locale.equals(rhs.locale))))&&((this.appliedOnMillis == rhs.appliedOnMillis)||((this.appliedOnMillis!= null)&&this.appliedOnMillis.equals(rhs.appliedOnMillis))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))));
    }

}
