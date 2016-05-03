package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Contact;
import io.swagger.client.model.Datetime;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainDetail   {
  
  private Double domainId = null;
  private String domain = null;
  private String status = null;
  private Datetime expires = null;
  private Boolean expirationProtected = null;
  private Boolean holdRegistrar = null;
  private Boolean limited = null;
  private Boolean locked = null;
  private Boolean privacy = null;
  private Boolean renewAuto = null;
  private Datetime renewDeadline = null;
  private Boolean smart = null;
  private Boolean transferProtected = null;
  private Datetime createdAt = null;
  private String authCode = null;
  private List<String> nameServers = new ArrayList<String>();
  private Contact contactRegistrant = null;
  private Contact contactBilling = null;
  private Contact contactAdmin = null;
  private Contact contactTech = null;

  
  /**
   * Unique identifier for this Domain
   **/
  public DomainDetail domainId(Double domainId) {
    this.domainId = domainId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for this Domain")
  @JsonProperty("domainId")
  public Double getDomainId() {
    return domainId;
  }
  public void setDomainId(Double domainId) {
    this.domainId = domainId;
  }

  
  /**
   * Name of the domain
   **/
  public DomainDetail domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the domain")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * Processing status of the domain<br/><ul>\n<li><strong style='margin-left: 12px;'>ACTIVE</strong> - All is well</li>\n<li><strong style='margin-left: 12px;'>AWAITING*</strong> - System is waiting for the end-user to complete an action</li>\n<li><strong style='margin-left: 12px;'>CANCELLED*</strong> - Domain has been cancelled, and may or may not be reclaimable</li>\n<li><strong style='margin-left: 12px;'>CONFISCATED</strong> - Domain has been confiscated, usually for abuse, chargeback, or fraud</li>\n<li><strong style='margin-left: 12px;'>DISABLED*</strong> - Domain has been disabled</li>\n<li><strong style='margin-left: 12px;'>EXCLUDED*</strong> - Domain has been excluded from Firehose registration</li>\n<li><strong style='margin-left: 12px;'>EXPIRED*</strong> - Domain has expired</li>\n<li><strong style='margin-left: 12px;'>FAILED*</strong> - Domain has failed a required action, and the system is no longer retrying</li>\n<li><strong style='margin-left: 12px;'>HELD*</strong> - Domain has been placed on hold, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>LOCKED*</strong> - Domain has been locked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>PARKED*</strong> - Domain has been parked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>PENDING*</strong> - Domain is working its way through an automated workflow</li>\n<li><strong style='margin-left: 12px;'>RESERVED*</strong> - Domain is reserved, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>REVERTED</strong> - Domain has been reverted, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>SUSPENDED*</strong> - Domain has been suspended, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>TRANSFERRED*</strong> - Domain has been transferred out</li>\n<li><strong style='margin-left: 12px;'>UNKNOWN</strong> - Domain is in an unknown state</li>\n<li><strong style='margin-left: 12px;'>UNLOCKED*</strong> - Domain has been unlocked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>UNPARKED*</strong> - Domain has been unparked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>UPDATED*</strong> - Domain ownership has been transferred to another account</li>\n</ul>
   **/
  public DomainDetail status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Processing status of the domain<br/><ul>\n<li><strong style='margin-left: 12px;'>ACTIVE</strong> - All is well</li>\n<li><strong style='margin-left: 12px;'>AWAITING*</strong> - System is waiting for the end-user to complete an action</li>\n<li><strong style='margin-left: 12px;'>CANCELLED*</strong> - Domain has been cancelled, and may or may not be reclaimable</li>\n<li><strong style='margin-left: 12px;'>CONFISCATED</strong> - Domain has been confiscated, usually for abuse, chargeback, or fraud</li>\n<li><strong style='margin-left: 12px;'>DISABLED*</strong> - Domain has been disabled</li>\n<li><strong style='margin-left: 12px;'>EXCLUDED*</strong> - Domain has been excluded from Firehose registration</li>\n<li><strong style='margin-left: 12px;'>EXPIRED*</strong> - Domain has expired</li>\n<li><strong style='margin-left: 12px;'>FAILED*</strong> - Domain has failed a required action, and the system is no longer retrying</li>\n<li><strong style='margin-left: 12px;'>HELD*</strong> - Domain has been placed on hold, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>LOCKED*</strong> - Domain has been locked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>PARKED*</strong> - Domain has been parked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>PENDING*</strong> - Domain is working its way through an automated workflow</li>\n<li><strong style='margin-left: 12px;'>RESERVED*</strong> - Domain is reserved, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>REVERTED</strong> - Domain has been reverted, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>SUSPENDED*</strong> - Domain has been suspended, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>TRANSFERRED*</strong> - Domain has been transferred out</li>\n<li><strong style='margin-left: 12px;'>UNKNOWN</strong> - Domain is in an unknown state</li>\n<li><strong style='margin-left: 12px;'>UNLOCKED*</strong> - Domain has been unlocked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>UNPARKED*</strong> - Domain has been unparked, and likely requires intervention from Support</li>\n<li><strong style='margin-left: 12px;'>UPDATED*</strong> - Domain ownership has been transferred to another account</li>\n</ul>")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date and time when this domain will expire
   **/
  public DomainDetail expires(Datetime expires) {
    this.expires = expires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time when this domain will expire")
  @JsonProperty("expires")
  public Datetime getExpires() {
    return expires;
  }
  public void setExpires(Datetime expires) {
    this.expires = expires;
  }

  
  /**
   * Whether or not the domain is protected from expiration
   **/
  public DomainDetail expirationProtected(Boolean expirationProtected) {
    this.expirationProtected = expirationProtected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is protected from expiration")
  @JsonProperty("expirationProtected")
  public Boolean getExpirationProtected() {
    return expirationProtected;
  }
  public void setExpirationProtected(Boolean expirationProtected) {
    this.expirationProtected = expirationProtected;
  }

  
  /**
   * Whether or not the domain is on-hold by the registrar
   **/
  public DomainDetail holdRegistrar(Boolean holdRegistrar) {
    this.holdRegistrar = holdRegistrar;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is on-hold by the registrar")
  @JsonProperty("holdRegistrar")
  public Boolean getHoldRegistrar() {
    return holdRegistrar;
  }
  public void setHoldRegistrar(Boolean holdRegistrar) {
    this.holdRegistrar = holdRegistrar;
  }

  
  /**
   * Whether or not the domain is limited
   **/
  public DomainDetail limited(Boolean limited) {
    this.limited = limited;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is limited")
  @JsonProperty("limited")
  public Boolean getLimited() {
    return limited;
  }
  public void setLimited(Boolean limited) {
    this.limited = limited;
  }

  
  /**
   * Whether or not the domain is locked to prevent transfers
   **/
  public DomainDetail locked(Boolean locked) {
    this.locked = locked;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is locked to prevent transfers")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  
  /**
   * Whether or not the domain has privacy protection
   **/
  public DomainDetail privacy(Boolean privacy) {
    this.privacy = privacy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain has privacy protection")
  @JsonProperty("privacy")
  public Boolean getPrivacy() {
    return privacy;
  }
  public void setPrivacy(Boolean privacy) {
    this.privacy = privacy;
  }

  
  /**
   * Whether or not the domain is configured to automatically renew
   **/
  public DomainDetail renewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is configured to automatically renew")
  @JsonProperty("renewAuto")
  public Boolean getRenewAuto() {
    return renewAuto;
  }
  public void setRenewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
  }

  
  /**
   * Date the domain must renew on
   **/
  public DomainDetail renewDeadline(Datetime renewDeadline) {
    this.renewDeadline = renewDeadline;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date the domain must renew on")
  @JsonProperty("renewDeadline")
  public Datetime getRenewDeadline() {
    return renewDeadline;
  }
  public void setRenewDeadline(Datetime renewDeadline) {
    this.renewDeadline = renewDeadline;
  }

  
  /**
   * Whether or not the domain is smart
   **/
  public DomainDetail smart(Boolean smart) {
    this.smart = smart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is smart")
  @JsonProperty("smart")
  public Boolean getSmart() {
    return smart;
  }
  public void setSmart(Boolean smart) {
    this.smart = smart;
  }

  
  /**
   * Whether or not the domain is protected from transfer
   **/
  public DomainDetail transferProtected(Boolean transferProtected) {
    this.transferProtected = transferProtected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain is protected from transfer")
  @JsonProperty("transferProtected")
  public Boolean getTransferProtected() {
    return transferProtected;
  }
  public void setTransferProtected(Boolean transferProtected) {
    this.transferProtected = transferProtected;
  }

  
  /**
   * Date and time when this domain was created
   **/
  public DomainDetail createdAt(Datetime createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date and time when this domain was created")
  @JsonProperty("createdAt")
  public Datetime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Datetime createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Authorization code for transferring the Domain
   **/
  public DomainDetail authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authorization code for transferring the Domain")
  @JsonProperty("authCode")
  public String getAuthCode() {
    return authCode;
  }
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  
  /**
   * Fully-qualified domain names for DNS servers
   **/
  public DomainDetail nameServers(List<String> nameServers) {
    this.nameServers = nameServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Fully-qualified domain names for DNS servers")
  @JsonProperty("nameServers")
  public List<String> getNameServers() {
    return nameServers;
  }
  public void setNameServers(List<String> nameServers) {
    this.nameServers = nameServers;
  }

  
  /**
   * Registration contact for the domain
   **/
  public DomainDetail contactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Registration contact for the domain")
  @JsonProperty("contactRegistrant")
  public Contact getContactRegistrant() {
    return contactRegistrant;
  }
  public void setContactRegistrant(Contact contactRegistrant) {
    this.contactRegistrant = contactRegistrant;
  }

  
  /**
   * Billing contact for the domain registration
   **/
  public DomainDetail contactBilling(Contact contactBilling) {
    this.contactBilling = contactBilling;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Billing contact for the domain registration")
  @JsonProperty("contactBilling")
  public Contact getContactBilling() {
    return contactBilling;
  }
  public void setContactBilling(Contact contactBilling) {
    this.contactBilling = contactBilling;
  }

  
  /**
   * Administrative contact for the domain registration
   **/
  public DomainDetail contactAdmin(Contact contactAdmin) {
    this.contactAdmin = contactAdmin;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Administrative contact for the domain registration")
  @JsonProperty("contactAdmin")
  public Contact getContactAdmin() {
    return contactAdmin;
  }
  public void setContactAdmin(Contact contactAdmin) {
    this.contactAdmin = contactAdmin;
  }

  
  /**
   * Technical contact for the domain registration
   **/
  public DomainDetail contactTech(Contact contactTech) {
    this.contactTech = contactTech;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Technical contact for the domain registration")
  @JsonProperty("contactTech")
  public Contact getContactTech() {
    return contactTech;
  }
  public void setContactTech(Contact contactTech) {
    this.contactTech = contactTech;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainDetail domainDetail = (DomainDetail) o;
    return Objects.equals(this.domainId, domainDetail.domainId) &&
        Objects.equals(this.domain, domainDetail.domain) &&
        Objects.equals(this.status, domainDetail.status) &&
        Objects.equals(this.expires, domainDetail.expires) &&
        Objects.equals(this.expirationProtected, domainDetail.expirationProtected) &&
        Objects.equals(this.holdRegistrar, domainDetail.holdRegistrar) &&
        Objects.equals(this.limited, domainDetail.limited) &&
        Objects.equals(this.locked, domainDetail.locked) &&
        Objects.equals(this.privacy, domainDetail.privacy) &&
        Objects.equals(this.renewAuto, domainDetail.renewAuto) &&
        Objects.equals(this.renewDeadline, domainDetail.renewDeadline) &&
        Objects.equals(this.smart, domainDetail.smart) &&
        Objects.equals(this.transferProtected, domainDetail.transferProtected) &&
        Objects.equals(this.createdAt, domainDetail.createdAt) &&
        Objects.equals(this.authCode, domainDetail.authCode) &&
        Objects.equals(this.nameServers, domainDetail.nameServers) &&
        Objects.equals(this.contactRegistrant, domainDetail.contactRegistrant) &&
        Objects.equals(this.contactBilling, domainDetail.contactBilling) &&
        Objects.equals(this.contactAdmin, domainDetail.contactAdmin) &&
        Objects.equals(this.contactTech, domainDetail.contactTech);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, domain, status, expires, expirationProtected, holdRegistrar, limited, locked, privacy, renewAuto, renewDeadline, smart, transferProtected, createdAt, authCode, nameServers, contactRegistrant, contactBilling, contactAdmin, contactTech);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainDetail {\n");
    
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    expirationProtected: ").append(toIndentedString(expirationProtected)).append("\n");
    sb.append("    holdRegistrar: ").append(toIndentedString(holdRegistrar)).append("\n");
    sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
    sb.append("    renewDeadline: ").append(toIndentedString(renewDeadline)).append("\n");
    sb.append("    smart: ").append(toIndentedString(smart)).append("\n");
    sb.append("    transferProtected: ").append(toIndentedString(transferProtected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    contactRegistrant: ").append(toIndentedString(contactRegistrant)).append("\n");
    sb.append("    contactBilling: ").append(toIndentedString(contactBilling)).append("\n");
    sb.append("    contactAdmin: ").append(toIndentedString(contactAdmin)).append("\n");
    sb.append("    contactTech: ").append(toIndentedString(contactTech)).append("\n");
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

