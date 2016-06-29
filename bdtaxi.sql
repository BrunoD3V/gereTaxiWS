-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 27-Jun-2016 às 00:07
-- Versão do servidor: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdtaxi`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `morada` varchar(255) NOT NULL,
  `codigoPostal` varchar(10) NOT NULL,
  `nif` int(9) UNSIGNED NOT NULL,
  `contacto` int(9) UNSIGNED NOT NULL,
  `email` varchar(64) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `idMotorista` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `morada`, `codigoPostal`, `nif`, `contacto`, `email`, `tipo`, `idMotorista`) VALUES
(1, 'AutoBruno Lda', 'Avenida das Amoreiras nº 235 1ºDto.', '4580-104', 249841985, 910153410, 'autoBruno@gmail.com', 'Assistencia em Viagem', 0),
(2, 'Belch Europe', 'Rua Olimpo Cabral nº6', '4580-104', 249841985, 910153410, 'BelchEurope@gmail.com', 'Acidentes de Trabalho', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `motorista`
--

DROP TABLE IF EXISTS `motorista`;
CREATE TABLE IF NOT EXISTS `motorista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `motorista`
--

INSERT INTO `motorista` (`id`, `email`, `password`) VALUES
(1, 'bruno@gmail.com', '123'),
(2, 'teste@gmail.com', '12345678'),
(3, 'coisas@gmail.com', '12'),
(4, 'bruno', '123'),
(5, 'antonio', '1233123123123'),
(6, 'zeabilio', '1ssd'),
(7, 'Miguel', 'asdlasdlnasd'),
(8, 'zeca das cabras', 'putas'),
(10, '2', 'hwO4rZJlvNVdXg/C4vggkw==\n'),
(11, '3', 'c0AVrP7598di1eQQqnP9Ag==\n'),
(12, 'pedrobelchior@hotmail.com', 'rWlvkl1KJ4VTHZj67RWzuw==\n'),
(13, 'brunomiguel', '16uFOV18ov58hVNDf9h/hg==\n');

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

DROP TABLE IF EXISTS `servico`;
CREATE TABLE IF NOT EXISTS `servico` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `processo` varchar(50) DEFAULT NULL,
  `nomeCliente` varchar(200) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `horaDeInicio` varchar(20) DEFAULT NULL,
  `data` varchar(50) DEFAULT NULL,
  `origem` varchar(50) DEFAULT NULL,
  `destino` varchar(50) DEFAULT NULL,
  `trajeto` longtext,
  `distancia` varchar(200) DEFAULT NULL,
  `horasDeEspera` varchar(200) DEFAULT NULL,
  `numPassageiros` int(10) UNSIGNED DEFAULT NULL,
  `custoPortagens` varchar(200) DEFAULT NULL,
  `idMotorista` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `servico`
--

INSERT INTO `servico` (`id`, `processo`, `nomeCliente`, `tipo`, `horaDeInicio`, `data`, `origem`, `destino`, `trajeto`, `distancia`, `horasDeEspera`, `numPassageiros`, `custoPortagens`, `idMotorista`) VALUES
(1, 'AEV1', 'AutoBruno', 'Assistencia em Viagem', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(3, 'AEV3', 'AutoBruno', 'Assistencia em Viagem', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(4, 'AEV4', 'AutoBruno', 'Assistencia em Viagem', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(5, 'AEV5', 'AutoBruno', 'Assistencia em Viagem', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(6, 'AT01', 'AutoBruno', 'Acidente de Trabalho', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(7, 'AT02', 'AutoBruno', 'Acidente de Trabalho', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(8, 'AT03', 'AutoBruno', 'Acidente de Trabalho', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(9, 'AT04', 'Belch Europe', 'Acidente de Trabalho', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(10, 'AT05', 'Belch Europe', 'Acidente de Trabalho', '13:42', '24-Jun-2016', 'Mirandela', 'Porto', 'LONGTEXT', '20', '0', 1, '0', 0),
(11, 'ASDASD', 'Bruno', 'asd', 'HoraDeInciio', '12-Jun-2016', 'Porto', 'Porto', NULL, '2.0', '2.3', 2, '2.0', 0),
(12, 'AEV11', 'AutoBruno', 'Assistencia em Viagem', '16:30', '25-Jan-2016', 'Lisboa', 'Porto', 'Trajetoasdasdad', '5.2', '2', 2, 'asdasdasd', 0),
(13, 'AEV69', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(14, 'xupa', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(15, 'xupa', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0),
(16, '12', 'AntonioBasilio', 'Assistencia Em Viagem', '18:30', '16-09-2016', 'Porto', 'Espanha', 'A25', '22', '0', 0, '200', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
