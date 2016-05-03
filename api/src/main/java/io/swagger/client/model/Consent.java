package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class Consent   {
  
  private List<String> agreementKeys = new ArrayList<String>();
  private String agreedBy = null;
  private String agreedAt = null;

  
  /**
   * Unique identifiers of the legal agreements to which the end-user has agreed, as returned from the/domains/agreements endpoint
   **/
  public Consent agreementKeys(List<String> agreementKeys) {
    this.agreementKeys = agreementKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifiers of the legal agreements to which the end-user has agreed, as returned from the/domains/agreements endpoint")
  @JsonProperty("agreementKeys")
  public List<String> getAgreementKeys() {
    return agreementKeys;
  }
  public void setAgreementKeys(List<String> agreementKeys) {
    this.agreementKeys = agreementKeys;
  }

  
  /**
   * Originating client IP address of the end-user's computer when they consented to these legal agreements
   **/
  public Consent agreedBy(String agreedBy) {
    this.agreedBy = agreedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Originating client IP address of the end-user's computer when they consented to these legal agreements")
  @JsonProperty("agreedBy")
  public String getAgreedBy() {
    return agreedBy;
  }
  public void setAgreedBy(String agreedBy) {
    this.agreedBy = agreedBy;
  }

  
  /**
   * Timestamp indicating when the end-user consented to these legal agreements
   **/
  public Consent agreedAt(String agreedAt) {
    this.agreedAt = agreedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Timestamp indicating when the end-user consented to these legal agreements")
  @JsonProperty("agreedAt")
  public String getAgreedAt() {
    return agreedAt;
  }
  public void setAgreedAt(String agreedAt) {
    this.agreedAt = agreedAt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consent consent = (Consent) o;
    return Objects.equals(this.agreementKeys, consent.agreementKeys) &&
        Objects.equals(this.agreedBy, consent.agreedBy) &&
        Objects.equals(this.agreedAt, consent.agreedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementKeys, agreedBy, agreedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consent {\n");
    
    sb.append("    agreementKeys: ").append(toIndentedString(agreementKeys)).append("\n");
    sb.append("    agreedBy: ").append(toIndentedString(agreedBy)).append("\n");
    sb.append("    agreedAt: ").append(toIndentedString(agreedAt)).append("\n");
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

