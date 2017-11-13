-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.17-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 mynote 的数据库结构
CREATE DATABASE IF NOT EXISTS `mynote` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mynote`;

-- 导出  表 mynote.note 结构
CREATE TABLE IF NOT EXISTS `note` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `text` text,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;

-- 正在导出表  mynote.note 的数据：~66 rows (大约)
/*!40000 ALTER TABLE `note` DISABLE KEYS */;
INSERT INTO `note` (`id`, `title`, `text`, `date`) VALUES
	(1, '111', 'aaa', '2017-11-10'),
	(2, '1110', 'aaa0', '2017-11-10'),
	(3, '1111', 'aaa1', '2017-11-10'),
	(4, '1112', 'aaa2', '2017-11-10'),
	(5, '1113', 'aaa3', '2017-11-10'),
	(6, '1114', 'aaa4', '2017-11-10'),
	(7, '1115', 'aaa5', '2017-11-10'),
	(8, '1116', 'aaa6', '2017-11-10'),
	(9, '1117', 'aaa7', '2017-11-10'),
	(10, '1118', 'aaa8', '2017-11-10'),
	(11, '1119', 'aaa9', '2017-11-10'),
	(12, '11110', 'aaa10', '2017-11-10'),
	(13, '11111', 'aaa11', '2017-11-10'),
	(14, '11112', 'aaa12', '2017-11-10'),
	(15, '11113', 'aaa13', '2017-11-10'),
	(16, '11114', 'aaa14', '2017-11-10'),
	(17, '11115', 'aaa15', '2017-11-10'),
	(18, '11116', 'aaa16', '2017-11-10'),
	(19, '11117', 'aaa17', '2017-11-10'),
	(20, '11118', 'aaa18', '2017-11-10'),
	(21, '11119', 'aaa19', '2017-11-10'),
	(22, '11120', 'aaa20', '2017-11-10'),
	(23, '11121', 'aaa21', '2017-11-10'),
	(24, '11122', 'aaa22', '2017-11-10'),
	(25, '11123', 'aaa23', '2017-11-10'),
	(26, '11124', 'aaa24', '2017-11-10'),
	(27, '11125', 'aaa25', '2017-11-10'),
	(28, '11126', 'aaa26', '2017-11-10'),
	(29, '11127', 'aaa27', '2017-11-10'),
	(30, '11128', 'aaa28', '2017-11-10'),
	(31, '11129', 'aaa29', '2017-11-10'),
	(32, '11130', 'aaa30', '2017-11-10'),
	(33, '11131', 'aaa31', '2017-11-10'),
	(34, '11132', 'aaa32', '2017-11-10'),
	(35, '11133', 'aaa33', '2017-11-10'),
	(36, '11134', 'aaa34', '2017-11-10'),
	(37, '11135', 'aaa35', '2017-11-10'),
	(38, '11136', 'aaa36', '2017-11-10'),
	(39, '11137', 'aaa37', '2017-11-10'),
	(40, '11138', 'aaa38', '2017-11-10'),
	(41, '11139', 'aaa39', '2017-11-10'),
	(42, '11140', 'aaa40', '2017-11-10'),
	(43, '11141', 'aaa41', '2017-11-10'),
	(44, '11142', 'aaa42', '2017-11-10'),
	(45, '11143', 'aaa43', '2017-11-10'),
	(46, '11144', 'aaa44', '2017-11-10'),
	(47, '11145', 'aaa45', '2017-11-10'),
	(48, '11146', 'aaa46', '2017-11-10'),
	(49, '11147', 'aaa47', '2017-11-10'),
	(50, '11148', 'aaa48', '2017-11-10'),
	(51, '11149', 'aaa49', '2017-11-10'),
	(52, 'atesta', '<aaaaaaaaa>aaaaa', '2017-11-10'),
	(53, 'test', '<p>test<br></p>', '2017-11-13'),
	(54, 'test', '<p><font color="#c24f4a">te<span></span>st</font><br></p>', '2017-11-13'),
	(55, '啊啊啊', '<p>多福多壽犯得上<br></p>', '2017-11-13'),
	(56, '啊啊啊', '<p>多福多壽<br></p>', '2017-11-13'),
	(57, '啊啊啊', '<p>多福多壽<br></p>', '2017-11-13'),
	(58, '啊啊啊', '<p>多福多壽<br></p>', '2017-11-13'),
	(59, '啊啊啊', '<p><font color="#7b5ba1">殺殺殺</font><br></p>', '2017-11-13'),
	(60, '实打实', '<p>大师傅但是<br></p>', '2017-11-13'),
	(61, 'aaa', '<p>aaa<br></p>', '2017-11-13'),
	(62, 'aaa', '<p>aaa<br></p>', '2017-11-13'),
	(63, 'aaaaaaa', '<p><span style="background-color: rgb(28, 72, 127);"><font color="#8baa4a"><b>aaaaaaaaaaaa</b></font></span><br></p>', '2017-11-13'),
	(64, 'asdasd', '<p><span style="background-color: rgb(249, 150, 59);"><i><b>asssssss<font color="#7b5ba1">ssssssssss</font>sssssss</b></i></span><br></p>', '2017-11-13'),
	(65, 'dsadasd', '<p>dasdsa<span><span><span><span></span></span></span></span></p>', '2017-11-13'),
	(66, '图片', '<p>图片测试<img src="https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1510567964164&amp;di=36cf9e72a2cadef49ad9adbc112290fd&amp;imgtype=0&amp;src=http%3A%2F%2Foldblog.voc.com.cn%2Fsp1%2Flimeizhi%2F175812439213%2F1203502179913_439213.jpg" style="max-width:100%;"></p>', '2017-11-13');
/*!40000 ALTER TABLE `note` ENABLE KEYS */;

-- 导出  表 mynote.note_pic 结构
CREATE TABLE IF NOT EXISTS `note_pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note_id` int(11) NOT NULL,
  `pic_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  mynote.note_pic 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `note_pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `note_pic` ENABLE KEYS */;

-- 导出  表 mynote.pic 结构
CREATE TABLE IF NOT EXISTS `pic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pic_url` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  mynote.pic 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `pic` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
