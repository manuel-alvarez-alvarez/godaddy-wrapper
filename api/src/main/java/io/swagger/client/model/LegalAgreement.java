package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class LegalAgreement   {
  
  private String agreementKey = null;
  private String title = null;
  private String url = null;
  private String content = null;

  
  /**
   * Unique identifier for the legal agreement
   **/
  public LegalAgreement agreementKey(String agreementKey) {
    this.agreementKey = agreementKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the legal agreement")
  @JsonProperty("agreementKey")
  public String getAgreementKey() {
    return agreementKey;
  }
  public void setAgreementKey(String agreementKey) {
    this.agreementKey = agreementKey;
  }

  
  /**
   * Title of the legal agreement
   **/
  public LegalAgreement title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title of the legal agreement")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * URL to a page containing the legal agreement
   **/
  public LegalAgreement url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to a page containing the legal agreement")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Contents of the legal agreement, suitable for embedding
   **/
  public LegalAgreement content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Contents of the legal agreement, suitable for embedding")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalAgreement legalAgreement = (LegalAgreement) o;
    return Objects.equals(this.agreementKey, legalAgreement.agreementKey) &&
        Objects.equals(this.title, legalAgreement.title) &&
        Objects.equals(this.url, legalAgreement.url) &&
        Objects.equals(this.content, legalAgreement.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementKey, title, url, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalAgreement {\n");
    
    sb.append("    agreementKey: ").append(toIndentedString(agreementKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

