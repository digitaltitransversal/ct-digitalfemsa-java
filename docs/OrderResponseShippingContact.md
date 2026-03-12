

# OrderResponseShippingContact

Shipping contact associated with the order. It may be `null` when not provided/required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phone** | **String** |  |  [optional] |
|**receiver** | **String** |  |  [optional] |
|**betweenStreets** | **String** |  |  [optional] |
|**address** | [**CustomerShippingContactsResponseAddress**](CustomerShippingContactsResponseAddress.md) |  |  [optional] |
|**parentId** | **String** | Customer ID that owns this shipping contact. |  [optional] |
|**_default** | **Boolean** | True if this is the customer&#39;s default shipping contact. |  [optional] |
|**id** | **String** |  |  [optional] |
|**createdAt** | **Long** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata associated with the shipping contact |  [optional] |
|**_object** | **String** |  |  [optional] |
|**deleted** | **Boolean** | Present only when the shipping contact was deleted. |  [optional] |



