

# LogResponse

Log model representing a recorded request/response cycle for troubleshooting and auditing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**createdAt** | **Long** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**livemode** | **Boolean** |  |  |
|**ipAddress** | **String** |  |  [optional] |
|**loggableId** | **String** |  |  [optional] |
|**loggableType** | **String** |  |  [optional] |
|**method** | **String** |  |  [optional] |
|**url** | **String** |  |  [optional] |
|**related** | **String** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**userAccountId** | **String** |  |  [optional] |
|**oauthTokenId** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**queryString** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**requestHeaders** | **Map&lt;String, String&gt;** |  |  [optional] |
|**responseHeaders** | **Map&lt;String, String&gt;** |  |  [optional] |
|**requestBody** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**responseBody** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**searchableTags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOG | &quot;log&quot; |



