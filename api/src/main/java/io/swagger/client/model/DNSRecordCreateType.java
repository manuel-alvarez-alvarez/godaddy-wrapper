package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DNSRecordCreateType   {
  
  private String name = null;
  private String data = null;
  private Integer priority = null;
  private Integer ttl = null;
  private String service = null;
  private String protocol = null;
  private Integer port = null;
  private Integer weight = null;

  
  /**
   **/
  public DNSRecordCreateType name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public DNSRecordCreateType data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   * Record priority (MX and SRV only)
   **/
  public DNSRecordCreateType priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Record priority (MX and SRV only)")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   **/
  public DNSRecordCreateType ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ttl")
  public Integer getTtl() {
    return ttl;
  }
  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }

  
  /**
   * Service type (SRV only)
   **/
  public DNSRecordCreateType service(String service) {
    this.service = service;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service type (SRV only)")
  @JsonProperty("service")
  public String getService() {
    return service;
  }
  public void setService(String service) {
    this.service = service;
  }

  
  /**
   * Service protocol (SRV only)
   **/
  public DNSRecordCreateType protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service protocol (SRV only)")
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  
  /**
   * Service port (SRV only)
   * minimum: 1.0
   * maximum: 65535.0
   **/
  public DNSRecordCreateType port(Integer port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service port (SRV only)")
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  
  /**
   * Record weight (SRV only)
   **/
  public DNSRecordCreateType weight(Integer weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Record weight (SRV only)")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSRecordCreateType dNSRecordCreateType = (DNSRecordCreateType) o;
    return Objects.equals(this.name, dNSRecordCreateType.name) &&
        Objects.equals(this.data, dNSRecordCreateType.data) &&
        Objects.equals(this.priority, dNSRecordCreateType.priority) &&
        Objects.equals(this.ttl, dNSRecordCreateType.ttl) &&
        Objects.equals(this.service, dNSRecordCreateType.service) &&
        Objects.equals(this.protocol, dNSRecordCreateType.protocol) &&
        Objects.equals(this.port, dNSRecordCreateType.port) &&
        Objects.equals(this.weight, dNSRecordCreateType.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, data, priority, ttl, service, protocol, port, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSRecordCreateType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

