/*
 Navicat Premium Dump SQL

 Source Server         : LocalMySQL84
 Source Server Type    : MySQL
 Source Server Version : 80400 (8.4.0)
 Source Host           : localhost:3306
 Source Schema         : cloud_product

 Target Server Type    : MySQL
 Target Server Version : 80400 (8.4.0)
 File Encoding         : 65001

 Date: 01/11/2024 01:08:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_detail
-- ----------------------------
DROP TABLE IF EXISTS `product_detail`;
CREATE TABLE `product_detail`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '产品id',
  `product_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '产品名称',
  `product_price` bigint NOT NULL COMMENT '产品价格',
  `state` tinyint NULL DEFAULT 0 COMMENT '产品状态 0-有效 1-下架',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10011 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '产品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_detail
-- ----------------------------
INSERT INTO `product_detail` VALUES (1001, 'T恤', 101, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1002, '短袖', 30, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1003, '短裤', 44, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1004, '卫⾐', 58, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1005, '⻢甲', 98, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1006, '⽻绒服', 101, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1007, '冲锋⾐', 30, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1008, '袜⼦', 44, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (1009, '鞋⼦', 58, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');
INSERT INTO `product_detail` VALUES (10010, '⽑⾐', 98, 0, '2024-10-31 13:22:42', '2024-10-31 13:22:42');

SET FOREIGN_KEY_CHECKS = 1;
