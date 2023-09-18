
package com.interview.assist.model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "employeeId",
    "firstName",
    "lastName",
    "email",
    "phoneNumber",
    "location",
    "skills",
    "designation",
    "department",
    "certifications"
})
@Generated("jsonschema2pojo")
@Document("interviewer")
public class Interviewer {

    @JsonProperty("employeeId")
    private String employeeId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("skills")
    private String skills;
    @JsonProperty("designation")
    private Designation designation;
    @JsonProperty("department")
    private Department department;
    @JsonProperty("certifications")
    private Certifications certifications;

    /**
     * No args constructor for use in serialization
     *
     */
    public Interviewer() {
    }

    /**
     *
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param email
     * @param headline
     * @param summary
     * @param additionalInfo
     * @param phoneNumber
     * @param location
     * @param skills
     */
    public Interviewer(String employeeId, String firstName, String lastName, String email, String phoneNumber, Location location, String skills, Certifications certifications) {
        super();
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.skills = skills;
        this.certifications = certifications;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Interviewer withFirstName(String firstName) {
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

    public Interviewer withLastName(String lastName) {
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

    public Interviewer withEmail(String email) {
        this.email = email;
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

    public Interviewer withPhoneNumber(String phoneNumber) {
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

    public Interviewer withLocation(Location location) {
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

    public Interviewer withSkills(String skills) {
        this.skills = skills;
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

    public Interviewer withCertifications(Certifications certifications) {
        this.certifications = certifications;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Interviewer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("certifications");
        sb.append('=');
        sb.append(((this.certifications == null)?"<null>":this.certifications));
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
        result = ((result* 31)+((this.employeeId == null)? 0 :this.employeeId.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.certifications == null)? 0 :this.certifications.hashCode()));
        result = ((result* 31)+((this.skills == null)? 0 :this.skills.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interviewer that = (Interviewer) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(location, that.location) && Objects.equals(skills, that.skills) && Objects.equals(designation, that.designation) && Objects.equals(department, that.department) && Objects.equals(certifications, that.certifications);
    }
}
