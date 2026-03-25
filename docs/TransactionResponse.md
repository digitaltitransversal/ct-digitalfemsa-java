

# TransactionResponse

Transaction object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the transaction. |  |
|**_object** | **String** | Object name, which is transaction. |  |
|**amount** | **Long** | The amount of the transaction. |  |
|**fee** | **Long** | The amount to be deducted for taxes and commissions. |  |
|**net** | **Long** | The net amount after deducting commissions and taxes. |  |
|**currency** | **String** | The currency of the transaction. It uses the 3-letter code of ISO 4217. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Code indicating transaction status. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Transaction type. |  |
|**createdAt** | **Long** | Date and time of creation of the transaction in Unix format. |  |
|**livemode** | **Boolean** | Indicates whether the transaction was created in live mode or test mode. |  |
|**charge** | **String** | Charge ID associated with the transaction (present only if the transaction belongs to a charge). |  [optional] |
|**transfer** | **String** | Transfer ID associated with the transaction (present only if the transaction belongs to a transfer). |  [optional] |
|**transferredAt** | **Long** | Date and time when the transaction was transferred, in Unix format. |  [optional] |
|**formula** | **String** | Transaction fee formula identifier (if available). |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNPROCESSED | &quot;unprocessed&quot; |
| PENDING | &quot;pending&quot; |
| AVAILABLE | &quot;available&quot; |
| OWING | &quot;owing&quot; |
| PAID_OUT | &quot;paid_out&quot; |
| ON_HOLD | &quot;on_hold&quot; |
| RETAINED | &quot;retained&quot; |
| VOIDED | &quot;voided&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAPTURE | &quot;capture&quot; |
| CAPTURE_REVERSAL | &quot;capture_reversal&quot; |
| LIQUIDATION | &quot;liquidation&quot; |
| LIQUIDATION_REVERSAL | &quot;liquidation_reversal&quot; |
| PAYOUT | &quot;payout&quot; |
| PAYOUT_REVERSAL | &quot;payout_reversal&quot; |
| REFUND | &quot;refund&quot; |
| REFUND_REVERSAL | &quot;refund_reversal&quot; |
| ROUNDING_ADJUSTMENT | &quot;rounding_adjustment&quot; |
| TRANSFER | &quot;transfer&quot; |
| TRANSFERRED | &quot;transferred&quot; |
| RETENTION | &quot;retention&quot; |
| TEMPORARY_RETENTION | &quot;temporary_retention&quot; |
| CASHOUT_RETENTION | &quot;cashout_retention&quot; |
| CASHOUT_CONFIRMATION | &quot;cashout_confirmation&quot; |
| CASHOUT_CANCELATION | &quot;cashout_cancelation&quot; |
| AUTOFUND_CAPTURE | &quot;autofund_capture&quot; |



