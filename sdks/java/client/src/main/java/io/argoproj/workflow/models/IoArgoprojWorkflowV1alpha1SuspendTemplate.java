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
 * SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time
 */
@ApiModel(description = "SuspendTemplate is a template subtype to suspend a workflow at a predetermined point in time")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1SuspendTemplate {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;


  public IoArgoprojWorkflowV1alpha1SuspendTemplate duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration is the seconds to wait before automatically resuming a template
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration is the seconds to wait before automatically resuming a template")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1SuspendTemplate ioArgoprojWorkflowV1alpha1SuspendTemplate = (IoArgoprojWorkflowV1alpha1SuspendTemplate) o;
    return Objects.equals(this.duration, ioArgoprojWorkflowV1alpha1SuspendTemplate.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1SuspendTemplate {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

