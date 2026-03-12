# ShippingsApi

All URIs are relative to *https://api.digitalfemsa.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ordersCreateShipping**](ShippingsApi.md#ordersCreateShipping) | **POST** /orders/{id}/shipping_lines | Create Shipping |
| [**ordersDeleteShipping**](ShippingsApi.md#ordersDeleteShipping) | **DELETE** /orders/{id}/shipping_lines/{shipping_id} | Delete Shipping |
| [**ordersUpdateShipping**](ShippingsApi.md#ordersUpdateShipping) | **PUT** /orders/{id}/shipping_lines/{shipping_id} | Update Shipping |



## ordersCreateShipping

> ShippingOrderResponse ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId)

Create Shipping

Creates a new shipping line for an existing order. The shipping line is added to the order identified by `id`. The response returns the created shipping line.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ShippingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShippingsApi apiInstance = new ShippingsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        ShippingRequest shippingRequest = new ShippingRequest(); // ShippingRequest | Request body for creating or updating a shipping line.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ShippingOrderResponse result = apiInstance.ordersCreateShipping(id, shippingRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShippingsApi#ordersCreateShipping");
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
| **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| Request body for creating or updating a shipping line. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersDeleteShipping

> ShippingOrderResponse ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId)

Delete Shipping

Deletes an existing shipping line from an order. The shipping line identified by `shipping_id` belongs to the order identified by `id`.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ShippingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShippingsApi apiInstance = new ShippingsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String shippingId = "ship_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ShippingOrderResponse result = apiInstance.ordersDeleteShipping(id, shippingId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShippingsApi#ordersDeleteShipping");
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
| **shippingId** | **String**| identifier | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersUpdateShipping

> ShippingOrderResponse ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId)

Update Shipping

Updates an existing shipping line for an order. The shipping line identified by `shipping_id` belongs to the order identified by `id`. Only the fields provided in the request body are updated.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ShippingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ShippingsApi apiInstance = new ShippingsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String shippingId = "ship_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        ShippingRequest shippingRequest = new ShippingRequest(); // ShippingRequest | Request body for creating or updating a shipping line.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ShippingOrderResponse result = apiInstance.ordersUpdateShipping(id, shippingId, shippingRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShippingsApi#ordersUpdateShipping");
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
| **shippingId** | **String**| identifier | |
| **shippingRequest** | [**ShippingRequest**](ShippingRequest.md)| Request body for creating or updating a shipping line. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ShippingOrderResponse**](ShippingOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.2.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

