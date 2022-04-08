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
import io.argoproj.workflow.models.CreateOptions;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest {
  public static final String SERIALIZED_NAME_CREATE_OPTIONS = "createOptions";
  @SerializedName(SERIALIZED_NAME_CREATE_OPTIONS)
  private CreateOptions createOptions;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplate template;


  public IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest createOptions(CreateOptions createOptions) {
    
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOptions getCreateOptions() {
    return createOptions;
  }


  public void setCreateOptions(CreateOptions createOptions) {
    this.createOptions = createOptions;
  }


  public IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest template(IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplate getTemplate() {
    return template;
  }


  public void setTemplate(IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest ioArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest = (IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest) o;
    return Objects.equals(this.createOptions, ioArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest.createOptions) &&
        Objects.equals(this.template, ioArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ClusterWorkflowTemplateCreateRequest {\n");
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

