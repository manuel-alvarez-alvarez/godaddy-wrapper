package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Address;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class Contact   {
  
  private String nameFirst = null;
  private String nameMiddle = null;
  private String nameLast = null;
  private String organization = null;
  private String jobTitle = null;
  private String email = null;
  private String phone = null;
  private String fax = null;
  private Address addressMailing = null;

  
  /**
   **/
  public Contact nameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("nameFirst")
  public String getNameFirst() {
    return nameFirst;
  }
  public void setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
  }

  
  /**
   **/
  public Contact nameMiddle(String nameMiddle) {
    this.nameMiddle = nameMiddle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nameMiddle")
  public String getNameMiddle() {
    return nameMiddle;
  }
  public void setNameMiddle(String nameMiddle) {
    this.nameMiddle = nameMiddle;
  }

  
  /**
   **/
  public Contact nameLast(String nameLast) {
    this.nameLast = nameLast;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("nameLast")
  public String getNameLast() {
    return nameLast;
  }
  public void setNameLast(String nameLast) {
    this.nameLast = nameLast;
  }

  
  /**
   **/
  public Contact organization(String organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  
  /**
   **/
  public Contact jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jobTitle")
  public String getJobTitle() {
    return jobTitle;
  }
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  
  /**
   **/
  public Contact email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  public Contact fax(String fax) {
    this.fax = fax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  
  /**
   **/
  public Contact addressMailing(Address addressMailing) {
    this.addressMailing = addressMailing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("addressMailing")
  public Address getAddressMailing() {
    return addressMailing;
  }
  public void setAddressMailing(Address addressMailing) {
    this.addressMailing = addressMailing;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.nameFirst, contact.nameFirst) &&
        Objects.equals(this.nameMiddle, contact.nameMiddle) &&
        Objects.equals(this.nameLast, contact.nameLast) &&
        Objects.equals(this.organization, contact.organization) &&
        Objects.equals(this.jobTitle, contact.jobTitle) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.fax, contact.fax) &&
        Objects.equals(this.addressMailing, contact.addressMailing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameFirst, nameMiddle, nameLast, organization, jobTitle, email, phone, fax, addressMailing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    nameFirst: ").append(toIndentedString(nameFirst)).append("\n");
    sb.append("    nameMiddle: ").append(toIndentedString(nameMiddle)).append("\n");
    sb.append("    nameLast: ").append(toIndentedString(nameLast)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    addressMailing: ").append(toIndentedString(addressMailing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

