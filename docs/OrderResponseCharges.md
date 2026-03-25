

# OrderResponseCharges

List preview of charges created for the order. Charges are only created when included in the request or created later through payment flows. This field can be `null` depending on the response context. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasMore** | **Boolean** | Indicates if there are more pages to be requested |  |
|**_object** | **String** | Object type, in this case is list |  |
|**data** | [**List&lt;ChargesDataResponse&gt;**](ChargesDataResponse.md) |  |  [optional] |



