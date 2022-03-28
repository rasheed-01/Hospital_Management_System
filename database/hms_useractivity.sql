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
-- Table structure for table `useractivity`
--

DROP TABLE IF EXISTS `useractivity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `useractivity` (
  `SNo` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(45) DEFAULT NULL,
  `Role` varchar(45) DEFAULT NULL,
  `DateAndTime` varchar(45) DEFAULT NULL,
  `Action` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SNo`),
  UNIQUE KEY `SNo_UNIQUE` (`SNo`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `useractivity`
--

LOCK TABLES `useractivity` WRITE;
/*!40000 ALTER TABLE `useractivity` DISABLE KEYS */;
INSERT INTO `useractivity` VALUES (1,'admin1','Admin','28-03-2022 11:46:49 AM','Log-In'),(2,'admin1','Admin','28-03-2022 11:46:49 AM','Log-In'),(3,NULL,'Admin','28-03-2022 11:57:46 AM','LogOut'),(4,'doctor1','Doctor','28-03-2022 11:57:53 AM','Log-In'),(5,'doctor1','Doctor','28-03-2022 12:01:34 PM','LogOut'),(6,'admin1','Admin','28-03-2022 12:01:42 PM','Log-In'),(7,'admin1','Admin','28-03-2022 12:02:15 PM','LogOut'),(8,'pharmacy1','Pharmacy','28-03-2022 12:02:23 PM','Log-In'),(9,'pharmacy1','Pharmacy','28-03-2022 12:05:26 PM','LogOut'),(10,'lab1','Lab','28-03-2022 12:05:33 PM','Log-In'),(11,'lab1','lab','28-03-2022 12:06:08 PM','LogOut'),(12,'admin1','Admin','28-03-2022 12:06:16 PM','Log-In'),(13,'admin1','Admin','28-03-2022 12:08:40 PM','LogOut'),(14,'lab1','Lab','28-03-2022 12:08:45 PM','Log-In'),(15,'lab1','lab','28-03-2022 12:09:40 PM','LogOut'),(16,'doctor1','Doctor','28-03-2022 12:09:45 PM','Log-In'),(17,'doctor1','Doctor','28-03-2022 12:12:44 PM','LogOut'),(18,'lab1','Lab','28-03-2022 12:12:52 PM','Log-In'),(19,'lab1','lab','28-03-2022 12:13:10 PM','LogOut'),(20,'admin1','Admin','28-03-2022 12:13:22 PM','Log-In'),(21,'admin1','Admin','28-03-2022 12:13:47 PM','LogOut'),(22,'lab1','Lab','28-03-2022 12:13:52 PM','Log-In'),(23,'lab1','lab','28-03-2022 12:14:23 PM','LogOut'),(24,'doctor1','Doctor','28-03-2022 12:14:28 PM','Log-In'),(25,'doctor1','Doctor','28-03-2022 12:15:02 PM','LogOut'),(26,'admin1','Admin','28-03-2022 12:15:10 PM','Log-In'),(27,'admin1','Admin','28-03-2022 12:15:25 PM','LogOut'),(28,'lab1','Lab','28-03-2022 19:13:04 PM','Log-In'),(29,'lab1','lab','28-03-2022 19:13:22 PM','LogOut'),(30,'lab1','Lab','28-03-2022 19:14:28 PM','Log-In'),(31,'lab1','lab','28-03-2022 19:14:57 PM','LogOut'),(32,'admin1','Admin','28-03-2022 19:28:54 PM','Log-In'),(33,NULL,'Admin','28-03-2022 19:35:10 PM','LogOut'),(34,'doctor1','Doctor','28-03-2022 19:35:17 PM','Log-In'),(35,'doctor1','Doctor','28-03-2022 19:37:53 PM','LogOut'),(36,'admin1','Admin','28-03-2022 19:38:02 PM','Log-In'),(37,'admin1','Admin','28-03-2022 19:38:07 PM','LogOut'),(38,'lab1','Lab','28-03-2022 19:38:12 PM','Log-In'),(39,'lab1','lab','28-03-2022 19:38:19 PM','LogOut'),(40,'admin1','Admin','28-03-2022 19:38:26 PM','Log-In'),(41,'admin1','Admin','28-03-2022 19:39:29 PM','LogOut'),(42,'lab1','Lab','28-03-2022 19:39:34 PM','Log-In'),(43,'lab1','lab','28-03-2022 19:40:12 PM','LogOut'),(44,'doctor1','Doctor','28-03-2022 19:40:20 PM','Log-In'),(45,'doctor1','Doctor','28-03-2022 19:41:00 PM','LogOut'),(46,'pharmacy1','Pharmacy','28-03-2022 19:41:13 PM','Log-In'),(47,'pharmacy1','Pharmacy','28-03-2022 19:41:48 PM','LogOut'),(48,'admin1','Admin','28-03-2022 20:19:33 PM','Log-In'),(49,'admin1','Admin','28-03-2022 20:19:51 PM','LogOut');
/*!40000 ALTER TABLE `useractivity` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 23:12:29
