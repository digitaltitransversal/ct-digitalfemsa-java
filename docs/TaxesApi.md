# TaxesApi

All URIs are relative to *https://api.digitalfemsa.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ordersCreateTaxes**](TaxesApi.md#ordersCreateTaxes) | **POST** /orders/{id}/tax_lines | Create Tax |
| [**ordersDeleteTaxes**](TaxesApi.md#ordersDeleteTaxes) | **DELETE** /orders/{id}/tax_lines/{tax_id} | Delete Tax |
| [**ordersUpdateTaxes**](TaxesApi.md#ordersUpdateTaxes) | **PUT** /orders/{id}/tax_lines/{tax_id} | Update Tax |



## ordersCreateTaxes

> UpdateOrderTaxResponse ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, xChildCompanyId)

Create Tax

Creates a new tax line for an existing order. The tax line is added to the order identified by `id`. The response returns the created tax line.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        OrderTaxRequest orderTaxRequest = new OrderTaxRequest(); // OrderTaxRequest | Request body for creating a tax line.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            UpdateOrderTaxResponse result = apiInstance.ordersCreateTaxes(id, orderTaxRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#ordersCreateTaxes");
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
| **orderTaxRequest** | [**OrderTaxRequest**](OrderTaxRequest.md)| Request body for creating a tax line. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersDeleteTaxes

> UpdateOrderTaxResponse ordersDeleteTaxes(id, taxId, acceptLanguage, xChildCompanyId)

Delete Tax

Deletes an existing tax line from an order. The tax line identified by `tax_id` belongs to the order identified by `id`. The response includes the deleted resource with `deleted: true`.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String taxId = "tax_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            UpdateOrderTaxResponse result = apiInstance.ordersDeleteTaxes(id, taxId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#ordersDeleteTaxes");
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
| **taxId** | **String**| identifier | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersUpdateTaxes

> UpdateOrderTaxResponse ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId)

Update Tax

Updates an existing tax line for an order. The tax line identified by `tax_id` belongs to the order identified by `id`. Only the fields provided in the request body are updated.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.TaxesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TaxesApi apiInstance = new TaxesApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String taxId = "tax_lin_2tQ974hSHcsdeSZHG"; // String | identifier
        UpdateOrderTaxRequest updateOrderTaxRequest = new UpdateOrderTaxRequest(); // UpdateOrderTaxRequest | Request body for creating a tax line.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            UpdateOrderTaxResponse result = apiInstance.ordersUpdateTaxes(id, taxId, updateOrderTaxRequest, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxesApi#ordersUpdateTaxes");
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
| **taxId** | **String**| identifier | |
| **updateOrderTaxRequest** | [**UpdateOrderTaxRequest**](UpdateOrderTaxRequest.md)| Request body for creating a tax line. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**UpdateOrderTaxResponse**](UpdateOrderTaxResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.app-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful |  -  |
| **401** | authentication error |  -  |
| **404** | not found entity |  -  |
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |

