package io.digitalfemsa;

import io.digitalfemsa.model.GetOrdersResponse;
import io.digitalfemsa.model.OrderCaptureRequest;
import io.digitalfemsa.model.OrderRefundRequest;
import io.digitalfemsa.model.OrderRequest;
import io.digitalfemsa.model.OrderResponse;
import io.digitalfemsa.model.OrderUpdateRequest;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
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
   * Cancel Order
   * Cancels an existing order. This operation marks the order as cancelled and prevents further processing depending on its current state. If the order cannot be cancelled (for example, due to its status or related charge constraints), the API returns an error response.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse cancelOrder(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return cancelOrderWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Cancel Order
   * Cancels an existing order. This operation marks the order as cancelled and prevents further processing depending on its current state. If the order cannot be cancelled (for example, due to its status or related charge constraints), the API returns an error response.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> cancelOrderWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelOrder");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/cancel"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.cancelOrder", localVarPath, "POST", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Cancel Refund
   * Cancels a refund previously created for an order. This operation is only available when the refund is still cancellable according to its current status and the payment method rules. If the refund cannot be cancelled, the API returns an error response.
   * @param id Identifier of the resource (required)
   * @param refundId refund identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse cancelOrderRefund(String id, String refundId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return cancelOrderRefundWithHttpInfo(id, refundId, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Cancel Refund
   * Cancels a refund previously created for an order. This operation is only available when the refund is still cancellable according to its current status and the payment method rules. If the refund cannot be cancelled, the API returns an error response.
   * @param id Identifier of the resource (required)
   * @param refundId refund identifier (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> cancelOrderRefundWithHttpInfo(String id, String refundId, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelOrderRefund");
    }
    if (refundId == null) {
      throw new ApiException(400, "Missing the required parameter 'refundId' when calling cancelOrderRefund");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/refunds/{refund_id}"
            .replaceAll("\\{id}", apiClient.escapeString(id))
            .replaceAll("\\{refund_id}", apiClient.escapeString(refundId));

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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.cancelOrderRefund", localVarPath, "DELETE", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Capture Order
   * Captures (finalizes) an order that has been previously authorized. Use this endpoint to capture a specific amount. The captured amount must be greater than 0 and must comply with the order and charge constraints enforced by the API.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param orderCaptureRequest Requested fields for capturing an order (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse captureOrder(String id, String acceptLanguage, String xChildCompanyId, OrderCaptureRequest orderCaptureRequest) throws ApiException {
    return captureOrderWithHttpInfo(id, acceptLanguage, xChildCompanyId, orderCaptureRequest).getData();
  }

  /**
   * Capture Order
   * Captures (finalizes) an order that has been previously authorized. Use this endpoint to capture a specific amount. The captured amount must be greater than 0 and must comply with the order and charge constraints enforced by the API.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param orderCaptureRequest Requested fields for capturing an order (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 428 </td><td> Precondition Required </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> captureOrderWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId, OrderCaptureRequest orderCaptureRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling captureOrder");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/capture"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.captureOrder", localVarPath, "POST", new ArrayList<>(), orderCaptureRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create order
   * Creates a new order. Optionally, you can include &#x60;charges&#x60; to create payment charges for the order during creation. If checkout parameters are provided and a checkout is created/linked, the response may include a &#x60;checkout&#x60; object. 
   * @param orderRequest Fields used to create an Order.  Required: - &#x60;currency&#x60; - &#x60;line_items&#x60; - &#x60;customer_info&#x60;  Customer information is required to successfully create an order in this API, since downstream flows (such as creating charges, checkout configuration, and validating referenced customer sub-documents) require customer context.  Provide &#x60;customer_info&#x60; in one of the following ways: - Reference an existing customer using [customer_info.customer_id] OR - Provide customer details (at minimum &#x60;customer_info.name&#x60; and &#x60;customer_info.email&#x60;) to create the order with customer context.  You can create the order in one of these ways: - Include &#x60;charges&#x60; to create the order and attempt charging it immediately (only one charge object is allowed). - Include &#x60;checkout&#x60; to create the order with embedded checkout configuration.  Important validation rules: - &#x60;charges&#x60; and &#x60;checkout&#x60; are mutually exclusive in the same request. - If you provide &#x60;shipping_contact_id&#x60; or &#x60;fiscal_entity_id&#x60;, you must also provide [customer_info.customer_id] so the API can validate the referenced customer sub-documents.  (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse createOrder(OrderRequest orderRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return createOrderWithHttpInfo(orderRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Create order
   * Creates a new order. Optionally, you can include &#x60;charges&#x60; to create payment charges for the order during creation. If checkout parameters are provided and a checkout is created/linked, the response may include a &#x60;checkout&#x60; object. 
   * @param orderRequest Fields used to create an Order.  Required: - &#x60;currency&#x60; - &#x60;line_items&#x60; - &#x60;customer_info&#x60;  Customer information is required to successfully create an order in this API, since downstream flows (such as creating charges, checkout configuration, and validating referenced customer sub-documents) require customer context.  Provide &#x60;customer_info&#x60; in one of the following ways: - Reference an existing customer using [customer_info.customer_id] OR - Provide customer details (at minimum &#x60;customer_info.name&#x60; and &#x60;customer_info.email&#x60;) to create the order with customer context.  You can create the order in one of these ways: - Include &#x60;charges&#x60; to create the order and attempt charging it immediately (only one charge object is allowed). - Include &#x60;checkout&#x60; to create the order with embedded checkout configuration.  Important validation rules: - &#x60;charges&#x60; and &#x60;checkout&#x60; are mutually exclusive in the same request. - If you provide &#x60;shipping_contact_id&#x60; or &#x60;fiscal_entity_id&#x60;, you must also provide [customer_info.customer_id] so the API can validate the referenced customer sub-documents.  (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> createOrderWithHttpInfo(OrderRequest orderRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (orderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderRequest' when calling createOrder");
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.createOrder", "/orders", "POST", new ArrayList<>(), orderRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Order
   * Returns the full details of an Order by its ID. The response follows the standard Order representation, including nested previews (for example &#x60;charges&#x60;, &#x60;line_items&#x60;, &#x60;shipping_lines&#x60;, &#x60;tax_lines&#x60;, and &#x60;discount_lines&#x60;) when available.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse getOrderById(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return getOrderByIdWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get Order
   * Returns the full details of an Order by its ID. The response follows the standard Order representation, including nested previews (for example &#x60;charges&#x60;, &#x60;line_items&#x60;, &#x60;shipping_lines&#x60;, &#x60;tax_lines&#x60;, and &#x60;discount_lines&#x60;) when available.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> getOrderByIdWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getOrderById");
    }

    // Path parameters
    String localVarPath = "/orders/{id}"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.getOrderById", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a list of Orders
   * Returns a paginated list of orders created in your account. Use pagination parameters to navigate through results, and &#x60;search&#x60; to filter by supported criteria. 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return GetOrdersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetOrdersResponse getOrders(String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous) throws ApiException {
    return getOrdersWithHttpInfo(acceptLanguage, xChildCompanyId, limit, search, next, previous).getData();
  }

  /**
   * Get a list of Orders
   * Returns a paginated list of orders created in your account. Use pagination parameters to navigate through results, and &#x60;search&#x60; to filter by supported criteria. 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @return ApiResponse&lt;GetOrdersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetOrdersResponse> getOrdersWithHttpInfo(String acceptLanguage, String xChildCompanyId, Integer limit, String search, String next, String previous) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
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
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<GetOrdersResponse> localVarReturnType = new GenericType<GetOrdersResponse>() {};
    return apiClient.invokeAPI("OrdersApi.getOrders", "/orders", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Refund Order
   * Creates a refund for an order. This operation is used to refund a previously paid order (fully or partially, depending on the request body). The API will validate the order and its related charges before processing the refund. If the refund cannot be created due to business rules or state, an error response is returned.
   * @param id Identifier of the resource (required)
   * @param orderRefundRequest requested field for a refund (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse orderRefund(String id, OrderRefundRequest orderRefundRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return orderRefundWithHttpInfo(id, orderRefundRequest, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Refund Order
   * Creates a refund for an order. This operation is used to refund a previously paid order (fully or partially, depending on the request body). The API will validate the order and its related charges before processing the refund. If the refund cannot be created due to business rules or state, an error response is returned.
   * @param id Identifier of the resource (required)
   * @param orderRefundRequest requested field for a refund (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 402 </td><td> payment required error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> orderRefundWithHttpInfo(String id, OrderRefundRequest orderRefundRequest, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling orderRefund");
    }
    if (orderRefundRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderRefundRequest' when calling orderRefund");
    }

    // Path parameters
    String localVarPath = "/orders/{id}/refunds"
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
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.orderRefund", localVarPath, "POST", new ArrayList<>(), orderRefundRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update order
   * Updates an existing order by its ID.  Orders are the central resource in the API. Updating an order may also update related order sub-resources when they are included in the request payload, according to server-side validations.  Only fields supported by the API can be modified. 
   * @param id Identifier of the resource (required)
   * @param orderUpdateRequest requested field for an order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return OrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public OrderResponse updateOrder(String id, OrderUpdateRequest orderUpdateRequest, String acceptLanguage) throws ApiException {
    return updateOrderWithHttpInfo(id, orderUpdateRequest, acceptLanguage).getData();
  }

  /**
   * Update order
   * Updates an existing order by its ID.  Orders are the central resource in the API. Updating an order may also update related order sub-resources when they are included in the request payload, according to server-side validations.  Only fields supported by the API can be modified. 
   * @param id Identifier of the resource (required)
   * @param orderUpdateRequest requested field for an order (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @return ApiResponse&lt;OrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> not found entity </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> parameter validation error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<OrderResponse> updateOrderWithHttpInfo(String id, OrderUpdateRequest orderUpdateRequest, String acceptLanguage) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateOrder");
    }
    if (orderUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'orderUpdateRequest' when calling updateOrder");
    }

    // Path parameters
    String localVarPath = "/orders/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.2.0+json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<OrderResponse> localVarReturnType = new GenericType<OrderResponse>() {};
    return apiClient.invokeAPI("OrdersApi.updateOrder", localVarPath, "PUT", new ArrayList<>(), orderUpdateRequest,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
