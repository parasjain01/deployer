/*
 * Copyright (C) 2007-2016 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.deployer.api;

import java.util.Map;

import org.craftercms.deployer.api.exceptions.DeployerException;

/**
 * Represents a collection of processors that are executed on each deployment.
 *
 * @author avasquez
 */
public interface DeploymentPipeline {

    /**
     * Destroys the pipeline, calling destroy also on all its processors
     *
     * @throws DeployerException if an error occurs
     */
    void destroy() throws DeployerException;

    /**
     * Does a deployment.
     *
     * @param target    the target that needs to be deployed
     * @param params    additional parameters that can be used by the processors of the pipeline
     *
     * @return the deployment info
     */
    Deployment execute(Target target, Map<String, Object> params);

}
