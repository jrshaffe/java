

# V1beta1SupplementalGroupsStrategyOptions

SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ranges** | [**List&lt;V1beta1IDRange&gt;**](V1beta1IDRange.md) | ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs. |  [optional] |
|**rule** | **String** | rule is the strategy that will dictate what supplemental groups is used in the SecurityContext. |  [optional] |



