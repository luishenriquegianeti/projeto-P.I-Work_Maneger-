-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28/05/2025 às 23:18
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `work`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `admistrador`
--

CREATE TABLE `admistrador` (
  `idadmistrador` int(11) NOT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `admistrador`
--

INSERT INTO `admistrador` (`idadmistrador`, `Nome`, `Email`, `Senha`) VALUES
(1, 'luis henrique', 'luisgian791@gmail.com', '889912'),
(2, 'Gustavo', 'gustavo7789@gmail.com', '2040');

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `idClientes` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `Telefone` varchar(15) DEFAULT NULL,
  `Cpf` varchar(14) DEFAULT NULL,
  `Rg` varchar(12) DEFAULT NULL,
  `Cidade` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`idClientes`, `nome`, `Telefone`, `Cpf`, `Rg`, `Cidade`, `Email`, `Senha`) VALUES
(1, 'luis', '312341', '41241', '1312', '421421', 'luisgian791@gmail.com', '88'),
(15, 'luis', '14559234124', '556612443423', '112334442', 'ipaussu', 'luisgian791@gmail.com', '889912');

-- --------------------------------------------------------

--
-- Estrutura para tabela `prestadores`
--

CREATE TABLE `prestadores` (
  `idPrestadores` int(11) NOT NULL,
  `Nome` varchar(50) DEFAULT NULL,
  `Telefone` varchar(50) DEFAULT NULL,
  `Cnpj` varchar(14) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Endereco` varchar(100) DEFAULT NULL,
  `Ramo` varchar(100) DEFAULT NULL,
  `Senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `prestadores`
--

INSERT INTO `prestadores` (`idPrestadores`, `Nome`, `Telefone`, `Cnpj`, `Email`, `Endereco`, `Ramo`, `Senha`) VALUES
(2, 'jhhhn', '5545454', '54545', 'luisgian791@gmail.com\r\n', 'gftgfhf', 'luisgian791@gmail.com\r\n', '889912'),
(3, 'Vinicius', '12313123', '4823414', 'Vinicius@gmail.com', 'fefaadawdaw', 'Engenheiro', '102030');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `admistrador`
--
ALTER TABLE `admistrador`
  ADD PRIMARY KEY (`idadmistrador`);

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idClientes`);

--
-- Índices de tabela `prestadores`
--
ALTER TABLE `prestadores`
  ADD PRIMARY KEY (`idPrestadores`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admistrador`
--
ALTER TABLE `admistrador`
  MODIFY `idadmistrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idClientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `prestadores`
--
ALTER TABLE `prestadores`
  MODIFY `idPrestadores` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
