
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
    "publicProfileUrl"
})
@Generated("jsonschema2pojo")
public class URLReferences {

    @JsonProperty("publicProfileUrl")
    private String publicProfileUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public URLReferences() {
    }

    /**
     * 
     * @param publicProfileUrl
     */
    public URLReferences(String publicProfileUrl) {
        super();
        this.publicProfileUrl = publicProfileUrl;
    }

    @JsonProperty("publicProfileUrl")
    public String getPublicProfileUrl() {
        return publicProfileUrl;
    }

    @JsonProperty("publicProfileUrl")
    public void setPublicProfileUrl(String publicProfileUrl) {
        this.publicProfileUrl = publicProfileUrl;
    }

    public URLReferences withPublicProfileUrl(String publicProfileUrl) {
        this.publicProfileUrl = publicProfileUrl;
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

    public URLReferences withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(URLReferences.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("publicProfileUrl");
        sb.append('=');
        sb.append(((this.publicProfileUrl == null)?"<null>":this.publicProfileUrl));
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
        result = ((result* 31)+((this.publicProfileUrl == null)? 0 :this.publicProfileUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof URLReferences) == false) {
            return false;
        }
        URLReferences rhs = ((URLReferences) other);
        return (((this.publicProfileUrl == rhs.publicProfileUrl)||((this.publicProfileUrl!= null)&&this.publicProfileUrl.equals(rhs.publicProfileUrl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
