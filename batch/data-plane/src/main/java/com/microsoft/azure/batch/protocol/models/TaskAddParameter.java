/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Azure Batch task to add.
 * Batch will retry tasks when a recovery operation is triggered on a compute
 * node. Examples of recovery operations include (but are not limited to) when
 * an unhealthy compute node is rebooted or a compute node disappeared due to
 * host failure. Retries due to recovery operations are independent of and are
 * not counted against the maxTaskRetryCount. Even if the maxTaskRetryCount is
 * 0, an internal retry due to a recovery operation may occur. Because of this,
 * all tasks should be idempotent. This means tasks need to tolerate being
 * interrupted and restarted without causing any corruption or duplicate data.
 * The best practice for long running tasks is to use some form of
 * checkpointing.
 */
public class TaskAddParameter {
    /**
     * A string that uniquely identifies the task within the job.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters. The
     * ID is case-preserving and case-insensitive (that is, you may not have
     * two IDs within a job that differ only by case).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * A display name for the task.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The command line of the task.
     * For multi-instance tasks, the command line is executed as the primary
     * task, after the primary task and all subtasks have finished executing
     * the coordination command line. The command line does not run under a
     * shell, and therefore cannot take advantage of shell features such as
     * environment variable expansion. If you want to take advantage of such
     * features, you should invoke the shell in the command line, for example
     * using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux.
     * If the command line refers to file paths, it should use a relative path
     * (relative to the task working directory), or use the Batch provided
     * environment variable
     * (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * The settings for the container under which the task runs.
     * If the pool that will run this task has containerConfiguration set, this
     * must be set as well. If the pool that will run this task doesn't have
     * containerConfiguration set, this must not be set. When this is
     * specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR
     * (the root of Azure Batch directories on the node) are mapped into the
     * container, all task environment variables are mapped into the container,
     * and the task command line is executed in the container.
     */
    @JsonProperty(value = "containerSettings")
    private TaskContainerSettings containerSettings;

    /**
     * How the Batch service should respond when the task completes.
     */
    @JsonProperty(value = "exitConditions")
    private ExitConditions exitConditions;

    /**
     * A list of files that the Batch service will download to the compute node
     * before running the command line.
     * For multi-instance tasks, the resource files will only be downloaded to
     * the compute node on which the primary task is executed. There is a
     * maximum size for the list of resource files.  When the max size is
     * exceeded, the request will fail and the response error code will be
     * RequestEntityTooLarge. If this occurs, the collection of ResourceFiles
     * must be reduced in size. This can be achieved using .zip files,
     * Application Packages, or Docker Containers.
     */
    @JsonProperty(value = "resourceFiles")
    private List<ResourceFile> resourceFiles;

    /**
     * A list of files that the Batch service will upload from the compute node
     * after running the command line.
     * For multi-instance tasks, the files will only be uploaded from the
     * compute node on which the primary task is executed.
     */
    @JsonProperty(value = "outputFiles")
    private List<OutputFile> outputFiles;

    /**
     * A list of environment variable settings for the task.
     */
    @JsonProperty(value = "environmentSettings")
    private List<EnvironmentSetting> environmentSettings;

    /**
     * A locality hint that can be used by the Batch service to select a
     * compute node on which to start the new task.
     */
    @JsonProperty(value = "affinityInfo")
    private AffinityInformation affinityInfo;

    /**
     * The execution constraints that apply to this task.
     * If you do not specify constraints, the maxTaskRetryCount is the
     * maxTaskRetryCount specified for the job, the maxWallClockTime is
     * infinite, and the retentionTime is 7 days.
     */
    @JsonProperty(value = "constraints")
    private TaskConstraints constraints;

    /**
     * The user identity under which the task runs.
     * If omitted, the task runs as a non-administrative user unique to the
     * task.
     */
    @JsonProperty(value = "userIdentity")
    private UserIdentity userIdentity;

    /**
     * An object that indicates that the task is a multi-instance task, and
     * contains information about how to run the multi-instance task.
     */
    @JsonProperty(value = "multiInstanceSettings")
    private MultiInstanceSettings multiInstanceSettings;

