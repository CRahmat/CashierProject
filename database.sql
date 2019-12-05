-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2019 at 04:45 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Telp` varchar(15) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `historytransaction`
--

CREATE TABLE `historytransaction` (
  `id_transaksi` bigint(20) NOT NULL,
  `id_product` varchar(50) NOT NULL,
  `date` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `historytransaction`
--

INSERT INTO `historytransaction` (`id_transaksi`, `id_product`, `date`, `jumlah`, `price`, `profit`) VALUES
(1, '12345', '04 - 12 - 2019-05 : 09 : 22', 1, 4500000, 500000),
(2, '12345', '04 - 12 - 2019|05 : 14 : 11', 1, 4500000, 500000),
(3, '12345', '04 - 12 - 2019|05 : 16 : 27', 1, 4500000, 500000),
(4, '12345', '04 - 12 - 2019|05 : 17 : 51', 1, 4500000, 500000),
(5, '12345', '04 - 12 - 2019|05 : 20 : 53', 1, 4500000, 500000),
(6, '', '04 - 12 - 2019|05 : 39 : 55', 1, 4500000, 500000),
(7, '12345', '04 - 12 - 2019|05 : 41 : 31', 1, 4500000, 500000),
(8, '12345', '04 - 12 - 2019|05 : 41 : 33', 1, 4500000, 500000),
(9, '12345', '04 - 12 - 2019|05 : 41 : 40', 1, 4500000, 500000),
(10, '12345', '04 - 12 - 2019|05 : 42 : 33', 1, 4500000, 500000),
(11, '12345', '04 - 12 - 2019|05 : 42 : 35', 1, 4500000, 500000),
(12, '12345', '04 - 12 - 2019|05 : 42 : 38', 1, 4500000, 500000),
(13, '12345', '04 - 12 - 2019|05 : 42 : 40', 1, 4500000, 500000),
(14, '12345', '04 - 12 - 2019|05 : 43 : 57', 1, 4500000, 500000),
(15, '12345', '04 - 12 - 2019|05 : 44 : 02', 1, 4500000, 500000),
(16, '12345', '04 - 12 - 2019|05 : 44 : 04', 1, 4500000, 500000),
(17, '12345', '04 - 12 - 2019|05 : 44 : 06', 1, 4500000, 500000),
(18, '12345', '04 - 12 - 2019|05 : 44 : 08', 1, 4500000, 500000),
(19, '12345', '04 - 12 - 2019|05 : 47 : 43', 1, 4500000, 500000),
(20, '12345', '04 - 12 - 2019|05 : 47 : 45', 1, 4500000, 500000),
(21, '12345', '04 - 12 - 2019|05 : 47 : 47', 1, 4500000, 500000),
(22, '12345', '04 - 12 - 2019|09 : 44 : 59', 1, 4500000, 500000),
(23, '12345', '04 - 12 - 2019|09 : 47 : 59', 1, 4500000, 500000),
(24, '12345', '04 - 12 - 2019|09 : 48 : 35', 1, 4500000, 500000),
(25, '12345', '04 - 12 - 2019|09 : 48 : 41', 1, 4500000, 500000),
(26, '12345', '04 - 12 - 2019|09 : 49 : 20', 1, 4500000, 500000),
(27, '12345', '04 - 12 - 2019|09 : 50 : 04', 1, 4500000, 500000),
(28, '12345', '04 - 12 - 2019|09 : 50 : 34', 1, 4500000, 500000),
(29, '12345', '04 - 12 - 2019|09 : 50 : 45', 1, 4500000, 500000),
(30, '12345', '04 - 12 - 2019|09 : 51 : 13', 1, 4500000, 500000),
(31, '12345', '04 - 12 - 2019|09 : 52 : 23', 1, 4500000, 500000),
(32, '12345', '04 - 12 - 2019|10 : 14 : 56', 1, 4500000, 500000),
(33, '12345', '04 - 12 - 2019|10 : 17 : 58', 1, 4500000, 500000),
(34, '12345', '04 - 12 - 2019|10 : 18 : 45', 1, 4500000, 500000),
(35, '12345', '04 - 12 - 2019|10 : 19 : 15', 1, 4500000, 500000),
(36, '12345', '04 - 12 - 2019|10 : 20 : 22', 1, 4500000, 500000),
(37, '12345', '04 - 12 - 2019|10 : 21 : 58', 1, 4500000, 500000),
(38, '12345', '04 - 12 - 2019|10 : 24 : 12', 1, 4500000, 500000),
(39, '12345', '04 - 12 - 2019|10 : 24 : 43', 1, 4500000, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id_product` varchar(50) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `profit` int(11) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id_product`, `product_name`, `price`, `profit`, `stock`) VALUES
('12345', 'ACER', 4000000, 500000, 82);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `historytransaction`
--
ALTER TABLE `historytransaction`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id_product`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `historytransaction`
--
ALTER TABLE `historytransaction`
  MODIFY `id_transaksi` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
