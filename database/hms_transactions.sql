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
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `SNo` int NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `CardType` varchar(45) DEFAULT NULL,
  `CardNo` varchar(45) DEFAULT NULL,
  `Amount` varchar(45) DEFAULT NULL,
  `Purpose` varchar(45) DEFAULT NULL,
  `DateAndTime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SNo`),
  UNIQUE KEY `SNo_UNIQUE` (`SNo`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (1,'8289','Virat','Visa','66554411','Sr 150','Appointment','28-03-2022 11:50:26 AM'),(2,'1748','Yahya','Visa','88855544','SR 80','Appointment','28-03-2022 11:52:18 AM'),(3,'1748','Yahya','Visa','7879898','SR 200','Appointment','28-03-2022 11:53:30 AM'),(4,'8572','Khansa','Visa','8888864','SR 100','Appointment','28-03-2022 11:54:14 AM'),(5,'1748','Yahya','Mastercard','788777888','SR 66','Pharmacy','28-03-2022 12:02:48 PM'),(6,'8289','Virat','American Express','878787','SR 120','Pharmacy','28-03-2022 12:05:08 PM'),(7,'8572','Khansa','Visa','88779955','SR 50','Lab Test','28-03-2022 12:08:04 PM'),(8,'8289','Virat','Visa','487989','SR 100','Lab Test','28-03-2022 12:08:30 PM'),(9,'1748','Yahya','Select a card type','7656566','SR 30','Lab Test','28-03-2022 12:13:41 PM'),(10,'6756','Muniba','Visa','444542649','SR 100','Appointment','28-03-2022 19:31:43 PM'),(11,'6756','Muniba','Visa','444542649','SR 200','Appointment','28-03-2022 19:32:20 PM'),(12,'9059','Rasheed','Visa','6465656','SR 100','Appointment','28-03-2022 19:33:15 PM'),(13,'1343','Maimuna','Mastercard','6465446','Sr 150','Appointment','28-03-2022 19:33:57 PM'),(14,'6756','Muniba','Visa','5688694','SR 100','Lab Test','28-03-2022 19:38:48 PM'),(15,'9059','Rasheed','Visa','1165653','SR 30','Lab Test','28-03-2022 19:39:18 PM'),(16,'6756','Muniba','Visa','54555554','SR 20','Pharmacy','28-03-2022 19:41:40 PM');
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
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
