package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Consent;
import io.swagger.client.model.Contact;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainPurchase   {
  
  private String domain = null;
  private Consent consent = null;
  private Integer period = null;
  private List<String> nameServers = new ArrayList<String>();
  private Boolean renewAuto = null;
  private Boolean privacy = null;
  private Contact contactRegistrant = null;
  private Contact contactAdmin = null;
  private Contact contactTech = null;
  private Contact contactBilling = null;

  
  /**
   **/
  public DomainPurchase domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public DomainPurchase consent(Consent consent) {
    this.consent = consent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("consent")
  public Consent getConsent() {
    return consent;
  }
  public void setConsent(Consent consent) {
    this.consent = consent;
  }

  
  /**
   * minimum: 1.0
   * maximum: 10.0
   **/
  public DomainPurchase period(Integer period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   **/
  public DomainPurchase nameServers(List<String> nameServers) {
    this.nameServers = nameServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nameServers")
  public List<String> getNameServers() {
    return nameServers;
  }
  public void setNameServers(List<String> nameServers) {
    this.nameServers = nameServers;
  }

  
  /**
   **/
  public DomainPurchase renewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("renewAuto")
  public Boolean getRenewAuto() {
    return renewAuto;
  }
  public void setRenewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
  }

  
  /**
   **/
  public DomainPurchase privacy(Boolean privacy) {
    this.privacy = privacy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("privacy")
  public Boolean getPrivacy() {
    return privacy;
  }
  public void setPrivacy(Boolean privacy) {
    this.privacy = privacy;
  }

  
  /**
   **/
  public DomainPurchase contactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactRegistrant")
  public Contact getContactRegistrant() {
    return contactRegistrant;
  }
  public void setContactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
  }

  
  /**
   **/
  public DomainPurchase contactAdmin(Contact contactAdmin) {
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
  public DomainPurchase contactTech(Contact contactTech) {
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
  public DomainPurchase contactBilling(Contact contactBilling) {
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
    DomainPurchase domainPurchase = (DomainPurchase) o;
    return Objects.equals(this.domain, domainPurchase.domain) &&
        Objects.equals(this.consent, domainPurchase.consent) &&
        Objects.equals(this.period, domainPurchase.period) &&
        Objects.equals(this.nameServers, domainPurchase.nameServers) &&
        Objects.equals(this.renewAuto, domainPurchase.renewAuto) &&
        Objects.equals(this.privacy, domainPurchase.privacy) &&
        Objects.equals(this.contactRegistrant, domainPurchase.contactRegistrant) &&
        Objects.equals(this.contactAdmin, domainPurchase.contactAdmin) &&
        Objects.equals(this.contactTech, domainPurchase.contactTech) &&
        Objects.equals(this.contactBilling, domainPurchase.contactBilling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, consent, period, nameServers, renewAuto, privacy, contactRegistrant, contactAdmin, contactTech, contactBilling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPurchase {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

