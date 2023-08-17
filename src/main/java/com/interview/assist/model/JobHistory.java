
package com.interview.assist.model;

import java.util.LinkedHashMap;
import java.util.List;
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
    "_total",
    "values"
})
@Generated("jsonschema2pojo")
public class JobHistory {

    @JsonProperty("_total")
    private Long total;
    @JsonProperty("values")
    private List<JobDetails> jobDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobHistory() {
    }

    /**
     * 
     * @param total
     * @param jobDetails
     */
    public JobHistory(Long total, List<JobDetails> jobDetails) {
        super();
        this.total = total;
        this.jobDetails = jobDetails;
    }

    @JsonProperty("_total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Long total) {
        this.total = total;
    }

    public JobHistory withTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonProperty("values")
    public List<JobDetails> getValues() {
        return jobDetails;
    }

    @JsonProperty("values")
    public void setValues(List<JobDetails> jobDetails) {
        this.jobDetails = jobDetails;
    }

    public JobHistory withValues(List<JobDetails> jobDetails) {
        this.jobDetails = jobDetails;
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

    public JobHistory withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.jobDetails == null)?"<null>":this.jobDetails));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.jobDetails == null)? 0 :this.jobDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobHistory) == false) {
            return false;
        }
        JobHistory rhs = ((JobHistory) other);
        return ((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.jobDetails == rhs.jobDetails)||((this.jobDetails != null)&&this.jobDetails.equals(rhs.jobDetails))));
    }

}
