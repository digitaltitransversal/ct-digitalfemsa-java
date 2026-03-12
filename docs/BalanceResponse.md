

# BalanceResponse

Company balance summary.  Monetary fields are returned as arrays of amounts grouped by currency (see `balance_common_field` items). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts currently available, grouped by currency. |  |
|**pending** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts pending settlement, grouped by currency. |  |
|**retentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Retention amount applied, grouped by currency. |  |
|**retained** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts currently retained, grouped by currency. |  |
|**temporarilyRetained** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Amounts temporarily retained, grouped by currency. |  |
|**targetRetentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Target retention amount, grouped by currency. |  |
|**targetTemporaryRetentionAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Target temporary retention amount, grouped by currency. |  |
|**targetCollateralAmount** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Target collateral amount, grouped by currency. |  |
|**gateway** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Gateway balance amounts, grouped by currency. |  |
|**cashoutRetentionDebited** | [**List&lt;BalanceCommonField&gt;**](BalanceCommonField.md) | Cashout retention debited amounts, grouped by currency. |  |



