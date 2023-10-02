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
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference;
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
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-29T20:37:51.396615Z[Etc/UTC]")
public class V2beta1ObjectMetricSource {
  public static final String SERIALIZED_NAME_AVERAGE_VALUE = "averageValue";
  @SerializedName(SERIALIZED_NAME_AVERAGE_VALUE)
  private Quantity averageValue;

  public static final String SERIALIZED_NAME_METRIC_NAME = "metricName";
  @SerializedName(SERIALIZED_NAME_METRIC_NAME)
  private String metricName;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private V2beta1CrossVersionObjectReference target;

  public static final String SERIALIZED_NAME_TARGET_VALUE = "targetValue";
  @SerializedName(SERIALIZED_NAME_TARGET_VALUE)
  private Quantity targetValue;

  public V2beta1ObjectMetricSource() {
  }

  public V2beta1ObjectMetricSource averageValue(Quantity averageValue) {

    this.averageValue = averageValue;
    return this;
  }

   /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost  b. No fractional digits will be emitted  c. The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \&quot;1500m\&quot;  1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return averageValue
  **/
  @jakarta.annotation.Nullable
  public Quantity getAverageValue() {
    return averageValue;
  }


  public void setAverageValue(Quantity averageValue) {
    this.averageValue = averageValue;
  }


  public V2beta1ObjectMetricSource metricName(String metricName) {

    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question.
   * @return metricName
  **/
  @jakarta.annotation.Nonnull
  public String getMetricName() {
    return metricName;
  }


  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }


  public V2beta1ObjectMetricSource selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @jakarta.annotation.Nullable
  public V1LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  public V2beta1ObjectMetricSource target(V2beta1CrossVersionObjectReference target) {

    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @jakarta.annotation.Nonnull
  public V2beta1CrossVersionObjectReference getTarget() {
    return target;
  }


  public void setTarget(V2beta1CrossVersionObjectReference target) {
    this.target = target;
  }


  public V2beta1ObjectMetricSource targetValue(Quantity targetValue) {

    this.targetValue = targetValue;
    return this;
  }

   /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)  &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)  &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.)  &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost  b. No fractional digits will be emitted  c. The exponent (or suffix) is as large as possible.  The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \&quot;1500m\&quot;  1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return targetValue
  **/
  @jakarta.annotation.Nonnull
  public Quantity getTargetValue() {
    return targetValue;
  }


  public void setTargetValue(Quantity targetValue) {
    this.targetValue = targetValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ObjectMetricSource v2beta1ObjectMetricSource = (V2beta1ObjectMetricSource) o;
    return Objects.equals(this.averageValue, v2beta1ObjectMetricSource.averageValue) &&
        Objects.equals(this.metricName, v2beta1ObjectMetricSource.metricName) &&
        Objects.equals(this.selector, v2beta1ObjectMetricSource.selector) &&
        Objects.equals(this.target, v2beta1ObjectMetricSource.target) &&
        Objects.equals(this.targetValue, v2beta1ObjectMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageValue, metricName, selector, target, targetValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ObjectMetricSource {\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
    openapiFields.add("averageValue");
    openapiFields.add("metricName");
    openapiFields.add("selector");
    openapiFields.add("target");
    openapiFields.add("targetValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metricName");
    openapiRequiredFields.add("target");
    openapiRequiredFields.add("targetValue");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V2beta1ObjectMetricSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V2beta1ObjectMetricSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V2beta1ObjectMetricSource is not found in the empty JSON string", V2beta1ObjectMetricSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V2beta1ObjectMetricSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V2beta1ObjectMetricSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V2beta1ObjectMetricSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("averageValue") != null && !jsonObj.get("averageValue").isJsonNull()) && !jsonObj.get("averageValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `averageValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("averageValue").toString()));
      }
      if (!jsonObj.get("metricName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metricName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metricName").toString()));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        V1LabelSelector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
      // validate the required field `target`
      V2beta1CrossVersionObjectReference.validateJsonObject(jsonObj.getAsJsonObject("target"));
      if (!jsonObj.get("targetValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V2beta1ObjectMetricSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V2beta1ObjectMetricSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V2beta1ObjectMetricSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V2beta1ObjectMetricSource.class));

       return (TypeAdapter<T>) new TypeAdapter<V2beta1ObjectMetricSource>() {
           @Override
           public void write(JsonWriter out, V2beta1ObjectMetricSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V2beta1ObjectMetricSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V2beta1ObjectMetricSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V2beta1ObjectMetricSource
  * @throws IOException if the JSON string is invalid with respect to V2beta1ObjectMetricSource
  */
  public static V2beta1ObjectMetricSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V2beta1ObjectMetricSource.class);
  }

 /**
  * Convert an instance of V2beta1ObjectMetricSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
