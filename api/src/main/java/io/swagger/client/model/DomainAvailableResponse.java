package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainAvailableResponse   {
  
  private String domain = null;
  private Boolean available = null;
  private Integer price = null;
  private String currency = null;
  private Integer period = null;

  
  /**
   * Domain name
   **/
  public DomainAvailableResponse domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Domain name")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * Whether or not the domain name is available
   **/
  public DomainAvailableResponse available(Boolean available) {
    this.available = available;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the domain name is available")
  @JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  
  /**
   * Price of the domain excluding taxes or fees
   **/
  public DomainAvailableResponse price(Integer price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Price of the domain excluding taxes or fees")
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  
  /**
   * Currency in which the `price` is listed
   **/
  public DomainAvailableResponse currency(String currency) {
    this.currency = currency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Currency in which the `price` is listed")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Number of years included in the price
   **/
  public DomainAvailableResponse period(Integer period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of years included in the price")
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
    DomainAvailableResponse domainAvailableResponse = (DomainAvailableResponse) o;
    return Objects.equals(this.domain, domainAvailableResponse.domain) &&
        Objects.equals(this.available, domainAvailableResponse.available) &&
        Objects.equals(this.price, domainAvailableResponse.price) &&
        Objects.equals(this.currency, domainAvailableResponse.currency) &&
        Objects.equals(this.period, domainAvailableResponse.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, available, price, currency, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainAvailableResponse {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

