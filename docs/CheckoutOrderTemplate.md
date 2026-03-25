

# CheckoutOrderTemplate

Attributes used to create the order when a new payment is received.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | ISO 4217 currency code for the order. |  |
|**customerInfo** | [**CheckoutOrderTemplateCustomerInfo**](CheckoutOrderTemplateCustomerInfo.md) |  |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | Products to buy. Each contains unit price and quantity used to calculate the order total. |  |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary key-value data attached to the order for internal use. |  [optional] |



