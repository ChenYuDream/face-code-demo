SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `eims_user`
-- ----------------------------
DROP TABLE IF EXISTS `eims_user`;
CREATE TABLE `eims_user` (
  `id` varchar(32) NOT NULL COMMENT '主键ID',
  `user_name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `role_type` varchar(32) DEFAULT NULL COMMENT '角色名',
  `other_info` varchar(255) DEFAULT NULL COMMENT '其他信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';

-- ----------------------------
-- Records of eims_user
-- ----------------------------
INSERT INTO `eims_user` VALUES ('0293e78659714245be17a2073ca311b1', '李四', '管理员', 'lisi', '2018-03-07 23:29:58', '2018-03-07 23:29:58');
INSERT INTO `eims_user` VALUES ('9caac481f0584670a37e78052929cdc1', '张三', '管理员', 'zhangsan', '2018-03-07 23:29:42', '2018-03-07 23:29:42');