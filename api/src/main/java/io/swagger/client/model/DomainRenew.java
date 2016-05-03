package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainRenew   {
  
  private Integer period = null;

  
  /**
   * minimum: 1.0
   * maximum: 10.0
   **/
  public DomainRenew period(Integer period) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainRenew domainRenew = (DomainRenew) o;
    return Objects.equals(this.period, domainRenew.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainRenew {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

