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
import io.argoproj.workflow.models.OwnerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubmitOpts are workflow submission options
 */
@ApiModel(description = "SubmitOpts are workflow submission options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1SubmitOpts {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private String annotations;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_ENTRY_POINT = "entryPoint";
  @SerializedName(SERIALIZED_NAME_ENTRY_POINT)
  private String entryPoint;

  public static final String SERIALIZED_NAME_GENERATE_NAME = "generateName";
  @SerializedName(SERIALIZED_NAME_GENERATE_NAME)
  private String generateName;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private String labels;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_REFERENCE = "ownerReference";
  @SerializedName(SERIALIZED_NAME_OWNER_REFERENCE)
  private OwnerReference ownerReference;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters = null;

  public static final String SERIALIZED_NAME_POD_PRIORITY_CLASS_NAME = "podPriorityClassName";
  @SerializedName(SERIALIZED_NAME_POD_PRIORITY_CLASS_NAME)
  private String podPriorityClassName;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_SERVER_DRY_RUN = "serverDryRun";
  @SerializedName(SERIALIZED_NAME_SERVER_DRY_RUN)
  private Boolean serverDryRun;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private String serviceAccount;


  public IoArgoprojWorkflowV1alpha1SubmitOpts annotations(String annotations) {
    
    this.annotations = annotations;
    return this;
  }

   /**
   * Annotations adds to metadata.labels
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations adds to metadata.labels")

  public String getAnnotations() {
    return annotations;
  }


  public void setAnnotations(String annotations) {
    this.annotations = annotations;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * DryRun validates the workflow on the client-side without creating it. This option is not supported in API
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DryRun validates the workflow on the client-side without creating it. This option is not supported in API")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts entryPoint(String entryPoint) {
    
    this.entryPoint = entryPoint;
    return this;
  }

   /**
   * Entrypoint overrides spec.entrypoint
   * @return entryPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entrypoint overrides spec.entrypoint")

  public String getEntryPoint() {
    return entryPoint;
  }


  public void setEntryPoint(String entryPoint) {
    this.entryPoint = entryPoint;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts generateName(String generateName) {
    
    this.generateName = generateName;
    return this;
  }

   /**
   * GenerateName overrides metadata.generateName
   * @return generateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GenerateName overrides metadata.generateName")

  public String getGenerateName() {
    return generateName;
  }


  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts labels(String labels) {
    
    this.labels = labels;
    return this;
  }

   /**
   * Labels adds to metadata.labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels adds to metadata.labels")

  public String getLabels() {
    return labels;
  }


  public void setLabels(String labels) {
    this.labels = labels;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name overrides metadata.name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name overrides metadata.name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts ownerReference(OwnerReference ownerReference) {
    
    this.ownerReference = ownerReference;
    return this;
  }

   /**
   * Get ownerReference
   * @return ownerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OwnerReference getOwnerReference() {
    return ownerReference;
  }


  public void setOwnerReference(OwnerReference ownerReference) {
    this.ownerReference = ownerReference;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts parameters(List<String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1SubmitOpts addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters passes input parameters to workflow
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters passes input parameters to workflow")

  public List<String> getParameters() {
    return parameters;
  }


  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts podPriorityClassName(String podPriorityClassName) {
    
    this.podPriorityClassName = podPriorityClassName;
    return this;
  }

   /**
   * Set the podPriorityClassName of the workflow
   * @return podPriorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the podPriorityClassName of the workflow")

  public String getPodPriorityClassName() {
    return podPriorityClassName;
  }


  public void setPodPriorityClassName(String podPriorityClassName) {
    this.podPriorityClassName = podPriorityClassName;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority is used if controller is configured to process limited number of workflows in parallel, higher priority workflows are processed first.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority is used if controller is configured to process limited number of workflows in parallel, higher priority workflows are processed first.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts serverDryRun(Boolean serverDryRun) {
    
    this.serverDryRun = serverDryRun;
    return this;
  }

   /**
   * ServerDryRun validates the workflow on the server-side without creating it
   * @return serverDryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServerDryRun validates the workflow on the server-side without creating it")

  public Boolean getServerDryRun() {
    return serverDryRun;
  }


  public void setServerDryRun(Boolean serverDryRun) {
    this.serverDryRun = serverDryRun;
  }


  public IoArgoprojWorkflowV1alpha1SubmitOpts serviceAccount(String serviceAccount) {
    
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * ServiceAccount runs all pods in the workflow using specified ServiceAccount.
   * @return serviceAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccount runs all pods in the workflow using specified ServiceAccount.")

  public String getServiceAccount() {
    return serviceAccount;
  }


  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1SubmitOpts ioArgoprojWorkflowV1alpha1SubmitOpts = (IoArgoprojWorkflowV1alpha1SubmitOpts) o;
    return Objects.equals(this.annotations, ioArgoprojWorkflowV1alpha1SubmitOpts.annotations) &&
        Objects.equals(this.dryRun, ioArgoprojWorkflowV1alpha1SubmitOpts.dryRun) &&
        Objects.equals(this.entryPoint, ioArgoprojWorkflowV1alpha1SubmitOpts.entryPoint) &&
        Objects.equals(this.generateName, ioArgoprojWorkflowV1alpha1SubmitOpts.generateName) &&
        Objects.equals(this.labels, ioArgoprojWorkflowV1alpha1SubmitOpts.labels) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1SubmitOpts.name) &&
        Objects.equals(this.ownerReference, ioArgoprojWorkflowV1alpha1SubmitOpts.ownerReference) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1SubmitOpts.parameters) &&
        Objects.equals(this.podPriorityClassName, ioArgoprojWorkflowV1alpha1SubmitOpts.podPriorityClassName) &&
        Objects.equals(this.priority, ioArgoprojWorkflowV1alpha1SubmitOpts.priority) &&
        Objects.equals(this.serverDryRun, ioArgoprojWorkflowV1alpha1SubmitOpts.serverDryRun) &&
        Objects.equals(this.serviceAccount, ioArgoprojWorkflowV1alpha1SubmitOpts.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, dryRun, entryPoint, generateName, labels, name, ownerReference, parameters, podPriorityClassName, priority, serverDryRun, serviceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1SubmitOpts {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerReference: ").append(toIndentedString(ownerReference)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    serverDryRun: ").append(toIndentedString(serverDryRun)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

