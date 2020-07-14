/*
Navicat MySQL Data Transfer

Source Server         : zh
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : zshop

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2020-07-14 17:46:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_cart
-- ----------------------------
DROP TABLE IF EXISTS `t_cart`;
CREATE TABLE `t_cart` (
  `id` int(20) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `customer_name` varchar(255) default NULL,
  `price` double(20,0) default NULL,
  `info` varchar(255) default NULL,
  `image` varchar(255) default NULL,
  `size` varchar(255) default NULL,
  `success` int(55) default NULL,
  `mounty` int(55) default NULL,
  `date` datetime default NULL,
  `address` varchar(155) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cart
-- ----------------------------
INSERT INTO `t_cart` VALUES ('1', '褂子2', null, '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xxl', '0', '5', null, null);
INSERT INTO `t_cart` VALUES ('2', '鞋', null, '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', 'l', '0', '2', null, null);
INSERT INTO `t_cart` VALUES ('3', '鞋', null, '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', 'l', '0', '5', null, null);
INSERT INTO `t_cart` VALUES ('4', '鞋', null, '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', 'l', '0', '5', null, null);
INSERT INTO `t_cart` VALUES ('5', '褂子2', null, '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xxl', '0', '5', null, null);
INSERT INTO `t_cart` VALUES ('6', '褂子2', null, '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xxl', '0', '6', null, null);
INSERT INTO `t_cart` VALUES ('14', '褂子2', '邹华', '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xxl', '0', '5', null, '商丘勒马，姓名邹华，电话15639736562');
INSERT INTO `t_cart` VALUES ('15', '褂子2', '邹华', '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xxl', '0', '2', null, '商丘勒马，姓名邹华，电话15639736562');
INSERT INTO `t_cart` VALUES ('16', '鞋', '邹华', '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', 'xl', '0', '2', null, '商丘勒马，姓名邹华，电话15639736562');
INSERT INTO `t_cart` VALUES ('17', '鞋', '邹华', '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', 'xl', '0', '1', null, '商丘勒马，姓名邹华，电话15639736562');
INSERT INTO `t_cart` VALUES ('18', '褂子2', '邹华', '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', '-1', '0', null, null, '商丘勒马，姓名邹华，电话15639736562');
INSERT INTO `t_cart` VALUES ('19', '褂子2', '邹华', '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', 'xl', '0', '1', null, '商丘勒马，姓名邹华，电话15639736562');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  `login_name` varchar(20) NOT NULL,
  `password` varchar(50) default NULL,
  `phone` varchar(20) default NULL,
  `address` varchar(30) default NULL,
  `is_valid` int(11) default NULL,
  `regist_date` datetime default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `login_name` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '邹华', '邹华', '123', '15639736562', '商丘勒马，姓名邹华，电话15639736562', '1', '2020-04-16 00:00:00');
INSERT INTO `t_customer` VALUES ('2', '王华', '王华', '123', '15639736562', '商丘', '1', '2020-04-17 00:00:00');
INSERT INTO `t_customer` VALUES ('3', '李华', '李华', '123', '15639736562', '商丘', '1', '2020-04-17 00:00:00');
INSERT INTO `t_customer` VALUES ('4', '张华', '张华', '123', '15639736562', '商丘', '1', '2020-04-17 00:00:00');
INSERT INTO `t_customer` VALUES ('5', '吴华', '吴华', '123', '15639736562', '商丘', '1', '2020-04-17 00:00:00');
INSERT INTO `t_customer` VALUES ('6', '周华', '周华', '123', '15639736562', '商丘', '0', '2020-04-17 00:00:00');
INSERT INTO `t_customer` VALUES ('7', '12', '5', '123', '15514908069', '勒马', null, null);
INSERT INTO `t_customer` VALUES ('8', '55', '22', '123', null, null, null, null);
INSERT INTO `t_customer` VALUES ('9', '66', '45', '123', null, null, null, null);

-- ----------------------------
-- Table structure for t_item
-- ----------------------------
DROP TABLE IF EXISTS `t_item`;
CREATE TABLE `t_item` (
  `id` int(11) NOT NULL auto_increment,
  `product_id` int(11) default NULL,
  `num` int(11) default NULL,
  `price` double default NULL,
  `order_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `product_id` (`product_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `t_item_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `t_product` (`id`),
  CONSTRAINT `t_item_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `t_order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_item
-- ----------------------------

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL auto_increment,
  `no` varchar(300) default NULL,
  `customer_id` int(11) default NULL,
  `price` double default NULL,
  `create_date` datetime default NULL,
  `image` varchar(200) default NULL,
  `productName` varchar(255) default NULL,
  `productInfo` varchar(255) default NULL,
  PRIMARY KEY  (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `t_order_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `t_customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', null, null, null, '2020-05-09 14:37:36', null, null, null);
INSERT INTO `t_order` VALUES ('2', null, null, '19', '2020-05-09 15:29:35', null, null, null);

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(200) NOT NULL,
  `price` double default NULL,
  `info` varchar(200) default NULL,
  `image` varchar(200) default NULL,
  `product_type_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `product_type_id` (`product_type_id`),
  CONSTRAINT `t_product_ibfk_1` FOREIGN KEY (`product_type_id`) REFERENCES `t_product_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO `t_product` VALUES ('19', '褂子2', '754', '平时穿也不会显得夸张，很大方洋气 我已经自留了，还和小姐妹准备人手一件圣诞节穿着出去玩！ 经典的圆领，大气休闲，长袖设计，休闲舒适 宽松的版型，怕冷可以里面穿保暖衣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910213478.jpg', '5');
INSERT INTO `t_product` VALUES ('22', '鞋', '55', '   工厂自产自销质量保证,拍下有运费险不合适，不满意，不喜欢7天无理由退换！下单送钥匙扣小礼物，全场满1件-包邮，注明：小礼物(钥匙扣）', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910222313.jpg', '11');
INSERT INTO `t_product` VALUES ('23', '美女', '5555', ' 新款大毛领加绒加厚牛仔棉衣羊羔毛短外套 休闲 时尚 百搭', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020041521262296.jpg', '11');
INSERT INTO `t_product` VALUES ('24', '鞋子', '55', '这款棉马甲推荐给妹子们，立领的设计， 马甲款式，面料是比较好的羽绒棉， 上身软软的很舒服~单排扣金属衣门襟， 两个插袋设计，实用又比较保暖~ 经典百搭的颜色色，里面配卫衣或者毛衣，都灰常好看~', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910185058.jpg', '3');
INSERT INTO `t_product` VALUES ('25', '衣服', '56', '    颜色无色差，质感好，百搭 2017冬季新款小香风淑女韩东大门女装毛毛外套', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910191833.jpg', '16');
INSERT INTO `t_product` VALUES ('26', '褂子', '100', '    颜色无色差，质感好，百搭 2017冬季新款小香风淑女韩东大门女装毛毛外套', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020041610375546.jpg', '11');
INSERT INTO `t_product` VALUES ('27', '衣服2', '100', '    颜色无色差，质感好，百搭 2017冬季新款小香风淑女韩东大门女装毛毛外套', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/202005091022493.jpg', '3');
INSERT INTO `t_product` VALUES ('28', '衣服1', '80', '    杭产品质，质量OK 支持退换送运费险，购买无忧', 'D:\\idea\\ssm\\zshop\\zshop_parent\\zshop_backend_web\\src\\main\\webapp\\WEB-INF\\upload/2020050910193788.jpg', '3');

-- ----------------------------
-- Table structure for t_product_type
-- ----------------------------
DROP TABLE IF EXISTS `t_product_type`;
CREATE TABLE `t_product_type` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(200) NOT NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_product_type
-- ----------------------------
INSERT INTO `t_product_type` VALUES ('2', '食品', '0');
INSERT INTO `t_product_type` VALUES ('3', '衣服', '0');
INSERT INTO `t_product_type` VALUES ('4', '数码', '0');
INSERT INTO `t_product_type` VALUES ('5', '生活用品', '0');
INSERT INTO `t_product_type` VALUES ('7', '旅游', '0');
INSERT INTO `t_product_type` VALUES ('8', '运动', '0');
INSERT INTO `t_product_type` VALUES ('9', '电器', '0');
INSERT INTO `t_product_type` VALUES ('10', '家居', '0');
INSERT INTO `t_product_type` VALUES ('11', '配饰', '0');
INSERT INTO `t_product_type` VALUES ('12', '裤子', '0');
INSERT INTO `t_product_type` VALUES ('13', '包包', '0');
INSERT INTO `t_product_type` VALUES ('14', '鞋子', '0');
INSERT INTO `t_product_type` VALUES ('15', '内衣', '0');
INSERT INTO `t_product_type` VALUES ('16', '裙子', '1');
INSERT INTO `t_product_type` VALUES ('17', '杯子', '1');
INSERT INTO `t_product_type` VALUES ('18', 'aa', '0');
INSERT INTO `t_product_type` VALUES ('19', 'bb', '1');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL auto_increment,
  `role_name` varchar(50) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '商品专员');
INSERT INTO `t_role` VALUES ('2', '营销经理');
INSERT INTO `t_role` VALUES ('3', '超级管理员');

-- ----------------------------
-- Table structure for t_sysuser
-- ----------------------------
DROP TABLE IF EXISTS `t_sysuser`;
CREATE TABLE `t_sysuser` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `login_name` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  `phone` varchar(50) default NULL,
  `email` varchar(100) default NULL,
  `is_valid` int(11) default NULL,
  `create_date` datetime default NULL,
  `role_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `login_name` (`login_name`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `t_sysuser_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sysuser
-- ----------------------------
INSERT INTO `t_sysuser` VALUES ('1', 'admin', 'admin', '123', '13988888888', 'admin@itany.com', '1', '2020-04-12 16:33:19', '3');
INSERT INTO `t_sysuser` VALUES ('2', '汤姆', 'tom', '123', '13999999999', 'tom@itany.com', '1', '2020-04-12 16:33:19', '1');
INSERT INTO `t_sysuser` VALUES ('3', '邹华', '199723', '199723', '1551490806', '792579876@qq.com', '1', '2020-04-15 13:02:26', '3');
INSERT INTO `t_sysuser` VALUES ('4', 'aaa', '6666', '123', '1589693500', '89652@qq.com', '0', '2020-04-15 13:04:48', '2');
INSERT INTO `t_sysuser` VALUES ('5', 'scc', '8965', '123', '15896938022', '123456@qq.com', '1', '2020-04-15 13:05:20', '1');
INSERT INTO `t_sysuser` VALUES ('6', 'bbb', 'ordinary', '123', '155514908069', '1850642796@qq.com', '1', '2020-04-15 13:05:58', '2');
INSERT INTO `t_sysuser` VALUES ('7', 'bbb', '123', '123', '123456789', '452562685@qq.com', '1', '2020-04-15 14:46:16', '1');
INSERT INTO `t_sysuser` VALUES ('8', 'ddd', '9865', '123', '87956', '9878545@qq.com', '1', '2020-04-15 14:46:43', '1');
INSERT INTO `t_sysuser` VALUES ('9', 'eee', 'eee', '452', '4567852', '895665@qq.com', '1', '2020-04-15 14:47:27', '1');
INSERT INTO `t_sysuser` VALUES ('10', 'fff', 'fff', '456123', '874554@qq.com', '78566565@qq.com', '1', '2020-04-15 14:48:05', '1');
INSERT INTO `t_sysuser` VALUES ('11', 'ggg', 'ggg', '45215', '158685655', '84566@qq.com', '1', '2020-04-15 14:48:33', '1');
