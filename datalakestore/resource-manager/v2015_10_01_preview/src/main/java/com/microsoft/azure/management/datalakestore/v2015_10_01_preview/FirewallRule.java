/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation.FirewallRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation.DataLakeStoreManager;

/**
 * Type representing FirewallRule.
 */
public interface FirewallRule extends HasInner<FirewallRuleInner>, Indexable, Refreshable<FirewallRule>, Updatable<FirewallRule.Update>, HasManager<DataLakeStoreManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    FirewallRuleProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the FirewallRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallRule definition.
         */
        interface Blank extends WithAccount {
        }

        /**
         * The stage of the firewallrule definition allowing to specify Account.
         */
        interface WithAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account
            * @param accountName The name of the Data Lake Store account to which to add the firewall rule
            * @return the next definition stage
            */
            WithCreate withExistingAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the firewallrule definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id the firewall rule's subscription ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the firewallrule definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location the firewall rule's regional location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the firewallrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name the firewall rule's name
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the firewallrule definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties of the firewall rule
             * @return the next definition stage
             */
            WithCreate withProperties(FirewallRuleProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallRule>, DefinitionStages.WithId, DefinitionStages.WithLocation, DefinitionStages.WithName, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a FirewallRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallRule>, UpdateStages.WithId, UpdateStages.WithLocation, UpdateStages.WithName, UpdateStages.WithProperties {
    }

    /**
     * Grouping of FirewallRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the firewallrule update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id the firewall rule's subscription ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the firewallrule update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location the firewall rule's regional location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the firewallrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name the firewall rule's name
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the firewallrule update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties of the firewall rule
             * @return the next update stage
             */
            Update withProperties(FirewallRuleProperties properties);
        }

    }
}