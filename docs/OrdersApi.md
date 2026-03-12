# OrdersApi

All URIs are relative to *https://api.digitalfemsa.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOrder**](OrdersApi.md#cancelOrder) | **POST** /orders/{id}/cancel | Cancel Order |
| [**cancelOrderRefund**](OrdersApi.md#cancelOrderRefund) | **DELETE** /orders/{id}/refunds/{refund_id} | Cancel Refund |
| [**captureOrder**](OrdersApi.md#captureOrder) | **POST** /orders/{id}/capture | Capture Order |
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /orders | Create order |
| [**getOrderById**](OrdersApi.md#getOrderById) | **GET** /orders/{id} | Get Order |
| [**getOrders**](OrdersApi.md#getOrders) | **GET** /orders | Get a list of Orders |
| [**orderRefund**](OrdersApi.md#orderRefund) | **POST** /orders/{id}/refunds | Refund Order |
| [**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /orders/{id} | Update order |



## cancelOrder

> OrderResponse cancelOrder(id, acceptLanguage, xChildCompanyId)

Cancel Order

Cancels an existing order. This operation marks the order as cancelled and prevents further processing depending on its current state. If the order cannot be cancelled (for example, due to its status or related charge constraints), the API returns an error response.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            OrderResponse result = apiInstance.cancelOrder(id, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#cancelOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **402** | payment required error |  -  |
| **404** | not found entity |  -  |
| **428** | Precondition Required |  -  |
| **500** | internal server error |  -  |


## cancelOrderRefund

> OrderResponse cancelOrderRefund(id, refundId, acceptLanguage, xChildCompanyId)

Cancel Refund

Cancels a refund previously created for an order. This operation is only available when the refund is still cancellable according to its current status and the payment method rules. If the refund cannot be cancelled, the API returns an error response.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String refundId = "6407b5bee1329a000175ba11"; // String | refund identifier
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            OrderResponse result = apiInstance.cancelOrderRefund(id, refundId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#cancelOrderRefund");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **refundId** | **String**| refund identifier | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **402** | payment required error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## captureOrder

> OrderResponse captureOrder(id, acceptLanguage, xChildCompanyId, orderCaptureRequest)

Capture Order

Captures (finalizes) an order that has been previously authorized. Use this endpoint to capture a specific amount. The captured amount must be greater than 0 and must comply with the order and charge constraints enforced by the API.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        OrderCaptureRequest orderCaptureRequest = new OrderCaptureRequest(); // OrderCaptureRequest | Requested fields for capturing an order
        try {
            OrderResponse result = apiInstance.captureOrder(id, acceptLanguage, xChildCompanyId, orderCaptureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#captureOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |
| **orderCaptureRequest** | [**OrderCaptureRequest**](OrderCaptureRequest.md)| Requested fields for capturing an order | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **428** | Precondition Required |  -  |
| **500** | internal server error |  -  |


## createOrder

> OrderResponse createOrder(orderRequest, acceptLanguage, xChildCompanyId)

Create order

Creates a new order. Optionally, you can include `charges` to create payment charges for the order during creation.
If checkout parameters are provided and a checkout is created/linked, the response may include a `checkout` object.


### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        OrderRequest orderRequest = new OrderRequest(); // OrderRequest | Fields used to create an Order.  Required: - `currency` - `line_items` - `customer_info`  Customer information is required to successfully create an order in this API, since downstream flows (such as creating charges, checkout configuration, and validating referenced customer sub-documents) require customer context.  Provide `customer_info` in one of the following ways: - Reference an existing customer using [customer_info.customer_id] OR - Provide customer details (at minimum `customer_info.name` and `customer_info.email`) to create the order with customer context.  You can create the order in one of these ways: - Include `charges` to create the order and attempt charging it immediately (only one charge object is allowed). - Include `checkout` to create the order with embedded checkout configuration.  Important validation rules: - `charges` and `checkout` are mutually exclusive in the same request. - If you provide `shipping_contact_id` or `fiscal_entity_id`, you must also provide [customer_info.customer_id] so the API can validate the referenced customer sub-documents. 
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            OrderResponse result = apiInstance.createOrder(orderRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#createOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderRequest** | [**OrderRequest**](OrderRequest.md)| Fields used to create an Order.  Required: - &#x60;currency&#x60; - &#x60;line_items&#x60; - &#x60;customer_info&#x60;  Customer information is required to successfully create an order in this API, since downstream flows (such as creating charges, checkout configuration, and validating referenced customer sub-documents) require customer context.  Provide &#x60;customer_info&#x60; in one of the following ways: - Reference an existing customer using [customer_info.customer_id] OR - Provide customer details (at minimum &#x60;customer_info.name&#x60; and &#x60;customer_info.email&#x60;) to create the order with customer context.  You can create the order in one of these ways: - Include &#x60;charges&#x60; to create the order and attempt charging it immediately (only one charge object is allowed). - Include &#x60;checkout&#x60; to create the order with embedded checkout configuration.  Important validation rules: - &#x60;charges&#x60; and &#x60;checkout&#x60; are mutually exclusive in the same request. - If you provide &#x60;shipping_contact_id&#x60; or &#x60;fiscal_entity_id&#x60;, you must also provide [customer_info.customer_id] so the API can validate the referenced customer sub-documents.  | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **402** | payment required error |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## getOrderById

> OrderResponse getOrderById(id, acceptLanguage, xChildCompanyId)

Get Order

Returns the full details of an Order by its ID. The response follows the standard Order representation, including nested previews (for example `charges`, `line_items`, `shipping_lines`, `tax_lines`, and `discount_lines`) when available.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            OrderResponse result = apiInstance.getOrderById(id, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrderById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **500** | internal server error |  -  |


## getOrders

> GetOrdersResponse getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous)

Get a list of Orders

Returns a paginated list of orders created in your account.
Use pagination parameters to navigate through results, and `search` to filter by supported criteria.


### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String search = "search_example"; // String | General order search, e.g. by mail, reference etc.
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        try {
            GetOrdersResponse result = apiInstance.getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |
| **limit** | **Integer**| The numbers of items to return, the maximum value is 250 | [optional] [default to 20] |
| **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] |
| **next** | **String**| next page | [optional] |
| **previous** | **String**| previous page | [optional] |

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |


## orderRefund

> OrderResponse orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId)

Refund Order

Creates a refund for an order. This operation is used to refund a previously paid order (fully or partially, depending on the request body). The API will validate the order and its related charges before processing the refund. If the refund cannot be created due to business rules or state, an error response is returned.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        OrderRefundRequest orderRefundRequest = new OrderRefundRequest(); // OrderRefundRequest | requested field for a refund
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            OrderResponse result = apiInstance.orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#orderRefund");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **orderRefundRequest** | [**OrderRefundRequest**](OrderRefundRequest.md)| requested field for a refund | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **402** | payment required error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## updateOrder

> OrderResponse updateOrder(id, orderUpdateRequest, acceptLanguage)

Update order

Updates an existing order by its ID.

Orders are the central resource in the API. Updating an order may also update related order sub-resources when they are included in the request payload, according to server-side validations.

Only fields supported by the API can be modified.


### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        OrderUpdateRequest orderUpdateRequest = new OrderUpdateRequest(); // OrderUpdateRequest | requested field for an order
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        try {
            OrderResponse result = apiInstance.updateOrder(id, orderUpdateRequest, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#updateOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Identifier of the resource | |
| **orderUpdateRequest** | [**OrderUpdateRequest**](OrderUpdateRequest.md)| requested field for an order | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

