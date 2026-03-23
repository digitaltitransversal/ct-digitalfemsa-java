# TransactionsApi

All URIs are relative to *https://api.digitalfemsa.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /transactions/{id} | Get transaction |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /transactions | List transactions |



## getTransaction

> TransactionResponse getTransaction(id, acceptLanguage, xChildCompanyId)

Get transaction

Retrieves the details of a transaction by its ID.

### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        String id = "6307a60c41de27127515a575"; // String | Identifier of the resource
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        try {
            TransactionResponse result = apiInstance.getTransaction(id, acceptLanguage, xChildCompanyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransaction");
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

[**TransactionResponse**](TransactionResponse.md)

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
| **500** | internal server error |  -  |


## getTransactions

> GetTransactionsResponse getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, search, chargeId, type, currency)

List transactions

Returns a paginated list of transactions (ledger movements).

A transaction is a movement that represents the financial impact of payment operations, including amounts, fees, and net values.
Transactions can be linked to a charge and may be linked to a transfer (payout) when they are included in a payout.

If you need payout-level information (destination, statement reference/description, payout status), use GET /transfers.


### Example

```java
// Import classes:
import io.digitalfemsa.ApiClient;
import io.digitalfemsa.ApiException;
import io.digitalfemsa.Configuration;
import io.digitalfemsa.auth.*;
import io.digitalfemsa.model.*;
import io.digitalfemsa.TransactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.digitalfemsa.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        String acceptLanguage = "es"; // String | Use for knowing which language to use
        String xChildCompanyId = "6441b6376b60c3a638da80af"; // String | In the case of a holding company, the company id of the child company to which will process the request.
        Integer limit = 20; // Integer | The numbers of items to return, the maximum value is 250
        String next = "next_example"; // String | next page
        String previous = "previous_example"; // String | previous page
        String search = "search_example"; // String | General order search, e.g. by mail, reference etc.
        String chargeId = "65412a893cd69a0001c25892"; // String | id of the charge used for filtering
        String type = "capture"; // String | type of the object to be retrieved
        String currency = "MXN"; // String | currency of the object to be retrieved
        try {
            GetTransactionsResponse result = apiInstance.getTransactions(acceptLanguage, xChildCompanyId, limit, next, previous, search, chargeId, type, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getTransactions");
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
| **next** | **String**| next page | [optional] |
| **previous** | **String**| previous page | [optional] |
| **search** | **String**| General order search, e.g. by mail, reference etc. | [optional] |
| **chargeId** | **String**| id of the charge used for filtering | [optional] |
| **type** | **String**| type of the object to be retrieved | [optional] |
| **currency** | **String**| currency of the object to be retrieved | [optional] |

### Return type

[**GetTransactionsResponse**](GetTransactionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.app-v2.1.0+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | authentication error |  -  |
| **500** | internal server error |  -  |

