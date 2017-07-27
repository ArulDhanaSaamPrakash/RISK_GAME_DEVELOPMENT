-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: RISK_GAME_DB
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `CHAT`
--

DROP TABLE IF EXISTS `CHAT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CHAT` (
  `chat_id` int(11) NOT NULL,
  `game_player_id` varchar(10) DEFAULT NULL,
  `message` varchar(300) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`chat_id`),
  KEY `game_player_id` (`game_player_id`),
  CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`game_player_id`) REFERENCES `GAME_PLAYER` (`game_player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CHAT`
--

LOCK TABLES `CHAT` WRITE;
/*!40000 ALTER TABLE `CHAT` DISABLE KEYS */;
/*!40000 ALTER TABLE `CHAT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `COMPANIES`
--

DROP TABLE IF EXISTS `COMPANIES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `COMPANIES` (
  `company_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `COMPANIES`
--

LOCK TABLES `COMPANIES` WRITE;
/*!40000 ALTER TABLE `COMPANIES` DISABLE KEYS */;
INSERT INTO `COMPANIES` VALUES (1,'Random Organization','You are the best employee selected to work on RISK project');
/*!40000 ALTER TABLE `COMPANIES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONFIG_PHASE_MAPPING`
--

DROP TABLE IF EXISTS `CONFIG_PHASE_MAPPING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONFIG_PHASE_MAPPING` (
  `config_phase_mapping_id` varchar(10) NOT NULL,
  `game_config_id` varchar(10) DEFAULT NULL,
  `phase_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`config_phase_mapping_id`),
  KEY `phase_id` (`phase_id`),
  KEY `game_config_id` (`game_config_id`),
  CONSTRAINT `config_phase_mapping_ibfk_1` FOREIGN KEY (`phase_id`) REFERENCES `PHASES` (`phase_id`),
  CONSTRAINT `config_phase_mapping_ibfk_2` FOREIGN KEY (`game_config_id`) REFERENCES `GAME_CONFIGURATIONS` (`game_config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONFIG_PHASE_MAPPING`
--

LOCK TABLES `CONFIG_PHASE_MAPPING` WRITE;
/*!40000 ALTER TABLE `CONFIG_PHASE_MAPPING` DISABLE KEYS */;
INSERT INTO `CONFIG_PHASE_MAPPING` VALUES ('CPM1','GC1','PH1'),('CPM2','GC1','PH2'),('CPM3','GC1','PH3'),('CPM4','GC1','PH4'),('CPM5','GC1','PH5'),('CPM6','GC1','PH6');
/*!40000 ALTER TABLE `CONFIG_PHASE_MAPPING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONFIG_PHASE_PROJECTSTEPS_MAPPING`
--

DROP TABLE IF EXISTS `CONFIG_PHASE_PROJECTSTEPS_MAPPING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONFIG_PHASE_PROJECTSTEPS_MAPPING` (
  `config_project_step_mapping_id` varchar(10) NOT NULL,
  `config_phase_mapping_id` varchar(10) DEFAULT NULL,
  `project_step_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`config_project_step_mapping_id`),
  KEY `config_phase_mapping_id` (`config_phase_mapping_id`),
  KEY `project_step_id` (`project_step_id`),
  CONSTRAINT `config_phase_projectsteps_mapping_ibfk_1` FOREIGN KEY (`config_phase_mapping_id`) REFERENCES `CONFIG_PHASE_MAPPING` (`config_phase_mapping_id`),
  CONSTRAINT `config_phase_projectsteps_mapping_ibfk_2` FOREIGN KEY (`project_step_id`) REFERENCES `PROJECT_STEPS` (`project_step_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONFIG_PHASE_PROJECTSTEPS_MAPPING`
--

LOCK TABLES `CONFIG_PHASE_PROJECTSTEPS_MAPPING` WRITE;
/*!40000 ALTER TABLE `CONFIG_PHASE_PROJECTSTEPS_MAPPING` DISABLE KEYS */;
INSERT INTO `CONFIG_PHASE_PROJECTSTEPS_MAPPING` VALUES ('CPSM1','CPM2','P1'),('CPSM10','CPM2','P10'),('CPSM11','CPM2','P11'),('CPSM12','CPM2','P12'),('CPSM13','CPM2','P13'),('CPSM14','CPM2','P14'),('CPSM15','CPM1','P15'),('CPSM16','CPM1','P16'),('CPSM17','CPM1','P17'),('CPSM18','CPM1','P18'),('CPSM19','CPM1','P19'),('CPSM2','CPM2','P2'),('CPSM20','CPM1','P20'),('CPSM21','CPM1','P21'),('CPSM22','CPM1','P22'),('CPSM23','CPM1','P23'),('CPSM24','CPM1','P24'),('CPSM25','CPM4','P25'),('CPSM26','CPM4','P26'),('CPSM27','CPM4','P27'),('CPSM28','CPM4','P28'),('CPSM29','CPM4','P29'),('CPSM3','CPM2','P3'),('CPSM30','CPM4','P30'),('CPSM31','CPM4','P31'),('CPSM32','CPM4','P32'),('CPSM33','CPM4','P33'),('CPSM34','CPM4','P34'),('CPSM35','CPM4','P35'),('CPSM36','CPM4','P36'),('CPSM37','CPM5','P37'),('CPSM38','CPM5','P38'),('CPSM39','CPM5','P39'),('CPSM4','CPM2','P4'),('CPSM40','CPM5','P40'),('CPSM41','CPM5','P41'),('CPSM42','CPM5','P42'),('CPSM43','CPM5','P43'),('CPSM44','CPM5','P44'),('CPSM45','CPM5','P45'),('CPSM46','CPM5','P46'),('CPSM47','CPM5','P47'),('CPSM48','CPM5','P48'),('CPSM49','CPM5','P49'),('CPSM5','CPM2','P5'),('CPSM50','CPM5','P50'),('CPSM51','CPM5','P51'),('CPSM52','CPM5','P52'),('CPSM53','CPM3','P53'),('CPSM54','CPM3','P54'),('CPSM55','CPM3','P55'),('CPSM56','CPM3','P56'),('CPSM57','CPM3','P57'),('CPSM58','CPM3','P58'),('CPSM59','CPM3','P59'),('CPSM6','CPM2','P6'),('CPSM60','CPM3','P60'),('CPSM61','CPM3','P61'),('CPSM62','CPM3','P62'),('CPSM63','CPM3','P63'),('CPSM64','CPM3','P64'),('CPSM65','CPM3','P65'),('CPSM66','CPM3','P66'),('CPSM7','CPM2','P7'),('CPSM8','CPM2','P8'),('CPSM9','CPM2','P9');
/*!40000 ALTER TABLE `CONFIG_PHASE_PROJECTSTEPS_MAPPING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONFIG_RISK_MAPPING`
--

DROP TABLE IF EXISTS `CONFIG_RISK_MAPPING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONFIG_RISK_MAPPING` (
  `config_risk_mapping_id` varchar(10) NOT NULL,
  `game_config_id` varchar(10) DEFAULT NULL,
  `risk_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`config_risk_mapping_id`),
  KEY `risk_id` (`risk_id`),
  KEY `game_config_id` (`game_config_id`),
  CONSTRAINT `config_risk_mapping_ibfk_1` FOREIGN KEY (`risk_id`) REFERENCES `RISKS` (`risk_id`),
  CONSTRAINT `config_risk_mapping_ibfk_2` FOREIGN KEY (`game_config_id`) REFERENCES `GAME_CONFIGURATIONS` (`game_config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONFIG_RISK_MAPPING`
--

LOCK TABLES `CONFIG_RISK_MAPPING` WRITE;
/*!40000 ALTER TABLE `CONFIG_RISK_MAPPING` DISABLE KEYS */;
INSERT INTO `CONFIG_RISK_MAPPING` VALUES ('CRM1','GC1','R1'),('CRM10','GC1','R10'),('CRM11','GC1','R11'),('CRM12','GC1','R12'),('CRM13','GC1','R13'),('CRM14','GC1','R14'),('CRM15','GC1','R15'),('CRM16','GC1','R16'),('CRM17','GC1','R17'),('CRM18','GC1','R18'),('CRM19','GC1','R19'),('CRM2','GC1','R2'),('CRM20','GC1','R20'),('CRM21','GC1','R21'),('CRM22','GC1','R22'),('CRM23','GC1','R23'),('CRM24','GC1','R24'),('CRM25','GC1','R25'),('CRM26','GC1','R26'),('CRM27','GC1','R27'),('CRM28','GC1','R28'),('CRM29','GC1','R29'),('CRM3','GC1','R3'),('CRM30','GC1','R30'),('CRM31','GC1','R31'),('CRM32','GC1','R32'),('CRM33','GC1','R33'),('CRM34','GC1','R34'),('CRM35','GC1','R35'),('CRM4','GC1','R4'),('CRM5','GC1','R5'),('CRM6','GC1','R6'),('CRM7','GC1','R7'),('CRM8','GC1','R8'),('CRM9','GC1','R9');
/*!40000 ALTER TABLE `CONFIG_RISK_MAPPING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONFIG_RISK_MITIGATION_MAPPING`
--

DROP TABLE IF EXISTS `CONFIG_RISK_MITIGATION_MAPPING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONFIG_RISK_MITIGATION_MAPPING` (
  `config_riks_mitigation_id` varchar(10) NOT NULL,
  `config_risk_mapping_id` varchar(10) DEFAULT NULL,
  `project_step_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`config_riks_mitigation_id`),
  KEY `config_risk_mapping_id` (`config_risk_mapping_id`),
  KEY `project_step_id` (`project_step_id`),
  CONSTRAINT `config_risk_mitigation_mapping_ibfk_1` FOREIGN KEY (`config_risk_mapping_id`) REFERENCES `CONFIG_RISK_MAPPING` (`config_risk_mapping_id`),
  CONSTRAINT `fk_crmap` FOREIGN KEY (`project_step_id`) REFERENCES `CONFIG_PHASE_PROJECTSTEPS_MAPPING` (`config_project_step_mapping_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONFIG_RISK_MITIGATION_MAPPING`
--

LOCK TABLES `CONFIG_RISK_MITIGATION_MAPPING` WRITE;
/*!40000 ALTER TABLE `CONFIG_RISK_MITIGATION_MAPPING` DISABLE KEYS */;
INSERT INTO `CONFIG_RISK_MITIGATION_MAPPING` VALUES ('CRMIT1','CRM1','CPSM6'),('CRMIT10','CRM3','CPSM6'),('CRMIT100','CRM20','CPSM58'),('CRMIT101','CRM20','CPSM29'),('CRMIT102','CRM21','CPSM13'),('CRMIT103','CRM21','CPSM14'),('CRMIT104','CRM21','CPSM9'),('CRMIT105','CRM21','CPSM62'),('CRMIT106','CRM21','CPSM48'),('CRMIT107','CRM21','CPSM23'),('CRMIT108','CRM22','CPSM23'),('CRMIT109','CRM22','CPSM28'),('CRMIT11','CRM3','CPSM5'),('CRMIT110','CRM22','CPSM56'),('CRMIT111','CRM23','CPSM33'),('CRMIT112','CRM23','CPSM17'),('CRMIT113','CRM23','CPSM45'),('CRMIT114','CRM23','CPSM52'),('CRMIT115','CRM24','CPSM1'),('CRMIT116','CRM24','CPSM8'),('CRMIT117','CRM24','CPSM12'),('CRMIT118','CRM24','CPSM61'),('CRMIT119','CRM24','CPSM38'),('CRMIT12','CRM3','CPSM23'),('CRMIT120','CRM25','CPSM13'),('CRMIT121','CRM25','CPSM14'),('CRMIT122','CRM25','CPSM36'),('CRMIT123','CRM25','CPSM46'),('CRMIT124','CRM25','CPSM59'),('CRMIT125','CRM25','CPSM9'),('CRMIT126','CRM26','CPSM17'),('CRMIT127','CRM26','CPSM33'),('CRMIT128','CRM26','CPSM38'),('CRMIT129','CRM26','CPSM52'),('CRMIT13','CRM3','CPSM12'),('CRMIT130','CRM26','CPSM44'),('CRMIT131','CRM27','CPSM23'),('CRMIT132','CRM27','CPSM15'),('CRMIT133','CRM27','CPSM9'),('CRMIT134','CRM27','CPSM46'),('CRMIT135','CRM27','CPSM14'),('CRMIT136','CRM27','CPSM48'),('CRMIT137','CRM28','CPSM34'),('CRMIT138','CRM28','CPSM23'),('CRMIT139','CRM28','CPSM29'),('CRMIT14','CRM3','CPSM24'),('CRMIT140','CRM29','CPSM24'),('CRMIT141','CRM29','CPSM23'),('CRMIT142','CRM29','CPSM13'),('CRMIT143','CRM29','CPSM44'),('CRMIT144','CRM29','CPSM9'),('CRMIT145','CRM30','CPSM4'),('CRMIT146','CRM30','CPSM28'),('CRMIT147','CRM30','CPSM29'),('CRMIT148','CRM30','CPSM33'),('CRMIT149','CRM31','CPSM33'),('CRMIT15','CRM4','CPSM6'),('CRMIT150','CRM31','CPSM17'),('CRMIT151','CRM31','CPSM45'),('CRMIT152','CRM31','CPSM52'),('CRMIT153','CRM32','CPSM16'),('CRMIT154','CRM32','CPSM17'),('CRMIT155','CRM32','CPSM18'),('CRMIT156','CRM32','CPSM19'),('CRMIT157','CRM32','CPSM20'),('CRMIT158','CRM32','CPSM23'),('CRMIT159','CRM32','CPSM29'),('CRMIT16','CRM4','CPSM7'),('CRMIT160','CRM32','CPSM34'),('CRMIT161','CRM33','CPSM33'),('CRMIT162','CRM33','CPSM38'),('CRMIT163','CRM33','CPSM48'),('CRMIT164','CRM33','CPSM40'),('CRMIT165','CRM33','CPSM44'),('CRMIT166','CRM34','CPSM24'),('CRMIT167','CRM34','CPSM23'),('CRMIT168','CRM34','CPSM5'),('CRMIT169','CRM34','CPSM15'),('CRMIT17','CRM4','CPSM14'),('CRMIT170','CRM34','CPSM21'),('CRMIT171','CRM35','CPSM33'),('CRMIT172','CRM35','CPSM38'),('CRMIT173','CRM35','CPSM44'),('CRMIT174','CRM35','CPSM52'),('CRMIT175','CRM35','CPSM31'),('CRMIT176','CRM35','CPSM32'),('CRMIT18','CRM4','CPSM11'),('CRMIT19','CRM4','CPSM13'),('CRMIT2','CRM1','CPSM7'),('CRMIT20','CRM5','CPSM24'),('CRMIT21','CRM5','CPSM4'),('CRMIT22','CRM5','CPSM56'),('CRMIT23','CRM5','CPSM28'),('CRMIT24','CRM6','CPSM24'),('CRMIT25','CRM6','CPSM14'),('CRMIT26','CRM6','CPSM56'),('CRMIT27','CRM6','CPSM35'),('CRMIT28','CRM6','CPSM36'),('CRMIT29','CRM7','CPSM1'),('CRMIT3','CRM1','CPSM14'),('CRMIT30','CRM7','CPSM12'),('CRMIT31','CRM7','CPSM53'),('CRMIT32','CRM7','CPSM61'),('CRMIT33','CRM7','CPSM65'),('CRMIT34','CRM8','CPSM24'),('CRMIT35','CRM8','CPSM7'),('CRMIT36','CRM8','CPSM13'),('CRMIT37','CRM8','CPSM36'),('CRMIT38','CRM8','CPSM44'),('CRMIT39','CRM9','CPSM24'),('CRMIT4','CRM1','CPSM11'),('CRMIT40','CRM9','CPSM6'),('CRMIT41','CRM9','CPSM12'),('CRMIT42','CRM9','CPSM13'),('CRMIT43','CRM9','CPSM14'),('CRMIT44','CRM10','CPSM24'),('CRMIT45','CRM10','CPSM1'),('CRMIT46','CRM10','CPSM12'),('CRMIT47','CRM10','CPSM57'),('CRMIT48','CRM10','CPSM61'),('CRMIT49','CRM11','CPSM18'),('CRMIT5','CRM1','CPSM13'),('CRMIT50','CRM11','CPSM17'),('CRMIT51','CRM11','CPSM33'),('CRMIT52','CRM11','CPSM44'),('CRMIT53','CRM12','CPSM2'),('CRMIT54','CRM12','CPSM3'),('CRMIT55','CRM12','CPSM9'),('CRMIT56','CRM12','CPSM8'),('CRMIT57','CRM12','CPSM6'),('CRMIT58','CRM13','CPSM5'),('CRMIT59','CRM13','CPSM23'),('CRMIT6','CRM2','CPSM54'),('CRMIT60','CRM13','CPSM21'),('CRMIT61','CRM13','CPSM16'),('CRMIT62','CRM13','CPSM18'),('CRMIT63','CRM14','CPSM23'),('CRMIT64','CRM14','CPSM33'),('CRMIT65','CRM14','CPSM3'),('CRMIT66','CRM14','CPSM29'),('CRMIT67','CRM14','CPSM24'),('CRMIT68','CRM14','CPSM21'),('CRMIT69','CRM15','CPSM21'),('CRMIT7','CRM2','CPSM58'),('CRMIT70','CRM15','CPSM16'),('CRMIT71','CRM15','CPSM17'),('CRMIT72','CRM15','CPSM18'),('CRMIT73','CRM15','CPSM19'),('CRMIT74','CRM15','CPSM20'),('CRMIT75','CRM15','CPSM23'),('CRMIT76','CRM15','CPSM15'),('CRMIT77','CRM16','CPSM23'),('CRMIT78','CRM16','CPSM22'),('CRMIT79','CRM16','CPSM15'),('CRMIT8','CRM2','CPSM27'),('CRMIT80','CRM16','CPSM21'),('CRMIT81','CRM17','CPSM13'),('CRMIT82','CRM17','CPSM14'),('CRMIT83','CRM17','CPSM59'),('CRMIT84','CRM17','CPSM66'),('CRMIT85','CRM17','CPSM36'),('CRMIT86','CRM17','CPSM46'),('CRMIT87','CRM18','CPSM24'),('CRMIT88','CRM18','CPSM6'),('CRMIT89','CRM18','CPSM13'),('CRMIT9','CRM2','CPSM29'),('CRMIT90','CRM18','CPSM9'),('CRMIT91','CRM18','CPSM8'),('CRMIT92','CRM19','CPSM58'),('CRMIT93','CRM19','CPSM27'),('CRMIT94','CRM19','CPSM29'),('CRMIT95','CRM19','CPSM31'),('CRMIT96','CRM19','CPSM32'),('CRMIT97','CRM20','CPSM38'),('CRMIT98','CRM20','CPSM49'),('CRMIT99','CRM20','CPSM51');
/*!40000 ALTER TABLE `CONFIG_RISK_MITIGATION_MAPPING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME`
--

DROP TABLE IF EXISTS `GAME`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME` (
  `game_id` varchar(50) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `isTimeBound` tinyint(1) DEFAULT NULL,
  `time_for_each_move` int(11) DEFAULT NULL,
  `steps_for_each_player` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `host` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`game_id`),
  KEY `company_id` (`company_id`),
  KEY `product_id` (`product_id`),
  KEY `host_id_check` (`host`),
  CONSTRAINT `game_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `COMPANIES` (`company_id`),
  CONSTRAINT `game_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `PRODUCTS` (`product_id`),
  CONSTRAINT `host_id_check` FOREIGN KEY (`host`) REFERENCES `USERS` (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME`
--

LOCK TABLES `GAME` WRITE;
/*!40000 ALTER TABLE `GAME` DISABLE KEYS */;
INSERT INTO `GAME` VALUES ('145637','2017-03-09 09:49:32','2017-03-09 09:50:09',1,1,1,2,5,'COMPLETE','droot@andrew.cmu.edu'),('983352','2017-03-09 09:42:25','2017-03-09 09:44:40',1,1,1,2,5,'COMPLETE','rosso@andrew.cmu.edu');
/*!40000 ALTER TABLE `GAME` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_CONFIGURATIONS`
--

DROP TABLE IF EXISTS `GAME_CONFIGURATIONS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_CONFIGURATIONS` (
  `game_config_id` varchar(10) NOT NULL,
  `methodology` varchar(40) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `initial_budget` int(11) DEFAULT NULL,
  `initial_resources` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  `capability_points` int(11) DEFAULT NULL,
  `loan_amount` int(11) DEFAULT NULL,
  `level2bonus` int(11) DEFAULT NULL,
  `level3bonus` int(11) DEFAULT NULL,
  PRIMARY KEY (`game_config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_CONFIGURATIONS`
--

LOCK TABLES `GAME_CONFIGURATIONS` WRITE;
/*!40000 ALTER TABLE `GAME_CONFIGURATIONS` DISABLE KEYS */;
INSERT INTO `GAME_CONFIGURATIONS` VALUES ('GC1','WAterfall','Start',65000,5,0,0,10000,100,120);
/*!40000 ALTER TABLE `GAME_CONFIGURATIONS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_MOVES_SNAPSHOT`
--

DROP TABLE IF EXISTS `GAME_MOVES_SNAPSHOT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_MOVES_SNAPSHOT` (
  `game_player_id` varchar(80) DEFAULT NULL,
  `turn_no` int(11) DEFAULT NULL,
  `budget` int(11) DEFAULT NULL,
  `personnel` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  `time_taken` int(11) DEFAULT NULL,
  `move_type` varchar(45) DEFAULT NULL,
  `move_status` tinyint(1) DEFAULT NULL,
  `skip_turn_status` tinyint(1) DEFAULT NULL,
  `project_step_id` varchar(10) DEFAULT NULL,
  `risk_id` varchar(10) DEFAULT NULL,
  `oops_id` varchar(10) DEFAULT NULL,
  `surprise_id` varchar(10) DEFAULT NULL,
  `oops_impact_id` varchar(10) DEFAULT NULL,
  `surprise_impact_id` varchar(10) DEFAULT NULL,
  `loan_amount` int(11) DEFAULT NULL,
  `isProduction` tinyint(1) DEFAULT NULL,
  `capability_points` int(11) DEFAULT NULL,
  KEY `game_player_id` (`game_player_id`),
  KEY `risk_id` (`risk_id`),
  KEY `oops_id` (`oops_id`),
  KEY `surprise_id` (`surprise_id`),
  KEY `oops_impact_id` (`oops_impact_id`),
  KEY `surprise_impact_id` (`surprise_impact_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_1` FOREIGN KEY (`game_player_id`) REFERENCES `GAME_PLAYER` (`game_player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_MOVES_SNAPSHOT`
--

LOCK TABLES `GAME_MOVES_SNAPSHOT` WRITE;
/*!40000 ALTER TABLE `GAME_MOVES_SNAPSHOT` DISABLE KEYS */;
INSERT INTO `GAME_MOVES_SNAPSHOT` VALUES ('rosso-983352',0,65000,5,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10000,NULL,0),('droot-983352',0,65000,5,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10000,NULL,0),('rosso-983352',1,63500,3,10,3,'projectstep',1,0,'CPSM16',NULL,NULL,NULL,NULL,NULL,0,0,1),('droot-983352',1,63500,3,10,3,'projectstep',1,0,'CPSM16',NULL,NULL,NULL,NULL,NULL,0,0,1),('rosso-983352',2,62000,1,20,3,'projectstep',1,0,'CPSM1',NULL,NULL,NULL,NULL,NULL,0,0,2),('droot-983352',2,62500,2,20,3,'projectstep',1,0,'CPSM2',NULL,NULL,NULL,NULL,NULL,0,0,2),('rosso-983352',3,61000,0,30,3,'projectstep',1,0,'CPSM2',NULL,NULL,NULL,NULL,NULL,0,0,3),('droot-983352',3,59500,2,20,3,'OOPS',1,0,'CPSM1',NULL,'OOPS1',NULL,NULL,NULL,0,0,2),('rosso-983352',4,59500,1,40,3,'projectstep',1,0,'CPSM53',NULL,NULL,NULL,NULL,NULL,0,0,4),('droot-983352',4,58000,2,30,3,'projectstep',1,0,'CPSM1',NULL,NULL,NULL,NULL,NULL,0,0,3),('rosso-983352',5,57400,3,40,3,'production',0,0,'null',NULL,NULL,NULL,NULL,NULL,0,1,4),('droot-983352',5,57400,3,30,3,'production',0,0,'null',NULL,NULL,NULL,NULL,NULL,0,1,3),('droot-145637',0,65000,5,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,10000,NULL,0),('droot-145637',1,63500,3,10,3,'projectstep',1,0,'CPSM16',NULL,NULL,NULL,NULL,NULL,0,0,1),('droot-145637',2,62000,1,20,3,'projectstep',1,0,'CPSM1',NULL,NULL,NULL,NULL,NULL,0,0,2),('droot-145637',3,60500,0,30,3,'projectstep',1,0,'CPSM53',NULL,NULL,NULL,NULL,NULL,0,0,3),('droot-145637',4,54200,2,30,3,'production',0,0,'null',NULL,NULL,NULL,NULL,NULL,0,1,3),('droot-145637',5,49200,4,30,3,'production',0,0,'null',NULL,NULL,NULL,NULL,NULL,0,1,3);
/*!40000 ALTER TABLE `GAME_MOVES_SNAPSHOT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_ORDERING`
--

DROP TABLE IF EXISTS `GAME_ORDERING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_ORDERING` (
  `game_player_id` varchar(80) DEFAULT NULL,
  `order_number` int(11) DEFAULT NULL,
  `game_id` varchar(50) DEFAULT NULL,
  KEY `game_player_id` (`game_player_id`),
  KEY `game_id_fkey` (`game_id`),
  CONSTRAINT `game_id_fkey` FOREIGN KEY (`game_id`) REFERENCES `GAME` (`game_id`),
  CONSTRAINT `game_ordering_ibfk_1` FOREIGN KEY (`game_player_id`) REFERENCES `GAME_PLAYER` (`game_player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_ORDERING`
--

LOCK TABLES `GAME_ORDERING` WRITE;
/*!40000 ALTER TABLE `GAME_ORDERING` DISABLE KEYS */;
INSERT INTO `GAME_ORDERING` VALUES ('rosso-983352',1,'983352'),('droot-983352',2,'983352'),('droot-145637',1,'145637');
/*!40000 ALTER TABLE `GAME_ORDERING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_PLAYER`
--

DROP TABLE IF EXISTS `GAME_PLAYER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_PLAYER` (
  `game_player_id` varchar(80) NOT NULL,
  `game_id` varchar(50) DEFAULT NULL,
  `player_id` varchar(80) DEFAULT NULL,
  `isObserver` tinyint(1) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `game_complete` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`game_player_id`),
  KEY `game_id` (`game_id`),
  KEY `player_id` (`player_id`),
  CONSTRAINT `game_player_ibfk_1` FOREIGN KEY (`game_id`) REFERENCES `GAME` (`game_id`),
  CONSTRAINT `game_player_ibfk_2` FOREIGN KEY (`player_id`) REFERENCES `USERS` (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_PLAYER`
--

LOCK TABLES `GAME_PLAYER` WRITE;
/*!40000 ALTER TABLE `GAME_PLAYER` DISABLE KEYS */;
INSERT INTO `GAME_PLAYER` VALUES ('droot-145637','145637','droot@andrew.cmu.edu',0,NULL,NULL,1),('droot-983352','983352','droot@andrew.cmu.edu',0,NULL,NULL,1),('rosso-983352','983352','rosso@andrew.cmu.edu',0,NULL,NULL,1);
/*!40000 ALTER TABLE `GAME_PLAYER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_PLAYER_PROJECT_STEP_STATUS`
--

DROP TABLE IF EXISTS `GAME_PLAYER_PROJECT_STEP_STATUS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_PLAYER_PROJECT_STEP_STATUS` (
  `game_player_id` varchar(100) DEFAULT NULL,
  `config_project_step_mapping_id` varchar(100) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_PLAYER_PROJECT_STEP_STATUS`
--

LOCK TABLES `GAME_PLAYER_PROJECT_STEP_STATUS` WRITE;
/*!40000 ALTER TABLE `GAME_PLAYER_PROJECT_STEP_STATUS` DISABLE KEYS */;
INSERT INTO `GAME_PLAYER_PROJECT_STEP_STATUS` VALUES ('rosso-983352','CPSM15',0),('rosso-983352','CPSM16',1),('rosso-983352','CPSM17',0),('rosso-983352','CPSM18',0),('rosso-983352','CPSM19',0),('rosso-983352','CPSM20',0),('rosso-983352','CPSM21',0),('rosso-983352','CPSM22',0),('rosso-983352','CPSM23',0),('rosso-983352','CPSM24',0),('rosso-983352','CPSM1',1),('rosso-983352','CPSM10',0),('rosso-983352','CPSM11',0),('rosso-983352','CPSM12',0),('rosso-983352','CPSM13',0),('rosso-983352','CPSM14',0),('rosso-983352','CPSM2',1),('rosso-983352','CPSM3',0),('rosso-983352','CPSM4',0),('rosso-983352','CPSM5',0),('rosso-983352','CPSM6',0),('rosso-983352','CPSM7',0),('rosso-983352','CPSM8',0),('rosso-983352','CPSM9',0),('rosso-983352','CPSM53',1),('rosso-983352','CPSM54',0),('rosso-983352','CPSM55',0),('rosso-983352','CPSM56',0),('rosso-983352','CPSM57',0),('rosso-983352','CPSM58',0),('rosso-983352','CPSM59',0),('rosso-983352','CPSM60',0),('rosso-983352','CPSM61',0),('rosso-983352','CPSM62',0),('rosso-983352','CPSM63',0),('rosso-983352','CPSM64',0),('rosso-983352','CPSM65',0),('rosso-983352','CPSM66',0),('rosso-983352','CPSM25',0),('rosso-983352','CPSM26',0),('rosso-983352','CPSM27',0),('rosso-983352','CPSM28',0),('rosso-983352','CPSM29',0),('rosso-983352','CPSM30',0),('rosso-983352','CPSM31',0),('rosso-983352','CPSM32',0),('rosso-983352','CPSM33',0),('rosso-983352','CPSM34',0),('rosso-983352','CPSM35',0),('rosso-983352','CPSM36',0),('rosso-983352','CPSM37',0),('rosso-983352','CPSM38',0),('rosso-983352','CPSM39',0),('rosso-983352','CPSM40',0),('rosso-983352','CPSM41',0),('rosso-983352','CPSM42',0),('rosso-983352','CPSM43',0),('rosso-983352','CPSM44',0),('rosso-983352','CPSM45',0),('rosso-983352','CPSM46',0),('rosso-983352','CPSM47',0),('rosso-983352','CPSM48',0),('rosso-983352','CPSM49',0),('rosso-983352','CPSM50',0),('rosso-983352','CPSM51',0),('rosso-983352','CPSM52',0),('droot-983352','CPSM15',0),('droot-983352','CPSM16',1),('droot-983352','CPSM17',0),('droot-983352','CPSM18',0),('droot-983352','CPSM19',0),('droot-983352','CPSM20',0),('droot-983352','CPSM21',0),('droot-983352','CPSM22',0),('droot-983352','CPSM23',0),('droot-983352','CPSM24',0),('droot-983352','CPSM1',1),('droot-983352','CPSM10',0),('droot-983352','CPSM11',0),('droot-983352','CPSM12',0),('droot-983352','CPSM13',0),('droot-983352','CPSM14',0),('droot-983352','CPSM2',1),('droot-983352','CPSM3',0),('droot-983352','CPSM4',0),('droot-983352','CPSM5',0),('droot-983352','CPSM6',0),('droot-983352','CPSM7',0),('droot-983352','CPSM8',0),('droot-983352','CPSM9',0),('droot-983352','CPSM53',0),('droot-983352','CPSM54',0),('droot-983352','CPSM55',0),('droot-983352','CPSM56',0),('droot-983352','CPSM57',0),('droot-983352','CPSM58',0),('droot-983352','CPSM59',0),('droot-983352','CPSM60',0),('droot-983352','CPSM61',0),('droot-983352','CPSM62',0),('droot-983352','CPSM63',0),('droot-983352','CPSM64',0),('droot-983352','CPSM65',0),('droot-983352','CPSM66',0),('droot-983352','CPSM25',0),('droot-983352','CPSM26',0),('droot-983352','CPSM27',0),('droot-983352','CPSM28',0),('droot-983352','CPSM29',0),('droot-983352','CPSM30',0),('droot-983352','CPSM31',0),('droot-983352','CPSM32',0),('droot-983352','CPSM33',0),('droot-983352','CPSM34',0),('droot-983352','CPSM35',0),('droot-983352','CPSM36',0),('droot-983352','CPSM37',0),('droot-983352','CPSM38',0),('droot-983352','CPSM39',0),('droot-983352','CPSM40',0),('droot-983352','CPSM41',0),('droot-983352','CPSM42',0),('droot-983352','CPSM43',0),('droot-983352','CPSM44',0),('droot-983352','CPSM45',0),('droot-983352','CPSM46',0),('droot-983352','CPSM47',0),('droot-983352','CPSM48',0),('droot-983352','CPSM49',0),('droot-983352','CPSM50',0),('droot-983352','CPSM51',0),('droot-983352','CPSM52',0),('droot-145637','CPSM15',0),('droot-145637','CPSM16',1),('droot-145637','CPSM17',0),('droot-145637','CPSM18',0),('droot-145637','CPSM19',0),('droot-145637','CPSM20',0),('droot-145637','CPSM21',0),('droot-145637','CPSM22',0),('droot-145637','CPSM23',0),('droot-145637','CPSM24',0),('droot-145637','CPSM1',1),('droot-145637','CPSM10',0),('droot-145637','CPSM11',0),('droot-145637','CPSM12',0),('droot-145637','CPSM13',0),('droot-145637','CPSM14',0),('droot-145637','CPSM2',0),('droot-145637','CPSM3',0),('droot-145637','CPSM4',0),('droot-145637','CPSM5',0),('droot-145637','CPSM6',0),('droot-145637','CPSM7',0),('droot-145637','CPSM8',0),('droot-145637','CPSM9',0),('droot-145637','CPSM53',1),('droot-145637','CPSM54',0),('droot-145637','CPSM55',0),('droot-145637','CPSM56',0),('droot-145637','CPSM57',0),('droot-145637','CPSM58',0),('droot-145637','CPSM59',0),('droot-145637','CPSM60',0),('droot-145637','CPSM61',0),('droot-145637','CPSM62',0),('droot-145637','CPSM63',0),('droot-145637','CPSM64',0),('droot-145637','CPSM65',0),('droot-145637','CPSM66',0),('droot-145637','CPSM25',0),('droot-145637','CPSM26',0),('droot-145637','CPSM27',0),('droot-145637','CPSM28',0),('droot-145637','CPSM29',0),('droot-145637','CPSM30',0),('droot-145637','CPSM31',0),('droot-145637','CPSM32',0),('droot-145637','CPSM33',0),('droot-145637','CPSM34',0),('droot-145637','CPSM35',0),('droot-145637','CPSM36',0),('droot-145637','CPSM37',0),('droot-145637','CPSM38',0),('droot-145637','CPSM39',0),('droot-145637','CPSM40',0),('droot-145637','CPSM41',0),('droot-145637','CPSM42',0),('droot-145637','CPSM43',0),('droot-145637','CPSM44',0),('droot-145637','CPSM45',0),('droot-145637','CPSM46',0),('droot-145637','CPSM47',0),('droot-145637','CPSM48',0),('droot-145637','CPSM49',0),('droot-145637','CPSM50',0),('droot-145637','CPSM51',0),('droot-145637','CPSM52',0);
/*!40000 ALTER TABLE `GAME_PLAYER_PROJECT_STEP_STATUS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_PLAYER_RISK_STATUS`
--

DROP TABLE IF EXISTS `GAME_PLAYER_RISK_STATUS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_PLAYER_RISK_STATUS` (
  `game_player_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `risk_id` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_PLAYER_RISK_STATUS`
--

LOCK TABLES `GAME_PLAYER_RISK_STATUS` WRITE;
/*!40000 ALTER TABLE `GAME_PLAYER_RISK_STATUS` DISABLE KEYS */;
INSERT INTO `GAME_PLAYER_RISK_STATUS` VALUES ('rosso-983352','CRM35',0),('rosso-983352','CRM25',0),('rosso-983352','CRM10',0),('rosso-983352','CRM24',0),('rosso-983352','CRM8',0),('droot-983352','CRM35',0),('droot-983352','CRM3',0),('droot-983352','CRM26',0),('droot-983352','CRM16',0),('droot-983352','CRM32',0),('droot-145637','CRM21',0),('droot-145637','CRM1',0),('droot-145637','CRM32',0),('droot-145637','CRM26',0),('droot-145637','CRM35',0);
/*!40000 ALTER TABLE `GAME_PLAYER_RISK_STATUS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OOPS`
--

DROP TABLE IF EXISTS `OOPS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OOPS` (
  `oops_id` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `budget` int(11) DEFAULT NULL,
  `capability_points` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  `personnel` int(11) DEFAULT NULL,
  PRIMARY KEY (`oops_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OOPS`
--

LOCK TABLES `OOPS` WRITE;
/*!40000 ALTER TABLE `OOPS` DISABLE KEYS */;
INSERT INTO `OOPS` VALUES ('OOPS1',3000,0,0,0),('OOPS2',0,1,0,1),('OOPS3',0,0,0,2),('OOPS4',0,0,20,0);
/*!40000 ALTER TABLE `OOPS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PHASES`
--

DROP TABLE IF EXISTS `PHASES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PHASES` (
  `phase_id` varchar(10) NOT NULL,
  `phase_name` varchar(45) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`phase_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PHASES`
--

LOCK TABLES `PHASES` WRITE;
/*!40000 ALTER TABLE `PHASES` DISABLE KEYS */;
INSERT INTO `PHASES` VALUES ('PH1','PLANNING','Plan your project in this phase'),('PH2','REQUIREMENTS','Gather requirements in this phase'),('PH3','DESIGN','Design your solution in this phase'),('PH4','IMPLEMENTATION','Implement the solution in this phase'),('PH5','TESTING','Test the code'),('PH6','PRODUCTION','Deploy the product');
/*!40000 ALTER TABLE `PHASES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRODUCTS`
--

DROP TABLE IF EXISTS `PRODUCTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRODUCTS` (
  `product_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRODUCTS`
--

LOCK TABLES `PRODUCTS` WRITE;
/*!40000 ALTER TABLE `PRODUCTS` DISABLE KEYS */;
INSERT INTO `PRODUCTS` VALUES (1,'Secret Army Project','Get this done with your best effors');
/*!40000 ALTER TABLE `PRODUCTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PROJECT_STEPS`
--

DROP TABLE IF EXISTS `PROJECT_STEPS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PROJECT_STEPS` (
  `project_step_id` varchar(10) NOT NULL,
  `level` int(11) DEFAULT NULL,
  `pre_requisite` varchar(10) DEFAULT NULL,
  `project_step_name` varchar(100) DEFAULT NULL,
  `budget` int(11) DEFAULT NULL,
  `personnel` int(11) DEFAULT NULL,
  `capability_points` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  PRIMARY KEY (`project_step_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PROJECT_STEPS`
--

LOCK TABLES `PROJECT_STEPS` WRITE;
/*!40000 ALTER TABLE `PROJECT_STEPS` DISABLE KEYS */;
INSERT INTO `PROJECT_STEPS` VALUES ('P1',1,'','Identify Quality Attributes',1500,2,1,10),('P10',2,'','Internally Review Requirements',2000,3,2,20),('P11',2,'','Send Docs to Client For Feedback',500,1,2,20),('P12',3,'','Create an SRS',2000,3,3,30),('P13',3,'','Review Requirements with Client',1000,2,3,30),('P14',3,'','Request Client Sign Off',1500,1,3,30),('P15',1,'','Use Estimates to Adjust Plan',1000,2,1,10),('P16',1,'','Conduct Requirements Planning',1500,2,1,10),('P17',1,'','Conduct Testing Planning',1500,2,1,10),('P18',1,'','Conduct Implementation Planning',1500,2,1,10),('P19',1,'','Conduct Design Planning',1500,2,1,10),('P2',1,'','Identify Stakeholders',1000,1,1,10),('P20',1,'','Conduct Production Planning',1500,2,1,10),('P21',1,'','Track Progress vs plan',1000,1,1,10),('P22',1,'','Update Project plan',2000,2,1,10),('P23',1,'','Create Project Plan',2000,2,1,10),('P24',1,'','Define Project Goals',1000,3,1,10),('P25',1,'','Following a Coding Standard',1000,1,1,10),('P26',1,'','Work on Implementation',4000,4,1,10),('P27',1,'','Setup Development Environment',2000,2,1,10),('P28',1,'','Do some pair programming',1500,2,1,10),('P29',1,'','Create an implementation plan',2000,2,1,10),('P3',1,'','Create Requirements Elicitation Plan',1500,3,1,10),('P30',1,'','Estimate Project Size',2500,1,1,10),('P31',2,'','Conduct Formal Inspections',2000,3,2,20),('P32',2,'','Conduct Code Reviews',2000,3,2,20),('P33',2,'','Create Test Plan',1500,2,2,20),('P34',2,'','Use a Version Control System',2000,4,2,20),('P35',2,'','Establish Change Control Mechanisms',1500,2,2,20),('P36',3,'','Talk To Client about Project Progress',1000,1,3,30),('P37',3,'','Do some unit testing',2000,4,3,30),('P38',3,'','Write Test Cases',2000,2,3,30),('P39',1,'','Fix Code Defects',3000,3,1,10),('P4',1,'','Do Some Team Building Activities',2000,3,1,10),('P40',1,'','Do some unit testing',2500,3,1,10),('P41',1,'','Create Test Plan',2000,2,1,10),('P42',1,'','Define Criteria for Picking Automated Tools',1000,2,1,10),('P43',1,'','Perform Usability Testing',2000,1,1,10),('P44',1,'','Get Clients Acceptance Criteria',1500,1,1,10),('P45',2,'','Use Automated Tools to Speed Up testing',1500,2,2,20),('P46',2,'','Show Parts of System to Client',1000,1,2,20),('P47',2,'','Review Test Plan',2000,2,2,20),('P48',2,'','Get Client to Test Product',1500,1,2,20),('P49',2,'','Integration Testing',2000,2,2,20),('P5',1,'','Estimate Project Size',1000,2,1,10),('P50',3,'','Independent Verification and Validation',1000,1,3,30),('P51',3,'','System Testing',2000,3,3,30),('P52',3,'','Using QA group',1000,1,3,30),('P53',1,'','Create Notional Architecture',1500,1,1,10),('P54',1,'','Select Development Technology',2000,3,1,10),('P55',1,'','Build Prototypes',2000,3,1,10),('P56',1,'','Check Team Morale',1000,1,1,10),('P57',1,'','Create Architectural Diagrams',2000,2,1,10),('P58',1,'P54','Learn Development TEchnology',2000,3,1,10),('P59',2,'','Ask Client for feedback on Architecture',1000,1,2,20),('P6',1,'','Talk to client about Requirements',1500,2,1,10),('P60',2,'','Create an implementation plan',2000,1,2,20),('P61',2,'','Write Architecture Document',2500,2,2,20),('P62',2,'','Trace Design to Requirements',1000,1,2,20),('P63',2,'','Work on Detailed Design',3000,3,2,20),('P64',3,'','Create Test Plan',2000,2,3,30),('P65',3,'','Refine Architecture based on feedback',3000,3,3,30),('P66',3,'','Get Client Sign off on architecture',1000,1,3,30),('P7',2,'','Document Requirements',2000,2,2,20),('P8',2,'P6','Create Use Cases',2000,2,2,20),('P9',2,'','Build Prototypes',2000,2,2,20);
/*!40000 ALTER TABLE `PROJECT_STEPS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RISKS`
--

DROP TABLE IF EXISTS `RISKS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RISKS` (
  `risk_id` varchar(10) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  `budget_to_mitigate` int(11) DEFAULT NULL,
  `personnel_to_mitigate` int(11) DEFAULT NULL,
  PRIMARY KEY (`risk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RISKS`
--

LOCK TABLES `RISKS` WRITE;
/*!40000 ALTER TABLE `RISKS` DISABLE KEYS */;
INSERT INTO `RISKS` VALUES ('R1','Client not sure what he wants from the product and keeps changing the requirements. Might not finish the project on time',500,1),('R10','Client seems to be fairly technical in nature. Might require a lot more technical documentation than what team has planned for',1000,2),('R11','Project team has not yet talked about how to test the final product. Might spend a lot of time on figuring how to test it correctly',1000,2),('R12','Project has a lot of different stakeholders. Might need to use varying requirements elicitation techniques to communicate effectively',1000,1),('R13','Budget is always tight around here. Project cost might not leave even a minimal margin of error',1000,2),('R14','Management is very interested in having us implement good software engineering processes. Might have to spend extra time on process than otherwise planned.',1500,2),('R15','Team lead is not very experienced in Project Planning. Might experience productivity, workload and ineffiiency issues',1000,2),('R16','Team is experiencing a lot of changes in the project plan. Might confuse team members leading to work inefficiencies',1500,1),('R17','Client wants to be involved with the ongoing work on the project. Might not provide the team the flexibility it needs to do a good quality job',1500,2),('R18','Project team is unfamiliar with most of the client technical terminology. Might not be able to understand exactly what the client wants',1000,3),('R19','Project team is working with this technology for the first time. Might have unfamiliar implementation problems',1500,4),('R2','Project team is unfamiliar with existing project technology. Might have to spend extra time to learn it',1500,2),('R20','Project team is developing using this technology for the first time. Might have more quality issues than usual',1000,2),('R21','Client is currently unable to define Acceptance criteria. Might have to wait until very late in the project for this important information',1500,2),('R22','Little backup exists if the team loses a member. Might have difficulties finishing the project on time',1500,2),('R23','Existing schedule doesnt provide enough time for proper quality assurance activities. Might not meet customer\'s quality requirements',2500,3),('R24','Client intends to extend the project once team is finished with it. Might require extra time for documentation that the team didnt plan on',1500,1),('R25','Communication mechanisms with the client are illdefined. Might not be able to meet clients expectation',1500,2),('R26','No defined quality assurance plan currently exists. Might result in a product with poor quality',1500,3),('R27','Client is busy with other projects. Might not be able to provide timely feedback when needed for on-time product delivery',1500,3),('R28','Project team is not using a configuration management system. Might cause loss of work or inconsistency in owk products',1500,2),('R29','Team members dont currently have a clear picture of the project goals and final product. Might miss customer expectations',1500,2),('R3','Scope of project is large for this size team.might not be able to finish project on time',1000,2),('R30','Team members development background and style varies. Might have issues impacting implementation and testing',1500,3),('R31','Project team is not using version control system. Might cause loss of work or inconsistency in work products',2500,3),('R32','Some key team members are busy with other projects. Might have to fight for resources and need to deal with knowledge management issues',1500,3),('R33','Project is going to be challenging to test. Might have to be creative in using various testing strategies',2500,4),('R34','Management is interested in using this project as a benchmark throughout the company. Might require extra time in collecting various estimates and metrics to company',1000,2),('R35','Client has set a strict low code defect ratio. Might need to spend more time in code inspections and testing omply and minimize rework',1500,3),('R4','Client is located far away from team. might create issues with communications or expectations management',500,1),('R5','Team is composed of mostly new members who never worked together before. Might have issues with team building',1000,2),('R6','Project team is working extra hours on the project. Might lower morale and hurt team productivity',1000,2),('R7','Project team is not experienced with design and architecture. Might have to spend extra time in that phase of the project',1000,2),('R8','Project team is planning to build prototypes for project. Client might want to use prototypes instead of waiting for the final product delivery',1000,1),('R9','Project team has a lot of stakeholders for this project. Requirements elicitation work might take longer than expected',1000,2);
/*!40000 ALTER TABLE `RISKS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SURPRISE`
--

DROP TABLE IF EXISTS `SURPRISE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SURPRISE` (
  `surprise_id` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `budget` int(11) DEFAULT NULL,
  `capability_points` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  `personnel` int(11) DEFAULT NULL,
  PRIMARY KEY (`surprise_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SURPRISE`
--

LOCK TABLES `SURPRISE` WRITE;
/*!40000 ALTER TABLE `SURPRISE` DISABLE KEYS */;
INSERT INTO `SURPRISE` VALUES ('S1',1000,1,10,0),('S2',2000,1,10,0),('S3',1000,0,0,0),('S4',3000,0,0,0);
/*!40000 ALTER TABLE `SURPRISE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `USERS`
--

DROP TABLE IF EXISTS `USERS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `USERS` (
  `player_id` varchar(80) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `andrew_id` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `isCMU` tinyint(1) DEFAULT NULL,
  `isAdmin` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USERS`
--

LOCK TABLES `USERS` WRITE;
/*!40000 ALTER TABLE `USERS` DISABLE KEYS */;
INSERT INTO `USERS` VALUES ('droot@andrew.cmu.edu','tomcat12','','David','Root',1,1),('rosso@andrew.cmu.edu','mels','','Mel','Llopart',1,1);
/*!40000 ALTER TABLE `USERS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-09 21:29:12
