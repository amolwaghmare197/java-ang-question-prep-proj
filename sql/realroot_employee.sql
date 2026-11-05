-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: realroot
-- ------------------------------------------------------
-- Server version	8.0.46

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL,
  `emp_code` varchar(20) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  `manager_id` int DEFAULT NULL,
  `designation` varchar(50) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `bonus` decimal(10,2) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `last_promotion_date` date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'EMP001','John','Smith','john@company.com',1,NULL,'Director',150000.00,20000.00,'2018-01-10','2024-01-15','ACTIVE','Mumbai','2026-11-05 06:38:10','2026-11-05 06:38:10'),(2,'EMP002','Amol','Patil','amol@company.com',1,1,'Lead',120000.00,15000.00,'2019-02-15','2023-06-10','ACTIVE','Pune','2026-11-05 06:38:10','2026-11-05 06:38:10'),(3,'EMP003','Rahul','Sharma','rahul@company.com',1,2,'Senior Dev',95000.00,12000.00,'2020-03-10','2022-08-12','ACTIVE','Mumbai','2026-11-05 06:38:10','2026-11-05 06:38:10'),(4,'EMP004','Neha','Patel','neha@company.com',1,2,'Senior Dev',95000.00,10000.00,'2020-05-20','2023-01-15','ACTIVE','Pune','2026-11-05 06:38:10','2026-11-05 06:38:10'),(5,'EMP005','Priya','Kulkarni','priya@company.com',2,NULL,'HR Head',115000.00,12000.00,'2017-07-15','2022-02-20','ACTIVE','Delhi','2026-11-05 06:38:10','2026-11-05 06:38:10'),(6,'EMP006','Sneha','Joshi','sneha@company.com',2,5,'HR Manager',85000.00,9000.00,'2021-04-18','2023-09-01','ACTIVE','Delhi','2026-11-05 06:38:10','2026-11-05 06:38:10'),(7,'EMP007','Ajay','Verma','ajay@company.com',2,6,'HR Executive',60000.00,5000.00,'2022-11-10','2024-01-01','ACTIVE','Delhi','2026-11-05 06:38:10','2026-11-05 06:38:10'),(8,'EMP008','Vikas','Singh','vikas@company.com',3,NULL,'Finance Head',130000.00,18000.00,'2016-09-01','2023-04-01','ACTIVE','Bangalore','2026-11-05 06:38:10','2026-11-05 06:38:10'),(9,'EMP009','Pooja','Jain','pooja@company.com',3,8,'Accountant',70000.00,6000.00,'2022-02-20','2024-03-10','ACTIVE','Bangalore','2026-11-05 06:38:10','2026-11-05 06:38:10'),(10,'EMP010','Rohit','Mehta','rohit@company.com',3,8,'Accountant',70000.00,7000.00,'2022-06-30','2023-07-01','ACTIVE','Bangalore','2026-11-05 06:38:10','2026-11-05 06:38:10'),(11,'EMP011','Karan','Yadav','karan@company.com',4,NULL,'Sales Head',125000.00,20000.00,'2019-01-05','2024-02-10','ACTIVE','Chennai','2026-11-05 06:38:10','2026-11-05 06:38:10'),(12,'EMP012','Anita','Rao','anita@company.com',4,11,'Sales Manager',90000.00,10000.00,'2021-08-15','2024-05-20','ACTIVE','Chennai','2026-11-05 06:38:10','2026-11-05 06:38:10'),(13,'EMP013','Deepak','Gupta','deepak@company.com',4,12,'Sales Executive',55000.00,4000.00,'2023-01-12','2024-06-15','ACTIVE','Chennai','2026-11-05 06:38:10','2026-11-05 06:38:10'),(14,'EMP014','Nisha','Kapoor','nisha@company.com',1,2,'Developer',80000.00,8000.00,'2023-03-15','2024-01-01','ACTIVE','Pune','2026-11-05 06:38:10','2026-11-05 06:38:10'),(15,'EMP015','Arjun','Mishra','arjun@company.com',1,2,'Developer',80000.00,8500.00,'2023-03-16','2024-01-10','ACTIVE','Pune','2026-11-05 06:38:10','2026-11-05 06:38:10');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-11-05 18:54:48
