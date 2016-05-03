package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Consent;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainTransferIn   {
  
  private String authCode = null;
  private Integer period = null;
  private Boolean renewAuto = null;
  private Boolean privacy = null;
  private Consent consent = null;

  
  /**
   * Authorization code from registrar for transferring a domain
   **/
  public DomainTransferIn authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authorization code from registrar for transferring a domain")
  @JsonProperty("authCode")
  public String getAuthCode() {
    return authCode;
  }
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  
  /**
   * Can be more than 1 but no more than 10 years total including current registration length
   * minimum: 1.0
   * maximum: 10.0
   **/
  public DomainTransferIn period(Integer period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Can be more than 1 but no more than 10 years total including current registration length")
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }

  
  /**
   * Whether or not the domain should be configured to automatically renew
   **/
  public DomainTransferIn renewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the domain should be configured to automatically renew")
  @JsonProperty("renewAuto")
  public Boolean getRenewAuto() {
    return renewAuto;
  }
  public void setRenewAuto(Boolean renewAuto) {
    this.renewAuto = renewAuto;
  }

  
  /**
   * Whether or not privacy has been requested
   **/
  public DomainTransferIn privacy(Boolean privacy) {
    this.privacy = privacy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not privacy has been requested")
  @JsonProperty("privacy")
  public Boolean getPrivacy() {
    return privacy;
  }
  public void setPrivacy(Boolean privacy) {
    this.privacy = privacy;
  }

  
  /**
   * Required agreements can be retrieved via the GET ./domains/agreements endpoint
   **/
  public DomainTransferIn consent(Consent consent) {
    this.consent = consent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required agreements can be retrieved via the GET ./domains/agreements endpoint")
  @JsonProperty("consent")
  public Consent getConsent() {
    return consent;
  }
  public void setConsent(Consent consent) {
    this.consent = consent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainTransferIn domainTransferIn = (DomainTransferIn) o;
    return Objects.equals(this.authCode, domainTransferIn.authCode) &&
        Objects.equals(this.period, domainTransferIn.period) &&
        Objects.equals(this.renewAuto, domainTransferIn.renewAuto) &&
        Objects.equals(this.privacy, domainTransferIn.privacy) &&
        Objects.equals(this.consent, domainTransferIn.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, period, renewAuto, privacy, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainTransferIn {\n");
    
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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

