-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 24, 2013 as 04:33 AM
-- Versão do Servidor: 5.1.50
-- Versão do PHP: 5.3.9-ZS5.6.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `system_os`
--
CREATE DATABASE `system_os` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `system_os`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codigo` int(10) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `telefone_celular` varchar(13) DEFAULT NULL,
  `telefone_residencial` varchar(13) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`codigo`, `nome`, `cpf`, `data_nascimento`, `endereco`, `telefone_celular`, `telefone_residencial`, `email`) VALUES
(1, 'Frank Furt', '999.999.999-99', '2013-06-11', 'Endereço', '(88)8888-8888', '(88)8888-8888', 'email@sinhorzinho.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE IF NOT EXISTS `equipamento` (
  `codigo` int(10) NOT NULL,
  `tipo` varchar(30) DEFAULT NULL,
  `numero_serie` varchar(30) DEFAULT NULL,
  `descricao` varchar(30) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `acessorios` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `equipamento`
--

INSERT INTO `equipamento` (`codigo`, `tipo`, `numero_serie`, `descricao`, `marca`, `modelo`, `cor`, `acessorios`) VALUES
(1, '1', '333', 'Computador', 'Dell', '1500', 'Preto', '0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `codigo_numero` int(4) NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `telefone` varchar(12) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codigo_numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`codigo_numero`, `nome`, `cnpj`, `endereco`, `telefone`, `email`) VALUES
(1, 'Asus Informatica', '999999999999', 'Endereço', '999999999', 'email@email.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `matricula` int(10) NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(12) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `endereco` varchar(80) DEFAULT NULL,
  `telefone` varchar(13) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `cargo` varchar(20) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`matricula`, `nome`, `cpf`, `rg`, `data_nascimento`, `endereco`, `telefone`, `email`, `cargo`, `senha`) VALUES
(1, 'Rafael Bruno', '000.000.000-00', '9999999', '2013-06-11', 'Quadra 10 lote 11', '(61)9232-0467', 'rafabrun2006@gmail.com', 'Professor', 'asdf'),
(2, 'Sinhorzinho Malta', '999.999.999-99', '9999999', '2013-06-28', 'Endereço', '8888888888', 'email@sinhorzinho.com', 'Matador', 'matar');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_pedido`
--

