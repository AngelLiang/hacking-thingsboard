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
package org.thingsboard.server.common.data.audit;

import lombok.Getter;

@Getter
public enum ActionType {
    // 添加
    ADDED(false), // log entity
    // 删除
    DELETED(false), // log string id
    // 更新
    UPDATED(false), // log entity
    // 属性更新
    ATTRIBUTES_UPDATED(false), // log attributes/values
    // 属性删除
    ATTRIBUTES_DELETED(false), // log attributes
    // timeseries删除
    TIMESERIES_DELETED(false), // log timeseries
    // 调用rpc
    RPC_CALL(false), // log method and params
    // 证书更新
    CREDENTIALS_UPDATED(false), // log new credentials
    // 分配给客户
    ASSIGNED_TO_CUSTOMER(false), // log customer name
    // 撤销分配客户
    UNASSIGNED_FROM_CUSTOMER(false), // log customer name
    
    // 激活
    ACTIVATED(false), // log string id
    // 废除
    SUSPENDED(false), // log string id

    // 证书读取
    CREDENTIALS_READ(true), // log device id
    // 属性读取
    ATTRIBUTES_READ(true), // log attributes
    // 关系
    RELATION_ADD_OR_UPDATE(false),
    RELATION_DELETED(false),
    RELATIONS_DELETED(false),
    // 警告响应
    ALARM_ACK(false),
    // 警告清除
    ALARM_CLEAR(false);

    private final boolean isRead;

    ActionType(boolean isRead) {
        this.isRead = isRead;
    }
}
