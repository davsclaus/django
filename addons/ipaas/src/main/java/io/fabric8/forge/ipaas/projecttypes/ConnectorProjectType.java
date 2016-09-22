/**
 *  Copyright 2005-2015 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.forge.ipaas.projecttypes;

import org.jboss.forge.addon.maven.projects.archetype.CustomMavenArchetypeProjectType;

/**
 * A project type for Camel Connector projects
 */
public class ConnectorProjectType extends CustomMavenArchetypeProjectType {

    public ConnectorProjectType() {
        super(ConnectorProjectArchetypeStep.class, "Connector");
    }

    @Override
    public int priority() {
        return super.priority() + 9001;
    }

}
