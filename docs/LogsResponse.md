

# LogsResponse

Log model representing a recorded request/response cycle for troubleshooting and auditing.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |  |
|**createdAt** | **Long** |  |  |
|**livemode** | **Boolean** |  |  |
|**method** | **String** |  |  |
|**url** | **String** |  |  |
|**status** | **String** |  |  |
|**version** | **String** |  |  |
|**ipAddress** | **String** |  |  |
|**related** | **String** |  |  |
|**queryString** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**requestBody** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**responseBody** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**requestHeaders** | **Map&lt;String, String&gt;** |  |  [optional] |
|**responseHeaders** | **Map&lt;String, String&gt;** |  |  [optional] |
|**searchableTags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOG | &quot;log&quot; |