    /**
     * The tasks that this task depends on.
     * This task will not be scheduled until all tasks that it depends on have
     * completed successfully. If any of those tasks fail and exhaust their
     * retry counts, this task will never be scheduled. If the job does not
     * have usesTaskDependencies set to true, and this element is present, the
     * request fails with error code TaskDependenciesNotSpecifiedOnJob.
     */
    @JsonProperty(value = "dependsOn")
    private TaskDependencies dependsOn;

    /**
     * A list of application packages that the Batch service will deploy to the
     * compute node before running the command line.
     * Application packages are downloaded and deployed to a shared directory,
     * not the task working directory. Therefore, if a referenced package is
     * already on the compute node, and is up to date, then it is not
     * re-downloaded; the existing copy on the compute node is used. If a
     * referenced application package cannot be installed, for example because
     * the package has been deleted or because download failed, the task fails.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The settings for an authentication token that the task can use to
     * perform Batch service operations.
     * If this property is set, the Batch service provides the task with an
     * authentication token which can be used to authenticate Batch service
     * operations without requiring an account access key. The token is
     * provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The
     * operations that the task can carry out using the token depend on the
     * settings. For example, a task can request job permissions in order to
     * add other tasks to the job, or check the status of the job or of other
     * tasks under the job.
     */
    @JsonProperty(value = "authenticationTokenSettings")
    private AuthenticationTokenSettings authenticationTokenSettings;

