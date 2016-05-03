package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainUpdate   {
  
  private Boolean locked = null;
  private Boolean renewAuto = null;
  private Double id = null;

  
  /**
   * Whether or not the domain should be locked to prevent transfers
   **/
  public DomainUpdate locked(Boolean locked) {
    this.locked = locked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the domain should be locked to prevent transfers")
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  
  /**
   * Whether or not the domain should be configured to automatically renew
   **/
  public DomainUpdate renewAuto(Boolean renewAuto) {
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
   **/
  public DomainUpdate id(Double id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUpdate domainUpdate = (DomainUpdate) o;
    return Objects.equals(this.locked, domainUpdate.locked) &&
        Objects.equals(this.renewAuto, domainUpdate.renewAuto) &&
        Objects.equals(this.id, domainUpdate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locked, renewAuto, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUpdate {\n");
    
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

