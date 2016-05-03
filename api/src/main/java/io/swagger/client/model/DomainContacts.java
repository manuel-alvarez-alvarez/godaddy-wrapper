package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Contact;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainContacts   {
  
  private Contact contactRegistrant = null;
  private Contact contactAdmin = null;
  private Contact contactTech = null;
  private Contact contactBilling = null;

  
  /**
   **/
  public DomainContacts contactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("contactRegistrant")
  public Contact getContactRegistrant() {
    return contactRegistrant;
  }
  public void setContactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
  }

  
  /**
   **/
  public DomainContacts contactAdmin(Contact contactAdmin) {
    this.contactAdmin = contactAdmin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactAdmin")
  public Contact getContactAdmin() {
    return contactAdmin;
  }
  public void setContactAdmin(Contact contactAdmin) {
    this.contactAdmin = contactAdmin;
  }

  
  /**
   **/
  public DomainContacts contactTech(Contact contactTech) {
    this.contactTech = contactTech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactTech")
  public Contact getContactTech() {
    return contactTech;
  }
  public void setContactTech(Contact contactTech) {
    this.contactTech = contactTech;
  }

  
  /**
   **/
  public DomainContacts contactBilling(Contact contactBilling) {
    this.contactBilling = contactBilling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactBilling")
  public Contact getContactBilling() {
    return contactBilling;
  }
  public void setContactBilling(Contact contactBilling) {
    this.contactBilling = contactBilling;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainContacts domainContacts = (DomainContacts) o;
    return Objects.equals(this.contactRegistrant, domainContacts.contactRegistrant) &&
        Objects.equals(this.contactAdmin, domainContacts.contactAdmin) &&
        Objects.equals(this.contactTech, domainContacts.contactTech) &&
        Objects.equals(this.contactBilling, domainContacts.contactBilling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactRegistrant, contactAdmin, contactTech, contactBilling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainContacts {\n");
    
    sb.append("    contactRegistrant: ").append(toIndentedString(contactRegistrant)).append("\n");
    sb.append("    contactAdmin: ").append(toIndentedString(contactAdmin)).append("\n");
    sb.append("    contactTech: ").append(toIndentedString(contactTech)).append("\n");
    sb.append("    contactBilling: ").append(toIndentedString(contactBilling)).append("\n");
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

