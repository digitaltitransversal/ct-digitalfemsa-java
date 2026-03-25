

# OrderRequest

a order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | Currency with which the payment will be made. |  |
|**customerInfo** | [**OrderRequestCustomerInfo**](OrderRequestCustomerInfo.md) |  |  |
|**lineItems** | [**List&lt;Product&gt;**](Product.md) | List of [products](https://developers.digitalfemsa.io/reference/orderscreateproduct) that are sold in the order. You must have at least one product. |  |
|**charges** | [**List&lt;ChargeRequest&gt;**](ChargeRequest.md) | List of [charges](https://developers.digitalfemsa.io/reference/orderscreatecharge) that are applied to the order |  [optional] |
|**checkout** | [**CheckoutRequest**](CheckoutRequest.md) |  |  [optional] |
|**discountLines** | [**List&lt;OrderDiscountLinesRequest&gt;**](OrderDiscountLinesRequest.md) | List of [discounts](https://developers.digitalfemsa.io/reference/orderscreatediscountline) that are applied to the order. You must have at least one discount. |  [optional] |
|**taxLines** | [**List&lt;OrderTaxRequest&gt;**](OrderTaxRequest.md) | List of [taxes](https://developers.digitalfemsa.io/reference/orderscreatetaxes) that are applied to the order. |  [optional] |
|**needsShippingContact** | **Boolean** | Allows you to fill out the shipping information at checkout |  [optional] |
|**shippingContact** | [**CustomerShippingContacts**](CustomerShippingContacts.md) |  |  [optional] |
|**shippingLines** | [**List&lt;ShippingRequest&gt;**](ShippingRequest.md) | List of [shipping costs](https://developers.digitalfemsa.io/reference/orderscreateshipping). If the online store offers digital products. |  [optional] |
|**fiscalEntity** | [**OrderFiscalEntityRequest**](OrderFiscalEntityRequest.md) |  |  [optional] |
|**processingMode** | **String** | Indicates the processing mode for the order, either ecommerce, recurrent or validation. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary key-value data that you can attach to the order for your internal use (e.g. &#x60;customer_segment&#x60;, &#x60;sales_channel&#x60;, &#x60;internal_order_id&#x60;). It is not used for payment processing or fraud decisions. Keys should be strings; values can be any JSON value. |  [optional] |



