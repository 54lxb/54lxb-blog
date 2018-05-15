DROP DATABASE IF EXISTS `blog_54lxb`;
CREATE DATABASE `blog_54lxb`;
USE `blog_54lxb`;

DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
  `category_id` INT NOT NULL COMMENT '分类Id',
  `title` VARCHAR(40) NOT NULL COMMENT '标题',
  `tags` VARCHAR(100) DEFAULT NULL COMMENT '标签',
  `content` LONGTEXT NOT NULL COMMENT '内容',
  `description` VARCHAR(500) NOT NULL COMMENT '文章简介  用于列表显示',
  `state` INT NOT NULL DEFAULT '1' COMMENT '状态 1：正常  2：草稿 3.删除',
  `show_count` INT(11) NOT NULL DEFAULT '0' COMMENT '浏览量',
  `comments_num` INT(11) NOT NULL DEFAULT '0' COMMENT '评论数',
  `blog_type` INT(11) NOT NULL DEFAULT '1' COMMENT '博客类型：1 原创 2 转载',
  `allow_comment` TINYINT(1) DEFAULT '1' COMMENT '是否允许评论：0 不可以 1 可以 ',
  `allow_ping` TINYINT(1) DEFAULT '1' COMMENT '是否允许ping：0 不可以 1 可以 ',
  `allow_feed` TINYINT(1) DEFAULT '1' COMMENT '允许出现在聚合中：0 不可以 1 可以 ',
  `author_id` INT NOT NULL COMMENT '作者ID',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发表时间戳',
  `update_time` DATETIME NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='博客文章表';

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pid` INT NOT NULL DEFAULT 0 COMMENT '父分类ID，没有则为0',
  `category_name` VARCHAR(20) NOT NULL COMMENT '分类名称  唯一',
  `alias_name` VARCHAR(20) NOT NULL COMMENT '别名,唯一,比如新闻,就用News代替,栏目Id不显示在url中',
  `sort` INT NOT NULL DEFAULT '0' COMMENT '排序 （0-10）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `alias_name_UNIQUE` (`alias_name`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='分类表';

INSERT INTO `category` VALUES (1, 0,'默认分类','default', 0);

DROP TABLE IF EXISTS `attachment`;
CREATE TABLE `attachment` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
  `file_name` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '文件名称',
  `file_type` VARCHAR(50) DEFAULT '' COMMENT '文件类型：1.图片 2.文件',
  `file_key` TEXT NOT NULL COMMENT '文件的地址',
  `author_id` INT DEFAULT NULL COMMENT '创建人的id',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建的时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=UTF8 COMMENT='文章附件列表';

DROP TABLE IF EXISTS `partner`;
CREATE TABLE `partner` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
  `site_name` VARCHAR(15) NOT NULL COMMENT '站点名',
  `site_url` VARCHAR(45) NOT NULL COMMENT '站点地址',
  `site_desc` VARCHAR(45) NOT NULL COMMENT '站点描述  简单备注 ',
  `sort` INT NOT NULL DEFAULT '0' COMMENT '排序',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建的时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='合作伙伴';


DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主键编号',
  `action` VARCHAR(100) DEFAULT NULL COMMENT '事件',
  `datas` VARCHAR(2000) DEFAULT NULL COMMENT '数据',
  `author_id` INT(10) DEFAULT NULL COMMENT '操作者编号',
  `ip` VARCHAR(20) DEFAULT NULL COMMENT 'ip地址',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间戳',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT='操作日志表';

DROP TABLE IF EXISTS `options`;
CREATE TABLE `options` (
  `name` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '配置名字',
  `value` VARCHAR(1000) DEFAULT '' COMMENT '配置值',
  `description` VARCHAR(200) DEFAULT NULL COMMENT '配置说明',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT '网站配置信息';

BEGIN;
INSERT INTO `options` VALUES
  ('baidu_site_verification', null, '百度网站验证码'),
  ('google_site_verification', null, 'google网站验证码'),
  ('site_description', null, '网站描述'),
  ('site_keywords', null, '54lxb,博客,大爱我小宝哥,刘小宝,小宝哥'),
  ('site_record', null, '备案号'),
  ('site_title', null, '网站标题'),
  ('social_csdn', null, 'CSDN'),
  ('social_github', null, 'GitHub'),
  ('social_jianshu', null, '简书地址'),
  ('social_resume', null, '简历地址'),
  ('social_twitter', null, 'Twitter'),
  ('social_weibo', null, '微博地址'),
  ('social_zhihu', null, '知乎地址'),
  ('social_juejin', null, '掘金地址');
COMMIT;

#增加一个账号为54lxb，密码为54-lxb@123.的用户，可以在任何主机上登录，并对此库用于所有操作权限。
GRANT ALL ON blog_54lxb.* TO 54lxb@'%' IDENTIFIED BY '54-lxb@123.';
FLUSH PRIVILEGES;