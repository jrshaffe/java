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
import io.kubernetes.client.openapi.models.V1alpha1Overhead;
import io.kubernetes.client.openapi.models.V1alpha1Scheduling;
import java.io.IOException;

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
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-29T20:37:51.396615Z[Etc/UTC]")
public class V1alpha1RuntimeClassSpec {
  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";
  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private V1alpha1Overhead overhead;

  public static final String SERIALIZED_NAME_RUNTIME_HANDLER = "runtimeHandler";
  @SerializedName(SERIALIZED_NAME_RUNTIME_HANDLER)
  private String runtimeHandler;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";
  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private V1alpha1Scheduling scheduling;

  public V1alpha1RuntimeClassSpec() {
  }

  public V1alpha1RuntimeClassSpec overhead(V1alpha1Overhead overhead) {

    this.overhead = overhead;
    return this;
  }

   /**
   * Get overhead
   * @return overhead
  **/
  @jakarta.annotation.Nullable
  public V1alpha1Overhead getOverhead() {
    return overhead;
  }


  public void setOverhead(V1alpha1Overhead overhead) {
    this.overhead = overhead;
  }


  public V1alpha1RuntimeClassSpec runtimeHandler(String runtimeHandler) {

    this.runtimeHandler = runtimeHandler;
    return this;
  }

   /**
   * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
   * @return runtimeHandler
  **/
  @jakarta.annotation.Nonnull
  public String getRuntimeHandler() {
    return runtimeHandler;
  }


  public void setRuntimeHandler(String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
  }


  public V1alpha1RuntimeClassSpec scheduling(V1alpha1Scheduling scheduling) {

    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @jakarta.annotation.Nullable
  public V1alpha1Scheduling getScheduling() {
    return scheduling;
  }


  public void setScheduling(V1alpha1Scheduling scheduling) {
    this.scheduling = scheduling;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RuntimeClassSpec v1alpha1RuntimeClassSpec = (V1alpha1RuntimeClassSpec) o;
    return Objects.equals(this.overhead, v1alpha1RuntimeClassSpec.overhead) &&
        Objects.equals(this.runtimeHandler, v1alpha1RuntimeClassSpec.runtimeHandler) &&
        Objects.equals(this.scheduling, v1alpha1RuntimeClassSpec.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overhead, runtimeHandler, scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RuntimeClassSpec {\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    runtimeHandler: ").append(toIndentedString(runtimeHandler)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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
    openapiFields.add("overhead");
    openapiFields.add("runtimeHandler");
    openapiFields.add("scheduling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("runtimeHandler");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1RuntimeClassSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1RuntimeClassSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1RuntimeClassSpec is not found in the empty JSON string", V1alpha1RuntimeClassSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1RuntimeClassSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1RuntimeClassSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1RuntimeClassSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `overhead`
      if (jsonObj.get("overhead") != null && !jsonObj.get("overhead").isJsonNull()) {
        V1alpha1Overhead.validateJsonObject(jsonObj.getAsJsonObject("overhead"));
      }
      if (!jsonObj.get("runtimeHandler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeHandler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtimeHandler").toString()));
      }
      // validate the optional field `scheduling`
      if (jsonObj.get("scheduling") != null && !jsonObj.get("scheduling").isJsonNull()) {
        V1alpha1Scheduling.validateJsonObject(jsonObj.getAsJsonObject("scheduling"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1RuntimeClassSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1RuntimeClassSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1RuntimeClassSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1RuntimeClassSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1RuntimeClassSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1RuntimeClassSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1RuntimeClassSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1RuntimeClassSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1RuntimeClassSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1RuntimeClassSpec
  */
  public static V1alpha1RuntimeClassSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1RuntimeClassSpec.class);
  }

 /**
  * Convert an instance of V1alpha1RuntimeClassSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
