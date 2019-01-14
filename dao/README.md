# dao

## admin setting model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\AdminSettingsEntity.java

```java
// ...
public final class AdminSettingsEntity implements BaseEntity<AdminSettings> {

    private UUID id;
    private String key;
    private JsonNode jsonValue;
    // ...
}
```

## alarm model (警告)

dao\src\main\java\org\thingsboard\server\dao\model\nosql\AlarmEntity.java

```java
// ...
public final class AlarmEntity implements BaseEntity<Alarm> {

    private UUID id;
    private UUID tenantId;              // 租户id
    private UUID originatorId;          // 来源者id
    private EntityType originatorType;  // 来源者类型
    private String type;                // 警报类型
    private AlarmSeverity severity;     //
    private AlarmStatus status;         // 警报状态
    private Long startTs;               // 开始时间
    private Long endTs;                 // 结束时间
    private Long ackTs;                 // 回复时间
    private Long clearTs;               // 清除时间
    private JsonNode details;           // 详情
    private Boolean propagate;          // 传送
    // ...
}
```

## asset model (资产)

dao\src\main\java\org\thingsboard\server\dao\model\nosql\AssetEntity.java

```java
// ...
public final class AssetEntity implements SearchTextEntity<Asset> {

    private UUID id;
    private UUID tenantId;              // 租户id
    private UUID customerId;            // 客户id
    private String type;
    private String name;                // 资产名称
    private String searchText;
    private JsonNode additionalInfo;    // 额外的信息
    // ...
}
```

## audit log model（审计日志）

dao\src\main\java\org\thingsboard\server\dao\model\nosql\AuditLogEntity.java

```java
// ...
public class AuditLogEntity implements BaseEntity<AuditLog> {

    private UUID id;
    private UUID tenantId;                  // 租户id
    private UUID customerId;                // 客户id
    private EntityType entityType;          // 实体类型
    private UUID entityId;                  // 实体id
    private String entityName;              // 实体名称
    private UUID userId;                    // 绑定的用户
    private String userName;                // 用户名
    private ActionType actionType;          // 操作类型
    private JsonNode actionData;            // 操作数据
    private ActionStatus actionStatus;      // 操作状态
    private String actionFailureDetails;    // 操作失败详情
    // ...
}
```

## component descriptor model

## customer model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\CustomerEntity.java

```java
// ...
public final class CustomerEntity implements SearchTextEntity<Customer> {

    private UUID id;
    private UUID tenantId;              // 租户id，所属租户？
    private String title;               // 名字
    private String searchText;
    private String country;             // 国家
    private String state;               // 状态
    private String city;                // 城市
    private String address;             // 地址
    private String address2;            // 地址2
    private String zip;                 // ？
    private String phone;               // 手机
    private String email;               // 邮箱
    private JsonNode additionalInfo;    // 额外的信息
    // ...
}
```

## dashboard model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\DashboardEntity.java

```java
// ...
public final class DashboardEntity implements SearchTextEntity<Dashboard> {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final JavaType assignedCustomersType =
            objectMapper.getTypeFactory().constructCollectionType(HashSet.class, ShortCustomerInfo.class);
    private UUID id;
    private UUID tenantId;              // 租户id
    private String title;               // 名称
    private String searchText;
    private String assignedCustomers;
    private JsonNode configuration;     // 配置
    // ...
}
```

## dashboard info model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\DashboardInfoEntity.java

```java
// ...

public class DashboardInfoEntity implements SearchTextEntity<DashboardInfo> {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final JavaType assignedCustomersType =
            objectMapper.getTypeFactory().constructCollectionType(HashSet.class, ShortCustomerInfo.class);
    private UUID id;
    private UUID tenantId;
    private String title;               // dashboard info 名称
    private String searchText;
    private String assignedCustomers;
    // ...
}
```

## device credentials model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\DeviceCredentialsEntity.java

