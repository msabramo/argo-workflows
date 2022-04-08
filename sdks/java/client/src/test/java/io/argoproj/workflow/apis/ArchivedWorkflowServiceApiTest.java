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


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.models.GrpcGatewayRuntimeError;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1LabelKeys;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1LabelValues;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1RetryArchivedWorkflowRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1Workflow;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1WorkflowList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArchivedWorkflowServiceApi
 */
@Ignore
public class ArchivedWorkflowServiceApiTest {

    private final ArchivedWorkflowServiceApi api = new ArchivedWorkflowServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceDeleteArchivedWorkflowTest() throws ApiException {
        String uid = null;
        Object response = api.archivedWorkflowServiceDeleteArchivedWorkflow(uid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceGetArchivedWorkflowTest() throws ApiException {
        String uid = null;
        IoArgoprojWorkflowV1alpha1Workflow response = api.archivedWorkflowServiceGetArchivedWorkflow(uid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceListArchivedWorkflowLabelKeysTest() throws ApiException {
        IoArgoprojWorkflowV1alpha1LabelKeys response = api.archivedWorkflowServiceListArchivedWorkflowLabelKeys();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceListArchivedWorkflowLabelValuesTest() throws ApiException {
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        IoArgoprojWorkflowV1alpha1LabelValues response = api.archivedWorkflowServiceListArchivedWorkflowLabelValues(listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceListArchivedWorkflowsTest() throws ApiException {
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        String namePrefix = null;
        IoArgoprojWorkflowV1alpha1WorkflowList response = api.archivedWorkflowServiceListArchivedWorkflows(listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue, namePrefix);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceResubmitArchivedWorkflowTest() throws ApiException {
        String uid = null;
        IoArgoprojWorkflowV1alpha1ResubmitArchivedWorkflowRequest body = null;
        IoArgoprojWorkflowV1alpha1Workflow response = api.archivedWorkflowServiceResubmitArchivedWorkflow(uid, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archivedWorkflowServiceRetryArchivedWorkflowTest() throws ApiException {
        String uid = null;
        IoArgoprojWorkflowV1alpha1RetryArchivedWorkflowRequest body = null;
        IoArgoprojWorkflowV1alpha1Workflow response = api.archivedWorkflowServiceRetryArchivedWorkflow(uid, body);

        // TODO: test validations
    }
    
}
