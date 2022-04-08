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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ContainerNode;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IoArgoprojWorkflowV1alpha1ContainerSetTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1ContainerSetTemplate {
  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<IoArgoprojWorkflowV1alpha1ContainerNode> containers = new ArrayList<>();

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retryStrategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy retryStrategy;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<io.kubernetes.client.openapi.models.V1VolumeMount> volumeMounts = null;


  public IoArgoprojWorkflowV1alpha1ContainerSetTemplate containers(List<IoArgoprojWorkflowV1alpha1ContainerNode> containers) {
    
    this.containers = containers;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ContainerSetTemplate addContainersItem(IoArgoprojWorkflowV1alpha1ContainerNode containersItem) {
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<IoArgoprojWorkflowV1alpha1ContainerNode> getContainers() {
    return containers;
  }


  public void setContainers(List<IoArgoprojWorkflowV1alpha1ContainerNode> containers) {
    this.containers = containers;
  }


  public IoArgoprojWorkflowV1alpha1ContainerSetTemplate retryStrategy(IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy getRetryStrategy() {
    return retryStrategy;
  }


  public void setRetryStrategy(IoArgoprojWorkflowV1alpha1ContainerSetRetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public IoArgoprojWorkflowV1alpha1ContainerSetTemplate volumeMounts(List<io.kubernetes.client.openapi.models.V1VolumeMount> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1ContainerSetTemplate addVolumeMountsItem(io.kubernetes.client.openapi.models.V1VolumeMount volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.openapi.models.V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<io.kubernetes.client.openapi.models.V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ContainerSetTemplate ioArgoprojWorkflowV1alpha1ContainerSetTemplate = (IoArgoprojWorkflowV1alpha1ContainerSetTemplate) o;
    return Objects.equals(this.containers, ioArgoprojWorkflowV1alpha1ContainerSetTemplate.containers) &&
        Objects.equals(this.retryStrategy, ioArgoprojWorkflowV1alpha1ContainerSetTemplate.retryStrategy) &&
        Objects.equals(this.volumeMounts, ioArgoprojWorkflowV1alpha1ContainerSetTemplate.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, retryStrategy, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ContainerSetTemplate {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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

