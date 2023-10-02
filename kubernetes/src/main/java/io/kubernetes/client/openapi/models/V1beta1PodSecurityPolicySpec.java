/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver;
import io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume;
import io.kubernetes.client.openapi.models.V1beta1AllowedHostPath;
import io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions;
import io.kubernetes.client.openapi.models.V1beta1HostPortRange;
import io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions;
import io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions;
import io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions;
import io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions;
import io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PodSecurityPolicySpec defines the policy enforced.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-29T20:37:51.396615Z[Etc/UTC]")
public class V1beta1PodSecurityPolicySpec {
  public static final String SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION = "allowPrivilegeEscalation";
  @SerializedName(SERIALIZED_NAME_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean allowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_ALLOWED_C_S_I_DRIVERS = "allowedCSIDrivers";
  @SerializedName(SERIALIZED_NAME_ALLOWED_C_S_I_DRIVERS)
  private List<V1beta1AllowedCSIDriver> allowedCSIDrivers;

  public static final String SERIALIZED_NAME_ALLOWED_CAPABILITIES = "allowedCapabilities";
  @SerializedName(SERIALIZED_NAME_ALLOWED_CAPABILITIES)
  private List<String> allowedCapabilities;

  public static final String SERIALIZED_NAME_ALLOWED_FLEX_VOLUMES = "allowedFlexVolumes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_FLEX_VOLUMES)
  private List<V1beta1AllowedFlexVolume> allowedFlexVolumes;

  public static final String SERIALIZED_NAME_ALLOWED_HOST_PATHS = "allowedHostPaths";
  @SerializedName(SERIALIZED_NAME_ALLOWED_HOST_PATHS)
  private List<V1beta1AllowedHostPath> allowedHostPaths;

  public static final String SERIALIZED_NAME_ALLOWED_PROC_MOUNT_TYPES = "allowedProcMountTypes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PROC_MOUNT_TYPES)
  private List<String> allowedProcMountTypes;

  public static final String SERIALIZED_NAME_ALLOWED_UNSAFE_SYSCTLS = "allowedUnsafeSysctls";
  @SerializedName(SERIALIZED_NAME_ALLOWED_UNSAFE_SYSCTLS)
  private List<String> allowedUnsafeSysctls;

  public static final String SERIALIZED_NAME_DEFAULT_ADD_CAPABILITIES = "defaultAddCapabilities";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ADD_CAPABILITIES)
  private List<String> defaultAddCapabilities;

