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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Gauge is a Gauge prometheus metric
 */
@ApiModel(description = "Gauge is a Gauge prometheus metric")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Gauge {
  public static final String SERIALIZED_NAME_REALTIME = "realtime";
  @SerializedName(SERIALIZED_NAME_REALTIME)
  private Boolean realtime;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public IoArgoprojWorkflowV1alpha1Gauge realtime(Boolean realtime) {
    
    this.realtime = realtime;
    return this;
  }

   /**
   * Realtime emits this metric in real time if applicable
   * @return realtime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Realtime emits this metric in real time if applicable")

  public Boolean getRealtime() {
    return realtime;
  }


  public void setRealtime(Boolean realtime) {
    this.realtime = realtime;
  }


  public IoArgoprojWorkflowV1alpha1Gauge value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the value of the metric
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Value is the value of the metric")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Gauge ioArgoprojWorkflowV1alpha1Gauge = (IoArgoprojWorkflowV1alpha1Gauge) o;
    return Objects.equals(this.realtime, ioArgoprojWorkflowV1alpha1Gauge.realtime) &&
        Objects.equals(this.value, ioArgoprojWorkflowV1alpha1Gauge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realtime, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Gauge {\n");
    sb.append("    realtime: ").append(toIndentedString(realtime)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

