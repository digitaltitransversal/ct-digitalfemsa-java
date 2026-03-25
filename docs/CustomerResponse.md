

# CustomerResponse

customer response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Customer&#39;s ID |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**createdAt** | **Long** | Creation date of the object (Unix timestamp) |  |
|**livemode** | **Boolean** | true if the object exists in live mode or false if the object exists in test mode |  |
|**name** | **String** | Customer&#39;s name |  [optional] |
|**email** | **String** |  |  [optional] |
|**phone** | **String** | Customer&#39;s phone number |  [optional] |
|**corporate** | **Boolean** | true if the customer is a company |  [optional] |
|**customReference** | **String** | Custom reference |  [optional] |
|**defaultFiscalEntityId** | **String** |  |  [optional] |
|**defaultShippingContactId** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** | Customer metadata (maps to contextual_data in backend) |  [optional] |
|**paymentSources** | [**CustomerPaymentMethodsResponse**](CustomerPaymentMethodsResponse.md) |  |  [optional] |
|**fiscalEntities** | [**CustomerFiscalEntitiesResponse**](CustomerFiscalEntitiesResponse.md) |  |  [optional] |
|**shippingContacts** | [**CustomerResponseShippingContacts**](CustomerResponseShippingContacts.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |



