

# ChargeRequestPaymentMethod

Payment method used in the charge. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Payment method type. |  |
|**expiresAt** | **Long** | Method expiration date as unix timestamp (applies to some payment methods, e.g. cash). |  [optional] |
|**paymentSourceId** | **String** | Identifier of a saved payment source to be used for this charge (if applicable). |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CASH | &quot;cash&quot; |
| OXXO_CASH | &quot;oxxo_cash&quot; |



