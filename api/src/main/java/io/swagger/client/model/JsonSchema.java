package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class JsonSchema   {
  
  private String id = null;
  private Object properties = null;
  private List<String> required = new ArrayList<String>();
  private Object models = null;

  
  /**
   **/
  public JsonSchema id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public JsonSchema properties(Object properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("properties")
  public Object getProperties() {
    return properties;
  }
  public void setProperties(Object properties) {
    this.properties = properties;
  }

  
  /**
   **/
  public JsonSchema required(List<String> required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }
  public void setRequired(List<String> required) {
    this.required = required;
  }

  
  /**
   **/
  public JsonSchema models(Object models) {
    this.models = models;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("models")
  public Object getModels() {
    return models;
  }
  public void setModels(Object models) {
    this.models = models;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchema jsonSchema = (JsonSchema) o;
    return Objects.equals(this.id, jsonSchema.id) &&
        Objects.equals(this.properties, jsonSchema.properties) &&
        Objects.equals(this.required, jsonSchema.required) &&
        Objects.equals(this.models, jsonSchema.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, properties, required, models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

