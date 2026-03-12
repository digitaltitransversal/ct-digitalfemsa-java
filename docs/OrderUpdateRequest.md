

# OrderUpdateRequest

Order update payload. Only supported fields can be modified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Order status update. Allowed values depend on server-side validations. |  [optional] |
|**currency** | **String** | Currency used for the order. Uses ISO 4217 (3-letter code). Allowed values depend on server-side validations. |  [optional] |
|**customerInfo** | [**CustomerInfo**](CustomerInfo.md) |  |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of products sold in the order. |  [optional] |
|**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of shipping costs applied to the order. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) |  |  [optional] |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of discounts applied to the order. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Additional information attached to the order. |  [optional] |
|**returnUrl** | **String** | URL to redirect the customer after completing the flow (when applicable). |  [optional] |
|**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) | Add new charges to the order. Subject to server-side validations (for example, maximum charges rules).  |  [optional] |
|**shippingContactId** | **String** | References an existing customer shipping contact. |  [optional] |
|**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional] |
|**fiscalEntityId** | **String** | References an existing customer fiscal entity. |  [optional] |
|**fiscalEntity** | [**OrderUpdateFiscalEntityRequest**](OrderUpdateFiscalEntityRequest.md) |  |  [optional] |



