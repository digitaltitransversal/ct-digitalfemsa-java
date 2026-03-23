package io.digitalfemsa;

import io.digitalfemsa.model.GetTransactionsResponse;
import io.digitalfemsa.model.TransactionResponse;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class TransactionsApi {
  private ApiClient apiClient;

  public TransactionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionsApi(ApiClient apiClient) {
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
   * Get transaction
   * Retrieves the details of a transaction by its ID.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return TransactionResponse
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
  public TransactionResponse getTransaction(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    return getTransactionWithHttpInfo(id, acceptLanguage, xChildCompanyId).getData();
  }

  /**
   * Get transaction
   * Retrieves the details of a transaction by its ID.
   * @param id Identifier of the resource (required)
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @return ApiResponse&lt;TransactionResponse&gt;
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
  public ApiResponse<TransactionResponse> getTransactionWithHttpInfo(String id, String acceptLanguage, String xChildCompanyId) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTransaction");
    }

    // Path parameters
    String localVarPath = "/transactions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<TransactionResponse> localVarReturnType = new GenericType<TransactionResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.getTransaction", localVarPath, "GET", new ArrayList<>(), null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List transactions
   * Returns a paginated list of transactions (ledger movements).  A transaction is a movement that represents the financial impact of payment operations, including amounts, fees, and net values. Transactions can be linked to a charge and may be linked to a transfer (payout) when they are included in a payout.  If you need payout-level information (destination, statement reference/description, payout status), use GET /transfers. 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param chargeId id of the charge used for filtering (optional)
   * @param type type of the object to be retrieved (optional)
   * @param currency currency of the object to be retrieved (optional)
   * @return GetTransactionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public GetTransactionsResponse getTransactions(String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search, String chargeId, String type, String currency) throws ApiException {
    return getTransactionsWithHttpInfo(acceptLanguage, xChildCompanyId, limit, next, previous, search, chargeId, type, currency).getData();
  }

  /**
   * List transactions
   * Returns a paginated list of transactions (ledger movements).  A transaction is a movement that represents the financial impact of payment operations, including amounts, fees, and net values. Transactions can be linked to a charge and may be linked to a transfer (payout) when they are included in a payout.  If you need payout-level information (destination, statement reference/description, payout status), use GET /transfers. 
   * @param acceptLanguage Use for knowing which language to use (optional, default to es)
   * @param xChildCompanyId In the case of a holding company, the company id of the child company to which will process the request. (optional)
   * @param limit The numbers of items to return, the maximum value is 250 (optional, default to 20)
   * @param next next page (optional)
   * @param previous previous page (optional)
   * @param search General order search, e.g. by mail, reference etc. (optional)
   * @param chargeId id of the charge used for filtering (optional)
   * @param type type of the object to be retrieved (optional)
   * @param currency currency of the object to be retrieved (optional)
   * @return ApiResponse&lt;GetTransactionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> authentication error </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetTransactionsResponse> getTransactionsWithHttpInfo(String acceptLanguage, String xChildCompanyId, Integer limit, String next, String previous, String search, String chargeId, String type, String currency) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "next", next));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "previous", previous));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "charge_id", chargeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    // Header parameters
    Map<String, String> localVarHeaderParams = new LinkedHashMap<>();
    if (acceptLanguage != null) {
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
    }
    if (xChildCompanyId != null) {
      localVarHeaderParams.put("X-Child-Company-Id", apiClient.parameterToString(xChildCompanyId));
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/vnd.app-v2.1.0+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<GetTransactionsResponse> localVarReturnType = new GenericType<GetTransactionsResponse>() {};
    return apiClient.invokeAPI("TransactionsApi.getTransactions", "/transactions", "GET", localVarQueryParams, null,
                               localVarHeaderParams, new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
