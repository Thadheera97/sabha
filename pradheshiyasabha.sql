-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2023 at 04:48 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pradheshiyasabha`
--

-- --------------------------------------------------------

--
-- Table structure for table `additem`
--

CREATE TABLE `additem` (
  `rid` varchar(20) NOT NULL,
  `item_code` varchar(50) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `suplier` varchar(50) NOT NULL,
  `quantity` double NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `additem`
--

INSERT INTO `additem` (`rid`, `item_code`, `item_name`, `suplier`, `quantity`, `date`) VALUES
('RN1019', 'PE-2304', 'Pen', 'Samagi Harware', 3000, '12-03-2023'),
('RN1018', 'LK-patt', 'Pencil', 'Open', 400, '12-03-2023'),
('RN1017', 'MR-1133', 'item55', 'Samagi Harware', 200, '02-42-38'),
('RN1012', 'BMW200', 'Camer', 'Open', 200, 'null'),
('RN1013', 'ST001', 'Pen', 'Nimal Stores', 200, 'null'),
('RN1014', 'rer', 'dfd', 'Nimal Stores', 100, 'null'),
('RN1015', 'ST001', 'Pen', 'Samagi Harware', 10, 'null'),
('RN1016', 'bb100', 'gfg', 'Samagi Harware', 100, 'null'),
('RN1018', 'LK-patt', 'Pencil', 'Nimal Stores', 100, '28-03-2023'),
('RN1020', 'MR-1133', 'Pen', 'Samagi Harware', 45, '28-03-2023'),
('RN1021', 'PE-2304', 'Pen', 'Nimal Stores', 10, '28-03-2023');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Emp_ID` varchar(10) NOT NULL,
  `First_Name` varchar(20) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Position` varchar(30) NOT NULL,
  `NIC` varchar(25) NOT NULL,
  `Phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_ID`, `First_Name`, `Last_Name`, `Position`, `NIC`, `Phone`) VALUES
('1233', 'neesara', 'shamudri', 'Watermachanic', 'iojuhhi', '0412255659'),
('em001', 'wwe', 'wrett', 'Electric', '56656566bv', '254454545'),
('ww0001', 'sds', 'sdsf', 'Watermachanic', '4545454v', '07765412');

-- --------------------------------------------------------

--
-- Table structure for table `issueitem`
--

CREATE TABLE `issueitem` (
  `Issue_Id` int(10) NOT NULL,
  `Item_Code` varchar(20) NOT NULL,
  `Item_Name` varchar(20) NOT NULL,
  `Employee` varchar(20) NOT NULL,
  `Issued_By` varchar(20) DEFAULT NULL,
  `Quantity` varchar(20) NOT NULL,
  `Date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `issueitem`
--

INSERT INTO `issueitem` (`Issue_Id`, `Item_Code`, `Item_Name`, `Employee`, `Issued_By`, `Quantity`, `Date`) VALUES
(1, 'PE-2304', 'Pen', 'null', 'em001', '127', '12-03-2023'),
(2, 'PE-2304', 'Pen', 'null', 'em001', '500', '12-03-2023'),
(3, 'PE-2304', 'Pen', 'null', 'em001', '10', '12-03-2023'),
(4, 'pe-2304', 'Pen', 'null', 'em001', '100', '27-03-2023'),
(5, 'mr-1133', 'Paper', 'null', 'ww0001', '5', '27-03-2023'),
(6, 'lk-patt', 'Pencil', 'null', 'ww0001', '100', '27-03-2023'),
(7, 'pe-2304', 'Pen', 'null', 'em001', '200', '28-03-2023');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Id` int(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Telephone` varchar(20) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Id`, `Name`, `Telephone`, `User_Name`, `Password`) VALUES
(15, 'Thilina', '0761458956', 'thilina', 't123'),
(16, 'Kasun', '0774589652', 'kasun', 'k123');

-- --------------------------------------------------------

--
-- Table structure for table `reorder`
--

CREATE TABLE `reorder` (
  `RID` int(11) NOT NULL,
  `Item_Name` varchar(25) NOT NULL,
  `Quantity` varchar(25) NOT NULL,
  `Date` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `reorder`
--

INSERT INTO `reorder` (`RID`, `Item_Name`, `Quantity`, `Date`) VALUES
(11, 'item55', '250', '09-05-39'),
(10, 'Pen', '130', '06-23-43'),
(9, 'Pen', '1274', '02-49-01'),
(8, 'item55', '250', '02-43-25'),
(6, 'Paper', '52', '2023-3-11'),
(7, 'Paper', '520', 'null');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `Item_Code` varchar(50) NOT NULL,
  `Item_Name` varchar(50) NOT NULL,
  `Quantity` varchar(100) NOT NULL,
  `Low_Level` int(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`Item_Code`, `Item_Name`, `Quantity`, `Low_Level`) VALUES
('PE-2304', 'Pen', '2200', 200),
('MR-1133', 'Paper', '245', 10),
('LK-patt', 'Pencil', '455', 0),
('ITM-22', 'item55', '25', 26),
('ki101', 'lll', '210', 10);

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `Sup_ID` varchar(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Telephone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `suplier`
--

INSERT INTO `suplier` (`Sup_ID`, `Name`, `Address`, `Telephone`) VALUES
('S001', 'Nimal Stores', 'Akuressa', '0415266895'),
('S002', 'Samagi Harware', 'matara', '0914528565'),
('S004', 'kasun stores', 'KAMBURUPITIYA', '0774298627');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Emp_ID`);

--
-- Indexes for table `issueitem`
--
ALTER TABLE `issueitem`
  ADD PRIMARY KEY (`Issue_Id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `reorder`
--
ALTER TABLE `reorder`
  ADD PRIMARY KEY (`RID`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`Sup_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `issueitem`
--
ALTER TABLE `issueitem`
  MODIFY `Issue_Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `reorder`
--
ALTER TABLE `reorder`
  MODIFY `RID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
