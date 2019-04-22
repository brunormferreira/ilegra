-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 22/04/2019 às 20:24
-- Versão do servidor: 10.1.38-MariaDB
-- Versão do PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `agenda`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `contato`
--

CREATE TABLE `contato` (
  `id` int(10) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Despejando dados para a tabela `contato`
--

INSERT INTO `contato` (`id`, `nome`, `email`, `telefone`) VALUES
(2, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com'),
(3, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com'),
(4, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com'),
(5, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com'),
(6, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com'),
(7, 'Bruno', '51991658585', 'bruno.ramires@ilegra.com');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `contato`
--
ALTER TABLE `contato`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `contato`
--
ALTER TABLE `contato`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
