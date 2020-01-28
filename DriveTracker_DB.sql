-- MySQL dump 10.13  Distrib 8.0.17, for macos10.14 (x86_64)
--
-- Host: localhost    Database: dt
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cddata`
--

DROP TABLE IF EXISTS `cddata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cddata` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(30) DEFAULT NULL,
  `exp` int(11) DEFAULT NULL,
  `ctc` int(11) DEFAULT NULL,
  `jc` int(11) DEFAULT NULL,
  `bond` int(11) DEFAULT NULL,
  `position` int(11) DEFAULT NULL,
  `ec` int(11) DEFAULT NULL,
  `followup` date DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cddata`
--

LOCK TABLES `cddata` WRITE;
/*!40000 ALTER TABLE `cddata` DISABLE KEYS */;
INSERT INTO `cddata` VALUES (11,'Shri',5,500000,0,0,1,0,'2020-02-12'),(12,'Greenlight Systems',2,300000,1,1,3,2,'2020-01-01'),(15,'Twitter',9,500000,1,1,3,2,'2020-03-10'),(16,'BirlaSoft',3,500000,0,1,1,1,'2020-01-14'),(26,'Synechron',4,600000,1,0,2,0,'2020-01-26');
/*!40000 ALTER TABLE `cddata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loginData`
--

DROP TABLE IF EXISTS `loginData`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loginData` (
  `uname` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loginData`
--

LOCK TABLES `loginData` WRITE;
/*!40000 ALTER TABLE `loginData` DISABLE KEYS */;
INSERT INTO `loginData` VALUES ('vish122','Vishal1234'),('shri199','shrikant1234'),('prashant93pawar@gmail.com','prash0909');
/*!40000 ALTER TABLE `loginData` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-28 10:52:36
