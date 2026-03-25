

# OrderResponse

Order model. Some nested resources are returned as list previews (for example: `charges`, `line_items`), and may be `null` depending on the request/context. The `checkout` field is only present when the order is linked to a checkout (`channel.checkout_request_id`). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  [optional] |
|**livemode** | **Boolean** |  |  [optional] |
|**amount** | **Integer** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**paymentStatus** | **String** | Current payment status of the order. It can be &#x60;null&#x60; for orders without payment information yet. |  [optional] |
|**amountRefunded** | **Integer** |  |  [optional] |
|**splitPayment** | **Boolean** | Indicates whether the order uses split payments (when available/configured). |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata attached to the order. |  [optional] |
|**isRefundable** | **Boolean** | Indicates whether the order is currently refundable. |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**updatedAt** | **Long** |  |  [optional] |
|**customerInfo** | [**OrderResponseCustomerInfo**](OrderResponseCustomerInfo.md) |  |  [optional] |
|**shippingContact** | [**OrderResponseShippingContact**](OrderResponseShippingContact.md) |  |  [optional] |
|**channel** | [**OrderResponseChannel**](OrderResponseChannel.md) |  |  [optional] |
|**fiscalEntity** | [**OrderFiscalEntityResponse**](OrderFiscalEntityResponse.md) |  |  [optional] |
|**checkout** | [**OrderResponseCheckout**](OrderResponseCheckout.md) |  |  [optional] |
|**lineItems** | [**OrderResponseProducts**](OrderResponseProducts.md) |  |  [optional] |
|**discountLines** | [**OrderResponseDiscountLines**](OrderResponseDiscountLines.md) |  |  [optional] |
|**charges** | [**OrderResponseCharges**](OrderResponseCharges.md) |  |  [optional] |
|**partialReference** | **Map&lt;String, Object&gt;** | Partial reference information (when applicable). Structure may vary depending on the payment flow. |  [optional] |
|**paymentsInfo** | **Map&lt;String, Object&gt;** | Additional payment information (when available). Structure may vary. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |



