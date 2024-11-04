/*
 Navicat Premium Dump SQL

 Source Server         : LocalMySQL84
 Source Server Type    : MySQL
 Source Server Version : 80400 (8.4.0)
 Source Host           : localhost:3306
 Source Schema         : cloud_order

 Target Server Type    : MySQL
 Target Server Version : 80400 (8.4.0)
 File Encoding         : 65001

 Date: 01/11/2024 01:08:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint NOT NULL COMMENT '⽤⼾ID',
  `product_id` bigint NULL DEFAULT NULL COMMENT '产品id',
  `num` int NULL DEFAULT 0 COMMENT '下单数量',
  `price` bigint NOT NULL COMMENT '实付款',
  `delete_flag` tinyint NULL DEFAULT 0,
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES (1, 2001, 1001, 1, 99, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');
INSERT INTO `order_detail` VALUES (2, 2002, 1002, 1, 30, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');
INSERT INTO `order_detail` VALUES (3, 2001, 1003, 1, 40, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');
INSERT INTO `order_detail` VALUES (4, 2003, 1004, 3, 58, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');
INSERT INTO `order_detail` VALUES (5, 2004, 1005, 7, 85, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');
INSERT INTO `order_detail` VALUES (6, 2005, 1006, 7, 94, 0, '2024-10-31 13:21:57', '2024-10-31 13:21:57');

SET FOREIGN_KEY_CHECKS = 1;
