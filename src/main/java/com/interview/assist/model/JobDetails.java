
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
    "startDateMonth",
    "startDateYear",
    "endDateMonth",
    "endDateYear",
    "endCurrent",
    "title",
    "company",
    "location",
    "description"
})
@Generated("jsonschema2pojo")
public class JobDetails {

    @JsonProperty("startDateMonth")
    private String startDateMonth;
    @JsonProperty("startDateYear")
    private String startDateYear;
    @JsonProperty("endDateMonth")
    private String endDateMonth;
    @JsonProperty("endDateYear")
    private String endDateYear;
    @JsonProperty("endCurrent")
    private Boolean endCurrent;
    @JsonProperty("title")
    private String title;
    @JsonProperty("company")
    private String company;
    @JsonProperty("location")
    private String location;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobDetails() {
    }

    /**
     * 
     * @param endCurrent
     * @param description
     * @param endDateYear
     * @param company
     * @param location
     * @param startDateMonth
     * @param startDateYear
     * @param title
     * @param endDateMonth
     */
    public JobDetails(String startDateMonth, String startDateYear, String endDateMonth, String endDateYear, Boolean endCurrent, String title, String company, String location, String description) {
        super();
        this.startDateMonth = startDateMonth;
        this.startDateYear = startDateYear;
        this.endDateMonth = endDateMonth;
        this.endDateYear = endDateYear;
        this.endCurrent = endCurrent;
        this.title = title;
        this.company = company;
        this.location = location;
        this.description = description;
    }

    @JsonProperty("startDateMonth")
    public String getStartDateMonth() {
        return startDateMonth;
    }

    @JsonProperty("startDateMonth")
    public void setStartDateMonth(String startDateMonth) {
        this.startDateMonth = startDateMonth;
    }

    public JobDetails withStartDateMonth(String startDateMonth) {
        this.startDateMonth = startDateMonth;
        return this;
    }

    @JsonProperty("startDateYear")
    public String getStartDateYear() {
        return startDateYear;
    }

    @JsonProperty("startDateYear")
    public void setStartDateYear(String startDateYear) {
        this.startDateYear = startDateYear;
    }

    public JobDetails withStartDateYear(String startDateYear) {
        this.startDateYear = startDateYear;
        return this;
    }

    @JsonProperty("endDateMonth")
    public String getEndDateMonth() {
        return endDateMonth;
    }

    @JsonProperty("endDateMonth")
    public void setEndDateMonth(String endDateMonth) {
        this.endDateMonth = endDateMonth;
    }

    public JobDetails withEndDateMonth(String endDateMonth) {
        this.endDateMonth = endDateMonth;
        return this;
    }

    @JsonProperty("endDateYear")
    public String getEndDateYear() {
        return endDateYear;
    }

    @JsonProperty("endDateYear")
    public void setEndDateYear(String endDateYear) {
        this.endDateYear = endDateYear;
    }

    public JobDetails withEndDateYear(String endDateYear) {
        this.endDateYear = endDateYear;
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

    public JobDetails withEndCurrent(Boolean endCurrent) {
        this.endCurrent = endCurrent;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public JobDetails withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public JobDetails withCompany(String company) {
        this.company = company;
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

    public JobDetails withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public JobDetails withDescription(String description) {
        this.description = description;
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

    public JobDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startDateMonth");
        sb.append('=');
        sb.append(((this.startDateMonth == null)?"<null>":this.startDateMonth));
        sb.append(',');
        sb.append("startDateYear");
        sb.append('=');
        sb.append(((this.startDateYear == null)?"<null>":this.startDateYear));
        sb.append(',');
        sb.append("endDateMonth");
        sb.append('=');
        sb.append(((this.endDateMonth == null)?"<null>":this.endDateMonth));
        sb.append(',');
        sb.append("endDateYear");
        sb.append('=');
        sb.append(((this.endDateYear == null)?"<null>":this.endDateYear));
        sb.append(',');
        sb.append("endCurrent");
        sb.append('=');
        sb.append(((this.endCurrent == null)?"<null>":this.endCurrent));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.endCurrent == null)? 0 :this.endCurrent.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.endDateYear == null)? 0 :this.endDateYear.hashCode()));
        result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDateMonth == null)? 0 :this.startDateMonth.hashCode()));
        result = ((result* 31)+((this.startDateYear == null)? 0 :this.startDateYear.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.endDateMonth == null)? 0 :this.endDateMonth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDetails) == false) {
            return false;
        }
        JobDetails rhs = ((JobDetails) other);
        return (((((((((((this.endCurrent == rhs.endCurrent)||((this.endCurrent!= null)&&this.endCurrent.equals(rhs.endCurrent)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.endDateYear == rhs.endDateYear)||((this.endDateYear!= null)&&this.endDateYear.equals(rhs.endDateYear))))&&((this.company == rhs.company)||((this.company!= null)&&this.company.equals(rhs.company))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDateMonth == rhs.startDateMonth)||((this.startDateMonth!= null)&&this.startDateMonth.equals(rhs.startDateMonth))))&&((this.startDateYear == rhs.startDateYear)||((this.startDateYear!= null)&&this.startDateYear.equals(rhs.startDateYear))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.endDateMonth == rhs.endDateMonth)||((this.endDateMonth!= null)&&this.endDateMonth.equals(rhs.endDateMonth))));
    }

}
