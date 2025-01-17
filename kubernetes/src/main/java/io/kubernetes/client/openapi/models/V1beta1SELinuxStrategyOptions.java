/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1SELinuxOptions;
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
 * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T16:04:55.212037Z[Etc/UTC]")
public class V1beta1SELinuxStrategyOptions {
  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_SE_LINUX_OPTIONS = "seLinuxOptions";
  @SerializedName(SERIALIZED_NAME_SE_LINUX_OPTIONS)
  private V1SELinuxOptions seLinuxOptions;

  public V1beta1SELinuxStrategyOptions() {
  }

  public V1beta1SELinuxStrategyOptions rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate the allowable labels that may be set.
   * @return rule
  **/
  @jakarta.annotation.Nonnull
  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public V1beta1SELinuxStrategyOptions seLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

   /**
   * Get seLinuxOptions
   * @return seLinuxOptions
  **/
  @jakarta.annotation.Nullable
  public V1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }


  public void setSeLinuxOptions(V1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SELinuxStrategyOptions v1beta1SELinuxStrategyOptions = (V1beta1SELinuxStrategyOptions) o;
    return Objects.equals(this.rule, v1beta1SELinuxStrategyOptions.rule) &&
        Objects.equals(this.seLinuxOptions, v1beta1SELinuxStrategyOptions.seLinuxOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, seLinuxOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SELinuxStrategyOptions {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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
    openapiFields.add("rule");
    openapiFields.add("seLinuxOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rule");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1SELinuxStrategyOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1SELinuxStrategyOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1SELinuxStrategyOptions is not found in the empty JSON string", V1beta1SELinuxStrategyOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1SELinuxStrategyOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1SELinuxStrategyOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1SELinuxStrategyOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      // validate the optional field `seLinuxOptions`
      if (jsonObj.get("seLinuxOptions") != null && !jsonObj.get("seLinuxOptions").isJsonNull()) {
        V1SELinuxOptions.validateJsonObject(jsonObj.getAsJsonObject("seLinuxOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1SELinuxStrategyOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1SELinuxStrategyOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1SELinuxStrategyOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1SELinuxStrategyOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1SELinuxStrategyOptions>() {
           @Override
           public void write(JsonWriter out, V1beta1SELinuxStrategyOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1SELinuxStrategyOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1SELinuxStrategyOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1SELinuxStrategyOptions
  * @throws IOException if the JSON string is invalid with respect to V1beta1SELinuxStrategyOptions
  */
  public static V1beta1SELinuxStrategyOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1SELinuxStrategyOptions.class);
  }

 /**
  * Convert an instance of V1beta1SELinuxStrategyOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