    /**
     * Get the ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within a job that differ only by case).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within a job that differ only by case).
     *
     * @param id the id value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get for multi-instance tasks, the command line is executed as the primary task, after the primary task and all subtasks have finished executing the coordination command line. The command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path (relative to the task working directory), or use the Batch provided environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set for multi-instance tasks, the command line is executed as the primary task, after the primary task and all subtasks have finished executing the coordination command line. The command line does not run under a shell, and therefore cannot take advantage of shell features such as environment variable expansion. If you want to take advantage of such features, you should invoke the shell in the command line, for example using "cmd /c MyCommand" in Windows or "/bin/sh -c MyCommand" in Linux. If the command line refers to file paths, it should use a relative path (relative to the task working directory), or use the Batch provided environment variable (https://docs.microsoft.com/en-us/azure/batch/batch-compute-node-environment-variables).
     *
     * @param commandLine the commandLine value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get if the pool that will run this task has containerConfiguration set, this must be set as well. If the pool that will run this task doesn't have containerConfiguration set, this must not be set. When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all task environment variables are mapped into the container, and the task command line is executed in the container.
     *
     * @return the containerSettings value
     */
    public TaskContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set if the pool that will run this task has containerConfiguration set, this must be set as well. If the pool that will run this task doesn't have containerConfiguration set, this must not be set. When this is specified, all directories recursively below the AZ_BATCH_NODE_ROOT_DIR (the root of Azure Batch directories on the node) are mapped into the container, all task environment variables are mapped into the container, and the task command line is executed in the container.
     *
     * @param containerSettings the containerSettings value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withContainerSettings(TaskContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get how the Batch service should respond when the task completes.
     *
     * @return the exitConditions value
     */
    public ExitConditions exitConditions() {
        return this.exitConditions;
    }

    /**
     * Set how the Batch service should respond when the task completes.
     *
     * @param exitConditions the exitConditions value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withExitConditions(ExitConditions exitConditions) {
        this.exitConditions = exitConditions;
        return this;
    }

    /**
     * Get for multi-instance tasks, the resource files will only be downloaded to the compute node on which the primary task is executed. There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @return the resourceFiles value
     */
    public List<ResourceFile> resourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set for multi-instance tasks, the resource files will only be downloaded to the compute node on which the primary task is executed. There is a maximum size for the list of resource files.  When the max size is exceeded, the request will fail and the response error code will be RequestEntityTooLarge. If this occurs, the collection of ResourceFiles must be reduced in size. This can be achieved using .zip files, Application Packages, or Docker Containers.
     *
     * @param resourceFiles the resourceFiles value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get for multi-instance tasks, the files will only be uploaded from the compute node on which the primary task is executed.
     *
     * @return the outputFiles value
     */
    public List<OutputFile> outputFiles() {
        return this.outputFiles;
    }

    /**
     * Set for multi-instance tasks, the files will only be uploaded from the compute node on which the primary task is executed.
     *
     * @param outputFiles the outputFiles value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withOutputFiles(List<OutputFile> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }

    /**
     * Get the environmentSettings value.
     *
     * @return the environmentSettings value
     */
    public List<EnvironmentSetting> environmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings value.
     *
     * @param environmentSettings the environmentSettings value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the affinityInfo value.
     *
     * @return the affinityInfo value
     */
    public AffinityInformation affinityInfo() {
        return this.affinityInfo;
    }

    /**
     * Set the affinityInfo value.
     *
     * @param affinityInfo the affinityInfo value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withAffinityInfo(AffinityInformation affinityInfo) {
        this.affinityInfo = affinityInfo;
        return this;
    }

    /**
     * Get if you do not specify constraints, the maxTaskRetryCount is the maxTaskRetryCount specified for the job, the maxWallClockTime is infinite, and the retentionTime is 7 days.
     *
     * @return the constraints value
     */
    public TaskConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set if you do not specify constraints, the maxTaskRetryCount is the maxTaskRetryCount specified for the job, the maxWallClockTime is infinite, and the retentionTime is 7 days.
     *
     * @param constraints the constraints value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withConstraints(TaskConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get if omitted, the task runs as a non-administrative user unique to the task.
     *
     * @return the userIdentity value
     */
    public UserIdentity userIdentity() {
        return this.userIdentity;
    }

    /**
     * Set if omitted, the task runs as a non-administrative user unique to the task.
     *
     * @param userIdentity the userIdentity value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withUserIdentity(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
        return this;
    }

    /**
     * Get the multiInstanceSettings value.
     *
     * @return the multiInstanceSettings value
     */
    public MultiInstanceSettings multiInstanceSettings() {
        return this.multiInstanceSettings;
    }

    /**
     * Set the multiInstanceSettings value.
     *
     * @param multiInstanceSettings the multiInstanceSettings value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withMultiInstanceSettings(MultiInstanceSettings multiInstanceSettings) {
        this.multiInstanceSettings = multiInstanceSettings;
        return this;
    }

    /**
     * Get this task will not be scheduled until all tasks that it depends on have completed successfully. If any of those tasks fail and exhaust their retry counts, this task will never be scheduled. If the job does not have usesTaskDependencies set to true, and this element is present, the request fails with error code TaskDependenciesNotSpecifiedOnJob.
     *
     * @return the dependsOn value
     */
    public TaskDependencies dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set this task will not be scheduled until all tasks that it depends on have completed successfully. If any of those tasks fail and exhaust their retry counts, this task will never be scheduled. If the job does not have usesTaskDependencies set to true, and this element is present, the request fails with error code TaskDependenciesNotSpecifiedOnJob.
     *
     * @param dependsOn the dependsOn value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withDependsOn(TaskDependencies dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get application packages are downloaded and deployed to a shared directory, not the task working directory. Therefore, if a referenced package is already on the compute node, and is up to date, then it is not re-downloaded; the existing copy on the compute node is used. If a referenced application package cannot be installed, for example because the package has been deleted or because download failed, the task fails.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set application packages are downloaded and deployed to a shared directory, not the task working directory. Therefore, if a referenced package is already on the compute node, and is up to date, then it is not re-downloaded; the existing copy on the compute node is used. If a referenced application package cannot be installed, for example because the package has been deleted or because download failed, the task fails.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get if this property is set, the Batch service provides the task with an authentication token which can be used to authenticate Batch service operations without requiring an account access key. The token is provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that the task can carry out using the token depend on the settings. For example, a task can request job permissions in order to add other tasks to the job, or check the status of the job or of other tasks under the job.
     *
     * @return the authenticationTokenSettings value
     */
    public AuthenticationTokenSettings authenticationTokenSettings() {
        return this.authenticationTokenSettings;
    }

    /**
     * Set if this property is set, the Batch service provides the task with an authentication token which can be used to authenticate Batch service operations without requiring an account access key. The token is provided via the AZ_BATCH_AUTHENTICATION_TOKEN environment variable. The operations that the task can carry out using the token depend on the settings. For example, a task can request job permissions in order to add other tasks to the job, or check the status of the job or of other tasks under the job.
     *
     * @param authenticationTokenSettings the authenticationTokenSettings value to set
     * @return the TaskAddParameter object itself.
     */
    public TaskAddParameter withAuthenticationTokenSettings(AuthenticationTokenSettings authenticationTokenSettings) {
        this.authenticationTokenSettings = authenticationTokenSettings;
        return this;
    }

}
