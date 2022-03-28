-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `docschedule`
--

DROP TABLE IF EXISTS `docschedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docschedule` (
  `SNo` int NOT NULL AUTO_INCREMENT,
  `DocName` varchar(45) DEFAULT NULL,
  `Dept` varchar(45) DEFAULT NULL,
  `Position` varchar(45) DEFAULT NULL,
  `Days` varchar(45) DEFAULT NULL,
  `Timings` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SNo`),
  UNIQUE KEY `SNo_UNIQUE` (`SNo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docschedule`
--

LOCK TABLES `docschedule` WRITE;
/*!40000 ALTER TABLE `docschedule` DISABLE KEYS */;
INSERT INTO `docschedule` VALUES (1,'Dr Ansari','Opthamology','Senior Doctor','Mon - Sat','9am - 4pm'),(2,'Dr Sara','Opthamology','Junior Doctor','Mon - Sat','4pm - 11pm'),(3,'Dr Ahmed','Dental','Senior Doctor','Mon - Sat','9am - 4pm'),(4,'Dr Rashad','Dental','Junior Doctor','Mon - Sat','4pm - 11pm'),(5,'Dr Hina','Pediatrics','Senior Doctor','Mon - Sat','9am - 4pm'),(6,'Dr Rida','Pediatrics','Junior Doctor','Mon - Sat','4pm - 11pm'),(7,'Dr Raj','General Physian','Senior Doctor','Mon - Sat','9am - 4pm'),(8,'Dr Haitham','General Physcian','Junior Doctor','Mon - Sat','4pm - 11pm'),(9,'Dr Ammar','Dermatology','Senior Doctor','Mon - Sat','9am - 4pm'),(10,'Dr Faisal','Dermatology','Junior Doctor','Mon - Sat','4pm - 11pm');
/*!40000 ALTER TABLE `docschedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 23:12:30
