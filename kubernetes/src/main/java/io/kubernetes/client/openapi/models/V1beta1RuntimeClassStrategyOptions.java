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
 * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-29T20:37:51.396615Z[Etc/UTC]")
public class V1beta1RuntimeClassStrategyOptions {
  public static final String SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES = "allowedRuntimeClassNames";
  @SerializedName(SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES)
  private List<String> allowedRuntimeClassNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME = "defaultRuntimeClassName";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME)
  private String defaultRuntimeClassName;

  public V1beta1RuntimeClassStrategyOptions() {
  }

  public V1beta1RuntimeClassStrategyOptions allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {

    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    return this;
  }

  public V1beta1RuntimeClassStrategyOptions addAllowedRuntimeClassNamesItem(String allowedRuntimeClassNamesItem) {
    if (this.allowedRuntimeClassNames == null) {
      this.allowedRuntimeClassNames = new ArrayList<>();
    }
    this.allowedRuntimeClassNames.add(allowedRuntimeClassNamesItem);
    return this;
  }

   /**
   * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. A value of \&quot;*\&quot; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
   * @return allowedRuntimeClassNames
  **/
  @jakarta.annotation.Nonnull
  public List<String> getAllowedRuntimeClassNames() {
    return allowedRuntimeClassNames;
  }


  public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
  }


  public V1beta1RuntimeClassStrategyOptions defaultRuntimeClassName(String defaultRuntimeClassName) {

    this.defaultRuntimeClassName = defaultRuntimeClassName;
    return this;
  }

   /**
   * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
   * @return defaultRuntimeClassName
  **/
  @jakarta.annotation.Nullable
  public String getDefaultRuntimeClassName() {
    return defaultRuntimeClassName;
  }


  public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
    this.defaultRuntimeClassName = defaultRuntimeClassName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RuntimeClassStrategyOptions v1beta1RuntimeClassStrategyOptions = (V1beta1RuntimeClassStrategyOptions) o;
    return Objects.equals(this.allowedRuntimeClassNames, v1beta1RuntimeClassStrategyOptions.allowedRuntimeClassNames) &&
        Objects.equals(this.defaultRuntimeClassName, v1beta1RuntimeClassStrategyOptions.defaultRuntimeClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRuntimeClassNames, defaultRuntimeClassName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RuntimeClassStrategyOptions {\n");
    sb.append("    allowedRuntimeClassNames: ").append(toIndentedString(allowedRuntimeClassNames)).append("\n");
    sb.append("    defaultRuntimeClassName: ").append(toIndentedString(defaultRuntimeClassName)).append("\n");
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
    openapiFields.add("allowedRuntimeClassNames");
    openapiFields.add("defaultRuntimeClassName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allowedRuntimeClassNames");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1RuntimeClassStrategyOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1RuntimeClassStrategyOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1RuntimeClassStrategyOptions is not found in the empty JSON string", V1beta1RuntimeClassStrategyOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1RuntimeClassStrategyOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1RuntimeClassStrategyOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1RuntimeClassStrategyOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("allowedRuntimeClassNames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("allowedRuntimeClassNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedRuntimeClassNames` to be an array in the JSON string but got `%s`", jsonObj.get("allowedRuntimeClassNames").toString()));
      }
      if ((jsonObj.get("defaultRuntimeClassName") != null && !jsonObj.get("defaultRuntimeClassName").isJsonNull()) && !jsonObj.get("defaultRuntimeClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultRuntimeClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultRuntimeClassName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1RuntimeClassStrategyOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1RuntimeClassStrategyOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1RuntimeClassStrategyOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1RuntimeClassStrategyOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1RuntimeClassStrategyOptions>() {
           @Override
           public void write(JsonWriter out, V1beta1RuntimeClassStrategyOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1RuntimeClassStrategyOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1RuntimeClassStrategyOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1RuntimeClassStrategyOptions
  * @throws IOException if the JSON string is invalid with respect to V1beta1RuntimeClassStrategyOptions
  */
  public static V1beta1RuntimeClassStrategyOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1RuntimeClassStrategyOptions.class);
  }

 /**
  * Convert an instance of V1beta1RuntimeClassStrategyOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
