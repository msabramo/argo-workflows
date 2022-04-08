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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1Header;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPArtifact allows an file served on HTTP to be placed as an input artifact in a container
 */
@ApiModel(description = "HTTPArtifact allows an file served on HTTP to be placed as an input artifact in a container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1HTTPArtifact {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<IoArgoprojWorkflowV1alpha1Header> headers = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public IoArgoprojWorkflowV1alpha1HTTPArtifact headers(List<IoArgoprojWorkflowV1alpha1Header> headers) {
    
    this.headers = headers;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1HTTPArtifact addHeadersItem(IoArgoprojWorkflowV1alpha1Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Headers are an optional list of headers to send with HTTP requests for artifacts
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Headers are an optional list of headers to send with HTTP requests for artifacts")

  public List<IoArgoprojWorkflowV1alpha1Header> getHeaders() {
    return headers;
  }


  public void setHeaders(List<IoArgoprojWorkflowV1alpha1Header> headers) {
    this.headers = headers;
  }


  public IoArgoprojWorkflowV1alpha1HTTPArtifact url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the artifact
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL of the artifact")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1HTTPArtifact ioArgoprojWorkflowV1alpha1HTTPArtifact = (IoArgoprojWorkflowV1alpha1HTTPArtifact) o;
    return Objects.equals(this.headers, ioArgoprojWorkflowV1alpha1HTTPArtifact.headers) &&
        Objects.equals(this.url, ioArgoprojWorkflowV1alpha1HTTPArtifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HTTPArtifact {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

