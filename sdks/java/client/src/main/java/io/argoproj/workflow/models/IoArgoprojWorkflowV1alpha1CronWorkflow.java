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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflowSpec;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflowStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CronWorkflow is the definition of a scheduled workflow resource
 */
@ApiModel(description = "CronWorkflow is the definition of a scheduled workflow resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1CronWorkflow {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.openapi.models.V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private IoArgoprojWorkflowV1alpha1CronWorkflowSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IoArgoprojWorkflowV1alpha1CronWorkflowStatus status;


  public IoArgoprojWorkflowV1alpha1CronWorkflow apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflow kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.io.k8s.community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflow metadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflow spec(IoArgoprojWorkflowV1alpha1CronWorkflowSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IoArgoprojWorkflowV1alpha1CronWorkflowSpec getSpec() {
    return spec;
  }


  public void setSpec(IoArgoprojWorkflowV1alpha1CronWorkflowSpec spec) {
    this.spec = spec;
  }


  public IoArgoprojWorkflowV1alpha1CronWorkflow status(IoArgoprojWorkflowV1alpha1CronWorkflowStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1CronWorkflowStatus getStatus() {
    return status;
  }


  public void setStatus(IoArgoprojWorkflowV1alpha1CronWorkflowStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1CronWorkflow ioArgoprojWorkflowV1alpha1CronWorkflow = (IoArgoprojWorkflowV1alpha1CronWorkflow) o;
    return Objects.equals(this.apiVersion, ioArgoprojWorkflowV1alpha1CronWorkflow.apiVersion) &&
        Objects.equals(this.kind, ioArgoprojWorkflowV1alpha1CronWorkflow.kind) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1CronWorkflow.metadata) &&
        Objects.equals(this.spec, ioArgoprojWorkflowV1alpha1CronWorkflow.spec) &&
        Objects.equals(this.status, ioArgoprojWorkflowV1alpha1CronWorkflow.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1CronWorkflow {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

