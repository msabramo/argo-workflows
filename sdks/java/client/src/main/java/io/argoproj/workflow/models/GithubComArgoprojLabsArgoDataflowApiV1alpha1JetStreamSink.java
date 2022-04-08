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
import io.argoproj.workflow.models.GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink {
  public static final String SERIALIZED_NAME_JETSTREAM = "jetstream";
  @SerializedName(SERIALIZED_NAME_JETSTREAM)
  private GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStream jetstream;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink jetstream(GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStream jetstream) {
    
    this.jetstream = jetstream;
    return this;
  }

   /**
   * Get jetstream
   * @return jetstream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStream getJetstream() {
    return jetstream;
  }


  public void setJetstream(GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStream jetstream) {
    this.jetstream = jetstream;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink githubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink = (GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink) o;
    return Objects.equals(this.jetstream, githubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink.jetstream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jetstream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1JetStreamSink {\n");
    sb.append("    jetstream: ").append(toIndentedString(jetstream)).append("\n");
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

