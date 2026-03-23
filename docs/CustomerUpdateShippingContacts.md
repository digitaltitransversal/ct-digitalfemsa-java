

# CustomerUpdateShippingContacts

[Shipping Contacts](https://developers.femsa.com/v2.1.0/reference/createcustomershippingcontacts) details for updating a customer shipping contact. Only the fields provided in the request body are updated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phone** | **String** | Phone contact |  [optional] |
|**receiver** | **String** | Name of the person who will receive the order |  [optional] |
|**betweenStreets** | **String** | The street names between which the order will be delivered. |  [optional] |
|**address** | [**CustomerShippingContactsAddress**](CustomerShippingContactsAddress.md) |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Metadata associated with the shipping contact |  [optional] |



