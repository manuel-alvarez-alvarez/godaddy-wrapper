package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class DomainPurchaseResponse   {
  
  private Integer orderId = null;
  private Integer itemCount = null;
  private Integer total = null;
  private String currency = null;

  
  /**
   * Unique identifier of the order processed to purchase the domain
   **/
  public DomainPurchaseResponse orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier of the order processed to purchase the domain")
  @JsonProperty("orderId")
  public Integer getOrderId() {
    return orderId;
  }
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  
  /**
   * Number items included in the order
   **/
  public DomainPurchaseResponse itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number items included in the order")
  @JsonProperty("itemCount")
  public Integer getItemCount() {
    return itemCount;
  }
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  
  /**
   * Total cost of the domain and any selected add-ons
   **/
  public DomainPurchaseResponse total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total cost of the domain and any selected add-ons")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * Currency in which the `total` is listed
   **/
  public DomainPurchaseResponse currency(String currency) {
    this.currency = currency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Currency in which the `total` is listed")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPurchaseResponse domainPurchaseResponse = (DomainPurchaseResponse) o;
    return Objects.equals(this.orderId, domainPurchaseResponse.orderId) &&
        Objects.equals(this.itemCount, domainPurchaseResponse.itemCount) &&
        Objects.equals(this.total, domainPurchaseResponse.total) &&
        Objects.equals(this.currency, domainPurchaseResponse.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, itemCount, total, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPurchaseResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

