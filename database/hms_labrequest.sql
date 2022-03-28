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
-- Table structure for table `labrequest`
--

DROP TABLE IF EXISTS `labrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `labrequest` (
  `SNo` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Age` varchar(45) DEFAULT NULL,
  `DoctorName` varchar(45) DEFAULT NULL,
  `TestName` varchar(45) DEFAULT NULL,
  `Amount` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Result` varchar(45) DEFAULT NULL,
  `DateAndTime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SNo`),
  UNIQUE KEY `SNo_UNIQUE` (`SNo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `labrequest`
--

LOCK TABLES `labrequest` WRITE;
/*!40000 ALTER TABLE `labrequest` DISABLE KEYS */;
INSERT INTO `labrequest` VALUES (1,'8572','Khansa','17','Dr Rida','Pregnancy Test','SR 50','Completed','Negative','28-03-2022 12:00:06 PM'),(2,'1748','Yahya','15','Dr Sara','Covid Test','SR 30','Completed','Negative','28-03-2022 12:00:28 PM'),(3,'8289','Virat','32','Dr Rashad','Drug Test','SR 100','Completed','Negative','28-03-2022 12:00:51 PM'),(4,'6756','Muniba','12','Dr Ansari','Drug Test','SR 100','Pending Test','Awaiting','28-03-2022 19:35:44 PM'),(5,'9059','Rasheed','18','Dr Raj','Covid Test','SR 30','Pending Test','Awaiting','28-03-2022 19:36:29 PM'),(6,'1343','Maimuna','14','Dr Rashad','Drug Test','SR 100','UnPaid','Awaiting','28-03-2022 19:37:16 PM');
/*!40000 ALTER TABLE `labrequest` ENABLE KEYS */;
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
