package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.DomainAvailableResponse;
import io.swagger.client.model.ErrorLimit;
import io.swagger.client.model.Error;
import io.swagger.client.model.DomainDetail;
import io.swagger.client.model.LegalAgreement;
import io.swagger.client.model.DomainSummary;
import io.swagger.client.model.DomainPurchaseResponse;
import io.swagger.client.model.DomainPurchase;
import io.swagger.client.model.DNSRecord;
import io.swagger.client.model.DNSRecordCreateType;
import io.swagger.client.model.DNSRecordCreateTypeName;
import io.swagger.client.model.DomainRenew;
import io.swagger.client.model.JsonSchema;
import io.swagger.client.model.DomainSuggestion;
import io.swagger.client.model.TldSummary;
import io.swagger.client.model.DomainTransferIn;
import io.swagger.client.model.DomainUpdate;
import io.swagger.client.model.DomainContacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-03T13:05:08.312+02:00")
public class VdomainsApi {
  private ApiClient apiClient;

  public VdomainsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VdomainsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Determine whether or not the specified domain is available for purchase
   * 
   * @param domain Domain name whose availability is to be checked (required)
   * @param checkType Optimize for time (&#39;FAST&#39;) or accuracy (&#39;FULL&#39;) (optional, default to FAST)
   * @param forTransfer Whether or not to include domains available for transfer (optional, default to false)
   * @param waitMs Maximum amount of time, in milliseconds, to wait for responses\nIf elapses, return the results compiled up to that point, some of which may not be authoritative (optional, default to 1000)
   * @return DomainAvailableResponse
   * @throws ApiException if fails to make API call
   */
  public DomainAvailableResponse available(String domain, String checkType, Boolean forTransfer, Integer waitMs) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling available");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/available".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "domain", domain));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkType", checkType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forTransfer", forTransfer));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waitMs", waitMs));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DomainAvailableResponse> localVarReturnType = new GenericType<DomainAvailableResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Cancel a purchased domain
   * 
   * @param domain Domain to cancel (required)
   * @throws ApiException if fails to make API call
   */
  public void cancel(String domain) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling cancel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Submit a privacy cancellation request for the given domain
   * 
   * @param domain Domain whose privacy is to be cancelled (required)
   * @param xShopperId Shopper ID of the owner of the domain (optional)
   * @throws ApiException if fails to make API call
   */
  public void cancelPrivacy(String domain, String xShopperId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling cancelPrivacy");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/privacy".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Retrieve details for the specified Domain
   * 
   * @param domain Domain name whose details are to be retrieved (required)
   * @param xShopperId Shopper ID expected to own the specified domain (optional)
   * @return DomainDetail
   * @throws ApiException if fails to make API call
   */
  public DomainDetail get(String domain, String xShopperId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling get");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DomainDetail> localVarReturnType = new GenericType<DomainDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the legal agreement(s) required to purchase the specified TLD and add-ons
   * 
   * @param tlds list of TLDs whose legal agreements are to be retrieved (required)
   * @param privacy Whether or not privacy has been requested (required)
   * @param xMarketId Unique identifier of the Market used to retrieve/translate Legal Agreements (optional, default to en-US)
   * @param forTransfer Whether or not domain tranfer has been requested (optional)
   * @return List<LegalAgreement>
   * @throws ApiException if fails to make API call
   */
  public List<LegalAgreement> getAgreement(List<String> tlds, Boolean privacy, String xMarketId, Boolean forTransfer) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tlds' is set
    if (tlds == null) {
      throw new ApiException(400, "Missing the required parameter 'tlds' when calling getAgreement");
    }
    
    // verify the required parameter 'privacy' is set
    if (privacy == null) {
      throw new ApiException(400, "Missing the required parameter 'privacy' when calling getAgreement");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/agreements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tlds", tlds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "privacy", privacy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forTransfer", forTransfer));
    

    if (xMarketId != null)
      localVarHeaderParams.put("X-Market-Id", apiClient.parameterToString(xMarketId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<LegalAgreement>> localVarReturnType = new GenericType<List<LegalAgreement>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve a list of Domains for the specified Shopper
   * 
   * @param xShopperId Shopper ID whose domains are to be retrieved (optional)
   * @param statuses Only include results with `status` value in the specified set (optional)
   * @param statusGroups Only include results with `status` value in any of the specified groups (optional)
   * @param limit Maximum number of domains to return (optional)
   * @param marker Marker Domain to use as the offset in results (optional)
   * @param includes Optional details to be included in the response (optional)
   * @return List<DomainSummary>
   * @throws ApiException if fails to make API call
   */
  public List<DomainSummary> list(String xShopperId, List<String> statuses, List<String> statusGroups, Integer limit, String marker, List<String> includes) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/domains".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "statuses", statuses));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "statusGroups", statusGroups));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "marker", marker));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "includes", includes));
    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DomainSummary>> localVarReturnType = new GenericType<List<DomainSummary>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Purchase and register the specified Domain
   * 
   * @param body An instance document expected to match the JSON schema returned by `./schema/{tld}` (required)
   * @param xShopperId The Shopper for whom the domain should be purchased (optional)
   * @return DomainPurchaseResponse
   * @throws ApiException if fails to make API call
   */
  public DomainPurchaseResponse purchase(DomainPurchase body, String xShopperId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling purchase");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/purchase".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DomainPurchaseResponse> localVarReturnType = new GenericType<DomainPurchaseResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add the specified DNS Records to the specified Domain
   * 
   * @param domain Domain whose DNS Records are to be augmented (required)
   * @param records DNS Records to add to whatever currently exists (required)
   * @param xShopperId Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void recordAdd(String domain, DNSRecord records, String xShopperId) throws ApiException {
    Object localVarPostBody = records;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling recordAdd");
    }
    
    // verify the required parameter 'records' is set
    if (records == null) {
      throw new ApiException(400, "Missing the required parameter 'records' when calling recordAdd");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/records".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Retrieve DNS Records for the specified Domain, optionally with the specified Type and/or Name
   * 
   * @param domain Domain whose DNS Records are to be retrieved (required)
   * @param type DNS Record Type for which DNS Records are to be retrieved (required)
   * @param name DNS Record Name for which DNS Records are to be retrieved (required)
   * @param xShopperId Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @param offset Number of results to skip for pagination (optional)
   * @param limit Maximum number of items to return (optional)
   * @return List<DNSRecord>
   * @throws ApiException if fails to make API call
   */
  public List<DNSRecord> recordGet(String domain, String type, String name, String xShopperId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling recordGet");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling recordGet");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling recordGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/records/{type?}/{name?}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DNSRecord>> localVarReturnType = new GenericType<List<DNSRecord>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Replace all DNS Records for the specified Domain
   * 
   * @param domain Domain whose DNS Records are to be replaced (required)
   * @param records DNS Records to replace whatever currently exists (required)
   * @param xShopperId Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void recordReplace(String domain, List<DNSRecord> records, String xShopperId) throws ApiException {
    Object localVarPostBody = records;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling recordReplace");
    }
    
    // verify the required parameter 'records' is set
    if (records == null) {
      throw new ApiException(400, "Missing the required parameter 'records' when calling recordReplace");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/records".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Replace all DNS Records for the specified Domain with the specified Type
   * 
   * @param domain Domain whose DNS Records are to be replaced (required)
   * @param type DNS Record Type for which DNS Records are to be replaced (required)
   * @param records DNS Records to replace whatever currently exists (required)
   * @param xShopperId Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void recordReplaceType(String domain, String type, List<DNSRecordCreateType> records, String xShopperId) throws ApiException {
    Object localVarPostBody = records;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling recordReplaceType");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling recordReplaceType");
    }
    
    // verify the required parameter 'records' is set
    if (records == null) {
      throw new ApiException(400, "Missing the required parameter 'records' when calling recordReplaceType");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/records/{type}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Replace all DNS Records for the specified Domain with the specified Type and Name
   * 
   * @param domain Domain whose DNS Records are to be replaced (required)
   * @param type DNS Record Type for which DNS Records are to be replaced (required)
   * @param name DNS Record Name for which DNS Records are to be replaced (required)
   * @param records DNS Records to replace whatever currently exists (required)
   * @param xShopperId Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void recordReplaceTypeName(String domain, String type, String name, List<DNSRecordCreateTypeName> records, String xShopperId) throws ApiException {
    Object localVarPostBody = records;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling recordReplaceTypeName");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling recordReplaceTypeName");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling recordReplaceTypeName");
    }
    
    // verify the required parameter 'records' is set
    if (records == null) {
      throw new ApiException(400, "Missing the required parameter 'records' when calling recordReplaceTypeName");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/records/{type}/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()))
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Renew the specified Domain
   * 
   * @param domain Domain to renew (required)
   * @param xShopperId The Shopper for whom the domain should be renewed (optional)
   * @param body  (optional)
   * @return DomainPurchaseResponse
   * @throws ApiException if fails to make API call
   */
  public DomainPurchaseResponse renew(String domain, String xShopperId, DomainRenew body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling renew");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/renew".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DomainPurchaseResponse> localVarReturnType = new GenericType<DomainPurchaseResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the schema to be submitted when registering a Domain for the specified TLD
   * 
   * @param tld The Top-Level Domain whose schema should be retrieved (required)
   * @return JsonSchema
   * @throws ApiException if fails to make API call
   */
  public JsonSchema schema(String tld) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tld' is set
    if (tld == null) {
      throw new ApiException(400, "Missing the required parameter 'tld' when calling schema");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/purchase/schema/{tld}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tld" + "\\}", apiClient.escapeString(tld.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<JsonSchema> localVarReturnType = new GenericType<JsonSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Suggest alternate Domain names based on a seed Domain or set of keywords
   * 
   * @param query Domain name or set of keywords for which alternative domain names will be suggested (required)
   * @param xShopperId Shopper ID for which the suggestions are being generated (optional)
   * @param country Two-letter ISO country code to be used as a hint for target region&lt;br/&gt;&lt;br/&gt;\nNOTE: These are sample values, there are many\n&lt;a href=\&quot;http://www.iso.org/iso/country_codes.htm\&quot;&gt;more&lt;/a&gt; (optional)
   * @param city Name of city to be used as a hint for target region (optional)
   * @param sources Sources to be queried&lt;br/&gt;&lt;br/&gt;&lt;ul&gt;\n&lt;li&gt;&lt;strong&gt;CC_TLD&lt;/strong&gt; - Varies the TLD using Country Codes&lt;/li&gt;\n&lt;li&gt;&lt;strong&gt;EXTENSION&lt;/strong&gt; - Varies the TLD&lt;/li&gt;\n&lt;li&gt;&lt;strong&gt;KEYWORD_SPIN&lt;/strong&gt; - Identifies keywords and then rotates each one&lt;/li&gt;\n&lt;li&gt;&lt;strong&gt;PREMIUM&lt;/strong&gt; - Includes variations with premium prices&lt;/li&gt;&lt;/ul&gt; (optional)
   * @param tlds Top-level domains to be included in suggestions&lt;br/&gt;&lt;br/&gt;\nNOTE: These are sample values, there are many\n&lt;a href=\&quot;http://www.godaddy.com/tlds/gtld.aspx#domain_search_form\&quot;&gt;more&lt;/a&gt; (optional)
   * @param lengthMax Maximum length of second-level domain (optional)
   * @param lengthMin Minimum length of second-level domain (optional)
   * @param limit Maximum number of suggestions to return (optional)
   * @param waitMs Maximum amount of time, in milliseconds, to wait for responses\nIf elapses, return the results compiled up to that point (optional, default to 1000)
   * @return List<DomainSuggestion>
   * @throws ApiException if fails to make API call
   */
  public List<DomainSuggestion> suggest(String query, String xShopperId, String country, String city, List<String> sources, List<String> tlds, Integer lengthMax, Integer lengthMin, Integer limit, Integer waitMs) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling suggest");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/suggest".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sources", sources));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "tlds", tlds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lengthMax", lengthMax));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lengthMin", lengthMin));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waitMs", waitMs));
    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<DomainSuggestion>> localVarReturnType = new GenericType<List<DomainSuggestion>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieves a list of TLDs supported and enabled for sale
   * 
   * @return List<TldSummary>
   * @throws ApiException if fails to make API call
   */
  public List<TldSummary> tlds() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/domains/tlds".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<TldSummary>> localVarReturnType = new GenericType<List<TldSummary>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Purchase and start or restart transfer process
   * 
   * @param domain Domain to transfer in (required)
   * @param body Details for domain transfer purchase (required)
   * @param xShopperId The Shopper to whom the domain should be transfered (optional)
   * @return DomainPurchaseResponse
   * @throws ApiException if fails to make API call
   */
  public DomainPurchaseResponse transferIn(String domain, DomainTransferIn body, String xShopperId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling transferIn");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling transferIn");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/transfer".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<DomainPurchaseResponse> localVarReturnType = new GenericType<DomainPurchaseResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update details for the specified Domain
   * 
   * @param domain Domain whose details are to be updated (required)
   * @param body Changes to apply to existing Domain (required)
   * @param xShopperId Shopper for whom Domain is to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void update(String domain, DomainUpdate body, String xShopperId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling update");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Update domain
   * 
   * @param domain Domain whose Contacts are to be updated. (required)
   * @param contacts Changes to apply to existing Contacts (required)
   * @param xShopperId Shopper for whom domain contacts are to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateContacts(String domain, DomainContacts contacts, String xShopperId) throws ApiException {
    Object localVarPostBody = contacts;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling updateContacts");
    }
    
    // verify the required parameter 'contacts' is set
    if (contacts == null) {
      throw new ApiException(400, "Missing the required parameter 'contacts' when calling updateContacts");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Validate the request body using the Domain Purchase Schema for the specified TLD
   * 
   * @param body An instance document expected to match the JSON schema returned by `./schema/{tld}` (required)
   * @throws ApiException if fails to make API call
   */
  public void validate(DomainPurchase body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling validate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/purchase/validate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Re-send Contact E-mail Verification for specified Domain
   * 
   * @param domain Domain whose Contact E-mail should be verified. (required)
   * @param xShopperId Shopper for whom domain contact e-mail should be verified. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com (optional)
   * @throws ApiException if fails to make API call
   */
  public void verifyEmail(String domain, String xShopperId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'domain' is set
    if (domain == null) {
      throw new ApiException(400, "Missing the required parameter 'domain' when calling verifyEmail");
    }
    
    // create path and map variables
    String localVarPath = "/v1/domains/{domain}/verifyRegistrantEmail".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (xShopperId != null)
      localVarHeaderParams.put("X-Shopper-Id", apiClient.parameterToString(xShopperId));
    

    

    final String[] localVarAccepts = {
      "application/json", "application/javascript", "application/xml", "text/javascript", "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
