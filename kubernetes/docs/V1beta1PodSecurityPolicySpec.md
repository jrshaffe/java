

# V1beta1PodSecurityPolicySpec

PodSecurityPolicySpec defines the policy enforced.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowPrivilegeEscalation** | **Boolean** | allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true. |  [optional] |
|**allowedCSIDrivers** | [**List&lt;V1beta1AllowedCSIDriver&gt;**](V1beta1AllowedCSIDriver.md) | AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is a beta field, and is only honored if the API server enables the CSIInlineVolume feature gate. |  [optional] |
|**allowedCapabilities** | **List&lt;String&gt;** | allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities. |  [optional] |
|**allowedFlexVolumes** | [**List&lt;V1beta1AllowedFlexVolume&gt;**](V1beta1AllowedFlexVolume.md) | allowedFlexVolumes is an allowlist of Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;volumes\&quot; field. |  [optional] |
|**allowedHostPaths** | [**List&lt;V1beta1AllowedHostPath&gt;**](V1beta1AllowedHostPath.md) | allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be used. |  [optional] |
|**allowedProcMountTypes** | **List&lt;String&gt;** | AllowedProcMountTypes is an allowlist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled. |  [optional] |
|**allowedUnsafeSysctls** | **List&lt;String&gt;** | allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to allowlist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc. |  [optional] |
|**defaultAddCapabilities** | **List&lt;String&gt;** | defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list. |  [optional] |
|**defaultAllowPrivilegeEscalation** | **Boolean** | defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process. |  [optional] |
|**forbiddenSysctls** | **List&lt;String&gt;** | forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc. |  [optional] |
|**fsGroup** | [**V1beta1FSGroupStrategyOptions**](V1beta1FSGroupStrategyOptions.md) |  |  |
|**hostIPC** | **Boolean** | hostIPC determines if the policy allows the use of HostIPC in the pod spec. |  [optional] |
|**hostNetwork** | **Boolean** | hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. |  [optional] |
|**hostPID** | **Boolean** | hostPID determines if the policy allows the use of HostPID in the pod spec. |  [optional] |
|**hostPorts** | [**List&lt;V1beta1HostPortRange&gt;**](V1beta1HostPortRange.md) | hostPorts determines which host port ranges are allowed to be exposed. |  [optional] |
|**privileged** | **Boolean** | privileged determines if a pod can request to be run as privileged. |  [optional] |
|**readOnlyRootFilesystem** | **Boolean** | readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. |  [optional] |
|**requiredDropCapabilities** | **List&lt;String&gt;** | requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. |  [optional] |
|**runAsGroup** | [**V1beta1RunAsGroupStrategyOptions**](V1beta1RunAsGroupStrategyOptions.md) |  |  [optional] |
|**runAsUser** | [**V1beta1RunAsUserStrategyOptions**](V1beta1RunAsUserStrategyOptions.md) |  |  |
|**runtimeClass** | [**V1beta1RuntimeClassStrategyOptions**](V1beta1RuntimeClassStrategyOptions.md) |  |  [optional] |
|**seLinux** | [**V1beta1SELinuxStrategyOptions**](V1beta1SELinuxStrategyOptions.md) |  |  |
|**supplementalGroups** | [**V1beta1SupplementalGroupsStrategyOptions**](V1beta1SupplementalGroupsStrategyOptions.md) |  |  |
|**volumes** | **List&lt;String&gt;** | volumes is an allowlist of volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use &#39;*&#39;. |  [optional] |



