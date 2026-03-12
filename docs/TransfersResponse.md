

# TransfersResponse

A transfer represents the action of sending an amount to a business bank account including the status, amount and destination used to make the transfer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the transfer. |  |
|**_object** | **String** | Object name, which is transfer. |  |
|**amount** | **Long** | Amount in cents of the transfer. |  |
|**createdAt** | **Long** | Date and time of creation of the transfer in Unix format. |  |
|**currency** | **String** | The currency of the transfer. It uses the 3-letter code of ISO 4217. |  |
|**livemode** | **Boolean** | Indicates whether the transfer was created in live mode or test mode. |  |
|**status** | **String** | Code indicating transfer status. |  |
|**statementReference** | **String** | Reference number of the transfer. |  |
|**statementDescription** | **String** | Description of the transfer. |  |
|**destination** | [**TransfersResponseDestination**](TransfersResponseDestination.md) |  |  |
|**fee** | **Long** | Total fee for the transfer (present only when requesting the &#39;details&#39; expansion). |  [optional] |
|**captureAmount** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**captureFee** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**captureNet** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**refundAmount** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**refundFee** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**refundNet** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**payoutAmount** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**payoutFee** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**payoutNet** | **Long** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |
|**transactions** | **List&lt;Object&gt;** | Present only when requesting the &#39;details&#39; expansion. |  [optional] |



