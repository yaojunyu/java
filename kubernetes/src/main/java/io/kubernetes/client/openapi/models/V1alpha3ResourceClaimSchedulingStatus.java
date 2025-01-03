/*
Copyright 2024 The Kubernetes Authors.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceClaimSchedulingStatus contains information about one particular ResourceClaim with \&quot;WaitForFirstConsumer\&quot; allocation mode.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-04T19:37:38.574271Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha3ResourceClaimSchedulingStatus {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNSUITABLE_NODES = "unsuitableNodes";
  @SerializedName(SERIALIZED_NAME_UNSUITABLE_NODES)
  private List<String> unsuitableNodes = new ArrayList<>();

  public V1alpha3ResourceClaimSchedulingStatus() {
  }

  public V1alpha3ResourceClaimSchedulingStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name matches the pod.spec.resourceClaims[*].Name field.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public V1alpha3ResourceClaimSchedulingStatus unsuitableNodes(List<String> unsuitableNodes) {
    this.unsuitableNodes = unsuitableNodes;
    return this;
  }

  public V1alpha3ResourceClaimSchedulingStatus addUnsuitableNodesItem(String unsuitableNodesItem) {
    if (this.unsuitableNodes == null) {
      this.unsuitableNodes = new ArrayList<>();
    }
    this.unsuitableNodes.add(unsuitableNodesItem);
    return this;
  }

   /**
   * UnsuitableNodes lists nodes that the ResourceClaim cannot be allocated for.  The size of this field is limited to 128, the same as for PodSchedulingSpec.PotentialNodes. This may get increased in the future, but not reduced.
   * @return unsuitableNodes
  **/
  @jakarta.annotation.Nullable
  public List<String> getUnsuitableNodes() {
    return unsuitableNodes;
  }

  public void setUnsuitableNodes(List<String> unsuitableNodes) {
    this.unsuitableNodes = unsuitableNodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ResourceClaimSchedulingStatus v1alpha3ResourceClaimSchedulingStatus = (V1alpha3ResourceClaimSchedulingStatus) o;
    return Objects.equals(this.name, v1alpha3ResourceClaimSchedulingStatus.name) &&
        Objects.equals(this.unsuitableNodes, v1alpha3ResourceClaimSchedulingStatus.unsuitableNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, unsuitableNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceClaimSchedulingStatus {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unsuitableNodes: ").append(toIndentedString(unsuitableNodes)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("unsuitableNodes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha3ResourceClaimSchedulingStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3ResourceClaimSchedulingStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3ResourceClaimSchedulingStatus is not found in the empty JSON string", V1alpha3ResourceClaimSchedulingStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3ResourceClaimSchedulingStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3ResourceClaimSchedulingStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3ResourceClaimSchedulingStatus.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("unsuitableNodes") != null && !jsonObj.get("unsuitableNodes").isJsonNull() && !jsonObj.get("unsuitableNodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsuitableNodes` to be an array in the JSON string but got `%s`", jsonObj.get("unsuitableNodes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3ResourceClaimSchedulingStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3ResourceClaimSchedulingStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3ResourceClaimSchedulingStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3ResourceClaimSchedulingStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3ResourceClaimSchedulingStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha3ResourceClaimSchedulingStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3ResourceClaimSchedulingStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha3ResourceClaimSchedulingStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha3ResourceClaimSchedulingStatus
  * @throws IOException if the JSON string is invalid with respect to V1alpha3ResourceClaimSchedulingStatus
  */
  public static V1alpha3ResourceClaimSchedulingStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3ResourceClaimSchedulingStatus.class);
  }

 /**
  * Convert an instance of V1alpha3ResourceClaimSchedulingStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
