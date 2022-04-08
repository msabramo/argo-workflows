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
 * GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS {
  public static final String SERIALIZED_NAME_CA_CERT_SECRET = "caCertSecret";
  @SerializedName(SERIALIZED_NAME_CA_CERT_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector caCertSecret;

  public static final String SERIALIZED_NAME_CERT_SECRET = "certSecret";
  @SerializedName(SERIALIZED_NAME_CERT_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret;

  public static final String SERIALIZED_NAME_KEY_SECRET = "keySecret";
  @SerializedName(SERIALIZED_NAME_KEY_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector keySecret;


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS caCertSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector caCertSecret) {
    
    this.caCertSecret = caCertSecret;
    return this;
  }

   /**
   * Get caCertSecret
   * @return caCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getCaCertSecret() {
    return caCertSecret;
  }


  public void setCaCertSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector caCertSecret) {
    this.caCertSecret = caCertSecret;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS certSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret) {
    
    this.certSecret = certSecret;
    return this;
  }

   /**
   * Get certSecret
   * @return certSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getCertSecret() {
    return certSecret;
  }


  public void setCertSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector certSecret) {
    this.certSecret = certSecret;
  }


  public GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS keySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector keySecret) {
    
    this.keySecret = keySecret;
    return this;
  }

   /**
   * Get keySecret
   * @return keySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getKeySecret() {
    return keySecret;
  }


  public void setKeySecret(io.kubernetes.client.openapi.models.V1SecretKeySelector keySecret) {
    this.keySecret = keySecret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS githubComArgoprojLabsArgoDataflowApiV1alpha1TLS = (GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS) o;
    return Objects.equals(this.caCertSecret, githubComArgoprojLabsArgoDataflowApiV1alpha1TLS.caCertSecret) &&
        Objects.equals(this.certSecret, githubComArgoprojLabsArgoDataflowApiV1alpha1TLS.certSecret) &&
        Objects.equals(this.keySecret, githubComArgoprojLabsArgoDataflowApiV1alpha1TLS.keySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertSecret, certSecret, keySecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubComArgoprojLabsArgoDataflowApiV1alpha1TLS {\n");
    sb.append("    caCertSecret: ").append(toIndentedString(caCertSecret)).append("\n");
    sb.append("    certSecret: ").append(toIndentedString(certSecret)).append("\n");
    sb.append("    keySecret: ").append(toIndentedString(keySecret)).append("\n");
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

