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
import java.util.ArrayList;
import java.util.List;

/**
 * HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository
 */
@ApiModel(description = "HDFSArtifactRepository defines the controller configuration for an HDFS artifact repository")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IoArgoprojWorkflowV1alpha1HDFSArtifactRepository {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = null;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public static final String SERIALIZED_NAME_HDFS_USER = "hdfsUser";
  @SerializedName(SERIALIZED_NAME_HDFS_USER)
  private String hdfsUser;

  public static final String SERIALIZED_NAME_KRB_C_CACHE_SECRET = "krbCCacheSecret";
  @SerializedName(SERIALIZED_NAME_KRB_C_CACHE_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret;

  public static final String SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP = "krbConfigConfigMap";
  @SerializedName(SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP)
  private io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap;

  public static final String SERIALIZED_NAME_KRB_KEYTAB_SECRET = "krbKeytabSecret";
  @SerializedName(SERIALIZED_NAME_KRB_KEYTAB_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret;

  public static final String SERIALIZED_NAME_KRB_REALM = "krbRealm";
  @SerializedName(SERIALIZED_NAME_KRB_REALM)
  private String krbRealm;

  public static final String SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME = "krbServicePrincipalName";
  @SerializedName(SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME)
  private String krbServicePrincipalName;

  public static final String SERIALIZED_NAME_KRB_USERNAME = "krbUsername";
  @SerializedName(SERIALIZED_NAME_KRB_USERNAME)
  private String krbUsername;

  public static final String SERIALIZED_NAME_PATH_FORMAT = "pathFormat";
  @SerializedName(SERIALIZED_NAME_PATH_FORMAT)
  private String pathFormat;


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses is accessible addresses of HDFS name nodes
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Addresses is accessible addresses of HDFS name nodes")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Force copies a file forcibly even if it exists
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force copies a file forcibly even if it exists")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository hdfsUser(String hdfsUser) {
    
    this.hdfsUser = hdfsUser;
    return this;
  }

   /**
   * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
   * @return hdfsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.")

  public String getHdfsUser() {
    return hdfsUser;
  }


  public void setHdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbCCacheSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret) {
    
    this.krbCCacheSecret = krbCCacheSecret;
    return this;
  }

   /**
   * Get krbCCacheSecret
   * @return krbCCacheSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getKrbCCacheSecret() {
    return krbCCacheSecret;
  }


  public void setKrbCCacheSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbConfigConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap) {
    
    this.krbConfigConfigMap = krbConfigConfigMap;
    return this;
  }

   /**
   * Get krbConfigConfigMap
   * @return krbConfigConfigMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector getKrbConfigConfigMap() {
    return krbConfigConfigMap;
  }


  public void setKrbConfigConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbKeytabSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret) {
    
    this.krbKeytabSecret = krbKeytabSecret;
    return this;
  }

   /**
   * Get krbKeytabSecret
   * @return krbKeytabSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getKrbKeytabSecret() {
    return krbKeytabSecret;
  }


  public void setKrbKeytabSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbRealm(String krbRealm) {
    
    this.krbRealm = krbRealm;
    return this;
  }

   /**
   * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
   * @return krbRealm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbRealm() {
    return krbRealm;
  }


  public void setKrbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbServicePrincipalName(String krbServicePrincipalName) {
    
    this.krbServicePrincipalName = krbServicePrincipalName;
    return this;
  }

   /**
   * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
   * @return krbServicePrincipalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.")

  public String getKrbServicePrincipalName() {
    return krbServicePrincipalName;
  }


  public void setKrbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository krbUsername(String krbUsername) {
    
    this.krbUsername = krbUsername;
    return this;
  }

   /**
   * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
   * @return krbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbUsername() {
    return krbUsername;
  }


  public void setKrbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
  }


  public IoArgoprojWorkflowV1alpha1HDFSArtifactRepository pathFormat(String pathFormat) {
    
    this.pathFormat = pathFormat;
    return this;
  }

   /**
   * PathFormat is defines the format of path to store a file. Can reference workflow variables
   * @return pathFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PathFormat is defines the format of path to store a file. Can reference workflow variables")

  public String getPathFormat() {
    return pathFormat;
  }


  public void setPathFormat(String pathFormat) {
    this.pathFormat = pathFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojWorkflowV1alpha1HDFSArtifactRepository ioArgoprojWorkflowV1alpha1HDFSArtifactRepository = (IoArgoprojWorkflowV1alpha1HDFSArtifactRepository) o;
    return Objects.equals(this.addresses, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.addresses) &&
        Objects.equals(this.force, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.force) &&
        Objects.equals(this.hdfsUser, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.hdfsUser) &&
        Objects.equals(this.krbCCacheSecret, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbCCacheSecret) &&
        Objects.equals(this.krbConfigConfigMap, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbConfigConfigMap) &&
        Objects.equals(this.krbKeytabSecret, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbKeytabSecret) &&
        Objects.equals(this.krbRealm, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbRealm) &&
        Objects.equals(this.krbServicePrincipalName, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbServicePrincipalName) &&
        Objects.equals(this.krbUsername, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.krbUsername) &&
        Objects.equals(this.pathFormat, ioArgoprojWorkflowV1alpha1HDFSArtifactRepository.pathFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, force, hdfsUser, krbCCacheSecret, krbConfigConfigMap, krbKeytabSecret, krbRealm, krbServicePrincipalName, krbUsername, pathFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HDFSArtifactRepository {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
    sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
    sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
    sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
    sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
    sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
    sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
    sb.append("    pathFormat: ").append(toIndentedString(pathFormat)).append("\n");
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

