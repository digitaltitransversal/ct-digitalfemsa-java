

# UpdateOrderDiscountLinesRequest

List of discounts that apply to the order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Long** |  |  [optional] |
|**code** | **String** | Discount code. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY | &quot;loyalty&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| COUPON | &quot;coupon&quot; |
| SIGN | &quot;sign&quot; |



