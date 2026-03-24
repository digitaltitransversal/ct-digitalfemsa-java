

# Checkout

Creates a Payment Link. This is a sub-resource related to an Order template: each time a customer pays using the link, the API will create an Order using `order_template`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Payment link name. |  |
|**type** | **String** | Checkout type. |  |
|**recurrent** | **Boolean** | false: single use. true: multiple payments |  |
|**paymentsLimitCount** | **Integer** | Required when &#x60;recurrent&#x60; is true. Maximum number of payments allowed through the link. |  [optional] |
|**allowedPaymentMethods** | **List&lt;String&gt;** | Payment methods available in the payment link. |  |
|**needsShippingContact** | **Boolean** | This flag allows you to fill in the shipping information at checkout. |  |
|**startsAt** | **Long** | Start time for the link. Unix timestamp in seconds. |  [optional] |
|**expiresAt** | **Long** | Expiration time for the link (Unix timestamp in seconds). Valid range is between 2 and 365 days (calculated from the next day of creation at 00:01).  |  |
|**canNotExpire** | **Boolean** | If true, the link does not expire. |  [optional] |
|**orderTemplate** | [**CheckoutOrderTemplate**](CheckoutOrderTemplate.md) |  |  |



