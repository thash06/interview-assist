
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
    "firstName",
    "lastName",
    "email",
    "headline",
    "summary",
    "additionalInfo",
    "phoneNumber",
    "location",
    "skills",
    "positions",
    "educations",
    "links",
    "awards",
    "certifications",
    "associations",
    "patents",
    "publications",
    "militaryServices"
})
@Generated("jsonschema2pojo")
public class ApplicantDetails {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("headline")
    private String headline;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("skills")
    private String skills;
    @JsonProperty("positions")
    private JobHistory jobHistory;
    @JsonProperty("educations")
    private Education educations;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("awards")
    private Awards awards;
    @JsonProperty("certifications")
    private Certifications certifications;
    @JsonProperty("associations")
    private Associations associations;
    @JsonProperty("patents")
    private Patents patents;
    @JsonProperty("publications")
    private Publications publications;
    @JsonProperty("militaryServices")
    private MilitaryServices militaryServices;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApplicantDetails() {
    }

    /**
     * 
     * @param summary
     * @param associations
     * @param militaryServices
     * @param lastName
     * @param jobHistory
     * @param educations
     * @param certifications
     * @param skills
     * @param firstName
     * @param phoneNumber
     * @param awards
     * @param additionalInfo
     * @param patents
     * @param location
     * @param links
     * @param headline
     * @param email
     * @param publications
     */
    public ApplicantDetails(String firstName, String lastName, String email, String headline, String summary, String additionalInfo, String phoneNumber, Location location, String skills, JobHistory jobHistory, Education educations, Links links, Awards awards, Certifications certifications, Associations associations, Patents patents, Publications publications, MilitaryServices militaryServices) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.headline = headline;
        this.summary = summary;
        this.additionalInfo = additionalInfo;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.skills = skills;
        this.jobHistory = jobHistory;
        this.educations = educations;
        this.links = links;
        this.awards = awards;
        this.certifications = certifications;
        this.associations = associations;
        this.patents = patents;
        this.publications = publications;
        this.militaryServices = militaryServices;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ApplicantDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ApplicantDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public ApplicantDetails withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("headline")
    public String getHeadline() {
        return headline;
    }

