package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class ErrorField   {
  
  private String path = null;
  private String pathRelated = null;
  private String code = null;
  private String message = null;

  
  /**
   * <ul>\n<li style='margin-left: 12px;'>JSONPath referring to a field containing an error</li>\n<strong style='margin-left: 12px;'>OR</strong>\n<li style='margin-left: 12px;'>JSONPath referring to a field that refers to an object containing an error, with more detail in `pathRelated`</li>\n</ul>
   **/
  public ErrorField path(String path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "<ul>\n<li style='margin-left: 12px;'>JSONPath referring to a field containing an error</li>\n<strong style='margin-left: 12px;'>OR</strong>\n<li style='margin-left: 12px;'>JSONPath referring to a field that refers to an object containing an error, with more detail in `pathRelated`</li>\n</ul>")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  
  /**
   * JSONPath referring to a field containing an error, which is referenced by `path`
   **/
  public ErrorField pathRelated(String pathRelated) {
    this.pathRelated = pathRelated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSONPath referring to a field containing an error, which is referenced by `path`")
  @JsonProperty("pathRelated")
  public String getPathRelated() {
    return pathRelated;
  }
  public void setPathRelated(String pathRelated) {
    this.pathRelated = pathRelated;
  }

  
  /**
   * Short identifier for the error, suitable for indicating the specific error within client code
   **/
  public ErrorField code(String code) {
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
   * Human-readable, English description of the problem with the contents of the field
   **/
  public ErrorField message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Human-readable, English description of the problem with the contents of the field")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorField errorField = (ErrorField) o;
    return Objects.equals(this.path, errorField.path) &&
        Objects.equals(this.pathRelated, errorField.pathRelated) &&
        Objects.equals(this.code, errorField.code) &&
        Objects.equals(this.message, errorField.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, pathRelated, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorField {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathRelated: ").append(toIndentedString(pathRelated)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