```java
// ...
public final class DeviceCredentialsEntity implements BaseEntity<DeviceCredentials> {

    private UUID id;
    private UUID deviceId;                          // 设备id
    private DeviceCredentialsType credentialsType;  // 证书类型
    private String credentialsId;                   // 证书id
    private String credentialsValue;                // 证书数值
    // ...
}
```

## device model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\DeviceEntity.java

```java
// ...
public final class DeviceEntity implements SearchTextEntity<Device> {

    private UUID id;
    private UUID tenantId;          // 关联租户
    private UUID customerId;        // 关联客户
    private String type;            // 设备类型
    private String name;            // 设备名称
    private String searchText;
    private JsonNode additionalInfo; // 额外的信息
    // ...
}
```

## entity view model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\EntityViewEntity.java

```java
// ...
public class EntityViewEntity implements SearchTextEntity<EntityView> {

    private UUID id;
    private UUID tenantId;              // 租户id
    private UUID customerId;            // 客户id
    private String type;                // Entity View 类型
    private EntityType entityType;      // 实体类型
    private UUID entityId;              // 实体id
    private String name;
    private String keys;
    private long startTs;               // 开始时间
    private long endTs;                 // 结束时间
    private String searchText;
    private JsonNode additionalInfo;    // 额外的信息
    // ...
}
```

## rule chain model (规则链)

dao\src\main\java\org\thingsboard\server\dao\model\nosql\RuleChainEntity.java

```java
// ...
public class RuleChainEntity implements SearchTextEntity<RuleChain> {

    private UUID id;
    private UUID tenantId;              // 租户id
    private String name;
    private String searchText;
    private UUID firstRuleNodeId;       // 第一个rule节点id
    private boolean root;               // 是否为root
    private boolean debugMode;
    private JsonNode configuration;     // 配置
    private JsonNode additionalInfo;    // 额外信息
    // ...
}
```

## rule node model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\RuleNodeEntity.java

```java
// ...

public class RuleNodeEntity implements SearchTextEntity<RuleNode> {

    private UUID id;
    private UUID ruleChainId;
    private String type;                // rule node 类型
    private String name;                // 名称
    private String searchText;
    private JsonNode configuration;     // 配置
    private JsonNode additionalInfo;
    private boolean debugMode;
    // ...
}
```

## tenant model (租户管理员)

dao\src\main\java\org\thingsboard\server\dao\model\nosql\TenantEntity.java

```java
// ...
public final class TenantEntity implements SearchTextEntity<Tenant> {

    private UUID id;
    private String title;
    private String searchText;
    private String region;
    private String country;
    private String state;
    private String city;
    private String address;
    private String address2;
    private String zip;
    private String phone;
    private String email;
    private JsonNode additionalInfo;
    // ...
}
```

## user credentials model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\UserCredentialsEntity.java

```java
// ...
public final class UserCredentialsEntity implements BaseEntity<UserCredentials> {

    private UUID id;
    private UUID userId;
    private boolean enabled;
    private String password;        // 证书密码
    private String activateToken;   // 激活token
    private String resetToken;      // 重置token
    // ...
}
```

## user model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\UserEntity.java

```java
// ...
public final class UserEntity implements SearchTextEntity<User> {

    private UUID id;
    private UUID tenantId;
    private UUID customerId;
    private Authority authority;
    private String email;
    private String searchText;
    private String firstName;           // 名
    private String lastName;            // 姓
    private JsonNode additionalInfo;    // 额外的信息
    // ...
}
```

## event model

dao\src\main\java\org\thingsboard\server\dao\model\nosql\EventEntity.java

```java
// ...
public class EventEntity implements BaseEntity<Event> {

    private UUID id;
    private UUID tenantId;
    private EntityType entityType;  // 实体类型
    private UUID entityId;          // 实体id
    private String eventType;       // 事件类型
    private String eventUid;
    private JsonNode body;
    // ...
}
```

## widgets bundle model

## widget type model
