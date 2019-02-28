CREATE TABLE base_area (
    id bigint unsigned not null auto_increment,
    pid bigint not null default 0 comment "父id, 关联base_area.id",
    area_long_id varchar(64) not null comment "id连起来组成long code",
    area_name varchar(64) not null comment "区域名称",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    create_time datetime not null comment "创建时间",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="地区表";

CREATE TABLE base_store(
    id bigint unsigned not null auto_increment,
    store_name varchar(64) not null comment "门店名称",
    area_long_id varchar(64) not null comment "id连起来组成long code",
    store_pic_ids varchar(64) comment "门店图片id, 关联res_pic.id, 用逗号隔开",
    store_address_info varchar(128) comment "门店详细地址",
    remark varchar(512) comment "门店备注",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    create_time datetime not null comment "创建时间",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="门店表";

CREATE TABLE base_category(
    id bigint unsigned not null auto_increment,
    pid bigint unsigned not null default 0 comment "父id, 关联base_category.id",
    category_long_id varchar(64) not null comment "id连起来组成long code",
    category_name varchar(16) not null comment "分类名称",
    category_pic_id bigint comment "分类图片id, 关联res_pic.id",
    click_rate int not null default 0 comment "排序用的点击量",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    create_time datetime not null comment "创建时间",
    level tinyint not null comment "level",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="分类表";

CREATE TABLE base_product(
    id bigint unsigned not null auto_increment,
    product_name varchar(64) not null comment "产品名称",
    category_long_id varchar(64) not null comment "该商品关联的分类的分类长编码, 关联base_category.category_long_id",
    store_id bigint unsigned comment "门店id, 关联base_store.id",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    survive_time int comment "这条信息在系统里面存活了多久(秒)",
    price int comment "价格, ?元/斤, ?元/个, 单位分",
    unit_type_value tinyint not null comment "单位类型, 1: ?元/斤, 2: ?元/个 3: 其他单位 ",
    price_info varchar(64) comment "记录: 10元3个, 其他价格单位的信息",
    create_time datetime not null comment "创建时间",
    remark varchar(512) comment "商品备注",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="商品信息表";

CREATE TABLE res_pic(
    id bigint unsigned not null auto_increment,
    file_path varchar(256) not null comment "图片路径",
    file_key varchar(64) not null comment "图片类型code",
    file_size int not null comment "图片大小(kb)",
    pic_length int not null comment "图片像素-长",
    pic_weight int not null comment "图片像素-宽",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    create_time datetime not null comment "创建时间",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="资源图片表";

CREATE TABLE base_user(
    id bigint unsigned not null auto_increment,
    user_type varchar(32) comment "用户类型; 来自微信/web后台管理员...",
    permission_type varchar(32) comment "权限类型, eg: 产品更新/后台管理",
    username varchar(64) comment "用户名",
    password varchar(64) comment "密码",
    open_id varchar(64) comment "来源于微信用户的openId",
    is_deleted tinyint not null default 0 comment "是否删除; 0: 默认未删除; 1: 已删除",
    create_time datetime not null comment "创建时间",
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT="用户表";