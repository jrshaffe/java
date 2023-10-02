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
import io.kubernetes.client.openapi.models.V1beta1IDRange;
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
 * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-29T20:37:51.396615Z[Etc/UTC]")
public class V1beta1RunAsGroupStrategyOptions {
  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<V1beta1IDRange> ranges;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public V1beta1RunAsGroupStrategyOptions() {
  }

  public V1beta1RunAsGroupStrategyOptions ranges(List<V1beta1IDRange> ranges) {

    this.ranges = ranges;
    return this;
  }

  public V1beta1RunAsGroupStrategyOptions addRangesItem(V1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @jakarta.annotation.Nullable
  public List<V1beta1IDRange> getRanges() {
    return ranges;
  }


  public void setRanges(List<V1beta1IDRange> ranges) {
    this.ranges = ranges;
  }


  public V1beta1RunAsGroupStrategyOptions rule(String rule) {

    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
   * @return rule
  **/
  @jakarta.annotation.Nonnull
  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RunAsGroupStrategyOptions v1beta1RunAsGroupStrategyOptions = (V1beta1RunAsGroupStrategyOptions) o;
    return Objects.equals(this.ranges, v1beta1RunAsGroupStrategyOptions.ranges) &&
        Objects.equals(this.rule, v1beta1RunAsGroupStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RunAsGroupStrategyOptions {\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
    openapiFields.add("ranges");
    openapiFields.add("rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("rule");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1beta1RunAsGroupStrategyOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1beta1RunAsGroupStrategyOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1beta1RunAsGroupStrategyOptions is not found in the empty JSON string", V1beta1RunAsGroupStrategyOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1beta1RunAsGroupStrategyOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1beta1RunAsGroupStrategyOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1beta1RunAsGroupStrategyOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ranges") != null && !jsonObj.get("ranges").isJsonNull()) {
        JsonArray jsonArrayranges = jsonObj.getAsJsonArray("ranges");
        if (jsonArrayranges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ranges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ranges` to be an array in the JSON string but got `%s`", jsonObj.get("ranges").toString()));
          }

          // validate the optional field `ranges` (array)
          for (int i = 0; i < jsonArrayranges.size(); i++) {
            V1beta1IDRange.validateJsonObject(jsonArrayranges.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1beta1RunAsGroupStrategyOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1beta1RunAsGroupStrategyOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1beta1RunAsGroupStrategyOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1beta1RunAsGroupStrategyOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1beta1RunAsGroupStrategyOptions>() {
           @Override
           public void write(JsonWriter out, V1beta1RunAsGroupStrategyOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1beta1RunAsGroupStrategyOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1beta1RunAsGroupStrategyOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1beta1RunAsGroupStrategyOptions
  * @throws IOException if the JSON string is invalid with respect to V1beta1RunAsGroupStrategyOptions
  */
  public static V1beta1RunAsGroupStrategyOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1beta1RunAsGroupStrategyOptions.class);
  }

 /**
  * Convert an instance of V1beta1RunAsGroupStrategyOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
