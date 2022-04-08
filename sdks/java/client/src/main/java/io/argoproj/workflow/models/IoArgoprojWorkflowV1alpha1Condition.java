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
 * IoArgoprojWorkflowV1alpha1Condition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1Condition {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public IoArgoprojWorkflowV1alpha1Condition message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message is the condition message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message is the condition message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public IoArgoprojWorkflowV1alpha1Condition status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status is the status of the condition
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status is the status of the condition")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public IoArgoprojWorkflowV1alpha1Condition type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is the type of condition
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type is the type of condition")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1Condition ioArgoprojWorkflowV1alpha1Condition = (IoArgoprojWorkflowV1alpha1Condition) o;
    return Objects.equals(this.message, ioArgoprojWorkflowV1alpha1Condition.message) &&
        Objects.equals(this.status, ioArgoprojWorkflowV1alpha1Condition.status) &&
        Objects.equals(this.type, ioArgoprojWorkflowV1alpha1Condition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Condition {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

