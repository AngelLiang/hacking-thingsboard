/**
 * Copyright © 2016-2018 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data;

/**
 * @author Andrew Shvayka
 */
public enum EntityType {
    // 实体类型
    // 租户 客户 用户 dashboard 资产 设备 警告 规则链 规则节点 实体视图
    TENANT, CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, ALARM, RULE_CHAIN, RULE_NODE, ENTITY_VIEW
}
