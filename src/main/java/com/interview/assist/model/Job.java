
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
    "jobId",
    "jobTitle",
    "jobCompany",
    "jobLocation",
    "jobUrl"
})
@Generated("jsonschema2pojo")
public class Job {

    @JsonProperty("jobId")
    private String jobId;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("jobCompany")
    private String jobCompany;
    @JsonProperty("jobLocation")
    private String jobLocation;
    @JsonProperty("jobUrl")
    private String jobUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Job() {
    }

    /**
     * 
     * @param jobId
     * @param jobLocation
     * @param jobTitle
     * @param jobCompany
     * @param jobUrl
     */
    public Job(String jobId, String jobTitle, String jobCompany, String jobLocation, String jobUrl) {
        super();
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.jobCompany = jobCompany;
        this.jobLocation = jobLocation;
        this.jobUrl = jobUrl;
    }

    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Job withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Job withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    @JsonProperty("jobCompany")
    public String getJobCompany() {
        return jobCompany;
    }

    @JsonProperty("jobCompany")
    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

    public Job withJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
        return this;
    }

    @JsonProperty("jobLocation")
    public String getJobLocation() {
        return jobLocation;
    }

    @JsonProperty("jobLocation")
    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public Job withJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
        return this;
    }

    @JsonProperty("jobUrl")
    public String getJobUrl() {
        return jobUrl;
    }

    @JsonProperty("jobUrl")
    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public Job withJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
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

    public Job withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Job.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jobId");
        sb.append('=');
        sb.append(((this.jobId == null)?"<null>":this.jobId));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("jobCompany");
        sb.append('=');
        sb.append(((this.jobCompany == null)?"<null>":this.jobCompany));
        sb.append(',');
        sb.append("jobLocation");
        sb.append('=');
        sb.append(((this.jobLocation == null)?"<null>":this.jobLocation));
        sb.append(',');
        sb.append("jobUrl");
        sb.append('=');
        sb.append(((this.jobUrl == null)?"<null>":this.jobUrl));
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
        result = ((result* 31)+((this.jobId == null)? 0 :this.jobId.hashCode()));
        result = ((result* 31)+((this.jobLocation == null)? 0 :this.jobLocation.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.jobCompany == null)? 0 :this.jobCompany.hashCode()));
        result = ((result* 31)+((this.jobUrl == null)? 0 :this.jobUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return (((((((this.jobId == rhs.jobId)||((this.jobId!= null)&&this.jobId.equals(rhs.jobId)))&&((this.jobLocation == rhs.jobLocation)||((this.jobLocation!= null)&&this.jobLocation.equals(rhs.jobLocation))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.jobCompany == rhs.jobCompany)||((this.jobCompany!= null)&&this.jobCompany.equals(rhs.jobCompany))))&&((this.jobUrl == rhs.jobUrl)||((this.jobUrl!= null)&&this.jobUrl.equals(rhs.jobUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
