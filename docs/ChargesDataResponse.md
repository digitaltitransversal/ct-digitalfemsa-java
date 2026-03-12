

# ChargesDataResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**livemode** | **Boolean** |  |  |
|**createdAt** | **Long** |  |  |
|**currency** | **String** |  |  |
|**failureCode** | **String** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |
|**channel** | [**ChargeResponseChannel**](ChargeResponseChannel.md) |  |  [optional] |
|**paymentMethod** | [**ChargeResponsePaymentMethod**](ChargeResponsePaymentMethod.md) |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**deviceFingerprint** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**isRefundable** | **Boolean** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**status** | **String** |  |  |
|**amount** | **Long** |  |  |
|**paidAt** | **Long** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**orderId** | **String** |  |  [optional] |
|**refunds** | [**ChargeResponseRefunds**](ChargeResponseRefunds.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CHARGE | &quot;charge&quot; |



