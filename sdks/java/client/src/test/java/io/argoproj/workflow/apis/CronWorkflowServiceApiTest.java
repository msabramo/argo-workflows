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
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CreateCronWorkflowRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflow;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflowList;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflowResumeRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1CronWorkflowSuspendRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1LintCronWorkflowRequest;
import io.argoproj.workflow.models.IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CronWorkflowServiceApi
 */
@Ignore
public class CronWorkflowServiceApiTest {

    private final CronWorkflowServiceApi api = new CronWorkflowServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cronWorkflowServiceCreateCronWorkflowTest() throws ApiException {
        String namespace = null;
        IoArgoprojWorkflowV1alpha1CreateCronWorkflowRequest body = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceCreateCronWorkflow(namespace, body);

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
    public void cronWorkflowServiceDeleteCronWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        String deleteOptionsGracePeriodSeconds = null;
        String deleteOptionsPreconditionsUid = null;
        String deleteOptionsPreconditionsResourceVersion = null;
        Boolean deleteOptionsOrphanDependents = null;
        String deleteOptionsPropagationPolicy = null;
        List<String> deleteOptionsDryRun = null;
        Object response = api.cronWorkflowServiceDeleteCronWorkflow(namespace, name, deleteOptionsGracePeriodSeconds, deleteOptionsPreconditionsUid, deleteOptionsPreconditionsResourceVersion, deleteOptionsOrphanDependents, deleteOptionsPropagationPolicy, deleteOptionsDryRun);

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
    public void cronWorkflowServiceGetCronWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        String getOptionsResourceVersion = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceGetCronWorkflow(namespace, name, getOptionsResourceVersion);

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
    public void cronWorkflowServiceLintCronWorkflowTest() throws ApiException {
        String namespace = null;
        IoArgoprojWorkflowV1alpha1LintCronWorkflowRequest body = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceLintCronWorkflow(namespace, body);

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
    public void cronWorkflowServiceListCronWorkflowsTest() throws ApiException {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        IoArgoprojWorkflowV1alpha1CronWorkflowList response = api.cronWorkflowServiceListCronWorkflows(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

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
    public void cronWorkflowServiceResumeCronWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        IoArgoprojWorkflowV1alpha1CronWorkflowResumeRequest body = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceResumeCronWorkflow(namespace, name, body);

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
    public void cronWorkflowServiceSuspendCronWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        IoArgoprojWorkflowV1alpha1CronWorkflowSuspendRequest body = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceSuspendCronWorkflow(namespace, name, body);

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
    public void cronWorkflowServiceUpdateCronWorkflowTest() throws ApiException {
        String namespace = null;
        String name = null;
        IoArgoprojWorkflowV1alpha1UpdateCronWorkflowRequest body = null;
        IoArgoprojWorkflowV1alpha1CronWorkflow response = api.cronWorkflowServiceUpdateCronWorkflow(namespace, name, body);

        // TODO: test validations
    }
    
}
