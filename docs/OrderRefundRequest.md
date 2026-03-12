

# OrderRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** | Amount to refund. If not provided, the API refunds the refundable amount of the selected charge. |  |
|**chargeId** | **String** | Charge ID to refund. If not provided, the API selects a refundable charge from the order. |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Refund reason. If not provided, the API uses a default reason. |  |
|**expiresAt** | **Long** | Expiration timestamp for cash refunds (must be within the allowed range configured by the API). |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| REQUESTED_BY_CLIENT | &quot;requested_by_client&quot; |
| CANNOT_BE_FULFILLED | &quot;cannot_be_fulfilled&quot; |
| DUPLICATED_TRANSACTION | &quot;duplicated_transaction&quot; |
| SUSPECTED_FRAUD | &quot;suspected_fraud&quot; |
| OTHER | &quot;other&quot; |



