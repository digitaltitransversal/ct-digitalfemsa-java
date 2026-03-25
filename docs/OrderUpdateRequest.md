

# OrderUpdateRequest

Order update payload. Only supported fields can be modified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | Currency code in ISO 4217 (3-letter uppercase). |  [optional] |
|**customerInfo** | [**OrderUpdateRequestCustomerInfo**](OrderUpdateRequestCustomerInfo.md) |  |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.femsa.com/v2.1.0/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  [optional] |
|**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) |  |  [optional] |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.femsa.com/v2.1.0/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) |  |  [optional] |
|**shippingContactId** | **String** | Existing shipping contact id from the customer to link to this order. |  [optional] |
|**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional] |
|**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.femsa.com/v2.1.0/reference/orderscreateshipping). If the online store offers digital products. |  [optional] |
|**fiscalEntityId** | **String** | Existing fiscal entity id from the customer to link to this order. |  [optional] |
|**fiscalEntity** | [**OrderUpdateFiscalEntityRequest**](OrderUpdateFiscalEntityRequest.md) |  |  [optional] |
|**returnUrl** | **String** | URL where the customer should be redirected after completing a payment flow (if applicable). |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary key-value data that you can attach to the order for your internal use. It is not used for payment processing. Keys should be strings; values can be any JSON value.  |  [optional] |
|**status** | **String** | Order status update (only allowed transitions will be accepted). |  [optional] |



