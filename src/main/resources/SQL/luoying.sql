/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 8.0.17 : Database - luoying
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`luoying` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `luoying`;

/*Table structure for table `t_role_menu` */

DROP TABLE IF EXISTS `t_role_menu`;

CREATE TABLE `t_role_menu` (
  `role_id` int(10) NOT NULL COMMENT '角色id',
  `menu_id` int(10) NOT NULL COMMENT '菜单id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_role_menu` */

/*Table structure for table `t_user_role` */

DROP TABLE IF EXISTS `t_user_role`;

CREATE TABLE `t_user_role` (
  `user_id` int(10) NOT NULL COMMENT '用户id',
  `role` int(10) NOT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_user_role` */

/*Table structure for table `tb_commodity` */

DROP TABLE IF EXISTS `tb_commodity`;

CREATE TABLE `tb_commodity` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `com_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '商品名称',
  `image` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '商品封面图',
  `sale_number` int(10) DEFAULT NULL COMMENT '商品销售数量',
  `total` int(10) DEFAULT NULL COMMENT '商品库存',
  `com _type` int(10) DEFAULT NULL COMMENT '商品类型',
  `date_time` datetime DEFAULT NULL COMMENT '上架时间',
  `com_state` int(1) DEFAULT NULL COMMENT '商品状态；1上架，2下架',
  `price` decimal(10,0) DEFAULT NULL COMMENT '商品价格',
  `describe` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '商品描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品表';

/*Data for the table `tb_commodity` */

/*Table structure for table `tb_commodity_image` */

DROP TABLE IF EXISTS `tb_commodity_image`;

CREATE TABLE `tb_commodity_image` (
  `com_id` int(10) NOT NULL COMMENT '商品id',
  `image_path` varchar(255) DEFAULT NULL COMMENT '商品图片路径'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品图 表';

/*Data for the table `tb_commodity_image` */

/*Table structure for table `tb_menu` */

DROP TABLE IF EXISTS `tb_menu`;

CREATE TABLE `tb_menu` (
  `id` bigint(20) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL COMMENT '菜单名',
  `
parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
  `order_num` int(10) DEFAULT NULL COMMENT '显示顺序',
  `path` varchar(255) DEFAULT NULL COMMENT '路由路径',
  `menu_type` char(1) DEFAULT NULL,
  `perms` varchar(255) DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `state` char(1) DEFAULT NULL COMMENT '0禁用1可用'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_menu` */

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `id` bigint(20) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `role_key` varchar(255) DEFAULT NULL COMMENT '角色权限字符',
  `role_sort` int(10) DEFAULT NULL COMMENT '角色权限',
  `data_scope` char(1) DEFAULT NULL COMMENT '定数据权限 3：本部门数据权限 4：本部门及以下数据权限）',
  `state` char(1) DEFAULT NULL COMMENT '角色状态',
  `del_flag` char(1) DEFAULT NULL COMMENT '删除标志（0代表存在 1代表删除）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '更新人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_role` */

/*Table structure for table `tb_total` */

DROP TABLE IF EXISTS `tb_total`;

CREATE TABLE `tb_total` (
  `com_name` char(1) DEFAULT NULL COMMENT '商品名称',
  `sale_number` int(11) DEFAULT NULL COMMENT '销售数量',
  `total` int(11) DEFAULT NULL COMMENT '商品总数'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_total` */

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type` int(1) DEFAULT NULL COMMENT '用户类型，1表示商家，2普通用户，3管理员',
  `state` int(1) DEFAULT NULL COMMENT '用户状态；1可用，2禁用',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `sex` int(1) DEFAULT NULL COMMENT '性别；1男2女',
  `head` varchar(50) DEFAULT NULL COMMENT '用户头像',
  `is_delete` int(1) DEFAULT NULL COMMENT '用户是否有效；1有，2没有',
  `nick_name` varchar(25) DEFAULT NULL COMMENT '用户昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tb_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
