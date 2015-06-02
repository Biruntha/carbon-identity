/*
 * Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.handler.provisioning;

import org.wso2.carbon.identity.application.authentication.framework.exception.FrameworkException;

import java.util.List;
import java.util.Map;

public interface ProvisioningHandler {

    /**
     * @param roles
     * @param subject
     * @param attributes
     * @param provisioningUserStoreId
     * @param tenantDomain
     * @throws FrameworkException
     */
    public void handle(List<String> roles, String subject, Map<String, String> attributes,
                       String provisioningUserStoreId, String tenantDomain) throws FrameworkException;
}
