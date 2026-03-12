

# DeleteApiKeysResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Indicates if the api key is active |  |
|**createdAt** | **Long** | Unix timestamp in seconds of when the api key was created |  |
|**description** | **String** | A name or brief explanation of what this api key is used for |  |
|**livemode** | **Boolean** | Indicates if the api key is in production |  |
|**prefix** | **String** | The first few characters of the authentication_token |  |
|**id** | **String** | Unique identifier of the api key |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object name, value is &#39;api_key&#39; |  |
|**deleted** | **Boolean** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) | Indicates if the api key is private or public |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| API_KEY | &quot;api_key&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