    @JsonProperty("headline")
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public ApplicantDetails withHeadline(String headline) {
        this.headline = headline;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ApplicantDetails withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("additionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public ApplicantDetails withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ApplicantDetails withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public ApplicantDetails withLocation(Location location) {
        this.location = location;
        return this;
    }

    @JsonProperty("skills")
    public String getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(String skills) {
        this.skills = skills;
    }

    public ApplicantDetails withSkills(String skills) {
        this.skills = skills;
        return this;
    }

    @JsonProperty("positions")
    public JobHistory getPositions() {
        return jobHistory;
    }

    @JsonProperty("positions")
    public void setPositions(JobHistory jobHistory) {
        this.jobHistory = jobHistory;
    }

    public ApplicantDetails withPositions(JobHistory jobHistory) {
        this.jobHistory = jobHistory;
        return this;
    }

    @JsonProperty("educations")
    public Education getEducations() {
        return educations;
    }

    @JsonProperty("educations")
    public void setEducations(Education educations) {
        this.educations = educations;
    }

    public ApplicantDetails withEducations(Education educations) {
        this.educations = educations;
        return this;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    public ApplicantDetails withLinks(Links links) {
        this.links = links;
        return this;
    }

    @JsonProperty("awards")
    public Awards getAwards() {
        return awards;
    }

    @JsonProperty("awards")
    public void setAwards(Awards awards) {
        this.awards = awards;
    }

    public ApplicantDetails withAwards(Awards awards) {
        this.awards = awards;
        return this;
    }

    @JsonProperty("certifications")
    public Certifications getCertifications() {
        return certifications;
    }

    @JsonProperty("certifications")
    public void setCertifications(Certifications certifications) {
        this.certifications = certifications;
    }

    public ApplicantDetails withCertifications(Certifications certifications) {
        this.certifications = certifications;
        return this;
    }

    @JsonProperty("associations")
    public Associations getAssociations() {
        return associations;
    }

    @JsonProperty("associations")
    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

    public ApplicantDetails withAssociations(Associations associations) {
        this.associations = associations;
        return this;
    }

    @JsonProperty("patents")
    public Patents getPatents() {
        return patents;
    }

    @JsonProperty("patents")
    public void setPatents(Patents patents) {
        this.patents = patents;
    }

    public ApplicantDetails withPatents(Patents patents) {
        this.patents = patents;
        return this;
    }

    @JsonProperty("publications")
    public Publications getPublications() {
        return publications;
    }

    @JsonProperty("publications")
    public void setPublications(Publications publications) {
        this.publications = publications;
    }

    public ApplicantDetails withPublications(Publications publications) {
        this.publications = publications;
        return this;
    }

    @JsonProperty("militaryServices")
    public MilitaryServices getMilitaryServices() {
        return militaryServices;
    }

    @JsonProperty("militaryServices")
    public void setMilitaryServices(MilitaryServices militaryServices) {
        this.militaryServices = militaryServices;
    }

    public ApplicantDetails withMilitaryServices(MilitaryServices militaryServices) {
        this.militaryServices = militaryServices;
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

    public ApplicantDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("headline");
        sb.append('=');
        sb.append(((this.headline == null)?"<null>":this.headline));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("additionalInfo");
        sb.append('=');
        sb.append(((this.additionalInfo == null)?"<null>":this.additionalInfo));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("skills");
        sb.append('=');
        sb.append(((this.skills == null)?"<null>":this.skills));
        sb.append(',');
        sb.append("positions");
        sb.append('=');
        sb.append(((this.jobHistory == null)?"<null>":this.jobHistory));
        sb.append(',');
        sb.append("educations");
        sb.append('=');
        sb.append(((this.educations == null)?"<null>":this.educations));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("awards");
        sb.append('=');
        sb.append(((this.awards == null)?"<null>":this.awards));
        sb.append(',');
        sb.append("certifications");
        sb.append('=');
        sb.append(((this.certifications == null)?"<null>":this.certifications));
        sb.append(',');
        sb.append("associations");
        sb.append('=');
        sb.append(((this.associations == null)?"<null>":this.associations));
        sb.append(',');
        sb.append("patents");
        sb.append('=');
        sb.append(((this.patents == null)?"<null>":this.patents));
        sb.append(',');
        sb.append("publications");
        sb.append('=');
        sb.append(((this.publications == null)?"<null>":this.publications));
        sb.append(',');
        sb.append("militaryServices");
        sb.append('=');
        sb.append(((this.militaryServices == null)?"<null>":this.militaryServices));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.associations == null)? 0 :this.associations.hashCode()));
        result = ((result* 31)+((this.militaryServices == null)? 0 :this.militaryServices.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.jobHistory == null)? 0 :this.jobHistory.hashCode()));
        result = ((result* 31)+((this.educations == null)? 0 :this.educations.hashCode()));
        result = ((result* 31)+((this.certifications == null)? 0 :this.certifications.hashCode()));
        result = ((result* 31)+((this.skills == null)? 0 :this.skills.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.awards == null)? 0 :this.awards.hashCode()));
        result = ((result* 31)+((this.additionalInfo == null)? 0 :this.additionalInfo.hashCode()));
        result = ((result* 31)+((this.patents == null)? 0 :this.patents.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.headline == null)? 0 :this.headline.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.publications == null)? 0 :this.publications.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantDetails) == false) {
            return false;
        }
        ApplicantDetails rhs = ((ApplicantDetails) other);
        return ((((((((((((((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.associations == rhs.associations)||((this.associations!= null)&&this.associations.equals(rhs.associations))))&&((this.militaryServices == rhs.militaryServices)||((this.militaryServices!= null)&&this.militaryServices.equals(rhs.militaryServices))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.jobHistory == rhs.jobHistory)||((this.jobHistory != null)&&this.jobHistory.equals(rhs.jobHistory))))&&((this.educations == rhs.educations)||((this.educations!= null)&&this.educations.equals(rhs.educations))))&&((this.certifications == rhs.certifications)||((this.certifications!= null)&&this.certifications.equals(rhs.certifications))))&&((this.skills == rhs.skills)||((this.skills!= null)&&this.skills.equals(rhs.skills))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.awards == rhs.awards)||((this.awards!= null)&&this.awards.equals(rhs.awards))))&&((this.additionalInfo == rhs.additionalInfo)||((this.additionalInfo!= null)&&this.additionalInfo.equals(rhs.additionalInfo))))&&((this.patents == rhs.patents)||((this.patents!= null)&&this.patents.equals(rhs.patents))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.headline == rhs.headline)||((this.headline!= null)&&this.headline.equals(rhs.headline))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.publications == rhs.publications)||((this.publications!= null)&&this.publications.equals(rhs.publications))));
    }

}
