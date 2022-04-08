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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.AWSElasticBlockStoreVolumeSource;
import io.argoproj.workflow.models.AzureDiskVolumeSource;
import io.argoproj.workflow.models.AzureFileVolumeSource;
import io.argoproj.workflow.models.CSIVolumeSource;
import io.argoproj.workflow.models.CephFSVolumeSource;
import io.argoproj.workflow.models.CinderVolumeSource;
import io.argoproj.workflow.models.ConfigMapVolumeSource;
import io.argoproj.workflow.models.DownwardAPIVolumeSource;
import io.argoproj.workflow.models.EmptyDirVolumeSource;
import io.argoproj.workflow.models.EphemeralVolumeSource;
import io.argoproj.workflow.models.FCVolumeSource;
import io.argoproj.workflow.models.FlexVolumeSource;
import io.argoproj.workflow.models.FlockerVolumeSource;
import io.argoproj.workflow.models.GCEPersistentDiskVolumeSource;
import io.argoproj.workflow.models.GitRepoVolumeSource;
import io.argoproj.workflow.models.GlusterfsVolumeSource;
import io.argoproj.workflow.models.HostPathVolumeSource;
import io.argoproj.workflow.models.ISCSIVolumeSource;
import io.argoproj.workflow.models.NFSVolumeSource;
import io.argoproj.workflow.models.PersistentVolumeClaimVolumeSource;
import io.argoproj.workflow.models.PhotonPersistentDiskVolumeSource;
import io.argoproj.workflow.models.PortworxVolumeSource;
import io.argoproj.workflow.models.ProjectedVolumeSource;
import io.argoproj.workflow.models.QuobyteVolumeSource;
import io.argoproj.workflow.models.RBDVolumeSource;
import io.argoproj.workflow.models.ScaleIOVolumeSource;
import io.argoproj.workflow.models.SecretVolumeSource;
import io.argoproj.workflow.models.StorageOSVolumeSource;
import io.argoproj.workflow.models.VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource
 */
public class GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSourceTest {
    private final GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource model = new GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource();

    /**
     * Model tests for GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource
     */
    @Test
    public void testGithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource() {
        // TODO: test GithubComArgoprojLabsArgoDataflowApiV1alpha1AbstractVolumeSource
    }

    /**
     * Test the property 'awsElasticBlockStore'
     */
    @Test
    public void awsElasticBlockStoreTest() {
        // TODO: test awsElasticBlockStore
    }

    /**
     * Test the property 'azureDisk'
     */
    @Test
    public void azureDiskTest() {
        // TODO: test azureDisk
    }

    /**
     * Test the property 'azureFile'
     */
    @Test
    public void azureFileTest() {
        // TODO: test azureFile
    }

    /**
     * Test the property 'cephfs'
     */
    @Test
    public void cephfsTest() {
        // TODO: test cephfs
    }

    /**
     * Test the property 'cinder'
     */
    @Test
    public void cinderTest() {
        // TODO: test cinder
    }

    /**
     * Test the property 'configMap'
     */
    @Test
    public void configMapTest() {
        // TODO: test configMap
    }

    /**
     * Test the property 'csi'
     */
    @Test
    public void csiTest() {
        // TODO: test csi
    }

    /**
     * Test the property 'downwardAPI'
     */
    @Test
    public void downwardAPITest() {
        // TODO: test downwardAPI
    }

    /**
     * Test the property 'emptyDir'
     */
    @Test
    public void emptyDirTest() {
        // TODO: test emptyDir
    }

    /**
     * Test the property 'ephemeral'
     */
    @Test
    public void ephemeralTest() {
        // TODO: test ephemeral
    }

    /**
     * Test the property 'fc'
     */
    @Test
    public void fcTest() {
        // TODO: test fc
    }

    /**
     * Test the property 'flexVolume'
     */
    @Test
    public void flexVolumeTest() {
        // TODO: test flexVolume
    }

    /**
     * Test the property 'flocker'
     */
    @Test
    public void flockerTest() {
        // TODO: test flocker
    }

    /**
     * Test the property 'gcePersistentDisk'
     */
    @Test
    public void gcePersistentDiskTest() {
        // TODO: test gcePersistentDisk
    }

    /**
     * Test the property 'gitRepo'
     */
    @Test
    public void gitRepoTest() {
        // TODO: test gitRepo
    }

    /**
     * Test the property 'glusterfs'
     */
    @Test
    public void glusterfsTest() {
        // TODO: test glusterfs
    }

    /**
     * Test the property 'hostPath'
     */
    @Test
    public void hostPathTest() {
        // TODO: test hostPath
    }

    /**
     * Test the property 'iscsi'
     */
    @Test
    public void iscsiTest() {
        // TODO: test iscsi
    }

    /**
     * Test the property 'nfs'
     */
    @Test
    public void nfsTest() {
        // TODO: test nfs
    }

    /**
     * Test the property 'persistentVolumeClaim'
     */
    @Test
    public void persistentVolumeClaimTest() {
        // TODO: test persistentVolumeClaim
    }

    /**
     * Test the property 'photonPersistentDisk'
     */
    @Test
    public void photonPersistentDiskTest() {
        // TODO: test photonPersistentDisk
    }

    /**
     * Test the property 'portworxVolume'
     */
    @Test
    public void portworxVolumeTest() {
        // TODO: test portworxVolume
    }

    /**
     * Test the property 'projected'
     */
    @Test
    public void projectedTest() {
        // TODO: test projected
    }

    /**
     * Test the property 'quobyte'
     */
    @Test
    public void quobyteTest() {
        // TODO: test quobyte
    }

    /**
     * Test the property 'rbd'
     */
    @Test
    public void rbdTest() {
        // TODO: test rbd
    }

    /**
     * Test the property 'scaleIO'
     */
    @Test
    public void scaleIOTest() {
        // TODO: test scaleIO
    }

    /**
     * Test the property 'secret'
     */
    @Test
    public void secretTest() {
        // TODO: test secret
    }

    /**
     * Test the property 'storageos'
     */
    @Test
    public void storageosTest() {
        // TODO: test storageos
    }

    /**
     * Test the property 'vsphereVolume'
     */
    @Test
    public void vsphereVolumeTest() {
        // TODO: test vsphereVolume
    }

}
