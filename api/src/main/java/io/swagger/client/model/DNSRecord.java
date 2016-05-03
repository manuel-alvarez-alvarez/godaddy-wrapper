package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DNSRecord   {
  


  public enum TypeEnum {
    A("A"),
    AAAA("AAAA"),
    CNAME("CNAME"),
    MX("MX"),
    NS("NS"),
    SOA("SOA"),
    SRV("SRV"),
    TXT("TXT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
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
  public DNSRecord type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public DNSRecord name(String name) {
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
  public DNSRecord data(String data) {
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
  public DNSRecord priority(Integer priority) {
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
  public DNSRecord ttl(Integer ttl) {
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
  public DNSRecord service(String service) {
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
  public DNSRecord protocol(String protocol) {
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
  public DNSRecord port(Integer port) {
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
  public DNSRecord weight(Integer weight) {
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
    DNSRecord dNSRecord = (DNSRecord) o;
    return Objects.equals(this.type, dNSRecord.type) &&
        Objects.equals(this.name, dNSRecord.name) &&
        Objects.equals(this.data, dNSRecord.data) &&
        Objects.equals(this.priority, dNSRecord.priority) &&
        Objects.equals(this.ttl, dNSRecord.ttl) &&
        Objects.equals(this.service, dNSRecord.service) &&
        Objects.equals(this.protocol, dNSRecord.protocol) &&
        Objects.equals(this.port, dNSRecord.port) &&
        Objects.equals(this.weight, dNSRecord.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, data, priority, ttl, service, protocol, port, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSRecord {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

