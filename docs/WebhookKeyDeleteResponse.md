

# WebhookKeyDeleteResponse

Represents a webhook signing key after it has been deleted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the webhook key |  |
|**_object** | **String** | Object name, value is webhook_key |  |
|**active** | **Boolean** | Indicates if the webhook key is active |  |
|**livemode** | **Boolean** | Indicates if the webhook key is in live mode |  |
|**createdAt** | **Long** | Unix timestamp in seconds with the creation date of the webhook key |  |
|**deactivatedAt** | **Long** | Unix timestamp in seconds when the webhook key was deactivated (if applicable). |  [optional] |
|**deleted** | **Boolean** | Indicates if the webhook key is deleted |  |



