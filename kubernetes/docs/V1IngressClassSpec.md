

# V1IngressClassSpec

IngressClassSpec provides information about the class of an Ingress.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controller** | **String** | Controller refers to the name of the controller that should handle this class. This allows for different \&quot;flavors\&quot; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. \&quot;acme.io/ingress-controller\&quot;. This field is immutable. |  [optional] |
|**parameters** | [**V1IngressClassParametersReference**](V1IngressClassParametersReference.md) |  |  [optional] |



