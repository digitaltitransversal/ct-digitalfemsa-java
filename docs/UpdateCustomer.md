

# UpdateCustomer

Request body to update a customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Customer&#39;s name. |  [optional] |
|**email** | **String** | Customer email address. |  [optional] |
|**phone** | **String** | Customer phone number. |  [optional] |
|**corporate** | **Boolean** | True if the customer represents a company. |  [optional] |
|**customReference** | **String** | Merchant-defined reference used to identify the customer in your system. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary metadata associated with the customer. |  [optional] |
|**paymentSources** | [**List&lt;CustomerPaymentMethodsRequest&gt;**](CustomerPaymentMethodsRequest.md) | Customer payment sources to create/attach (offline recurrent references). |  [optional] |
|**defaultPaymentSourceId** | **String** | Sets the default payment source for the customer (must be an existing payment source on the customer). |  [optional] |
|**defaultFiscalEntityId** | **String** | Sets the default fiscal entity for the customer (must be an existing fiscal entity on the customer). |  [optional] |
|**defaultShippingContactId** | **String** | Sets the default shipping contact for the customer (must be an existing shipping contact on the customer). |  [optional] |



