package io.digitalfemsa;

import io.digitalfemsa.model.GetWebhooksResponse;
import io.digitalfemsa.model.WebhookRequest;
import io.digitalfemsa.model.WebhookResponse;
import io.digitalfemsa.model.WebhookUpdateRequest;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create webhook
   * Creates a webhook and subscribes it to events so your system can receive notifications when those events occur.
   * @param webhookRequest Webhook creation/update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return WebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WebhookResponse createWebhook(WebhookRequest webhookRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return createWebhookWithHttpInfo(webhookRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create webhook
   * Creates a webhook and subscribes it to events so your system can receive notifications when those events occur.
   * @param webhookRequest Webhook creation/update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;WebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhookResponse> createWebhookWithHttpInfo(WebhookRequest webhookRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (webhookRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookRequest' when calling createWebhook");
    }

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.createWebhook", "/webhooks", "POST", new ArrayList<>(), webhookRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete webhook
   * Deletes a webhook.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return WebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WebhookResponse deleteWebhook(String id, String acceptLanguage) throws ApiException {
    return deleteWebhookWithHttpInfo(id, acceptLanguage).getData();
  }

  /**
   * Delete webhook
   * Deletes a webhook.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;WebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhookResponse> deleteWebhookWithHttpInfo(String id, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.deleteWebhook", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get webhook
   * Retrieves the details of a webhook by its ID.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return WebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WebhookResponse getWebhook(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return getWebhookWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get webhook
   * Retrieves the details of a webhook by its ID.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;WebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhookResponse> getWebhookWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.getWebhook", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get webhooks
   * Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)
   * @param webhookRequest Webhook creation/update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param url url for webhook filter (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return GetWebhooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetWebhooksResponse getWebhooks(WebhookRequest webhookRequest, String acceptLanguage, String xChildCompanyId, Integer limit, String search, String url, String next, String previous) throws ApiException {
    return getWebhooksWithHttpInfo(webhookRequest, acceptLanguage, xChildCompanyId, limit, search, url, next, previous).getData();
  }

  /**
   * Get webhooks
   * Consume the list of webhooks you have, each environment supports 10 webhooks (For production and testing)
   * @param webhookRequest Webhook creation/update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param url url for webhook filter (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return ApiResponse&lt;GetWebhooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetWebhooksResponse> getWebhooksWithHttpInfo(WebhookRequest webhookRequest, String acceptLanguage, String xChildCompanyId, Integer limit, String search, String url, String next, String previous) throws ApiException {
    // Check required parameters
    if (webhookRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookRequest' when calling getWebhooks");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<GetWebhooksResponse> localVarReturnType = new GenericType<GetWebhooksResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.getWebhooks", "/webhooks", "GET", localVarQueryParams, webhookRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Test webhook
   * Sends a test event to the specified webhook to verify it can receive events.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return WebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WebhookResponse testWebhook(String id, String acceptLanguage) throws ApiException {
    return testWebhookWithHttpInfo(id, acceptLanguage).getData();
  }

  /**
   * Test webhook
   * Sends a test event to the specified webhook to verify it can receive events.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;WebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhookResponse> testWebhookWithHttpInfo(String id, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling testWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{id}/test"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.testWebhook", localVarPath, "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update webhook
   * Updates an existing webhook.
   * @param id Identifier of the resource (required)
   * @param webhookUpdateRequest Webhook update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return WebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public WebhookResponse updateWebhook(String id, WebhookUpdateRequest webhookUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return updateWebhookWithHttpInfo(id, webhookUpdateRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update webhook
   * Updates an existing webhook.
   * @param id Identifier of the resource (required)
   * @param webhookUpdateRequest Webhook update request payload. (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;WebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WebhookResponse> updateWebhookWithHttpInfo(String id, WebhookUpdateRequest webhookUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateWebhook");
    }
    if (webhookUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookUpdateRequest' when calling updateWebhook");
    }

    // Path parameters
    String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<WebhookResponse> localVarReturnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI("WebhooksApi.updateWebhook", localVarPath, "PUT", new ArrayList<>(), webhookUpdateRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
