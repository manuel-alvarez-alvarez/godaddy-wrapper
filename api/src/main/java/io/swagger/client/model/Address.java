package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class Address   {
  
  private String address1 = null;
  private String address2 = null;
  private String city = null;
  private String state = null;
  private String postalCode = null;


  public enum CountryEnum {
    AC("AC"),
    AD("AD"),
    AE("AE"),
    AF("AF"),
    AG("AG"),
    AI("AI"),
    AL("AL"),
    AM("AM"),
    AO("AO"),
    AQ("AQ"),
    AR("AR"),
    AS("AS"),
    AT("AT"),
    AU("AU"),
    AW("AW"),
    AZ("AZ"),
    BA("BA"),
    BB("BB"),
    BD("BD"),
    BE("BE"),
    BF("BF"),
    BG("BG"),
    BH("BH"),
    BI("BI"),
    BJ("BJ"),
    BM("BM"),
    BN("BN"),
    BO("BO"),
    BQ("BQ"),
    BR("BR"),
    BS("BS"),
    BT("BT"),
    BV("BV"),
    BW("BW"),
    BY("BY"),
    BZ("BZ"),
    CA("CA"),
    CC("CC"),
    CD("CD"),
    CF("CF"),
    CG("CG"),
    CH("CH"),
    CI("CI"),
    CK("CK"),
    CL("CL"),
    CM("CM"),
    CN("CN"),
    CO("CO"),
    CR("CR"),
    CV("CV"),
    CW("CW"),
    CX("CX"),
    CY("CY"),
    CZ("CZ"),
    DE("DE"),
    DJ("DJ"),
    DK("DK"),
    DM("DM"),
    DO("DO"),
    DZ("DZ"),
    EC("EC"),
    EE("EE"),
    EG("EG"),
    EH("EH"),
    ER("ER"),
    ES("ES"),
    ET("ET"),
    FI("FI"),
    FJ("FJ"),
    FK("FK"),
    FM("FM"),
    FO("FO"),
    FR("FR"),
    GA("GA"),
    GB("GB"),
    GD("GD"),
    GE("GE"),
    GF("GF"),
    GG("GG"),
    GH("GH"),
    GI("GI"),
    GL("GL"),
    GM("GM"),
    GN("GN"),
    GP("GP"),
    GQ("GQ"),
    GR("GR"),
    GS("GS"),
    GT("GT"),
    GU("GU"),
    GW("GW"),
    GY("GY"),
    HK("HK"),
    HM("HM"),
    HN("HN"),
    HR("HR"),
    HT("HT"),
    HU("HU"),
    ID("ID"),
    IE("IE"),
    IL("IL"),
    IM("IM"),
    IN("IN"),
    IO("IO"),
    IQ("IQ"),
    IS("IS"),
    IT("IT"),
    JE("JE"),
    JM("JM"),
    JO("JO"),
    JP("JP"),
    KE("KE"),
    KG("KG"),
    KH("KH"),
    KI("KI"),
    KM("KM"),
    KN("KN"),
    KR("KR"),
    KV("KV"),
    KW("KW"),
    KY("KY"),
    KZ("KZ"),
    LA("LA"),
    LB("LB"),
    LC("LC"),
    LI("LI"),
    LK("LK"),
    LR("LR"),
    LS("LS"),
    LT("LT"),
    LU("LU"),
    LV("LV"),
    LY("LY"),
    MA("MA"),
    MC("MC"),
    MD("MD"),
    ME("ME"),
    MG("MG"),
    MH("MH"),
    MK("MK"),
    ML("ML"),
    MM("MM"),
    MN("MN"),
    MO("MO"),
    MP("MP"),
    MQ("MQ"),
    MR("MR"),
    MS("MS"),
    MT("MT"),
    MU("MU"),
    MV("MV"),
    MW("MW"),
    MX("MX"),
    MY("MY"),
    MZ("MZ"),
    NA("NA"),
    NC("NC"),
    NE("NE"),
    NF("NF"),
    NG("NG"),
    NI("NI"),
    NL("NL"),
    NO("NO"),
    NP("NP"),
    NR("NR"),
    NU("NU"),
    NZ("NZ"),
    OM("OM"),
    PA("PA"),
    PE("PE"),
    PF("PF"),
    PG("PG"),
    PH("PH"),
    PK("PK"),
    PL("PL"),
    PM("PM"),
    PN("PN"),
    PR("PR"),
    PS("PS"),
    PT("PT"),
    PW("PW"),
    PY("PY"),
    QA("QA"),
    RE("RE"),
    RO("RO"),
    RS("RS"),
    RU("RU"),
    RW("RW"),
    SA("SA"),
    SB("SB"),
    SC("SC"),
    SE("SE"),
    SG("SG"),
    SH("SH"),
    SI("SI"),
    SJ("SJ"),
    SK("SK"),
    SL("SL"),
    SM("SM"),
    SN("SN"),
    SO("SO"),
    SR("SR"),
    ST("ST"),
    SV("SV"),
    SX("SX"),
    SZ("SZ"),
    TC("TC"),
    TD("TD"),
    TF("TF"),
    TG("TG"),
    TH("TH"),
    TJ("TJ"),
    TK("TK"),
    TL("TL"),
    TM("TM"),
    TN("TN"),
    TO("TO"),
    TP("TP"),
    TR("TR"),
    TT("TT"),
    TV("TV"),
    TW("TW"),
    TZ("TZ"),
    UA("UA"),
    UG("UG"),
    UM("UM"),
    US("US"),
    UY("UY"),
    UZ("UZ"),
    VA("VA"),
    VC("VC"),
    VE("VE"),
    VG("VG"),
    VI("VI"),
    VN("VN"),
    VU("VU"),
    WF("WF"),
    WS("WS"),
    YE("YE"),
    YT("YT"),
    ZA("ZA"),
    ZM("ZM"),
    ZW("ZW");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CountryEnum country = null;

  
  /**
   **/
  public Address address1(String address1) {
    this.address1 = address1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  /**
   **/
  public Address address2(String address2) {
    this.address2 = address2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  /**
   **/
  public Address city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State or province or territory
   **/
  public Address state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "State or province or territory")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Postal or zip code
   **/
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Postal or zip code")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * Two-letter ISO country code to be used as a hint for target region<br/><br/>\nNOTE: These are sample values, there are many\n<a href='http://www.iso.org/iso/country_codes.htm'>more</a>
   **/
  public Address country(CountryEnum country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Two-letter ISO country code to be used as a hint for target region<br/><br/>\nNOTE: These are sample values, there are many\n<a href='http://www.iso.org/iso/country_codes.htm'>more</a>")
  @JsonProperty("country")
  public CountryEnum getCountry() {
    return country;
  }
  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.address2, address.address2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, state, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

