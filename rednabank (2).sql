-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 13, 2022 at 05:26 AM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rednabank`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `AdminId` varchar(10) NOT NULL,
  `AFullName` varchar(250) NOT NULL,
  `AIniName` varchar(100) NOT NULL,
  `ANIC` varchar(15) DEFAULT NULL,
  `AGender` varchar(10) NOT NULL,
  `ADOB` date NOT NULL,
  `AdAge` int(11) NOT NULL,
  `AdminAddress` varchar(100) NOT NULL,
  `AdTP` int(11) NOT NULL,
  `AdEmail` varchar(100) NOT NULL,
  `AdminPassword` varchar(20) NOT NULL,
  PRIMARY KEY (`AdminId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminId`, `AFullName`, `AIniName`, `ANIC`, `AGender`, `ADOB`, `AdAge`, `AdminAddress`, `AdTP`, `AdEmail`, `AdminPassword`) VALUES
('A001', 'laka', 'KHNL', '2001058963', 'Male', '2001-02-27', 21, 'Negombo', 767241249, 'laka200', '1212'),
('A002', 'laka', 'KHNL', '2001058963', 'Male', '2001-02-27', 21, 'Negombo', 767241249, 'laka200', '1212'),
('A003', 'laka', 'KHNL', '2001058963', 'Male', '2001-02-27', 21, 'Negombo', 767241249, 'laka200', '1212'),
('A004', 'laka', 'KHNL', '2001058963', 'Male', '2001-02-27', 21, 'Negombo', 767241249, 'laka200', '1212');

-- --------------------------------------------------------

--
-- Table structure for table `bankaccount`
--

DROP TABLE IF EXISTS `bankaccount`;
CREATE TABLE IF NOT EXISTS `bankaccount` (
  `AccountID` varchar(10) NOT NULL,
  `AccType` varchar(50) NOT NULL,
  `AccountBalance` decimal(20,2) DEFAULT NULL,
  `Intrest` decimal(20,2) DEFAULT NULL,
  `CusID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`AccountID`),
  KEY `CusID` (`CusID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `CustomerID` varchar(10) NOT NULL,
  `CFullname` varchar(250) NOT NULL,
  `CInitialtName` varchar(150) NOT NULL,
  `NIC` varchar(15) DEFAULT NULL,
  `Gender` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int(11) NOT NULL,
  `CustomerAddress` varchar(200) NOT NULL,
  `TpNo` int(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustomerID`, `CFullname`, `CInitialtName`, `NIC`, `Gender`, `DOB`, `Age`, `CustomerAddress`, `TpNo`, `Email`) VALUES
('C001', 'Lakshan Fernando', 'KHNL Fernando', '200105801541', 'Male', '2001-02-27', 21, '353/2 Dalupatha Negombo', 767241249, 'laka23@gmail.com'),
('C002', 'Lakshan Fernando', 'KHNL Fernando', '200105801541', 'Male', '2001-02-27', 21, '353/2 Dalupatha Negombo', 767241249, 'laka23@gmail.com'),
('C003', 'Lakshan Fernando', 'KHNL Fernando', '200105801541', 'Male', '2001-02-27', 21, '353/2 Dalupatha Negombo', 767241249, 'laka23@gmail.com'),
('C004', 'Lakshan Fernando', 'KHNL Fernando', '200105801541', 'Male', '2001-02-27', 21, '353/2 Dalupatha Negombo', 767241249, 'laka23@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `StaffID` varchar(10) NOT NULL,
  `SFullname` varchar(200) NOT NULL,
  `SIniName` varchar(100) NOT NULL,
  `SNIC` varchar(15) DEFAULT NULL,
  `SGender` varchar(10) NOT NULL,
  `SDOB` date NOT NULL,
  `SAge` int(11) NOT NULL,
  `StaffAddress` varchar(100) NOT NULL,
  `StaffTP` int(11) NOT NULL,
  `StaffEmail` varchar(100) NOT NULL,
  `StaffPassword` varchar(20) NOT NULL,
  PRIMARY KEY (`StaffID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
CREATE TABLE IF NOT EXISTS `transactions` (
  `TransactionID` varchar(255) NOT NULL,
  `AccountNo` varchar(10) DEFAULT NULL,
  `TransactionType` varchar(100) NOT NULL,
  `Amount` decimal(20,2) DEFAULT NULL,
  `TransactionDateTime` datetime NOT NULL,
  PRIMARY KEY (`TransactionID`),
  KEY `AccountNo` (`AccountNo`)
) ENGINE=MyISAM AUTO_INCREMENT=1000000100 DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
