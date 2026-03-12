package io.digitalfemsa;

import io.digitalfemsa.model.ChargeOrderResponse;
import io.digitalfemsa.model.ChargeRequest;
import io.digitalfemsa.model.ChargeResponse;
import io.digitalfemsa.model.ChargeUpdateRequest;
import io.digitalfemsa.model.GetChargesResponse;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ChargesApi {
  private ApiClient apiClient;

  public ChargesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChargesApi(ApiClient apiClient) {
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
   * List charges
   * Retrieves a paginated list of charges for the authenticated account.  Use the pagination parameters (&#x60;limit&#x60;, &#x60;next_page&#x60;, &#x60;previous_page&#x60;) to navigate through results. Use &#x60;search&#x60; to filter charges (for example by id or reference). 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @return GetChargesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> whitelist validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetChargesResponse getCharges(String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search) throws ApiException {
    return getChargesWithHttpInfo(acceptLanguage, xChildCompanyId, limit, next, previous, search).getData();
  }

  /**
   * List charges
   * Retrieves a paginated list of charges for the authenticated account.  Use the pagination parameters (&#x60;limit&#x60;, &#x60;next_page&#x60;, &#x60;previous_page&#x60;) to navigate through results. Use &#x60;search&#x60; to filter charges (for example by id or reference). 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @return ApiResponse&lt;GetChargesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> whitelist validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetChargesResponse> getChargesWithHttpInfo(String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

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
    GenericType<GetChargesResponse> localVarReturnType = new GenericType<GetChargesResponse>() {};
    return apiClient.invokeAPI("ChargesApi.getCharges", "/charges", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a charge for an order
   * Creates a new charge associated with an existing order.  Notes: - The charge is created for the order identified by the path parameter &#x60;id&#x60;. - Depending on the payment method, the charge may be created in a non-final status (for example, pending). - If the order does not meet the required conditions, the API may respond with **428 Precondition Required**. 
   * @param id Identifier of the resource (required)
   * @param chargeRequest requested field for a charge (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ChargeOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ChargeOrderResponse ordersCreateCharge(String id, ChargeRequest chargeRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return ordersCreateChargeWithHttpInfo(id, chargeRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create a charge for an order
   * Creates a new charge associated with an existing order.  Notes: - The charge is created for the order identified by the path parameter &#x60;id&#x60;. - Depending on the payment method, the charge may be created in a non-final status (for example, pending). - If the order does not meet the required conditions, the API may respond with **428 Precondition Required**. 
   * @param id Identifier of the resource (required)
   * @param chargeRequest requested field for a charge (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ChargeOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChargeOrderResponse> ordersCreateChargeWithHttpInfo(String id, ChargeRequest chargeRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ordersCreateCharge");
    }
    if (chargeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeRequest' when calling ordersCreateCharge");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/charges"
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
    GenericType<ChargeOrderResponse> localVarReturnType = new GenericType<ChargeOrderResponse>() {};
    return apiClient.invokeAPI("ChargesApi.ordersCreateCharge", localVarPath, "POST", new ArrayList<>(), chargeRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a charge
   * Updates an existing charge. Only &#x60;reference_id&#x60; can be updated.
   * @param id Identifier of the resource (required)
   * @param chargeUpdateRequest requested field for update a charge (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ChargeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ChargeResponse updateCharge(String id, ChargeUpdateRequest chargeUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return updateChargeWithHttpInfo(id, chargeUpdateRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Update a charge
   * Updates an existing charge. Only &#x60;reference_id&#x60; can be updated.
   * @param id Identifier of the resource (required)
   * @param chargeUpdateRequest requested field for update a charge (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;ChargeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ChargeResponse> updateChargeWithHttpInfo(String id, ChargeUpdateRequest chargeUpdateRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCharge");
    }
    if (chargeUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chargeUpdateRequest' when calling updateCharge");
    }

    // Path parameters
    String localVarPath = "/charges/{id}"
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
    GenericType<ChargeResponse> localVarReturnType = new GenericType<ChargeResponse>() {};
    return apiClient.invokeAPI("ChargesApi.updateCharge", localVarPath, "PUT", new ArrayList<>(), chargeUpdateRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
