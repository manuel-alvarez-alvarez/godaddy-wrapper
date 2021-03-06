package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorField;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class ErrorLimit   {
  
  private Integer retryAfterSec = null;
  private String code = null;
  private String message = null;
  private List<ErrorField> fields = new ArrayList<ErrorField>();

  
  /**
   * Number of seconds to wait before attempting a similar request
   **/
  public ErrorLimit retryAfterSec(Integer retryAfterSec) {
    this.retryAfterSec = retryAfterSec;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of seconds to wait before attempting a similar request")
  @JsonProperty("retryAfterSec")
  public Integer getRetryAfterSec() {
    return retryAfterSec;
  }
  public void setRetryAfterSec(Integer retryAfterSec) {
    this.retryAfterSec = retryAfterSec;
  }

  
  /**
   * Short identifier for the error, suitable for indicating the specific error within client code
   **/
  public ErrorLimit code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Short identifier for the error, suitable for indicating the specific error within client code")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Human-readable, English description of the error
   **/
  public ErrorLimit message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Human-readable, English description of the error")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * List of the specific fields, and the errors found with their contents
   **/
  public ErrorLimit fields(List<ErrorField> fields) {
    this.fields = fields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of the specific fields, and the errors found with their contents")
  @JsonProperty("fields")
  public List<ErrorField> getFields() {
    return fields;
  }
  public void setFields(List<ErrorField> fields) {
    this.fields = fields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorLimit errorLimit = (ErrorLimit) o;
    return Objects.equals(this.retryAfterSec, errorLimit.retryAfterSec) &&
        Objects.equals(this.code, errorLimit.code) &&
        Objects.equals(this.message, errorLimit.message) &&
        Objects.equals(this.fields, errorLimit.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retryAfterSec, code, message, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorLimit {\n");
    
    sb.append("    retryAfterSec: ").append(toIndentedString(retryAfterSec)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

