

# BalanceResponse

Company balance summary.  Monetary fields are returned as arrays of amounts grouped by currency (see `balance_common_field` items). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts currently available, grouped by currency. |  [optional] |
|**cashoutRetentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | The balance&#39;s cashout retention amount |  [optional] |
|**conektaRetention** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | The balance&#39;s Femsa retention |  [optional] |
|**gateway** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Gateway balance amounts, grouped by currency. |  [optional] |
|**pending** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts pending settlement, grouped by currency. |  [optional] |
|**retained** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts currently retained, grouped by currency. |  [optional] |
|**retentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Retention amount applied, grouped by currency. |  [optional] |
|**targetCollateralAmount** | **Object** | Target collateral amount, grouped by currency. |  [optional] |
|**targetRetentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Target retention amount, grouped by currency. |  [optional] |
|**temporarilyRetained** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts temporarily retained |  [optional] |



