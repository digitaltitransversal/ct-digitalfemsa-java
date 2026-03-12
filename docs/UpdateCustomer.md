

# UpdateCustomer

Request body to update a customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Customer&#39;s name. |  [optional] |
|**email** | **String** | Customer email address. |  [optional] |
|**phone** | **String** | Customer phone number. |  [optional] |
|**corporate** | **Boolean** | Indicates whether the customer email is corporate. |  [optional] |
|**customReference** | **String** | Merchant-defined reference used to identify the customer in your system. |  [optional] |
|**referrer** | **String** | Referrer value (if applicable). |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary metadata associated with the customer. |  [optional] |
|**paymentSources** | [**List&lt;CustomerPaymentMethodsRequest&gt;**](CustomerPaymentMethodsRequest.md) | Contains details of the payment methods that the customer has active or has used in Femsa |  [optional] |
|**defaultPaymentSourceId** | **String** | Sets the default payment source for the customer (must be an existing payment source on the customer). |  [optional] |
|**defaultFiscalEntityId** | **String** | Sets the default fiscal entity for the customer (must be an existing fiscal entity on the customer). |  [optional] |
|**defaultShippingContactId** | **String** | Sets the default shipping contact for the customer (must be an existing shipping contact on the customer). |  [optional] |



