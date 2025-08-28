-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: tech_wear_db
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `tamanho_produto`
--

DROP TABLE IF EXISTS `tamanho_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tamanho_produto` (
  `id_tamanho_produto` int NOT NULL AUTO_INCREMENT,
  `tamanhos_idtamanhos_produto` int NOT NULL,
  `produtos_id_produtos` int NOT NULL,
  PRIMARY KEY (`id_tamanho_produto`,`tamanhos_idtamanhos_produto`,`produtos_id_produtos`),
  UNIQUE KEY `idtamanho_produto_UNIQUE` (`id_tamanho_produto`),
  KEY `fk_tamanho_produto_tamanhos1_idx` (`tamanhos_idtamanhos_produto`),
  KEY `fk_tamanho_produto_produtos1_idx` (`produtos_id_produtos`),
  CONSTRAINT `fk_tamanho_produto_produtos1` FOREIGN KEY (`produtos_id_produtos`) REFERENCES `produtos` (`id_produtos`),
  CONSTRAINT `fk_tamanho_produto_tamanhos1` FOREIGN KEY (`tamanhos_idtamanhos_produto`) REFERENCES `tamanhos` (`idtamanhos_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tamanho_produto`
--

LOCK TABLES `tamanho_produto` WRITE;
/*!40000 ALTER TABLE `tamanho_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tamanho_produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-28 14:00:15
