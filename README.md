# springcloud
使用SpringCloud + Spring Cloud Gateway + Eureka 实现双微服务跨db关系查询<br>
## 新闻数据库News
sci_news新闻表：<br>
  `id` varchar(32) NOT NULL  COMMENT '新闻ID',<br>
  `title` varchar(255) NOT NULL  COMMENT '新闻标题',<br>
  `type` varchar(24) NOT NULL  COMMENT '新闻类型',<br>
  `user_id` varchar(32) NOT NULL  COMMENT '作者ID',<br>
  `link` varchar(255) COMMENT '新闻链接',<br>
  `cover` varchar(255) NOT NULL  COMMENT '新闻封面链接',<br>
  `downloads` Integer(0) NOT NULL  COMMENT '下载量',<br>
  `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',<br>
  `create_by` varchar(24) NOT NULL  COMMENT '创建操作人',<br>
  `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',<br>
  `update_by` varchar(24) NOT NULL  COMMENT '更新操作人',<br>
  PRIMARY KEY (`id`), <br>
  UNIQUE KEY `news_title_index` (`title`)<br>
<br>
## 用户数据库Users
sys_user用户表：<br>
`id` varchar(32) NOT NULL  COMMENT '用户ID<br>
`nickname` varchar(255) NOT NULL  COMMENT '昵称',<br>
`phone` varchar(32) NOT NULL  COMMENT '手机号',<br>
`email` varchar(255) NOT NULL  COMMENT '邮箱',<br>
`password` varchar(32) COMMENT '密码',<br>
`salt` varchar(32) COMMENT '盐值',<br>
`gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',<br>
`gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',<br>
PRIMARY KEY (`id`), <br>
UNIQUE KEY `nickname_index` (`nickname`),<br>
UNIQUE KEY `email_index` (`email`),<br>
UNIQUE KEY `phone_index` (`phone`)<br>
