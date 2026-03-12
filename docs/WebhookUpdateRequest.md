

# WebhookUpdateRequest

Parameters used to update a webhook. All fields are optional; send only the fields you want to change.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | Webhook endpoint URL. Local URLs are not allowed. |  [optional] |
|**subscribedEvents** | **List&lt;String&gt;** | List of event types the webhook is subscribed to. |  [optional] |
|**events** | **List&lt;String&gt;** | Alias for subscribed_events. |  [optional] |
|**synchronous** | **Boolean** | Indicates whether the webhook uses synchronous delivery behavior. |  [optional] |
|**active** | **Boolean** | Activates or deactivates the webhook. |  [optional] |
|**description** | **String** | Optional description of the webhook. |  [optional] |



