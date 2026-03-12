

# WebhookRequest

Parameters used to create or update a webhook.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | Webhook endpoint URL. Local URLs are not allowed. |  |
|**subscribedEvents** | **List&lt;String&gt;** | List of event types the webhook is subscribed to. |  [optional] |
|**events** | **List&lt;String&gt;** | Alias for subscribed_events. |  [optional] |
|**synchronous** | **Boolean** | Indicates whether the webhook uses synchronous delivery behavior. |  [optional] |
|**active** | **Boolean** | Indicates whether the webhook is active. |  [optional] |
|**description** | **String** | Optional description of the webhook. |  [optional] |



