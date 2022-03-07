-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: db_portafolio_2
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `about_me_banner_principal`
--

DROP TABLE IF EXISTS `about_me_banner_principal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `about_me_banner_principal` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `about_me_banner_principal`
--

LOCK TABLES `about_me_banner_principal` WRITE;
/*!40000 ALTER TABLE `about_me_banner_principal` DISABLE KEYS */;
INSERT INTO `about_me_banner_principal` VALUES (1,NULL,'b2b2b2ee333333','333333333');
/*!40000 ALTER TABLE `about_me_banner_principal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_complemento`
--

DROP TABLE IF EXISTS `certificado_complemento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_complemento` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_complemento`
--

LOCK TABLES `certificado_complemento` WRITE;
/*!40000 ALTER TABLE `certificado_complemento` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificado_complemento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_data_base`
--

DROP TABLE IF EXISTS `certificado_data_base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_data_base` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_data_base`
--

LOCK TABLES `certificado_data_base` WRITE;
/*!40000 ALTER TABLE `certificado_data_base` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificado_data_base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_html_css`
--

DROP TABLE IF EXISTS `certificado_html_css`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_html_css` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_html_css`
--

LOCK TABLES `certificado_html_css` WRITE;
/*!40000 ALTER TABLE `certificado_html_css` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificado_html_css` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_iot`
--

DROP TABLE IF EXISTS `certificado_iot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_iot` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_iot`
--

LOCK TABLES `certificado_iot` WRITE;
/*!40000 ALTER TABLE `certificado_iot` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificado_iot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_java_script`
--

DROP TABLE IF EXISTS `certificado_java_script`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_java_script` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_java_script`
--

LOCK TABLES `certificado_java_script` WRITE;
/*!40000 ALTER TABLE `certificado_java_script` DISABLE KEYS */;
INSERT INTO `certificado_java_script` VALUES (1,'1','1','1969-12-31','1','1'),(2,'2','2','1969-12-31','2','2'),(3,'3e','3e','1969-12-30','3e','3e');
/*!40000 ALTER TABLE `certificado_java_script` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificado_python`
--

DROP TABLE IF EXISTS `certificado_python`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificado_python` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion_banner` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `entidad_emisora` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `link_certificado` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificado_python`
--

LOCK TABLES `certificado_python` WRITE;
/*!40000 ALTER TABLE `certificado_python` DISABLE KEYS */;
INSERT INTO `certificado_python` VALUES (1,'1','1','1969-12-31','1','1'),(2,'2','2','1969-12-31','2','2'),(3,'3e','3e','1969-12-30','3e','3e');
/*!40000 ALTER TABLE `certificado_python` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `info_contacto`
--

DROP TABLE IF EXISTS `info_contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `info_contacto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `contenido` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `icono` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `info_contacto`
--

LOCK TABLES `info_contacto` WRITE;
/*!40000 ALTER TABLE `info_contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `info_contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lenguajes`
--

DROP TABLE IF EXISTS `lenguajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lenguajes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dominio` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `nombre_del_lenguaje` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `color_barra` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `color_fondo` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lenguajes`
--

LOCK TABLES `lenguajes` WRITE;
/*!40000 ALTER TABLE `lenguajes` DISABLE KEYS */;
INSERT INTO `lenguajes` VALUES (1,'68','http',NULL,NULL),(2,'20','2e','#f8f9fa','#8bd1ff'),(4,'78','cxzcxzxcxz',NULL,NULL);
/*!40000 ALTER TABLE `lenguajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `soft_skills`
--

DROP TABLE IF EXISTS `soft_skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soft_skills` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `pocentaje` int NOT NULL,
  `soft_skill` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soft_skills`
--

LOCK TABLES `soft_skills` WRITE;
/*!40000 ALTER TABLE `soft_skills` DISABLE KEYS */;
INSERT INTO `soft_skills` VALUES (1,30,'11'),(2,21,'22'),(3,50,'eee'),(4,0,'4eee'),(5,0,'4eee');
/*!40000 ALTER TABLE `soft_skills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_educacion`
--

DROP TABLE IF EXISTS `tabla_educacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_educacion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fecha_fin` date DEFAULT NULL,
  `color` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `nombre_institucion_educativa` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_educacion`
--

LOCK TABLES `tabla_educacion` WRITE;
/*!40000 ALTER TABLE `tabla_educacion` DISABLE KEYS */;
INSERT INTO `tabla_educacion` VALUES (1,'2022-03-02','#bbbbbb','e1','2022-03-02','e1'),(2,'2022-03-02','#bbbbbb','e2m','2022-03-02','e2m'),(3,'2022-03-02','#bbbbbb','e3','2022-03-02','e3'),(5,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tabla_educacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_experiencia`
--

DROP TABLE IF EXISTS `tabla_experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_experiencia` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `fecha_fin` date DEFAULT NULL,
  `color` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `descripcion` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `nombre_empresa` varchar(255) COLLATE utf8mb4_unicode_520_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_experiencia`
--

LOCK TABLES `tabla_experiencia` WRITE;
/*!40000 ALTER TABLE `tabla_experiencia` DISABLE KEYS */;
INSERT INTO `tabla_experiencia` VALUES (1,NULL,'#bbbbbb','2',NULL,'5'),(5,'2022-03-25','#311fcf','prieba1','2022-03-01','prueba1');
/*!40000 ALTER TABLE `tabla_experiencia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-07 11:19:54
