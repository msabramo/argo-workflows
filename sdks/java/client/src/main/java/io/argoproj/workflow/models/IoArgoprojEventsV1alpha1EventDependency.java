/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argoproj.github.io/argo-workflows/
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventDependencyFilter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventDependencyTransformer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojEventsV1alpha1EventDependency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1EventDependency {
  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_EVENT_SOURCE_NAME = "eventSourceName";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE_NAME)
  private String eventSourceName;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private IoArgoprojEventsV1alpha1EventDependencyFilter filters;

  public static final String SERIALIZED_NAME_FILTERS_LOGICAL_OPERATOR = "filtersLogicalOperator";
  @SerializedName(SERIALIZED_NAME_FILTERS_LOGICAL_OPERATOR)
  private String filtersLogicalOperator;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private IoArgoprojEventsV1alpha1EventDependencyTransformer transform;


  public IoArgoprojEventsV1alpha1EventDependency eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public IoArgoprojEventsV1alpha1EventDependency eventSourceName(String eventSourceName) {
    
    this.eventSourceName = eventSourceName;
    return this;
  }

   /**
   * Get eventSourceName
   * @return eventSourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEventSourceName() {
    return eventSourceName;
  }


  public void setEventSourceName(String eventSourceName) {
    this.eventSourceName = eventSourceName;
  }


  public IoArgoprojEventsV1alpha1EventDependency filters(IoArgoprojEventsV1alpha1EventDependencyFilter filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventDependencyFilter getFilters() {
    return filters;
  }


  public void setFilters(IoArgoprojEventsV1alpha1EventDependencyFilter filters) {
    this.filters = filters;
  }


  public IoArgoprojEventsV1alpha1EventDependency filtersLogicalOperator(String filtersLogicalOperator) {
    
    this.filtersLogicalOperator = filtersLogicalOperator;
    return this;
  }

   /**
   * FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&amp;&amp;), or (||) Is optional and if left blank treated as and (&amp;&amp;).
   * @return filtersLogicalOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FiltersLogicalOperator defines how different filters are evaluated together. Available values: and (&&), or (||) Is optional and if left blank treated as and (&&).")

  public String getFiltersLogicalOperator() {
    return filtersLogicalOperator;
  }


  public void setFiltersLogicalOperator(String filtersLogicalOperator) {
    this.filtersLogicalOperator = filtersLogicalOperator;
  }


  public IoArgoprojEventsV1alpha1EventDependency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IoArgoprojEventsV1alpha1EventDependency transform(IoArgoprojEventsV1alpha1EventDependencyTransformer transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventDependencyTransformer getTransform() {
    return transform;
  }


  public void setTransform(IoArgoprojEventsV1alpha1EventDependencyTransformer transform) {
    this.transform = transform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1EventDependency ioArgoprojEventsV1alpha1EventDependency = (IoArgoprojEventsV1alpha1EventDependency) o;
    return Objects.equals(this.eventName, ioArgoprojEventsV1alpha1EventDependency.eventName) &&
        Objects.equals(this.eventSourceName, ioArgoprojEventsV1alpha1EventDependency.eventSourceName) &&
        Objects.equals(this.filters, ioArgoprojEventsV1alpha1EventDependency.filters) &&
        Objects.equals(this.filtersLogicalOperator, ioArgoprojEventsV1alpha1EventDependency.filtersLogicalOperator) &&
        Objects.equals(this.name, ioArgoprojEventsV1alpha1EventDependency.name) &&
        Objects.equals(this.transform, ioArgoprojEventsV1alpha1EventDependency.transform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, eventSourceName, filters, filtersLogicalOperator, name, transform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1EventDependency {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    filtersLogicalOperator: ").append(toIndentedString(filtersLogicalOperator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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

}

