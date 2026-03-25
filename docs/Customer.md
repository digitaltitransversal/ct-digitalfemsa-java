

# Customer

Customer create request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Customer&#39;s name. |  |
|**email** | **String** | Customer email address. |  |
|**phone** | **String** | Customer phone number. |  [optional] |
|**corporate** | **Boolean** | Indicates whether the customer email is corporate. |  [optional] |
|**customReference** | **String** | Merchant-defined reference used to identify the customer in your system. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary metadata associated with the customer. |  [optional] |
|**paymentSources** | [**List&lt;CustomerPaymentMethodsRequest&gt;**](CustomerPaymentMethodsRequest.md) | Customer payment sources to be created with the customer (optional). |  [optional] |
|**fiscalEntities** | [**List&lt;CustomerFiscalEntitiesRequest&gt;**](CustomerFiscalEntitiesRequest.md) | Customer fiscal entities to be created with the customer (optional). |  [optional] |
|**shippingContacts** | [**List&lt;CustomerShippingContacts&gt;**](CustomerShippingContacts.md) | Customer shipping contacts to be created with the customer (optional). |  [optional] |



