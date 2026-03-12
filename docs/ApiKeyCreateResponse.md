

# ApiKeyCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the API key |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object name, value is &#39;api_key&#39; |  |
|**active** | **Boolean** | Indicates if the API key is active |  |
|**livemode** | **Boolean** | Indicates if the API key is in production |  |
|**role** | [**RoleEnum**](#RoleEnum) | Indicates if the API key is private or public |  |
|**description** | **String** | A name or brief explanation of what this API key is used for |  [optional] |
|**prefix** | **String** | The first few characters of the authentication_token |  |
|**createdAt** | **Long** | Unix timestamp in seconds of when the API key was created |  |
|**updatedAt** | **Long** | Unix timestamp in seconds of when the API key was last updated |  |
|**deactivatedAt** | **Long** | Unix timestamp in seconds of when the API key was deactivated |  [optional] |
|**deleted** | **Boolean** | Indicates if the API key was deleted |  [optional] |
|**authenticationToken** | **String** | Used as the username for Basic Authentication, with a blank password. This value is shown only once (when the key is created). Copy and store it securely.  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| API_KEY | &quot;api_key&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



