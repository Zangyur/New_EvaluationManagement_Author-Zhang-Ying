/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : inc

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-03-09 15:09:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
  `perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `component` varchar(20) DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `redirect` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单管理';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('2', '3', '系统菜单', '/admin/menu', 'admin:menu:menu', '1', 'fa fa-th-list', '2', '2017-08-09 22:55:15', null, null, null);
INSERT INTO `sys_menu` VALUES ('3', '0', '系统管理', null, null, '0', 'fa fa-desktop', '4', '2017-08-09 23:06:55', null, '2017-08-14 14:13:43', null);
INSERT INTO `sys_menu` VALUES ('6', '3', '用户管理', '/admin/user', 'admin:user:user', '1', 'fa fa-user', '0', '2017-08-10 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('7', '3', '角色管理', '/admin/role', 'admin:role:role', '1', 'fa fa-paw', '1', '2017-08-10 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('12', '6', '新增', '/api-admin/user', 'admin:user:add', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('13', '6', '编辑', '/api-admin/user', 'admin:user:edit', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('14', '6', '删除', '/api-admin/user', 'admin:user:remove', '2', null, '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('15', '7', '新增', '/api-admin/role', 'admin:role:add', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('20', '2', '新增', '/api-admin/menu', 'admin:menu:add', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('21', '2', '编辑', '/api-admin/menu', 'admin:menu:edit', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('22', '2', '删除', '/api-admin/menu', 'admin:menu:remove', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('25', '6', '停用', '/api-admin/user/disable', 'admin:user:disable', '2', null, '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('26', '6', '重置密码', '/api-admin/user/resetPwd', 'admin:user:resetPwd', '2', '', '0', '2017-08-14 00:00:00', null, null, null);
INSERT INTO `sys_menu` VALUES ('55', '7', '编辑', '/api-admin/role', 'admin:role:edit', '2', '', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('56', '7', '删除', '/api-admin/role', 'admin:role:remove', '2', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('74', '73', '清除缓存', '/admin/api/menu/clearCache', 'system:sysDept:add', '1', null, '1', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('76', '73', '编辑', '/admin/api/user/currentUser', 'system:sysDept:edit', '2', null, '3', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('77', '2', '列表', '/api-admin/menu', 'admin:menu:list', '2', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('80', '79', '数据字典', '/a', null, '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('81', '78', '文件管理', '/cms/file', null, '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('82', '81', '列表', '/api-cms/file', 'cms:file', '2', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('87', '81', '上传', '/file/upload', null, '2', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('107', '0', '信息管理', '/', 'xxgl', '0', null, '1', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('108', '107', '课程信息管理', '/kecheng', 'kecheng', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('109', '107', '班级信息管理', '/banji', 'banji', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('110', '107', '教师信息管理', '/jiaoshi', 'jiaoshi', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('111', '107', '学生信息管理', '/xuesheng', 'xuesheng', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('113', '107', '公告信息管理', '/gonggao', 'gonggao', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('114', '0', '活动管理', '/', 'huodong', '0', null, '0', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('115', '114', '活动广场', '/hdgc', 'hdgc', '1', null, '0', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('116', '114', '活动类别', '/hdlb', 'hdlb', '1', null, '6', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('117', '114', '活动发布', '/hdfb', 'hdfb', '1', null, '1', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('118', '114', '信息中心', '/xxzx', 'xxzx', '1', null, '7', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('119', '114', '活动参与', '/hdcy', 'hdcy', '1', null, '3', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('120', '114', '证明上传', '/zmsc', 'zmsc', '1', null, '5', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('121', '0', '综合测评管理', '/', 'zhcp', '0', null, '2', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('122', '121', '综合成绩管理', '/zhcjgl', 'zhcjgl', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('123', '121', '综合成绩比例', '/zhcjbl', 'zhcjbl', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('124', '121', '综合异议管理', '/zhyygl', 'zhyygl', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('125', '0', '综合测评成绩可视化', '/', 'ksh', '0', null, '3', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('126', '114', '活动审核', '/hdsh', 'hdsh', '1', null, '4', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('127', '125', '成绩分布', '/fsfb', 'fsfb', '1', null, null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('128', '125', 'Top5', '/top5', 'top5', '1', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `role_sign` varchar(100) DEFAULT NULL COMMENT '角色标识',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '管理员角色', 'admin', '拥有最高权限', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('2', '学院领导', 'xueyuan', '学院领导', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('3', '科任教师', 'teacher', '科任教师', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('4', '教务处', 'jiaowuchu', '教务处', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('5', '班主任', 'banzhuren', '班主任', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('6', '辅导员', 'fudaoyuan', '辅导员', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');
INSERT INTO `sys_role` VALUES ('7', '学生', 'xuesheng', '学生', '2', '2017-08-12 00:00:00', '2017-08-12 00:00:00');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3835 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色与菜单对应关系';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('367', '44', '1');
INSERT INTO `sys_role_menu` VALUES ('368', '44', '32');
INSERT INTO `sys_role_menu` VALUES ('369', '44', '33');
INSERT INTO `sys_role_menu` VALUES ('370', '44', '34');
INSERT INTO `sys_role_menu` VALUES ('371', '44', '35');
INSERT INTO `sys_role_menu` VALUES ('372', '44', '28');
INSERT INTO `sys_role_menu` VALUES ('373', '44', '29');
INSERT INTO `sys_role_menu` VALUES ('374', '44', '30');
INSERT INTO `sys_role_menu` VALUES ('375', '44', '38');
INSERT INTO `sys_role_menu` VALUES ('376', '44', '4');
INSERT INTO `sys_role_menu` VALUES ('377', '44', '27');
INSERT INTO `sys_role_menu` VALUES ('378', '45', '38');
INSERT INTO `sys_role_menu` VALUES ('379', '46', '3');
INSERT INTO `sys_role_menu` VALUES ('380', '46', '20');
INSERT INTO `sys_role_menu` VALUES ('381', '46', '21');
INSERT INTO `sys_role_menu` VALUES ('382', '46', '22');
INSERT INTO `sys_role_menu` VALUES ('383', '46', '23');
INSERT INTO `sys_role_menu` VALUES ('384', '46', '11');
INSERT INTO `sys_role_menu` VALUES ('385', '46', '12');
INSERT INTO `sys_role_menu` VALUES ('386', '46', '13');
INSERT INTO `sys_role_menu` VALUES ('387', '46', '14');
INSERT INTO `sys_role_menu` VALUES ('389', '46', '25');
INSERT INTO `sys_role_menu` VALUES ('390', '46', '26');
INSERT INTO `sys_role_menu` VALUES ('391', '46', '15');
INSERT INTO `sys_role_menu` VALUES ('392', '46', '2');
INSERT INTO `sys_role_menu` VALUES ('393', '46', '6');
INSERT INTO `sys_role_menu` VALUES ('394', '46', '7');
INSERT INTO `sys_role_menu` VALUES ('598', '50', '38');
INSERT INTO `sys_role_menu` VALUES ('632', '38', '42');
INSERT INTO `sys_role_menu` VALUES ('737', '51', '38');
INSERT INTO `sys_role_menu` VALUES ('738', '51', '39');
INSERT INTO `sys_role_menu` VALUES ('739', '51', '40');
INSERT INTO `sys_role_menu` VALUES ('740', '51', '41');
INSERT INTO `sys_role_menu` VALUES ('741', '51', '4');
INSERT INTO `sys_role_menu` VALUES ('742', '51', '32');
INSERT INTO `sys_role_menu` VALUES ('743', '51', '33');
INSERT INTO `sys_role_menu` VALUES ('744', '51', '34');
INSERT INTO `sys_role_menu` VALUES ('745', '51', '35');
INSERT INTO `sys_role_menu` VALUES ('746', '51', '27');
INSERT INTO `sys_role_menu` VALUES ('747', '51', '28');
INSERT INTO `sys_role_menu` VALUES ('748', '51', '29');
INSERT INTO `sys_role_menu` VALUES ('749', '51', '30');
INSERT INTO `sys_role_menu` VALUES ('750', '51', '1');
INSERT INTO `sys_role_menu` VALUES ('1064', '54', '53');
INSERT INTO `sys_role_menu` VALUES ('1095', '55', '2');
INSERT INTO `sys_role_menu` VALUES ('1096', '55', '6');
INSERT INTO `sys_role_menu` VALUES ('1097', '55', '7');
INSERT INTO `sys_role_menu` VALUES ('1098', '55', '3');
INSERT INTO `sys_role_menu` VALUES ('1099', '55', '50');
INSERT INTO `sys_role_menu` VALUES ('1100', '55', '49');
INSERT INTO `sys_role_menu` VALUES ('1101', '55', '1');
INSERT INTO `sys_role_menu` VALUES ('1856', '53', '28');
INSERT INTO `sys_role_menu` VALUES ('1857', '53', '29');
INSERT INTO `sys_role_menu` VALUES ('1858', '53', '30');
INSERT INTO `sys_role_menu` VALUES ('1859', '53', '27');
INSERT INTO `sys_role_menu` VALUES ('1860', '53', '57');
INSERT INTO `sys_role_menu` VALUES ('1861', '53', '71');
INSERT INTO `sys_role_menu` VALUES ('1862', '53', '48');
INSERT INTO `sys_role_menu` VALUES ('1863', '53', '72');
INSERT INTO `sys_role_menu` VALUES ('1864', '53', '1');
INSERT INTO `sys_role_menu` VALUES ('1865', '53', '7');
INSERT INTO `sys_role_menu` VALUES ('1866', '53', '55');
INSERT INTO `sys_role_menu` VALUES ('1867', '53', '56');
INSERT INTO `sys_role_menu` VALUES ('1869', '53', '15');
INSERT INTO `sys_role_menu` VALUES ('1870', '53', '2');
INSERT INTO `sys_role_menu` VALUES ('1872', '53', '20');
INSERT INTO `sys_role_menu` VALUES ('1873', '53', '21');
INSERT INTO `sys_role_menu` VALUES ('1874', '53', '22');
INSERT INTO `sys_role_menu` VALUES ('2247', '63', '-1');
INSERT INTO `sys_role_menu` VALUES ('2251', '63', '87');
INSERT INTO `sys_role_menu` VALUES ('2255', '64', '87');
INSERT INTO `sys_role_menu` VALUES ('2262', '67', '48');
INSERT INTO `sys_role_menu` VALUES ('2264', '68', '87');
INSERT INTO `sys_role_menu` VALUES ('2268', '69', '87');
INSERT INTO `sys_role_menu` VALUES ('2274', '70', '87');
INSERT INTO `sys_role_menu` VALUES ('2277', '71', '87');
INSERT INTO `sys_role_menu` VALUES ('2278', '72', '59');
INSERT INTO `sys_role_menu` VALUES ('2279', '73', '48');
INSERT INTO `sys_role_menu` VALUES ('2281', '74', '87');
INSERT INTO `sys_role_menu` VALUES ('2283', '75', '87');
INSERT INTO `sys_role_menu` VALUES ('2287', '76', '87');
INSERT INTO `sys_role_menu` VALUES ('2293', '78', '87');
INSERT INTO `sys_role_menu` VALUES ('2294', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2295', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2296', '78', null);
INSERT INTO `sys_role_menu` VALUES ('2308', '80', '87');
INSERT INTO `sys_role_menu` VALUES ('2310', '80', '-1');
INSERT INTO `sys_role_menu` VALUES ('2328', '79', '72');
INSERT INTO `sys_role_menu` VALUES ('2329', '79', '48');
INSERT INTO `sys_role_menu` VALUES ('2330', '79', '77');
INSERT INTO `sys_role_menu` VALUES ('2334', '79', '87');
INSERT INTO `sys_role_menu` VALUES ('2337', '79', '-1');
INSERT INTO `sys_role_menu` VALUES ('2340', '77', '87');
INSERT INTO `sys_role_menu` VALUES ('2344', '77', '72');
INSERT INTO `sys_role_menu` VALUES ('2345', '77', '-1');
INSERT INTO `sys_role_menu` VALUES ('2346', '77', '77');
INSERT INTO `sys_role_menu` VALUES ('3664', '7', '120');
INSERT INTO `sys_role_menu` VALUES ('3665', '7', '119');
INSERT INTO `sys_role_menu` VALUES ('3666', '7', '118');
INSERT INTO `sys_role_menu` VALUES ('3667', '7', '117');
INSERT INTO `sys_role_menu` VALUES ('3668', '7', '115');
INSERT INTO `sys_role_menu` VALUES ('3669', '7', '114');
INSERT INTO `sys_role_menu` VALUES ('3708', '4', '125');
INSERT INTO `sys_role_menu` VALUES ('3709', '4', '128');
INSERT INTO `sys_role_menu` VALUES ('3710', '4', '127');
INSERT INTO `sys_role_menu` VALUES ('3711', '4', '121');
INSERT INTO `sys_role_menu` VALUES ('3712', '4', '124');
INSERT INTO `sys_role_menu` VALUES ('3713', '4', '123');
INSERT INTO `sys_role_menu` VALUES ('3714', '4', '122');
INSERT INTO `sys_role_menu` VALUES ('3715', '4', '107');
INSERT INTO `sys_role_menu` VALUES ('3716', '4', '113');
INSERT INTO `sys_role_menu` VALUES ('3717', '4', '111');
INSERT INTO `sys_role_menu` VALUES ('3718', '4', '110');
INSERT INTO `sys_role_menu` VALUES ('3719', '4', '109');
INSERT INTO `sys_role_menu` VALUES ('3720', '4', '108');
INSERT INTO `sys_role_menu` VALUES ('3721', '3', '108');
INSERT INTO `sys_role_menu` VALUES ('3722', '3', '107');
INSERT INTO `sys_role_menu` VALUES ('3723', '2', '125');
INSERT INTO `sys_role_menu` VALUES ('3724', '2', '128');
INSERT INTO `sys_role_menu` VALUES ('3725', '2', '127');
INSERT INTO `sys_role_menu` VALUES ('3762', '1', '125');
INSERT INTO `sys_role_menu` VALUES ('3763', '1', '128');
INSERT INTO `sys_role_menu` VALUES ('3764', '1', '127');
INSERT INTO `sys_role_menu` VALUES ('3765', '1', '121');
INSERT INTO `sys_role_menu` VALUES ('3766', '1', '124');
INSERT INTO `sys_role_menu` VALUES ('3767', '1', '123');
INSERT INTO `sys_role_menu` VALUES ('3768', '1', '122');
INSERT INTO `sys_role_menu` VALUES ('3769', '1', '114');
INSERT INTO `sys_role_menu` VALUES ('3770', '1', '126');
INSERT INTO `sys_role_menu` VALUES ('3771', '1', '120');
INSERT INTO `sys_role_menu` VALUES ('3772', '1', '119');
INSERT INTO `sys_role_menu` VALUES ('3773', '1', '118');
INSERT INTO `sys_role_menu` VALUES ('3774', '1', '117');
INSERT INTO `sys_role_menu` VALUES ('3775', '1', '116');
INSERT INTO `sys_role_menu` VALUES ('3776', '1', '115');
INSERT INTO `sys_role_menu` VALUES ('3777', '1', '107');
INSERT INTO `sys_role_menu` VALUES ('3778', '1', '113');
INSERT INTO `sys_role_menu` VALUES ('3779', '1', '111');
INSERT INTO `sys_role_menu` VALUES ('3780', '1', '110');
INSERT INTO `sys_role_menu` VALUES ('3781', '1', '109');
INSERT INTO `sys_role_menu` VALUES ('3782', '1', '108');
INSERT INTO `sys_role_menu` VALUES ('3783', '1', '3');
INSERT INTO `sys_role_menu` VALUES ('3784', '1', '7');
INSERT INTO `sys_role_menu` VALUES ('3785', '1', '56');
INSERT INTO `sys_role_menu` VALUES ('3786', '1', '55');
INSERT INTO `sys_role_menu` VALUES ('3787', '1', '15');
INSERT INTO `sys_role_menu` VALUES ('3788', '1', '6');
INSERT INTO `sys_role_menu` VALUES ('3789', '1', '26');
INSERT INTO `sys_role_menu` VALUES ('3790', '1', '25');
INSERT INTO `sys_role_menu` VALUES ('3791', '1', '14');
INSERT INTO `sys_role_menu` VALUES ('3792', '1', '13');
INSERT INTO `sys_role_menu` VALUES ('3793', '1', '12');
INSERT INTO `sys_role_menu` VALUES ('3794', '1', '2');
INSERT INTO `sys_role_menu` VALUES ('3795', '1', '77');
INSERT INTO `sys_role_menu` VALUES ('3796', '1', '22');
INSERT INTO `sys_role_menu` VALUES ('3797', '1', '21');
INSERT INTO `sys_role_menu` VALUES ('3798', '1', '20');
INSERT INTO `sys_role_menu` VALUES ('3799', '5', '125');
INSERT INTO `sys_role_menu` VALUES ('3800', '5', '128');
INSERT INTO `sys_role_menu` VALUES ('3801', '5', '127');
INSERT INTO `sys_role_menu` VALUES ('3802', '5', '121');
INSERT INTO `sys_role_menu` VALUES ('3803', '5', '124');
INSERT INTO `sys_role_menu` VALUES ('3804', '5', '123');
INSERT INTO `sys_role_menu` VALUES ('3805', '5', '122');
INSERT INTO `sys_role_menu` VALUES ('3806', '5', '126');
INSERT INTO `sys_role_menu` VALUES ('3807', '5', '118');
INSERT INTO `sys_role_menu` VALUES ('3808', '5', '117');
INSERT INTO `sys_role_menu` VALUES ('3809', '5', '116');
INSERT INTO `sys_role_menu` VALUES ('3810', '5', '107');
INSERT INTO `sys_role_menu` VALUES ('3811', '5', '113');
INSERT INTO `sys_role_menu` VALUES ('3812', '5', '111');
INSERT INTO `sys_role_menu` VALUES ('3813', '5', '110');
INSERT INTO `sys_role_menu` VALUES ('3814', '5', '109');
INSERT INTO `sys_role_menu` VALUES ('3815', '5', '108');
INSERT INTO `sys_role_menu` VALUES ('3816', '5', '114');
INSERT INTO `sys_role_menu` VALUES ('3817', '6', '125');
INSERT INTO `sys_role_menu` VALUES ('3818', '6', '128');
INSERT INTO `sys_role_menu` VALUES ('3819', '6', '127');
INSERT INTO `sys_role_menu` VALUES ('3820', '6', '121');
INSERT INTO `sys_role_menu` VALUES ('3821', '6', '124');
INSERT INTO `sys_role_menu` VALUES ('3822', '6', '123');
INSERT INTO `sys_role_menu` VALUES ('3823', '6', '122');
INSERT INTO `sys_role_menu` VALUES ('3824', '6', '126');
INSERT INTO `sys_role_menu` VALUES ('3825', '6', '118');
INSERT INTO `sys_role_menu` VALUES ('3826', '6', '117');
INSERT INTO `sys_role_menu` VALUES ('3827', '6', '116');
INSERT INTO `sys_role_menu` VALUES ('3828', '6', '107');
INSERT INTO `sys_role_menu` VALUES ('3829', '6', '113');
INSERT INTO `sys_role_menu` VALUES ('3830', '6', '111');
INSERT INTO `sys_role_menu` VALUES ('3831', '6', '110');
INSERT INTO `sys_role_menu` VALUES ('3832', '6', '109');
INSERT INTO `sys_role_menu` VALUES ('3833', '6', '108');
INSERT INTO `sys_role_menu` VALUES ('3834', '6', '114');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `dept_id` bigint(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(100) DEFAULT NULL COMMENT '手机号',
  `status` tinyint(255) DEFAULT NULL COMMENT '状态 0:禁用，1:正常',
  `user_id_create` bigint(255) DEFAULT NULL COMMENT '创建用户id',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `sex` bigint(32) DEFAULT NULL COMMENT '性别',
  `birth` datetime DEFAULT NULL COMMENT '出身日期',
  `img` varchar(200) DEFAULT NULL,
  `live_address` varchar(500) DEFAULT NULL COMMENT '现居住地',
  `hobby` varchar(255) DEFAULT NULL COMMENT '爱好',
  `province` varchar(255) DEFAULT NULL COMMENT '省份',
  `city` varchar(255) DEFAULT NULL COMMENT '所在城市',
  `district` varchar(255) DEFAULT NULL COMMENT '所在地区',
  `is_msg` int(1) DEFAULT '0' COMMENT '是否接收消息',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '超级管理员', '48899be1123519cd15ea8f7a177de4e7', '1', '945601578@qq.com', '17699999999', '1', '1', '2017-08-15 21:40:39', '2017-08-15 21:41:00', '96', '2017-12-12 00:00:00', 'http://localhost:8001/files/image/5e4601e759b947c389adc599c7b877ff.jpg', 'ccc', '软件211班', '北京市', '北京市市辖区', '东城区', '1');
INSERT INTO `sys_user` VALUES ('2', 'xyld', '张院长', 'a12459788d4059207fc834d6e0cf0929', null, '', null, null, null, null, null, null, '2021-12-29 00:00:00', 'http://localhost:8001/files/image/b97d84eb2b244e4a87908abcf9fbeed9.jpg', null, null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('3', 'jwc', '教务处', '42cbb05c6af771c329023131f438e65d', null, '', null, null, null, null, null, null, '2021-12-30 00:00:00', 'http://localhost:8001/files/image/cdc6475d93434cac9a008b2cc923de56.jpg', null, null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('4', 'krjs', '张老师', '4cc7d19292ddcf209915e2a69c8a3df2', null, '', null, null, null, null, null, '1', null, 'http://localhost:8001/files/image/66d6bdcc6d864d44ba4266824157ca84.jpg', null, null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('5', 'bzr', '班主任', '3f0820d19aeab8613ccd424093eb6a1a', null, '', null, null, null, null, null, '1', null, 'http://localhost:8001/files/image/485e7dae0dca4904bb2b00b56b323692.jpg', null, null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('6', 'fdy', '辅导员', '9cd640ac436d8009d676ca85a16d75fc', null, '', null, null, null, null, null, '0', null, 'http://localhost:8001/files/image/72db9280a1c0480b86d3f0d0e87c5906.jpg', null, null, null, null, null, '0');
INSERT INTO `sys_user` VALUES ('7', 'st001', '张同学', 'fce8d983df9b1327eff857324d372dc7', null, '', null, null, null, null, null, '1', null, 'http://localhost:8001/files/image/e3b805449b7b427da3864d8e3c2638bd.jpg', null, null, null, null, null, '1');
INSERT INTO `sys_user` VALUES ('8', 'st002', '李同学', 'cd59840b1ec43f6dae28c5eaff5504f3', '2', '123@163.com', '18823232323', '0', '1', null, null, '1', '1970-01-01 00:00:00', null, null, '软件212班', null, null, null, '0');
INSERT INTO `sys_user` VALUES ('9', 'st003', '李同学', '39f7ba827042169e49549e57c0d99ffa', '1', '123@163.com', '18823232323', '0', '1', null, null, '1', '1970-01-01 00:00:00', null, null, '软件211班', null, null, null, '0');
INSERT INTO `sys_user` VALUES ('10', '张了个三', '张了个三', 'dea3b0edfc734c3715eb2cbe46a01a61', '1', '', null, '0', null, null, null, null, '2022-03-08 00:00:00', 'http://10.0.0.10:8001/files/image/7c3c8007d111449ab1dad9e6767825fb.jpg', null, '软件211班', null, null, null, '0');
INSERT INTO `sys_user` VALUES ('12', '理了个死', '理了个死', 'dacc1641e588d581a4e48168842e7bdf', '1', null, null, '0', '1', null, null, '0', '1970-01-01 08:00:45', null, null, null, null, null, null, '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=216 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户与角色对应关系';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('73', '30', '48');
INSERT INTO `sys_user_role` VALUES ('74', '30', '49');
INSERT INTO `sys_user_role` VALUES ('75', '30', '50');
INSERT INTO `sys_user_role` VALUES ('76', '31', '48');
INSERT INTO `sys_user_role` VALUES ('77', '31', '49');
INSERT INTO `sys_user_role` VALUES ('78', '31', '52');
INSERT INTO `sys_user_role` VALUES ('79', '32', '48');
INSERT INTO `sys_user_role` VALUES ('80', '32', '49');
INSERT INTO `sys_user_role` VALUES ('81', '32', '50');
INSERT INTO `sys_user_role` VALUES ('82', '32', '51');
INSERT INTO `sys_user_role` VALUES ('83', '32', '52');
INSERT INTO `sys_user_role` VALUES ('84', '33', '38');
INSERT INTO `sys_user_role` VALUES ('85', '33', '49');
INSERT INTO `sys_user_role` VALUES ('86', '33', '52');
INSERT INTO `sys_user_role` VALUES ('87', '34', '50');
INSERT INTO `sys_user_role` VALUES ('88', '34', '51');
INSERT INTO `sys_user_role` VALUES ('89', '34', '52');
INSERT INTO `sys_user_role` VALUES ('124', null, '48');
INSERT INTO `sys_user_role` VALUES ('127', '123', '48');
INSERT INTO `sys_user_role` VALUES ('132', '36', '48');
INSERT INTO `sys_user_role` VALUES ('151', '136', '1');
INSERT INTO `sys_user_role` VALUES ('152', '135', '1');
INSERT INTO `sys_user_role` VALUES ('153', '134', '1');
INSERT INTO `sys_user_role` VALUES ('154', '134', '48');
INSERT INTO `sys_user_role` VALUES ('155', '134', '56');
INSERT INTO `sys_user_role` VALUES ('158', '131', '48');
INSERT INTO `sys_user_role` VALUES ('159', '131', '1');
INSERT INTO `sys_user_role` VALUES ('160', '130', '1');
INSERT INTO `sys_user_role` VALUES ('164', '124', '56');
INSERT INTO `sys_user_role` VALUES ('165', '124', '48');
INSERT INTO `sys_user_role` VALUES ('168', '156', '1');
INSERT INTO `sys_user_role` VALUES ('169', '157', '56');
INSERT INTO `sys_user_role` VALUES ('193', '2', '2');
INSERT INTO `sys_user_role` VALUES ('194', '3', '4');
INSERT INTO `sys_user_role` VALUES ('202', '7', '7');
INSERT INTO `sys_user_role` VALUES ('204', '5', '5');
INSERT INTO `sys_user_role` VALUES ('205', '6', '6');
INSERT INTO `sys_user_role` VALUES ('206', '4', '3');
INSERT INTO `sys_user_role` VALUES ('207', '9', '7');
INSERT INTO `sys_user_role` VALUES ('208', '8', '7');
INSERT INTO `sys_user_role` VALUES ('211', '1', '1');
INSERT INTO `sys_user_role` VALUES ('212', '1', '7');
INSERT INTO `sys_user_role` VALUES ('215', '12', '7');

-- ----------------------------
-- Table structure for t_banji
-- ----------------------------
DROP TABLE IF EXISTS `t_banji`;
CREATE TABLE `t_banji` (
  `banji_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `xueqi` varchar(50) NOT NULL COMMENT '学期',
  `xueyuan` varchar(50) NOT NULL COMMENT '学院',
  `banji_name` varchar(50) NOT NULL COMMENT '班级',
  `banzhuren_id` int(11) NOT NULL COMMENT '班主任id',
  `banzhuren_name` varchar(50) NOT NULL COMMENT '班主任',
  `fudaoyuan_id` int(10) DEFAULT NULL COMMENT '辅导员id',
  `fudaoyuan_name` varchar(255) DEFAULT NULL COMMENT '辅导员',
  PRIMARY KEY (`banji_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='班级';

-- ----------------------------
-- Records of t_banji
-- ----------------------------
INSERT INTO `t_banji` VALUES ('1', '2021年--第一学期', '计算机学院', '软件211班', '5', '班主任', '6', '辅导员');
INSERT INTO `t_banji` VALUES ('2', '2021年---第一学期', '计算机学院', '软件212班', '5', '班主任', '6', '辅导员');
INSERT INTO `t_banji` VALUES ('3', '2021年--第一学期', '计算机学院', '软件214班', '5', '班主任', '6', '辅导员');

-- ----------------------------
-- Table structure for t_bili
-- ----------------------------
DROP TABLE IF EXISTS `t_bili`;
CREATE TABLE `t_bili` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `deyu` float(3,3) DEFAULT NULL COMMENT '德育',
  `xueye` float(3,3) DEFAULT '0.000' COMMENT '学业',
  `wenti` float(3,3) DEFAULT NULL COMMENT '文体',
  `qita` float(3,3) DEFAULT NULL COMMENT '其他',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='成绩比例';

-- ----------------------------
-- Records of t_bili
-- ----------------------------
INSERT INTO `t_bili` VALUES ('1', '0.200', '0.500', '0.200', '0.100');

-- ----------------------------
-- Table structure for t_email
-- ----------------------------
DROP TABLE IF EXISTS `t_email`;
CREATE TABLE `t_email` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `sid` varchar(255) NOT NULL COMMENT 'SID',
  `out_time` bigint(20) DEFAULT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='邮件';

-- ----------------------------
-- Records of t_email
-- ----------------------------

-- ----------------------------
-- Table structure for t_gonggao
-- ----------------------------
DROP TABLE IF EXISTS `t_gonggao`;
CREATE TABLE `t_gonggao` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `msg` varchar(500) DEFAULT NULL COMMENT '公告内容',
  `files` varchar(500) DEFAULT NULL COMMENT '公告附件',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='公告';

-- ----------------------------
-- Records of t_gonggao
-- ----------------------------
INSERT INTO `t_gonggao` VALUES ('1', '公告测试', '/files/image/9bc0e4cec91847308e2afc4d34e35304.docx', '2022-01-27 13:57:53');
INSERT INTO `t_gonggao` VALUES ('2', '测试2', '/files/image/4f0957a876b346d1b53137d1bad0caac.doc', null);
INSERT INTO `t_gonggao` VALUES ('3', '测试3', '', '2022-03-08 14:54:19');

-- ----------------------------
-- Table structure for t_huodong
-- ----------------------------
DROP TABLE IF EXISTS `t_huodong`;
CREATE TABLE `t_huodong` (
  `huodong_id` int(10) NOT NULL AUTO_INCREMENT,
  `huodong_name` varchar(255) NOT NULL COMMENT '活动名称',
  `huodong_leibie` int(11) DEFAULT NULL COMMENT '活动类别',
  `huodong_desc` varchar(255) DEFAULT NULL COMMENT '活动内容',
  `huodong_place` varchar(255) DEFAULT NULL COMMENT '活动地点',
  `huodong_producer` varchar(255) NOT NULL COMMENT '活动发布人',
  `huodong_fen` double(3,1) NOT NULL COMMENT '活动分值',
  `huodong_zhengming` varchar(255) DEFAULT NULL COMMENT '活动证明',
  `huodong_time` varchar(100) DEFAULT NULL COMMENT '活动时间',
  PRIMARY KEY (`huodong_id`),
  KEY `huodongleibie` (`huodong_leibie`),
  CONSTRAINT `huodongleibie` FOREIGN KEY (`huodong_leibie`) REFERENCES `t_huodong_leibie` (`huodongleibie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COMMENT='活动';

-- ----------------------------
-- Records of t_huodong
-- ----------------------------
INSERT INTO `t_huodong` VALUES ('10', '学业1', '2', '1', '1', '超级管理员', '10.0', null, '2022-03-09');
INSERT INTO `t_huodong` VALUES ('11', '德育1', '1', '1', '1', '超级管理员', '21.0', null, '2022-03-31');
INSERT INTO `t_huodong` VALUES ('12', '文体1', '3', '文体', '文体', '超级管理员', '54.0', null, '2022-03-16');
INSERT INTO `t_huodong` VALUES ('21', '学业2', '2', '1', '1', '超级管理员', '1.0', null, '2022-03-01');
INSERT INTO `t_huodong` VALUES ('22', '德育2', '1', '1', '1', '超级管理员', '1.0', null, '2022-03-01');

-- ----------------------------
-- Table structure for t_huodong_canjia
-- ----------------------------
DROP TABLE IF EXISTS `t_huodong_canjia`;
CREATE TABLE `t_huodong_canjia` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `student_id` int(11) NOT NULL COMMENT '学生id',
  `huodong_id` int(11) DEFAULT NULL COMMENT '活动id',
  `canjia_zhengming` varchar(255) DEFAULT NULL COMMENT '活动证明',
  `canjia_status` int(1) DEFAULT '0' COMMENT '参加状态',
  `fen` float(10,0) DEFAULT '0' COMMENT '分值',
  `huodong_name` varchar(255) DEFAULT NULL COMMENT '活动主题',
  `huodong_content` varchar(255) DEFAULT NULL COMMENT '活动内容',
  `huodong_leibie` varchar(255) DEFAULT NULL COMMENT '活动类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COMMENT='活动参与';

-- ----------------------------
-- Records of t_huodong_canjia
-- ----------------------------
INSERT INTO `t_huodong_canjia` VALUES ('13', '1', '3', null, '1', '20', '测试', '1', '德育');
INSERT INTO `t_huodong_canjia` VALUES ('14', '1', '1', null, '1', '20', '德育活动测试1', '德育活动测试1德育活动测试1', '德育');
INSERT INTO `t_huodong_canjia` VALUES ('15', '1', null, '', '0', '2', 'test', '江雪 唐代柳宗元 千山鸟飞绝， 万径人踪灭。 孤舟蓑笠翁， 独钓寒江雪。', 'test');
INSERT INTO `t_huodong_canjia` VALUES ('16', '1', null, '/files/image/ea8d9424b57b4c28bd0f6eb340f92de2.jfif', '0', '1', '1', '江雪 唐代柳宗元 千山鸟飞绝， 万径人踪灭。 孤舟蓑笠翁， 独钓寒江雪。', '1');
INSERT INTO `t_huodong_canjia` VALUES ('17', '1', '4', null, '1', '15', '请问请问', '请问请问', '文体');
INSERT INTO `t_huodong_canjia` VALUES ('18', '1', null, '/files/image/0f4cfc01bd274f1192171fbdf7c6d4b9.jfif', '0', '0', 'tttt', '江雪 唐代柳宗元 千山鸟飞绝， 万径人踪灭。 孤舟蓑笠翁， 独钓寒江雪。', '3');
INSERT INTO `t_huodong_canjia` VALUES ('19', '1', '10', null, '2', '10', '学业1', '1', '学业');
INSERT INTO `t_huodong_canjia` VALUES ('20', '9', '11', null, '0', '21', '德育1', '1', '德育');
INSERT INTO `t_huodong_canjia` VALUES ('21', '7', '10', null, '0', '10', '学业1', '1', '学业');

-- ----------------------------
-- Table structure for t_huodong_leibie
-- ----------------------------
DROP TABLE IF EXISTS `t_huodong_leibie`;
CREATE TABLE `t_huodong_leibie` (
  `huodongleibie_id` int(10) NOT NULL AUTO_INCREMENT,
  `huodongleibie_name` varchar(50) DEFAULT NULL COMMENT '活动类别',
  `huodongleibie_fen` float(5,1) DEFAULT '0.0' COMMENT '分值',
  `bili` float(5,2) DEFAULT '0.00' COMMENT '比例',
  PRIMARY KEY (`huodongleibie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='活动类别';

-- ----------------------------
-- Records of t_huodong_leibie
-- ----------------------------
INSERT INTO `t_huodong_leibie` VALUES ('1', '德育', '20.0', '0.20');
INSERT INTO `t_huodong_leibie` VALUES ('2', '学业', '10.0', '0.50');
INSERT INTO `t_huodong_leibie` VALUES ('3', '文体', '15.0', '0.20');
INSERT INTO `t_huodong_leibie` VALUES ('4', '其他', '5.0', '0.10');

-- ----------------------------
-- Table structure for t_kecheng
-- ----------------------------
DROP TABLE IF EXISTS `t_kecheng`;
CREATE TABLE `t_kecheng` (
  `kecheng_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `kecheng_name` varchar(50) NOT NULL COMMENT '课程',
  `laoshi_id` int(10) NOT NULL COMMENT '教师id',
  `laoshi_name` varchar(50) DEFAULT NULL COMMENT '教师',
  `xueqi` varchar(255) DEFAULT NULL COMMENT '学期',
  `xueyuan` varchar(255) DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`kecheng_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='课程';

-- ----------------------------
-- Records of t_kecheng
-- ----------------------------
INSERT INTO `t_kecheng` VALUES ('1', '计算机原理', '4', '张老师', '2021年---第一学期', '计算机学院');
INSERT INTO `t_kecheng` VALUES ('2', '英语', '5', '班主任', '2021年--第一学期', '外国语学院');
INSERT INTO `t_kecheng` VALUES ('3', '课程', '5', '班主任', '2021年--第一学期', '计算机学院');

-- ----------------------------
-- Table structure for t_kecheng_chengji
-- ----------------------------
DROP TABLE IF EXISTS `t_kecheng_chengji`;
CREATE TABLE `t_kecheng_chengji` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `kecheng_id` int(10) NOT NULL COMMENT '课程id',
  `kecheng_name` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `xuesheng_id` int(11) NOT NULL COMMENT '学生id',
  `xuesheng_name` varchar(255) DEFAULT NULL COMMENT '学生',
  `kecheng_chengji` double(10,1) DEFAULT NULL COMMENT '课程成绩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='课程成绩';

-- ----------------------------
-- Records of t_kecheng_chengji
-- ----------------------------

-- ----------------------------
-- Table structure for t_msg
-- ----------------------------
DROP TABLE IF EXISTS `t_msg`;
CREATE TABLE `t_msg` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` varchar(255) DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `status` tinyint(2) DEFAULT '0' COMMENT '状态',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=169 DEFAULT CHARSET=utf8mb4 COMMENT='消息';

-- ----------------------------
-- Records of t_msg
-- ----------------------------
INSERT INTO `t_msg` VALUES ('166', '您感兴趣的活动已发布:《学业2》', '1', null, '0', '2022-03-09 15:03:24');
INSERT INTO `t_msg` VALUES ('167', '您感兴趣的活动已发布:《学业2》', '7', null, '0', '2022-03-09 15:03:24');
INSERT INTO `t_msg` VALUES ('168', '您感兴趣的活动已发布:《德育2》', '1', null, '0', '2022-03-09 15:03:50');

-- ----------------------------
-- Table structure for t_user_setting
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `leibie` varchar(255) DEFAULT NULL COMMENT '类别',
  `is_msg` int(1) DEFAULT '0' COMMENT '接收消息',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户设置';

-- ----------------------------
-- Records of t_user_setting
-- ----------------------------

-- ----------------------------
-- Table structure for t_xueqi
-- ----------------------------
DROP TABLE IF EXISTS `t_xueqi`;
CREATE TABLE `t_xueqi` (
  `xueqi` varchar(20) NOT NULL COMMENT '学期',
  PRIMARY KEY (`xueqi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学期';

-- ----------------------------
-- Records of t_xueqi
-- ----------------------------
INSERT INTO `t_xueqi` VALUES ('2021年--第一学期');
INSERT INTO `t_xueqi` VALUES ('2021年--第二学期');

-- ----------------------------
-- Table structure for t_xueyuan
-- ----------------------------
DROP TABLE IF EXISTS `t_xueyuan`;
CREATE TABLE `t_xueyuan` (
  `xueyuan_id` int(10) NOT NULL COMMENT 'id',
  `xueyuan_name` varchar(20) NOT NULL COMMENT '学院',
  `xueyuan_lingdao` varchar(50) NOT NULL COMMENT '学院领导',
  `xueyuan_lingdao_id` int(10) NOT NULL COMMENT '学院领导id',
  PRIMARY KEY (`xueyuan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学院';

-- ----------------------------
-- Records of t_xueyuan
-- ----------------------------
INSERT INTO `t_xueyuan` VALUES ('1', '计算机学院', '计算机学院领导', '1');
INSERT INTO `t_xueyuan` VALUES ('2', '外国语学院', '外国语学院领导', '2');

-- ----------------------------
-- Table structure for t_zongce_chengji
-- ----------------------------
DROP TABLE IF EXISTS `t_zongce_chengji`;
CREATE TABLE `t_zongce_chengji` (
  `zongce_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `xueqi` varchar(255) DEFAULT NULL COMMENT '学期',
  `xueyuan` varchar(255) DEFAULT NULL COMMENT '学院',
  `banji_id` int(10) DEFAULT NULL COMMENT '班级id',
  `banji_name` varchar(255) DEFAULT NULL COMMENT '班级',
  `xuesheng_id` int(10) DEFAULT NULL COMMENT '学生id',
  `xuesheng_name` varchar(255) DEFAULT NULL COMMENT '学生',
  `deyu_chengji` double(10,1) DEFAULT NULL COMMENT '德育成绩',
  `xueye_chengji` double(10,1) DEFAULT NULL COMMENT '学业成绩',
  `wenti_chengji` double(10,1) DEFAULT NULL COMMENT '文体成绩',
  `zongce_chengji` double(10,1) DEFAULT NULL COMMENT '综测成绩',
  `yiyi_status` tinyint(2) DEFAULT '0' COMMENT '异议状态',
  `yiyi_desc` varchar(255) DEFAULT NULL COMMENT '异议内容',
  PRIMARY KEY (`zongce_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='综测成绩';

-- ----------------------------
-- Records of t_zongce_chengji
-- ----------------------------
INSERT INTO `t_zongce_chengji` VALUES ('1', '2021年--第一学期', null, '1', '软件211班', '1', '超级管理员', '20.0', '30.0', '37.0', '26.4', '3', '123123');
INSERT INTO `t_zongce_chengji` VALUES ('2', '2021年--第一学期', null, '2', '软件212班', '2', '的都得', '500.0', '400.0', '300.0', '4.0', '4', null);
