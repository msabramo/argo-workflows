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
import io.argoproj.workflow.models.GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline> items = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.openapi.models.V1ListMeta metadata;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList items(List<GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline> items) {
    
    this.items = items;
    return this;
  }

  public GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList addItemsItem(GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline> getItems() {
    return items;
  }


  public void setItems(List<GithubComArgoprojLabsArgoDataflowApiV1alpha1Pipeline> items) {
    this.items = items;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList metadata(io.kubernetes.client.openapi.models.V1ListMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList githubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList = (GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList) o;
    return Objects.equals(this.items, githubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList.items) &&
        Objects.equals(this.metadata, githubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1PipelineList {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

