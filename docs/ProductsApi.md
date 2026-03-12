# ProductsApi

All URIs are relative to *https://api.digitalfemsa.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ordersCreateProduct**](ProductsApi.md#ordersCreateProduct) | **POST** /orders/{id}/line_items | Create Product |
| [**ordersDeleteProduct**](ProductsApi.md#ordersDeleteProduct) | **DELETE** /orders/{id}/line_items/{line_item_id} | Delete Product |
| [**ordersUpdateProduct**](ProductsApi.md#ordersUpdateProduct) | **PUT** /orders/{id}/line_items/{line_item_id} | Update Product |



## ordersCreateProduct

> ProductOrderResponse ordersCreateProduct(id, product, acceptLanguage, xChildCompanyId)

Create Product

Creates a new product (line item) for an existing order. Use this endpoint to add an additional item to the order after it has been created.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        Product product = new Product(); // Product | Fields required to create a new product (line item) for an existing order. This request adds a new item to the order.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ProductOrderResponse result = apiInstance.ordersCreateProduct(id, product, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#ordersCreateProduct");
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
| **product** | [**Product**](Product.md)| Fields required to create a new product (line item) for an existing order. This request adds a new item to the order. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

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
| **500** | internal server error |  -  |


## ordersDeleteProduct

> ProductOrderResponse ordersDeleteProduct(id, lineItemId, acceptLanguage, xChildCompanyId)

Delete Product

Deletes a product (line item) from an existing order. The API will validate whether the order can be modified before removing the item.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String lineItemId = "line_item_2tQ8HkkfbauaKP9Ho"; // String | identifier
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ProductOrderResponse result = apiInstance.ordersDeleteProduct(id, lineItemId, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#ordersDeleteProduct");
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
| **lineItemId** | **String**| identifier | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

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
| **422** | parameter validation error |  -  |
| **500** | internal server error |  -  |


## ordersUpdateProduct

> ProductOrderResponse ordersUpdateProduct(id, lineItemId, updateProduct, acceptLanguage, xChildCompanyId)

Update Product

Updates an existing product (line item) for an existing order. Use this endpoint to modify the details of a specific line item in the order.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.ProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String lineItemId = "line_item_2tQ8HkkfbauaKP9Ho"; // String | identifier
        UpdateProduct updateProduct = new UpdateProduct(); // UpdateProduct | Fields allowed to update an existing product (line item) in an order. All fields are optional; only the provided fields will be updated.
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            ProductOrderResponse result = apiInstance.ordersUpdateProduct(id, lineItemId, updateProduct, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#ordersUpdateProduct");
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
| **lineItemId** | **String**| identifier | |
| **updateProduct** | [**UpdateProduct**](UpdateProduct.md)| Fields allowed to update an existing product (line item) in an order. All fields are optional; only the provided fields will be updated. | |
| **acceptLanguage** | **String**| Use for knowing which language to use | [optional] [default to es] [enum: es, en] |
| **xChildCompanyId** | **String**| In the case of a holding company, the company id of the child company to which will process the request. | [optional] |

### Return type

[**ProductOrderResponse**](ProductOrderResponse.md)

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