CREATE TABLE IF NOT EXISTS `item_pedido` (
  `cod_peca_estoque` int(10) DEFAULT NULL,
  `cod_pedido` int(10) DEFAULT NULL,
  `quantidade` int(10) DEFAULT NULL,
  KEY `cod_peca_estoque` (`cod_peca_estoque`),
  KEY `cod_pedido` (`cod_pedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `item_pedido`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `ordem_servico`
--

CREATE TABLE IF NOT EXISTS `ordem_servico` (
  `codigo` int(10) NOT NULL AUTO_INCREMENT,
  `cod_cliente` int(10) DEFAULT NULL,
  `cod_equipamento` int(10) DEFAULT NULL,
  `matr_funcionario` int(10) DEFAULT NULL,
  `cod_peca_estoque` int(10) DEFAULT NULL,
  `cod_servico` int(10) DEFAULT NULL,
  `data_abertura` date DEFAULT NULL,
  `data_encerramento` date DEFAULT NULL,
  `situacao_atual` varchar(30) DEFAULT NULL,
  `tipo_servico` varchar(30) DEFAULT NULL,
  `defeito_informado` varchar(30) DEFAULT NULL,
  `defeito_constatado` varchar(30) DEFAULT NULL,
  `situacao_orcamento` varchar(30) DEFAULT NULL,
  `observacao` varchar(80) DEFAULT NULL,
  `valor` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_cliente` (`cod_cliente`),
  KEY `cod_equipamento` (`cod_equipamento`),
  KEY `cod_peca_estoque` (`cod_peca_estoque`),
  KEY `matr_funcionario` (`matr_funcionario`),
  KEY `cod_servico` (`cod_servico`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `ordem_servico`
--

INSERT INTO `ordem_servico` (`codigo`, `cod_cliente`, `cod_equipamento`, `matr_funcionario`, `cod_peca_estoque`, `cod_servico`, `data_abertura`, `data_encerramento`, `situacao_atual`, `tipo_servico`, `defeito_informado`, `defeito_constatado`, `situacao_orcamento`, `observacao`, `valor`) VALUES
(1, 1, 1, 1, 1, 1, '1998-01-02', '1998-01-02', 'situacao', 'tipo serviço', 'defeito', 'cosntatado', 'situacao orcamento', 'obs', 3.88),
(2, 1, 1, 1, 1, 1, '1998-01-02', '1998-01-02', 'situacao', 'tipo serviÃ§o', 'defeito', 'constatado', 'situacao orÃ§amento', 'obs', 33.99),
(3, 1, 1, 1, 1, 1, '1998-01-02', '1998-01-02', 'situacao', 'tipo serviÃ§o', 'defeito', 'constatado', 'situacao orÃ§amento', 'obs', 33.99);

-- --------------------------------------------------------

--
-- Estrutura da tabela `peca_estoque`
--

CREATE TABLE IF NOT EXISTS `peca_estoque` (
  `codigo` int(10) NOT NULL,
  `tipo` varchar(30) DEFAULT NULL,
  `descricao` varchar(20) DEFAULT NULL,
  `fabricante` varchar(20) DEFAULT NULL,
  `quantidade` int(10) DEFAULT NULL,
  `data_entrada` date DEFAULT NULL,
  `valor_venda` double(6,2) DEFAULT NULL,
  `valor_compra` double(6,2) DEFAULT NULL,
  `notafiscal` int(10) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `peca_estoque`
--

INSERT INTO `peca_estoque` (`codigo`, `tipo`, `descricao`, `fabricante`, `quantidade`, `data_entrada`, `valor_venda`, `valor_compra`, `notafiscal`) VALUES
(1, '1', 'Placa Mãe', 'ASUS', 1, '2013-06-19', 128.09, 128.09, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido_compra`
--

CREATE TABLE IF NOT EXISTS `pedido_compra` (
  `codigo` int(10) NOT NULL,
  `matr_funcionario` int(10) DEFAULT NULL,
  `cod_fornecedor_numero` int(4) DEFAULT NULL,
  `data_pedido` varchar(20) DEFAULT NULL,
  `valor` double(6,2) DEFAULT NULL,
  `nota_fiscal` int(10) DEFAULT NULL,
  `situacao_atual` varchar(20) DEFAULT NULL,
  `observacao` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `matr_funcionario` (`matr_funcionario`),
  KEY `cod_fornecedor_numero` (`cod_fornecedor_numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pedido_compra`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE IF NOT EXISTS `servico` (
  `codigo` int(10) NOT NULL,
  `descricao` varchar(20) DEFAULT NULL,
  `valor` double(6,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `servico`
--

INSERT INTO `servico` (`codigo`, `descricao`, `valor`) VALUES
(1, 'Substituição Peça', 150.09);

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD CONSTRAINT `item_pedido_ibfk_1` FOREIGN KEY (`cod_peca_estoque`) REFERENCES `peca_estoque` (`codigo`),
  ADD CONSTRAINT `item_pedido_ibfk_2` FOREIGN KEY (`cod_pedido`) REFERENCES `pedido_compra` (`codigo`);

--
-- Restrições para a tabela `ordem_servico`
--
ALTER TABLE `ordem_servico`
  ADD CONSTRAINT `ordem_servico_ibfk_1` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`codigo`),
  ADD CONSTRAINT `ordem_servico_ibfk_2` FOREIGN KEY (`cod_equipamento`) REFERENCES `equipamento` (`codigo`),
  ADD CONSTRAINT `ordem_servico_ibfk_3` FOREIGN KEY (`cod_peca_estoque`) REFERENCES `peca_estoque` (`codigo`),
  ADD CONSTRAINT `ordem_servico_ibfk_4` FOREIGN KEY (`matr_funcionario`) REFERENCES `funcionario` (`matricula`),
  ADD CONSTRAINT `ordem_servico_ibfk_5` FOREIGN KEY (`cod_servico`) REFERENCES `servico` (`codigo`);

--
-- Restrições para a tabela `pedido_compra`
--
ALTER TABLE `pedido_compra`
  ADD CONSTRAINT `pedido_compra_ibfk_1` FOREIGN KEY (`matr_funcionario`) REFERENCES `funcionario` (`matricula`),
  ADD CONSTRAINT `pedido_compra_ibfk_2` FOREIGN KEY (`cod_fornecedor_numero`) REFERENCES `fornecedor` (`codigo_numero`);
