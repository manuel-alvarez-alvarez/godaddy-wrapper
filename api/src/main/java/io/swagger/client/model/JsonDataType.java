package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class JsonDataType   {
  
  private String type = null;
  private String ref = null;
  private String format = null;
  private String pattern = null;

  
  /**
   **/
  public JsonDataType type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public JsonDataType ref(String ref) {
    this.ref = ref;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("$ref")
  public String getRef() {
    return ref;
  }
  public void setRef(String ref) {
    this.ref = ref;
  }

  
  /**
   **/
  public JsonDataType format(String format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   **/
  public JsonDataType pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonDataType jsonDataType = (JsonDataType) o;
    return Objects.equals(this.type, jsonDataType.type) &&
        Objects.equals(this.ref, jsonDataType.ref) &&
        Objects.equals(this.format, jsonDataType.format) &&
        Objects.equals(this.pattern, jsonDataType.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ref, format, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonDataType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

