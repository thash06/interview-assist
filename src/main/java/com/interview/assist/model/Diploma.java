
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
    "degree",
    "field",
    "school",
    "location",
    "endCurrent"
})
@Generated("jsonschema2pojo")
public class Diploma {

    @JsonProperty("degree")
    private String degree;
    @JsonProperty("field")
    private String field;
    @JsonProperty("school")
    private String school;
    @JsonProperty("location")
    private String location;
    @JsonProperty("endCurrent")
    private Boolean endCurrent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Diploma() {
    }

    /**
     * 
     * @param field
     * @param school
     * @param endCurrent
     * @param degree
     * @param location
     */
    public Diploma(String degree, String field, String school, String location, Boolean endCurrent) {
        super();
        this.degree = degree;
        this.field = field;
        this.school = school;
        this.location = location;
        this.endCurrent = endCurrent;
    }

    @JsonProperty("degree")
    public String getDegree() {
        return degree;
    }

    @JsonProperty("degree")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Diploma withDegree(String degree) {
        this.degree = degree;
        return this;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public Diploma withField(String field) {
        this.field = field;
        return this;
    }

    @JsonProperty("school")
    public String getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(String school) {
        this.school = school;
    }

    public Diploma withSchool(String school) {
        this.school = school;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Diploma withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("endCurrent")
    public Boolean getEndCurrent() {
        return endCurrent;
    }

    @JsonProperty("endCurrent")
    public void setEndCurrent(Boolean endCurrent) {
        this.endCurrent = endCurrent;
    }

    public Diploma withEndCurrent(Boolean endCurrent) {
        this.endCurrent = endCurrent;
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

    public Diploma withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Diploma.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degree");
        sb.append('=');
        sb.append(((this.degree == null)?"<null>":this.degree));
        sb.append(',');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("school");
        sb.append('=');
        sb.append(((this.school == null)?"<null>":this.school));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("endCurrent");
        sb.append('=');
        sb.append(((this.endCurrent == null)?"<null>":this.endCurrent));
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
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.school == null)? 0 :this.school.hashCode()));
        result = ((result* 31)+((this.endCurrent == null)? 0 :this.endCurrent.hashCode()));
        result = ((result* 31)+((this.degree == null)? 0 :this.degree.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diploma) == false) {
            return false;
        }
        Diploma rhs = ((Diploma) other);
        return (((((((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field)))&&((this.school == rhs.school)||((this.school!= null)&&this.school.equals(rhs.school))))&&((this.endCurrent == rhs.endCurrent)||((this.endCurrent!= null)&&this.endCurrent.equals(rhs.endCurrent))))&&((this.degree == rhs.degree)||((this.degree!= null)&&this.degree.equals(rhs.degree))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
