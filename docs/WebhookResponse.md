

# WebhookResponse

Represents a webhook endpoint configured to receive event notifications.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the webhook. |  |
|**_object** | **String** | Object name, which is webhook. |  |
|**url** | **String** | The URL where events will be delivered. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current delivery status of the webhook. |  |
|**subscribedEvents** | **List&lt;String&gt;** | List of event types the webhook is subscribed to. |  |
|**synchronous** | **Boolean** | Indicates whether the webhook uses synchronous delivery behavior. |  |
|**description** | **String** | Optional description of the webhook. |  [optional] |
|**livemode** | **Boolean** | Indicates whether the webhook is in live mode or test mode. |  |
|**active** | **Boolean** | Indicates whether the webhook is active. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| BEING_PINGED | &quot;being_pinged&quot; |
| LISTENING | &quot;listening&quot; |
| INTERMITTENT_ERRORS | &quot;intermittent_errors&quot; |
| UNRESPONSIVE | &quot;unresponsive&quot; |
| ERROR | &quot;error&quot; |
| DISABLED | &quot;disabled&quot; |



