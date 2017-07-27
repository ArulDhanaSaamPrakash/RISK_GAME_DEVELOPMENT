-- MySQL dump 10.13  Distrib 5.7.12, for osx10.11 (x86_64)
--
-- Host: localhost    Database: RISK_GAME_DB
-- ------------------------------------------------------
-- Server version	5.7.12

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
  CONSTRAINT `config_risk_mitigation_mapping_ibfk_2` FOREIGN KEY (`project_step_id`) REFERENCES `PROJECT_STEPS` (`project_step_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONFIG_RISK_MITIGATION_MAPPING`
--

LOCK TABLES `CONFIG_RISK_MITIGATION_MAPPING` WRITE;
/*!40000 ALTER TABLE `CONFIG_RISK_MITIGATION_MAPPING` DISABLE KEYS */;
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
  `name` varchar(45) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `isTimeBound` tinyint(1) DEFAULT NULL,
  `time_for_each_move` int(11) DEFAULT NULL,
  `steps_for_each_player` int(11) DEFAULT NULL,
  PRIMARY KEY (`game_id`),
  KEY `company_id` (`company_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `game_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `COMPANIES` (`company_id`),
  CONSTRAINT `game_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `PRODUCTS` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME`
--

LOCK TABLES `GAME` WRITE;
/*!40000 ALTER TABLE `GAME` DISABLE KEYS */;
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
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`game_config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_CONFIGURATIONS`
--

LOCK TABLES `GAME_CONFIGURATIONS` WRITE;
/*!40000 ALTER TABLE `GAME_CONFIGURATIONS` DISABLE KEYS */;
INSERT INTO `GAME_CONFIGURATIONS` VALUES ('GC1','WAterfall','Start');
/*!40000 ALTER TABLE `GAME_CONFIGURATIONS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_MOVES_SNAPSHOT`
--

DROP TABLE IF EXISTS `GAME_MOVES_SNAPSHOT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_MOVES_SNAPSHOT` (
  `snapshot_id` int(11) NOT NULL,
  `game_player_id` varchar(10) DEFAULT NULL,
  `turn_no` int(11) DEFAULT NULL,
  `budget` int(11) DEFAULT NULL,
  `personnel` int(11) DEFAULT NULL,
  `capability_bonus` int(11) DEFAULT NULL,
  `time_taken` datetime DEFAULT NULL,
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
  PRIMARY KEY (`snapshot_id`),
  KEY `game_player_id` (`game_player_id`),
  KEY `risk_id` (`risk_id`),
  KEY `oops_id` (`oops_id`),
  KEY `surprise_id` (`surprise_id`),
  KEY `oops_impact_id` (`oops_impact_id`),
  KEY `surprise_impact_id` (`surprise_impact_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_1` FOREIGN KEY (`game_player_id`) REFERENCES `GAME_PLAYER` (`game_player_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_2` FOREIGN KEY (`risk_id`) REFERENCES `RISKS` (`risk_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_3` FOREIGN KEY (`oops_id`) REFERENCES `OOPS` (`oops_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_4` FOREIGN KEY (`surprise_id`) REFERENCES `SURPRISE` (`surprise_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_5` FOREIGN KEY (`oops_impact_id`) REFERENCES `OOPS_IMPACT` (`oops_impact_id`),
  CONSTRAINT `game_moves_snapshot_ibfk_6` FOREIGN KEY (`surprise_impact_id`) REFERENCES `SURPRISE_IMPACT` (`surprise_impact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_MOVES_SNAPSHOT`
--

LOCK TABLES `GAME_MOVES_SNAPSHOT` WRITE;
/*!40000 ALTER TABLE `GAME_MOVES_SNAPSHOT` DISABLE KEYS */;
/*!40000 ALTER TABLE `GAME_MOVES_SNAPSHOT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_ORDERING`
--

DROP TABLE IF EXISTS `GAME_ORDERING`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_ORDERING` (
  `game_ordering_id` int(11) NOT NULL,
  `game_player_id` varchar(10) DEFAULT NULL,
  `order_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`game_ordering_id`),
  KEY `game_player_id` (`game_player_id`),
  CONSTRAINT `game_ordering_ibfk_1` FOREIGN KEY (`game_player_id`) REFERENCES `GAME_PLAYER` (`game_player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GAME_ORDERING`
--

LOCK TABLES `GAME_ORDERING` WRITE;
/*!40000 ALTER TABLE `GAME_ORDERING` DISABLE KEYS */;
/*!40000 ALTER TABLE `GAME_ORDERING` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GAME_PLAYER`
--

DROP TABLE IF EXISTS `GAME_PLAYER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GAME_PLAYER` (
  `game_player_id` varchar(10) NOT NULL,
  `game_id` varchar(50) DEFAULT NULL,
  `player_id` varchar(80) DEFAULT NULL,
  `isObserver` tinyint(1) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
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
/*!40000 ALTER TABLE `GAME_PLAYER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OOPS`
--

DROP TABLE IF EXISTS `OOPS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OOPS` (
  `oops_id` varchar(10) NOT NULL,
  `description` varchar(400) DEFAULT NULL,
  `is_there_precondition` tinyint(1) DEFAULT NULL,
  `steps_to_be_completed` varchar(20) DEFAULT NULL,
  `is_any_risk_mitigated` tinyint(1) DEFAULT NULL,
  `oops_impact_id` varchar(10) DEFAULT NULL,
  `config_phase_mapping_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`oops_id`),
  KEY `oops_impact_id` (`oops_impact_id`),
  KEY `config_phase_mapping_id` (`config_phase_mapping_id`),
  CONSTRAINT `oops_ibfk_1` FOREIGN KEY (`oops_impact_id`) REFERENCES `OOPS_IMPACT` (`oops_impact_id`),
  CONSTRAINT `oops_ibfk_2` FOREIGN KEY (`config_phase_mapping_id`) REFERENCES `CONFIG_PHASE_MAPPING` (`config_phase_mapping_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OOPS`
--

LOCK TABLES `OOPS` WRITE;
/*!40000 ALTER TABLE `OOPS` DISABLE KEYS */;
/*!40000 ALTER TABLE `OOPS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OOPS_IMPACT`
--

DROP TABLE IF EXISTS `OOPS_IMPACT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OOPS_IMPACT` (
  `oops_impact_id` varchar(10) NOT NULL,
  `lose_turn` int(11) DEFAULT NULL,
  `lose_capability_points` int(11) DEFAULT NULL,
  `lose_team_number` int(11) DEFAULT NULL,
  `lose_team_member_rounds` int(11) DEFAULT NULL,
  `revenue_cut` int(11) DEFAULT NULL,
  PRIMARY KEY (`oops_impact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OOPS_IMPACT`
--

LOCK TABLES `OOPS_IMPACT` WRITE;
/*!40000 ALTER TABLE `OOPS_IMPACT` DISABLE KEYS */;
/*!40000 ALTER TABLE `OOPS_IMPACT` ENABLE KEYS */;
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
INSERT INTO `PROJECT_STEPS` VALUES ('P1',1,'null','Identify Quality Attributes',1500,2,1,10),('P10',2,'','Internally Review Requirements',2000,3,2,20),('P11',2,'','Send Docs to Client For Feedback',500,1,2,20),('P12',3,'','Create an SRS',2000,3,3,30),('P13',3,'','Review Requirements with Client',1000,2,3,30),('P14',3,'','Request Client Sign Off',1500,1,3,30),('P15',1,'','Use Estimates to Adjust Plan',1000,2,1,10),('P16',1,'','Conduct Requirements Planning',1500,2,1,10),('P17',1,'','Conduct Testing Planning',1500,2,1,10),('P18',1,'','Conduct Implementation Planning',1500,2,1,10),('P19',1,'','Conduct Design Planning',1500,2,1,10),('P2',1,'','Identify Stakeholders',1000,1,1,10),('P20',1,'','Conduct Production Planning',1500,2,1,10),('P21',1,'','Track Progress vs plan',1000,1,1,10),('P22',1,'','Update Project plan',2000,2,1,10),('P23',1,'','Create Project Plan',2000,2,1,10),('P24',1,'','Define Project Goals',1000,3,1,10),('P25',1,'','Following a Coding Standard',1000,1,1,10),('P26',1,'','Work on Implementation',4000,4,1,10),('P27',1,'','Setup Development Environment',2000,2,1,10),('P28',1,'','Do some pair programming',1500,2,1,10),('P29',1,'','Create an implementation plan',2000,2,1,10),('P3',1,'','Create Requirements Elicitation Plan',1500,3,1,10),('P30',1,'','Estimate Project Size',2500,1,1,10),('P31',2,'','Conduct Formal Inspections',2000,3,2,20),('P32',2,'','Conduct Code Reviews',2000,3,2,20),('P33',2,'','Create Test Plan',1500,2,2,20),('P34',2,'','Use a Version Control System',2000,4,2,20),('P35',2,'','Establish Change Control Mechanisms',1500,2,2,20),('P36',3,'','Talk To Client about Project Progress',1000,1,3,30),('P37',3,'','Do some unit testing',2000,4,3,30),('P38',3,'','Write Test Cases',2000,2,3,30),('P39',1,'','Fix Code Defects',3000,3,1,10),('P4',1,'','Do Some Team Building Activities',2000,3,1,10),('P40',1,'','Do some unit testing',2500,3,1,10),('P41',1,'','Create Test Plan',2000,2,1,10),('P42',1,'','Define Criteria for Picking Automated Tools',1000,2,1,10),('P43',1,'','Perform Usability Testing',2000,1,1,10),('P44',1,'','Get Clients Acceptance Criteria',1500,1,1,10),('P45',2,'','Use Automated Tools to Speed Up testing',1500,2,2,20),('P46',2,'','Show Parts of System to Client',1000,1,2,20),('P47',2,'','Review Test Plan',2000,2,2,20),('P48',2,'','Get Client to Test Product',1500,1,2,20),('P49',2,'','Integration Testing',2000,2,2,20),('P5',1,'','Estimate Project Size',1000,2,1,10),('P50',3,'','Independent Verification and Validation',1000,1,3,30),('P51',3,'','System Testing',2000,3,3,30),('P52',3,'','Using QA group',1000,1,3,30),('P53',1,'','Create Notional Architecture',1500,1,1,10),('P54',1,'','Select Development Technology',2000,3,1,10),('P55',1,'','Build Prototypes',2000,3,1,10),('P56',1,'','Check Team Morale',1000,1,1,10),('P57',1,'','Create Architectural Diagrams',2000,2,1,10),('P58',1,'P54','Learn Development TEchnology',2000,3,1,10),('P59',2,'','Ask Client for feedback on Architecture',1000,1,2,20),('P6',1,'','Talk to client about Requirements',1500,2,1,10),('P60',2,'','Create an implementation plan',2000,1,2,20),('P61',2,'','Write Architecture Document',2500,2,2,20),('P62',2,'','Trace Design to Requirements',1000,1,2,20),('P63',2,'','Work on Detailed Design',3000,3,2,20),('P64',3,'','Create Test Plan',2000,2,3,30),('P65',3,'','Refine Architecture based on feedback',3000,3,3,30),('P66',3,'','Get Client Sign off on architecture',1000,1,3,30),('P7',2,'','Document Requirements',2000,2,2,20),('P8',2,'P6','Create Use Cases',2000,2,2,20),('P9',2,'','Build Prototypes',2000,2,2,20);
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
/*!40000 ALTER TABLE `RISKS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SURPRISE`
--

DROP TABLE IF EXISTS `SURPRISE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SURPRISE` (
  `surprise_id` varchar(10) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  `surprise_impact_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`surprise_id`),
  KEY `surprise_impact_id` (`surprise_impact_id`),
  CONSTRAINT `surprise_ibfk_1` FOREIGN KEY (`surprise_impact_id`) REFERENCES `SURPRISE_IMPACT` (`surprise_impact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SURPRISE`
--

LOCK TABLES `SURPRISE` WRITE;
/*!40000 ALTER TABLE `SURPRISE` DISABLE KEYS */;
/*!40000 ALTER TABLE `SURPRISE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SURPRISE_IMPACT`
--

DROP TABLE IF EXISTS `SURPRISE_IMPACT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SURPRISE_IMPACT` (
  `surprise_impact_id` varchar(10) NOT NULL,
  `get_extra_turn` int(11) DEFAULT NULL,
  `lose_turn` int(11) DEFAULT NULL,
  `gain_employee_for_project` int(11) DEFAULT NULL,
  `return_risk` int(11) DEFAULT NULL,
  `lose_team_member` int(11) DEFAULT NULL,
  `lose_team_member_rounds` int(11) DEFAULT NULL,
  `pick_risk` int(11) DEFAULT NULL,
  `money` int(11) DEFAULT NULL,
  `do_steps_before_proceeding` varchar(20) DEFAULT NULL,
  `team_member_for_next_project_step` int(11) DEFAULT NULL,
  `capability_for_next_project_step` int(11) DEFAULT NULL,
  `budget_for_next_project_step` int(11) DEFAULT NULL,
  `mitigate_risk_before_proceeding` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`surprise_impact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SURPRISE_IMPACT`
--

LOCK TABLES `SURPRISE_IMPACT` WRITE;
/*!40000 ALTER TABLE `SURPRISE_IMPACT` DISABLE KEYS */;
/*!40000 ALTER TABLE `SURPRISE_IMPACT` ENABLE KEYS */;
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
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USERS`
--

LOCK TABLES `USERS` WRITE;
/*!40000 ALTER TABLE `USERS` DISABLE KEYS */;
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

-- Dump completed on 2016-10-04  0:54:55
