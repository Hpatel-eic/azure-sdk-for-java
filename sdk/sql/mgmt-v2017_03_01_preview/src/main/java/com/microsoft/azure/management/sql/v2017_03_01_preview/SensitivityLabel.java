/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SensitivityLabelInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;

/**
 * Type representing SensitivityLabel.
 */
public interface SensitivityLabel extends HasInner<SensitivityLabelInner>, Indexable, Refreshable<SensitivityLabel>, Updatable<SensitivityLabel.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the informationType value.
     */
    String informationType();

    /**
     * @return the informationTypeId value.
     */
    String informationTypeId();

    /**
     * @return the isDisabled value.
     */
    Boolean isDisabled();

    /**
     * @return the labelId value.
     */
    String labelId();

    /**
     * @return the labelName value.
     */
    String labelName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SensitivityLabel definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithColumn, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SensitivityLabel definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SensitivityLabel definition.
         */
        interface Blank extends WithColumn {
        }

        /**
         * The stage of the sensitivitylabel definition allowing to specify Column.
         */
        interface WithColumn {
           /**
            * Specifies resourceGroupName, serverName, databaseName, schemaName, tableName, columnName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param databaseName The name of the database
            * @param schemaName The name of the schema
            * @param tableName The name of the table
            * @param columnName The name of the column
            * @return the next definition stage
            */
            WithCreate withExistingColumn(String resourceGroupName, String serverName, String databaseName, String schemaName, String tableName, String columnName);
        }

        /**
         * The stage of the sensitivitylabel definition allowing to specify InformationType.
         */
        interface WithInformationType {
            /**
             * Specifies informationType.
             * @param informationType The information type
             * @return the next definition stage
             */
            WithCreate withInformationType(String informationType);
        }

        /**
         * The stage of the sensitivitylabel definition allowing to specify InformationTypeId.
         */
        interface WithInformationTypeId {
            /**
             * Specifies informationTypeId.
             * @param informationTypeId The information type ID
             * @return the next definition stage
             */
            WithCreate withInformationTypeId(String informationTypeId);
        }

        /**
         * The stage of the sensitivitylabel definition allowing to specify LabelId.
         */
        interface WithLabelId {
            /**
             * Specifies labelId.
             * @param labelId The label ID
             * @return the next definition stage
             */
            WithCreate withLabelId(String labelId);
        }

        /**
         * The stage of the sensitivitylabel definition allowing to specify LabelName.
         */
        interface WithLabelName {
            /**
             * Specifies labelName.
             * @param labelName The label name
             * @return the next definition stage
             */
            WithCreate withLabelName(String labelName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SensitivityLabel>, DefinitionStages.WithInformationType, DefinitionStages.WithInformationTypeId, DefinitionStages.WithLabelId, DefinitionStages.WithLabelName {
        }
    }
    /**
     * The template for a SensitivityLabel update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SensitivityLabel>, UpdateStages.WithInformationType, UpdateStages.WithInformationTypeId, UpdateStages.WithLabelId, UpdateStages.WithLabelName {
    }

    /**
     * Grouping of SensitivityLabel update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sensitivitylabel update allowing to specify InformationType.
         */
        interface WithInformationType {
            /**
             * Specifies informationType.
             * @param informationType The information type
             * @return the next update stage
             */
            Update withInformationType(String informationType);
        }

        /**
         * The stage of the sensitivitylabel update allowing to specify InformationTypeId.
         */
        interface WithInformationTypeId {
            /**
             * Specifies informationTypeId.
             * @param informationTypeId The information type ID
             * @return the next update stage
             */
            Update withInformationTypeId(String informationTypeId);
        }

        /**
         * The stage of the sensitivitylabel update allowing to specify LabelId.
         */
        interface WithLabelId {
            /**
             * Specifies labelId.
             * @param labelId The label ID
             * @return the next update stage
             */
            Update withLabelId(String labelId);
        }

        /**
         * The stage of the sensitivitylabel update allowing to specify LabelName.
         */
        interface WithLabelName {
            /**
             * Specifies labelName.
             * @param labelName The label name
             * @return the next update stage
             */
            Update withLabelName(String labelName);
        }

    }
}