  public static final String SERIALIZED_NAME_DEFAULT_ALLOW_PRIVILEGE_ESCALATION = "defaultAllowPrivilegeEscalation";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ALLOW_PRIVILEGE_ESCALATION)
  private Boolean defaultAllowPrivilegeEscalation;

  public static final String SERIALIZED_NAME_FORBIDDEN_SYSCTLS = "forbiddenSysctls";
  @SerializedName(SERIALIZED_NAME_FORBIDDEN_SYSCTLS)
  private List<String> forbiddenSysctls;

  public static final String SERIALIZED_NAME_FS_GROUP = "fsGroup";
  @SerializedName(SERIALIZED_NAME_FS_GROUP)
  private V1beta1FSGroupStrategyOptions fsGroup;

  public static final String SERIALIZED_NAME_HOST_I_P_C = "hostIPC";
  @SerializedName(SERIALIZED_NAME_HOST_I_P_C)
  private Boolean hostIPC;

  public static final String SERIALIZED_NAME_HOST_NETWORK = "hostNetwork";
  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_HOST_P_I_D = "hostPID";
  @SerializedName(SERIALIZED_NAME_HOST_P_I_D)
  private Boolean hostPID;

  public static final String SERIALIZED_NAME_HOST_PORTS = "hostPorts";
  @SerializedName(SERIALIZED_NAME_HOST_PORTS)
  private List<V1beta1HostPortRange> hostPorts;

  public static final String SERIALIZED_NAME_PRIVILEGED = "privileged";
  @SerializedName(SERIALIZED_NAME_PRIVILEGED)
  private Boolean privileged;

  public static final String SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM = "readOnlyRootFilesystem";
  @SerializedName(SERIALIZED_NAME_READ_ONLY_ROOT_FILESYSTEM)
  private Boolean readOnlyRootFilesystem;

  public static final String SERIALIZED_NAME_REQUIRED_DROP_CAPABILITIES = "requiredDropCapabilities";
  @SerializedName(SERIALIZED_NAME_REQUIRED_DROP_CAPABILITIES)
  private List<String> requiredDropCapabilities;

  public static final String SERIALIZED_NAME_RUN_AS_GROUP = "runAsGroup";
  @SerializedName(SERIALIZED_NAME_RUN_AS_GROUP)
  private V1beta1RunAsGroupStrategyOptions runAsGroup;

  public static final String SERIALIZED_NAME_RUN_AS_USER = "runAsUser";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER)
  private V1beta1RunAsUserStrategyOptions runAsUser;

  public static final String SERIALIZED_NAME_RUNTIME_CLASS = "runtimeClass";
  @SerializedName(SERIALIZED_NAME_RUNTIME_CLASS)
  private V1beta1RuntimeClassStrategyOptions runtimeClass;

  public static final String SERIALIZED_NAME_SE_LINUX = "seLinux";
  @SerializedName(SERIALIZED_NAME_SE_LINUX)
  private V1beta1SELinuxStrategyOptions seLinux;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_GROUPS = "supplementalGroups";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_GROUPS)
  private V1beta1SupplementalGroupsStrategyOptions supplementalGroups;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<String> volumes;

  public V1beta1PodSecurityPolicySpec() {
  }

  public V1beta1PodSecurityPolicySpec allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {

    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

   /**
   * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
   * @return allowPrivilegeEscalation
  **/
  @jakarta.annotation.Nullable
  public Boolean getAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }


  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }


  public V1beta1PodSecurityPolicySpec allowedCSIDrivers(List<V1beta1AllowedCSIDriver> allowedCSIDrivers) {

    this.allowedCSIDrivers = allowedCSIDrivers;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedCSIDriversItem(V1beta1AllowedCSIDriver allowedCSIDriversItem) {
    if (this.allowedCSIDrivers == null) {
      this.allowedCSIDrivers = new ArrayList<>();
    }
    this.allowedCSIDrivers.add(allowedCSIDriversItem);
    return this;
  }

   /**
   * AllowedCSIDrivers is an allowlist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is a beta field, and is only honored if the API server enables the CSIInlineVolume feature gate.
   * @return allowedCSIDrivers
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1AllowedCSIDriver> getAllowedCSIDrivers() {
    return allowedCSIDrivers;
  }


  public void setAllowedCSIDrivers(List<V1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
  }


  public V1beta1PodSecurityPolicySpec allowedCapabilities(List<String> allowedCapabilities) {

    this.allowedCapabilities = allowedCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedCapabilitiesItem(String allowedCapabilitiesItem) {
    if (this.allowedCapabilities == null) {
      this.allowedCapabilities = new ArrayList<>();
    }
    this.allowedCapabilities.add(allowedCapabilitiesItem);
    return this;
  }

   /**
   * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
   * @return allowedCapabilities
  **/
  @jakarta.annotation.Nullable
  public List<String> getAllowedCapabilities() {
    return allowedCapabilities;
  }


  public void setAllowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
  }


  public V1beta1PodSecurityPolicySpec allowedFlexVolumes(List<V1beta1AllowedFlexVolume> allowedFlexVolumes) {

    this.allowedFlexVolumes = allowedFlexVolumes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedFlexVolumesItem(V1beta1AllowedFlexVolume allowedFlexVolumesItem) {
    if (this.allowedFlexVolumes == null) {
      this.allowedFlexVolumes = new ArrayList<>();
    }
    this.allowedFlexVolumes.add(allowedFlexVolumesItem);
    return this;
  }

   /**
   * allowedFlexVolumes is an allowlist of Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;volumes\&quot; field.
   * @return allowedFlexVolumes
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1AllowedFlexVolume> getAllowedFlexVolumes() {
    return allowedFlexVolumes;
  }


  public void setAllowedFlexVolumes(List<V1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
  }


  public V1beta1PodSecurityPolicySpec allowedHostPaths(List<V1beta1AllowedHostPath> allowedHostPaths) {

    this.allowedHostPaths = allowedHostPaths;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedHostPathsItem(V1beta1AllowedHostPath allowedHostPathsItem) {
    if (this.allowedHostPaths == null) {
      this.allowedHostPaths = new ArrayList<>();
    }
    this.allowedHostPaths.add(allowedHostPathsItem);
    return this;
  }

   /**
   * allowedHostPaths is an allowlist of host paths. Empty indicates that all host paths may be used.
   * @return allowedHostPaths
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1AllowedHostPath> getAllowedHostPaths() {
    return allowedHostPaths;
  }


  public void setAllowedHostPaths(List<V1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
  }


  public V1beta1PodSecurityPolicySpec allowedProcMountTypes(List<String> allowedProcMountTypes) {

    this.allowedProcMountTypes = allowedProcMountTypes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedProcMountTypesItem(String allowedProcMountTypesItem) {
    if (this.allowedProcMountTypes == null) {
      this.allowedProcMountTypes = new ArrayList<>();
    }
    this.allowedProcMountTypes.add(allowedProcMountTypesItem);
    return this;
  }

   /**
   * AllowedProcMountTypes is an allowlist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
   * @return allowedProcMountTypes
  **/
  @jakarta.annotation.Nullable
  public List<String> getAllowedProcMountTypes() {
    return allowedProcMountTypes;
  }


  public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
  }


  public V1beta1PodSecurityPolicySpec allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {

    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addAllowedUnsafeSysctlsItem(String allowedUnsafeSysctlsItem) {
    if (this.allowedUnsafeSysctls == null) {
      this.allowedUnsafeSysctls = new ArrayList<>();
    }
    this.allowedUnsafeSysctls.add(allowedUnsafeSysctlsItem);
    return this;
  }

   /**
   * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to allowlist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return allowedUnsafeSysctls
  **/
  @jakarta.annotation.Nullable
  public List<String> getAllowedUnsafeSysctls() {
    return allowedUnsafeSysctls;
  }


  public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
  }


  public V1beta1PodSecurityPolicySpec defaultAddCapabilities(List<String> defaultAddCapabilities) {

    this.defaultAddCapabilities = defaultAddCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addDefaultAddCapabilitiesItem(String defaultAddCapabilitiesItem) {
    if (this.defaultAddCapabilities == null) {
      this.defaultAddCapabilities = new ArrayList<>();
    }
    this.defaultAddCapabilities.add(defaultAddCapabilitiesItem);
    return this;
  }

   /**
   * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
   * @return defaultAddCapabilities
  **/
  @jakarta.annotation.Nullable
  public List<String> getDefaultAddCapabilities() {
    return defaultAddCapabilities;
  }


  public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
  }


  public V1beta1PodSecurityPolicySpec defaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {

    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return this;
  }

   /**
   * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
   * @return defaultAllowPrivilegeEscalation
  **/
  @jakarta.annotation.Nullable
  public Boolean getDefaultAllowPrivilegeEscalation() {
    return defaultAllowPrivilegeEscalation;
  }


  public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
  }


  public V1beta1PodSecurityPolicySpec forbiddenSysctls(List<String> forbiddenSysctls) {

    this.forbiddenSysctls = forbiddenSysctls;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addForbiddenSysctlsItem(String forbiddenSysctlsItem) {
    if (this.forbiddenSysctls == null) {
      this.forbiddenSysctls = new ArrayList<>();
    }
    this.forbiddenSysctls.add(forbiddenSysctlsItem);
    return this;
  }

   /**
   * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return forbiddenSysctls
  **/
  @jakarta.annotation.Nullable
  public List<String> getForbiddenSysctls() {
    return forbiddenSysctls;
  }


  public void setForbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
  }


  public V1beta1PodSecurityPolicySpec fsGroup(V1beta1FSGroupStrategyOptions fsGroup) {

    this.fsGroup = fsGroup;
    return this;
  }

   /**
   * Get fsGroup
   * @return fsGroup
  **/
  @jakarta.annotation.Nonnull
  public V1beta1FSGroupStrategyOptions getFsGroup() {
    return fsGroup;
  }


  public void setFsGroup(V1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
  }


  public V1beta1PodSecurityPolicySpec hostIPC(Boolean hostIPC) {

    this.hostIPC = hostIPC;
    return this;
  }

   /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
   * @return hostIPC
  **/
  @jakarta.annotation.Nullable
  public Boolean getHostIPC() {
    return hostIPC;
  }


  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }


  public V1beta1PodSecurityPolicySpec hostNetwork(Boolean hostNetwork) {

    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
   * @return hostNetwork
  **/
  @jakarta.annotation.Nullable
  public Boolean getHostNetwork() {
    return hostNetwork;
  }


  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }


  public V1beta1PodSecurityPolicySpec hostPID(Boolean hostPID) {

    this.hostPID = hostPID;
    return this;
  }

   /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
   * @return hostPID
  **/
  @jakarta.annotation.Nullable
  public Boolean getHostPID() {
    return hostPID;
  }


  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }


  public V1beta1PodSecurityPolicySpec hostPorts(List<V1beta1HostPortRange> hostPorts) {

    this.hostPorts = hostPorts;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addHostPortsItem(V1beta1HostPortRange hostPortsItem) {
    if (this.hostPorts == null) {
      this.hostPorts = new ArrayList<>();
    }
    this.hostPorts.add(hostPortsItem);
    return this;
  }

   /**
   * hostPorts determines which host port ranges are allowed to be exposed.
   * @return hostPorts
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1HostPortRange> getHostPorts() {
    return hostPorts;
  }


  public void setHostPorts(List<V1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
  }


  public V1beta1PodSecurityPolicySpec privileged(Boolean privileged) {

    this.privileged = privileged;
    return this;
  }

   /**
   * privileged determines if a pod can request to be run as privileged.
   * @return privileged
  **/
  @jakarta.annotation.Nullable
  public Boolean getPrivileged() {
    return privileged;
  }


  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }


  public V1beta1PodSecurityPolicySpec readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {

    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

   /**
   * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
   * @return readOnlyRootFilesystem
  **/
  @jakarta.annotation.Nullable
  public Boolean getReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }


  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }


  public V1beta1PodSecurityPolicySpec requiredDropCapabilities(List<String> requiredDropCapabilities) {

    this.requiredDropCapabilities = requiredDropCapabilities;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addRequiredDropCapabilitiesItem(String requiredDropCapabilitiesItem) {
    if (this.requiredDropCapabilities == null) {
      this.requiredDropCapabilities = new ArrayList<>();
    }
    this.requiredDropCapabilities.add(requiredDropCapabilitiesItem);
    return this;
  }

   /**
   * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
   * @return requiredDropCapabilities
  **/
  @jakarta.annotation.Nullable
  public List<String> getRequiredDropCapabilities() {
    return requiredDropCapabilities;
  }


  public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
  }


  public V1beta1PodSecurityPolicySpec runAsGroup(V1beta1RunAsGroupStrategyOptions runAsGroup) {

    this.runAsGroup = runAsGroup;
    return this;
  }

   /**
   * Get runAsGroup
   * @return runAsGroup
  **/
  @jakarta.annotation.Nullable
  public V1beta1RunAsGroupStrategyOptions getRunAsGroup() {
    return runAsGroup;
  }


  public void setRunAsGroup(V1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
  }


  public V1beta1PodSecurityPolicySpec runAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {

    this.runAsUser = runAsUser;
    return this;
  }

   /**
   * Get runAsUser
   * @return runAsUser
  **/
  @jakarta.annotation.Nonnull
  public V1beta1RunAsUserStrategyOptions getRunAsUser() {
    return runAsUser;
  }


  public void setRunAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
  }


  public V1beta1PodSecurityPolicySpec runtimeClass(V1beta1RuntimeClassStrategyOptions runtimeClass) {

    this.runtimeClass = runtimeClass;
    return this;
  }

   /**
   * Get runtimeClass
   * @return runtimeClass
  **/
  @jakarta.annotation.Nullable
  public V1beta1RuntimeClassStrategyOptions getRuntimeClass() {
    return runtimeClass;
  }


  public void setRuntimeClass(V1beta1RuntimeClassStrategyOptions runtimeClass) {
    this.runtimeClass = runtimeClass;
  }


  public V1beta1PodSecurityPolicySpec seLinux(V1beta1SELinuxStrategyOptions seLinux) {

    this.seLinux = seLinux;
    return this;
  }

   /**
   * Get seLinux
   * @return seLinux
  **/
  @jakarta.annotation.Nonnull
  public V1beta1SELinuxStrategyOptions getSeLinux() {
    return seLinux;
  }


  public void setSeLinux(V1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
  }


  public V1beta1PodSecurityPolicySpec supplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {

    this.supplementalGroups = supplementalGroups;
    return this;
  }

   /**
   * Get supplementalGroups
   * @return supplementalGroups
  **/
  @jakarta.annotation.Nonnull
  public V1beta1SupplementalGroupsStrategyOptions getSupplementalGroups() {
    return supplementalGroups;
  }


  public void setSupplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  public V1beta1PodSecurityPolicySpec volumes(List<String> volumes) {

    this.volumes = volumes;
    return this;
  }

  public V1beta1PodSecurityPolicySpec addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * volumes is an allowlist of volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use &#39;*&#39;.
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  public List<String> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PodSecurityPolicySpec v1beta1PodSecurityPolicySpec = (V1beta1PodSecurityPolicySpec) o;
    return Objects.equals(this.allowPrivilegeEscalation, v1beta1PodSecurityPolicySpec.allowPrivilegeEscalation) &&
        Objects.equals(this.allowedCSIDrivers, v1beta1PodSecurityPolicySpec.allowedCSIDrivers) &&
        Objects.equals(this.allowedCapabilities, v1beta1PodSecurityPolicySpec.allowedCapabilities) &&
        Objects.equals(this.allowedFlexVolumes, v1beta1PodSecurityPolicySpec.allowedFlexVolumes) &&
        Objects.equals(this.allowedHostPaths, v1beta1PodSecurityPolicySpec.allowedHostPaths) &&
        Objects.equals(this.allowedProcMountTypes, v1beta1PodSecurityPolicySpec.allowedProcMountTypes) &&
        Objects.equals(this.allowedUnsafeSysctls, v1beta1PodSecurityPolicySpec.allowedUnsafeSysctls) &&
        Objects.equals(this.defaultAddCapabilities, v1beta1PodSecurityPolicySpec.defaultAddCapabilities) &&
        Objects.equals(this.defaultAllowPrivilegeEscalation, v1beta1PodSecurityPolicySpec.defaultAllowPrivilegeEscalation) &&
        Objects.equals(this.forbiddenSysctls, v1beta1PodSecurityPolicySpec.forbiddenSysctls) &&
        Objects.equals(this.fsGroup, v1beta1PodSecurityPolicySpec.fsGroup) &&
        Objects.equals(this.hostIPC, v1beta1PodSecurityPolicySpec.hostIPC) &&
        Objects.equals(this.hostNetwork, v1beta1PodSecurityPolicySpec.hostNetwork) &&
        Objects.equals(this.hostPID, v1beta1PodSecurityPolicySpec.hostPID) &&
        Objects.equals(this.hostPorts, v1beta1PodSecurityPolicySpec.hostPorts) &&
        Objects.equals(this.privileged, v1beta1PodSecurityPolicySpec.privileged) &&
        Objects.equals(this.readOnlyRootFilesystem, v1beta1PodSecurityPolicySpec.readOnlyRootFilesystem) &&
        Objects.equals(this.requiredDropCapabilities, v1beta1PodSecurityPolicySpec.requiredDropCapabilities) &&
        Objects.equals(this.runAsGroup, v1beta1PodSecurityPolicySpec.runAsGroup) &&
        Objects.equals(this.runAsUser, v1beta1PodSecurityPolicySpec.runAsUser) &&
        Objects.equals(this.runtimeClass, v1beta1PodSecurityPolicySpec.runtimeClass) &&
        Objects.equals(this.seLinux, v1beta1PodSecurityPolicySpec.seLinux) &&
        Objects.equals(this.supplementalGroups, v1beta1PodSecurityPolicySpec.supplementalGroups) &&
        Objects.equals(this.volumes, v1beta1PodSecurityPolicySpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrivilegeEscalation, allowedCSIDrivers, allowedCapabilities, allowedFlexVolumes, allowedHostPaths, allowedProcMountTypes, allowedUnsafeSysctls, defaultAddCapabilities, defaultAllowPrivilegeEscalation, forbiddenSysctls, fsGroup, hostIPC, hostNetwork, hostPID, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsGroup, runAsUser, runtimeClass, seLinux, supplementalGroups, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodSecurityPolicySpec {\n");
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    allowedCSIDrivers: ").append(toIndentedString(allowedCSIDrivers)).append("\n");
    sb.append("    allowedCapabilities: ").append(toIndentedString(allowedCapabilities)).append("\n");
    sb.append("    allowedFlexVolumes: ").append(toIndentedString(allowedFlexVolumes)).append("\n");
    sb.append("    allowedHostPaths: ").append(toIndentedString(allowedHostPaths)).append("\n");
    sb.append("    allowedProcMountTypes: ").append(toIndentedString(allowedProcMountTypes)).append("\n");
    sb.append("    allowedUnsafeSysctls: ").append(toIndentedString(allowedUnsafeSysctls)).append("\n");
    sb.append("    defaultAddCapabilities: ").append(toIndentedString(defaultAddCapabilities)).append("\n");
    sb.append("    defaultAllowPrivilegeEscalation: ").append(toIndentedString(defaultAllowPrivilegeEscalation)).append("\n");
    sb.append("    forbiddenSysctls: ").append(toIndentedString(forbiddenSysctls)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostPorts: ").append(toIndentedString(hostPorts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    requiredDropCapabilities: ").append(toIndentedString(requiredDropCapabilities)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    runtimeClass: ").append(toIndentedString(runtimeClass)).append("\n");
    sb.append("    seLinux: ").append(toIndentedString(seLinux)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allowPrivilegeEscalation");
    openapiFields.add("allowedCSIDrivers");
    openapiFields.add("allowedCapabilities");
    openapiFields.add("allowedFlexVolumes");
    openapiFields.add("allowedHostPaths");
    openapiFields.add("allowedProcMountTypes");
    openapiFields.add("allowedUnsafeSysctls");
    openapiFields.add("defaultAddCapabilities");
    openapiFields.add("defaultAllowPrivilegeEscalation");
    openapiFields.add("forbiddenSysctls");
    openapiFields.add("fsGroup");
    openapiFields.add("hostIPC");
    openapiFields.add("hostNetwork");
    openapiFields.add("hostPID");
    openapiFields.add("hostPorts");
    openapiFields.add("privileged");
    openapiFields.add("readOnlyRootFilesystem");
    openapiFields.add("requiredDropCapabilities");
    openapiFields.add("runAsGroup");
    openapiFields.add("runAsUser");
    openapiFields.add("runtimeClass");
    openapiFields.add("seLinux");
    openapiFields.add("supplementalGroups");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fsGroup");
    openapiRequiredFields.add("runAsUser");
    openapiRequiredFields.add("seLinux");
    openapiRequiredFields.add("supplementalGroups");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1PodSecurityPolicySpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1PodSecurityPolicySpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1PodSecurityPolicySpec is not found in the empty JSON string", V1beta1PodSecurityPolicySpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1PodSecurityPolicySpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1PodSecurityPolicySpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1PodSecurityPolicySpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("allowedCSIDrivers") != null && !jsonObj.get("allowedCSIDrivers").isJsonNull()) {
        JsonArray jsonArrayallowedCSIDrivers = jsonObj.getAsJsonArray("allowedCSIDrivers");
        if (jsonArrayallowedCSIDrivers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allowedCSIDrivers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowedCSIDrivers` to be an array in the JSON string but got `%s`", jsonObj.get("allowedCSIDrivers").toString()));
          }

          // validate the optional field `allowedCSIDrivers` (array)
          for (int i = 0; i < jsonArrayallowedCSIDrivers.size(); i++) {
            V1beta1AllowedCSIDriver.validateJsonObject(jsonArrayallowedCSIDrivers.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedCapabilities") != null && !jsonObj.get("allowedCapabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedCapabilities` to be an array in the JSON string but got `%s`", jsonObj.get("allowedCapabilities").toString()));
      }
      if (jsonObj.get("allowedFlexVolumes") != null && !jsonObj.get("allowedFlexVolumes").isJsonNull()) {
        JsonArray jsonArrayallowedFlexVolumes = jsonObj.getAsJsonArray("allowedFlexVolumes");
        if (jsonArrayallowedFlexVolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allowedFlexVolumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowedFlexVolumes` to be an array in the JSON string but got `%s`", jsonObj.get("allowedFlexVolumes").toString()));
          }

          // validate the optional field `allowedFlexVolumes` (array)
          for (int i = 0; i < jsonArrayallowedFlexVolumes.size(); i++) {
            V1beta1AllowedFlexVolume.validateJsonObject(jsonArrayallowedFlexVolumes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("allowedHostPaths") != null && !jsonObj.get("allowedHostPaths").isJsonNull()) {
        JsonArray jsonArrayallowedHostPaths = jsonObj.getAsJsonArray("allowedHostPaths");
        if (jsonArrayallowedHostPaths != null) {
          // ensure the json data is an array
          if (!jsonObj.get("allowedHostPaths").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `allowedHostPaths` to be an array in the JSON string but got `%s`", jsonObj.get("allowedHostPaths").toString()));
          }

          // validate the optional field `allowedHostPaths` (array)
          for (int i = 0; i < jsonArrayallowedHostPaths.size(); i++) {
            V1beta1AllowedHostPath.validateJsonObject(jsonArrayallowedHostPaths.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedProcMountTypes") != null && !jsonObj.get("allowedProcMountTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedProcMountTypes` to be an array in the JSON string but got `%s`", jsonObj.get("allowedProcMountTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedUnsafeSysctls") != null && !jsonObj.get("allowedUnsafeSysctls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedUnsafeSysctls` to be an array in the JSON string but got `%s`", jsonObj.get("allowedUnsafeSysctls").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("defaultAddCapabilities") != null && !jsonObj.get("defaultAddCapabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultAddCapabilities` to be an array in the JSON string but got `%s`", jsonObj.get("defaultAddCapabilities").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("forbiddenSysctls") != null && !jsonObj.get("forbiddenSysctls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `forbiddenSysctls` to be an array in the JSON string but got `%s`", jsonObj.get("forbiddenSysctls").toString()));
      }
      // validate the required field `fsGroup`
      V1beta1FSGroupStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("fsGroup"));
      if (jsonObj.get("hostPorts") != null && !jsonObj.get("hostPorts").isJsonNull()) {
        JsonArray jsonArrayhostPorts = jsonObj.getAsJsonArray("hostPorts");
        if (jsonArrayhostPorts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hostPorts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hostPorts` to be an array in the JSON string but got `%s`", jsonObj.get("hostPorts").toString()));
          }

          // validate the optional field `hostPorts` (array)
          for (int i = 0; i < jsonArrayhostPorts.size(); i++) {
            V1beta1HostPortRange.validateJsonObject(jsonArrayhostPorts.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requiredDropCapabilities") != null && !jsonObj.get("requiredDropCapabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requiredDropCapabilities` to be an array in the JSON string but got `%s`", jsonObj.get("requiredDropCapabilities").toString()));
      }
      // validate the optional field `runAsGroup`
      if (jsonObj.get("runAsGroup") != null && !jsonObj.get("runAsGroup").isJsonNull()) {
        V1beta1RunAsGroupStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("runAsGroup"));
      }
      // validate the required field `runAsUser`
      V1beta1RunAsUserStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("runAsUser"));
      // validate the optional field `runtimeClass`
      if (jsonObj.get("runtimeClass") != null && !jsonObj.get("runtimeClass").isJsonNull()) {
        V1beta1RuntimeClassStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("runtimeClass"));
      }
      // validate the required field `seLinux`
      V1beta1SELinuxStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("seLinux"));
      // validate the required field `supplementalGroups`
      V1beta1SupplementalGroupsStrategyOptions.validateJsonObject(jsonObj.getAsJsonObject("supplementalGroups"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1PodSecurityPolicySpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1PodSecurityPolicySpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1PodSecurityPolicySpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1PodSecurityPolicySpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1PodSecurityPolicySpec>() {
           @Override
           public void write(JsonWriter out, V1beta1PodSecurityPolicySpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1PodSecurityPolicySpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1PodSecurityPolicySpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1PodSecurityPolicySpec
  * @throws IOException if the JSON string is invalid with respect to V1beta1PodSecurityPolicySpec
  */
  public static V1beta1PodSecurityPolicySpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1PodSecurityPolicySpec.class);
  }

 /**
  * Convert an instance of V1beta1PodSecurityPolicySpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
