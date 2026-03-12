

# OrderRequest

a order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) | List of [charges](https://developers.digitalfemsa.io/reference/orderscreatecharge) that are applied to the order |  [optional] |
|**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional] |
|**returnUrl** | **URI** | Optional return URL used by some payment/checkout flows. |  [optional] |
|**currency** | **String** | Currency with which the payment will be made. It uses the 3-letter code of the [International Standard ISO 4217.](https://es.wikipedia.org/wiki/ISO_4217) |  |
|**customerInfo** | [**CustomerInfo**](CustomerInfo.md) |  |  |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.digitalfemsa.io/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional] |
|**fiscalEntity** | [**Object**](Object.md) | Fiscal entity of the order, Currently it is a purely informative field |  [optional] |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.digitalfemsa.io/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata associated with the order |  [optional] |
|**needsShippingContact** | **Boolean** | Allows you to fill out the shipping information at checkout |  [optional] |
|**processingMode** | **String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional] |
|**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional] |
|**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.digitalfemsa.io/reference/orderscreateshipping). If the online store offers digital products. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.digitalfemsa.io/reference/orderscreatetaxes) that are applied to the order. |  [optional] |



