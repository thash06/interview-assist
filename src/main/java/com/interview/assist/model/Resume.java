
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
    "file",
    "json"
})
@Generated("jsonschema2pojo")
public class Resume {

    @JsonProperty("file")
    private File file;
    @JsonProperty("json")
    private ApplicantDetails applicantDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resume() {
    }

    /**
     * 
     * @param file
     * @param applicantDetails
     */
    public Resume(File file, ApplicantDetails applicantDetails) {
        super();
        this.file = file;
        this.applicantDetails = applicantDetails;
    }

    @JsonProperty("file")
    public File getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(File file) {
        this.file = file;
    }

    public Resume withFile(File file) {
        this.file = file;
        return this;
    }

    @JsonProperty("json")
    public ApplicantDetails getJson() {
        return applicantDetails;
    }

    @JsonProperty("json")
    public void setJson(ApplicantDetails applicantDetails) {
        this.applicantDetails = applicantDetails;
    }

    public Resume withJson(ApplicantDetails applicantDetails) {
        this.applicantDetails = applicantDetails;
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

    public Resume withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resume.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("json");
        sb.append('=');
        sb.append(((this.applicantDetails == null)?"<null>":this.applicantDetails));
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
        result = ((result* 31)+((this.applicantDetails == null)? 0 :this.applicantDetails.hashCode()));
        result = ((result* 31)+((this.file == null)? 0 :this.file.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resume) == false) {
            return false;
        }
        Resume rhs = ((Resume) other);
        return ((((this.applicantDetails == rhs.applicantDetails)||((this.applicantDetails != null)&&this.applicantDetails.equals(rhs.applicantDetails)))&&((this.file == rhs.file)||((this.file!= null)&&this.file.equals(rhs.file))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
