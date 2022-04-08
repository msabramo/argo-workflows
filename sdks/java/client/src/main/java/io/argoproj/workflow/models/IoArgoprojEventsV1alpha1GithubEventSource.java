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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventSourceFilter;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1GithubAppCreds;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1OwnedRepositories;
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1WebhookContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IoArgoprojEventsV1alpha1GithubEventSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojEventsV1alpha1GithubEventSource {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_API_TOKEN = "apiToken";
  @SerializedName(SERIALIZED_NAME_API_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector apiToken;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private IoArgoprojEventsV1alpha1EventSourceFilter filter;

  public static final String SERIALIZED_NAME_GITHUB_APP = "githubApp";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP)
  private IoArgoprojEventsV1alpha1GithubAppCreds githubApp;

  public static final String SERIALIZED_NAME_GITHUB_BASE_U_R_L = "githubBaseURL";
  @SerializedName(SERIALIZED_NAME_GITHUB_BASE_U_R_L)
  private String githubBaseURL;

  public static final String SERIALIZED_NAME_GITHUB_UPLOAD_U_R_L = "githubUploadURL";
  @SerializedName(SERIALIZED_NAME_GITHUB_UPLOAD_U_R_L)
  private String githubUploadURL;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSECURE = "insecure";
  @SerializedName(SERIALIZED_NAME_INSECURE)
  private Boolean insecure;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private List<String> organizations = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<IoArgoprojEventsV1alpha1OwnedRepositories> repositories = null;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private IoArgoprojEventsV1alpha1WebhookContext webhook;

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhookSecret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector webhookSecret;


  public IoArgoprojEventsV1alpha1GithubEventSource active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource apiToken(io.kubernetes.client.openapi.models.V1SecretKeySelector apiToken) {
    
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getApiToken() {
    return apiToken;
  }


  public void setApiToken(io.kubernetes.client.openapi.models.V1SecretKeySelector apiToken) {
    this.apiToken = apiToken;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * Get deleteHookOnFinish
   * @return deleteHookOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }


  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public IoArgoprojEventsV1alpha1GithubEventSource addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource filter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(IoArgoprojEventsV1alpha1EventSourceFilter filter) {
    this.filter = filter;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource githubApp(IoArgoprojEventsV1alpha1GithubAppCreds githubApp) {
    
    this.githubApp = githubApp;
    return this;
  }

   /**
   * Get githubApp
   * @return githubApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1GithubAppCreds getGithubApp() {
    return githubApp;
  }


  public void setGithubApp(IoArgoprojEventsV1alpha1GithubAppCreds githubApp) {
    this.githubApp = githubApp;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource githubBaseURL(String githubBaseURL) {
    
    this.githubBaseURL = githubBaseURL;
    return this;
  }

   /**
   * Get githubBaseURL
   * @return githubBaseURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGithubBaseURL() {
    return githubBaseURL;
  }


  public void setGithubBaseURL(String githubBaseURL) {
    this.githubBaseURL = githubBaseURL;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource githubUploadURL(String githubUploadURL) {
    
    this.githubUploadURL = githubUploadURL;
    return this;
  }

   /**
   * Get githubUploadURL
   * @return githubUploadURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGithubUploadURL() {
    return githubUploadURL;
  }


  public void setGithubUploadURL(String githubUploadURL) {
    this.githubUploadURL = githubUploadURL;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource insecure(Boolean insecure) {
    
    this.insecure = insecure;
    return this;
  }

   /**
   * Get insecure
   * @return insecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInsecure() {
    return insecure;
  }


  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public IoArgoprojEventsV1alpha1GithubEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource organizations(List<String> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public IoArgoprojEventsV1alpha1GithubEventSource addOrganizationsItem(String organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.
   * @return organizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.")

  public List<String> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(List<String> organizations) {
    this.organizations = organizations;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource repositories(List<IoArgoprojEventsV1alpha1OwnedRepositories> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public IoArgoprojEventsV1alpha1GithubEventSource addRepositoriesItem(IoArgoprojEventsV1alpha1OwnedRepositories repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.
   * @return repositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.")

  public List<IoArgoprojEventsV1alpha1OwnedRepositories> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<IoArgoprojEventsV1alpha1OwnedRepositories> repositories) {
    this.repositories = repositories;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource webhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(IoArgoprojEventsV1alpha1WebhookContext webhook) {
    this.webhook = webhook;
  }


  public IoArgoprojEventsV1alpha1GithubEventSource webhookSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector webhookSecret) {
    
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getWebhookSecret() {
    return webhookSecret;
  }


  public void setWebhookSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1GithubEventSource ioArgoprojEventsV1alpha1GithubEventSource = (IoArgoprojEventsV1alpha1GithubEventSource) o;
    return Objects.equals(this.active, ioArgoprojEventsV1alpha1GithubEventSource.active) &&
        Objects.equals(this.apiToken, ioArgoprojEventsV1alpha1GithubEventSource.apiToken) &&
        Objects.equals(this.contentType, ioArgoprojEventsV1alpha1GithubEventSource.contentType) &&
        Objects.equals(this.deleteHookOnFinish, ioArgoprojEventsV1alpha1GithubEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1GithubEventSource.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1GithubEventSource.filter) &&
        Objects.equals(this.githubApp, ioArgoprojEventsV1alpha1GithubEventSource.githubApp) &&
        Objects.equals(this.githubBaseURL, ioArgoprojEventsV1alpha1GithubEventSource.githubBaseURL) &&
        Objects.equals(this.githubUploadURL, ioArgoprojEventsV1alpha1GithubEventSource.githubUploadURL) &&
        Objects.equals(this.id, ioArgoprojEventsV1alpha1GithubEventSource.id) &&
        Objects.equals(this.insecure, ioArgoprojEventsV1alpha1GithubEventSource.insecure) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1GithubEventSource.metadata) &&
        Objects.equals(this.organizations, ioArgoprojEventsV1alpha1GithubEventSource.organizations) &&
        Objects.equals(this.owner, ioArgoprojEventsV1alpha1GithubEventSource.owner) &&
        Objects.equals(this.repositories, ioArgoprojEventsV1alpha1GithubEventSource.repositories) &&
        Objects.equals(this.repository, ioArgoprojEventsV1alpha1GithubEventSource.repository) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1GithubEventSource.webhook) &&
        Objects.equals(this.webhookSecret, ioArgoprojEventsV1alpha1GithubEventSource.webhookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, apiToken, contentType, deleteHookOnFinish, events, filter, githubApp, githubBaseURL, githubUploadURL, id, insecure, metadata, organizations, owner, repositories, repository, webhook, webhookSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1GithubEventSource {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    githubApp: ").append(toIndentedString(githubApp)).append("\n");
    sb.append("    githubBaseURL: ").append(toIndentedString(githubBaseURL)).append("\n");
    sb.append("    githubUploadURL: ").append(toIndentedString(githubUploadURL)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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

