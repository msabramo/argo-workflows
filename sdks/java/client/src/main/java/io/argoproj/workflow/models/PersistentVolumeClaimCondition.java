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
import java.time.OffsetDateTime;

/**
 * PersistentVolumeClaimCondition contails details about state of pvc
 */
@ApiModel(description = "PersistentVolumeClaimCondition contails details about state of pvc")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PersistentVolumeClaimCondition {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private OffsetDateTime lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private OffsetDateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  /**
   *    Possible enum values:  - &#x60;\&quot;FileSystemResizePending\&quot;&#x60; - controller resize is finished and a file system resize is pending on node  - &#x60;\&quot;Resizing\&quot;&#x60; - a user trigger resize of pvc has been started
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FILESYSTEMRESIZEPENDING("FileSystemResizePending"),
    
    RESIZING("Resizing");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public PersistentVolumeClaimCondition lastProbeTime(OffsetDateTime lastProbeTime) {
    
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return lastProbeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public OffsetDateTime getLastProbeTime() {
    return lastProbeTime;
  }


  public void setLastProbeTime(OffsetDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public PersistentVolumeClaimCondition lastTransitionTime(OffsetDateTime lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public PersistentVolumeClaimCondition message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public PersistentVolumeClaimCondition reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports \&quot;ResizeStarted\&quot; that means the underlying persistent volume is being resized.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports \"ResizeStarted\" that means the underlying persistent volume is being resized.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public PersistentVolumeClaimCondition status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PersistentVolumeClaimCondition type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   *    Possible enum values:  - &#x60;\&quot;FileSystemResizePending\&quot;&#x60; - controller resize is finished and a file system resize is pending on node  - &#x60;\&quot;Resizing\&quot;&#x60; - a user trigger resize of pvc has been started
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "   Possible enum values:  - `\"FileSystemResizePending\"` - controller resize is finished and a file system resize is pending on node  - `\"Resizing\"` - a user trigger resize of pvc has been started")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    PersistentVolumeClaimCondition persistentVolumeClaimCondition = (PersistentVolumeClaimCondition) o;
    return Objects.equals(this.lastProbeTime, persistentVolumeClaimCondition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, persistentVolumeClaimCondition.lastTransitionTime) &&
        Objects.equals(this.message, persistentVolumeClaimCondition.message) &&
        Objects.equals(this.reason, persistentVolumeClaimCondition.reason) &&
        Objects.equals(this.status, persistentVolumeClaimCondition.status) &&
        Objects.equals(this.type, persistentVolumeClaimCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentVolumeClaimCondition {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

