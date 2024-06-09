-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 09, 2024 at 12:14 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `votingsystemdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `createcandidatestb`
--

CREATE TABLE `createcandidatestb` (
  `position` varchar(100) NOT NULL,
  `ballotnum` int NOT NULL,
  `candidatename` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `createcandidatestb`
--

INSERT INTO `createcandidatestb` (`position`, `ballotnum`, `candidatename`) VALUES
('add', 2, 'hehe'),
('dd', 1, 'dd');

-- --------------------------------------------------------

--
-- Table structure for table `voteraccsinfotb`
--

CREATE TABLE `voteraccsinfotb` (
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `citizenship` varchar(50) NOT NULL,
  `civil_status` varchar(20) NOT NULL,
  `date_of_birth` date NOT NULL,
  `address` varchar(255) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `security_answer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `voteraccsinfotb`
--

INSERT INTO `voteraccsinfotb` (`email`, `password`, `fullname`, `gender`, `citizenship`, `civil_status`, `date_of_birth`, `address`, `security_question`, `security_answer`) VALUES
('johnvaugusto32@gmail.com', '12345', 'Augusto John Vincent Dela Torre', 'MALE', 'Filipino', 'SINGLE', '2005-05-30', 'Abuno, Pajac LLC', 'In what city were you born?', 'Cebu'),
('michaelbully@gmail.com', '12345', 'Tagaan Michael Joseph Bullecer', 'MALE', 'Filipino', 'SINGLE', '1970-05-11', 'Liloan, luluan', 'What was your favorite sport in high school?', 'Playing Barbie'),
('augustojohnv11@gmail.com', 'Aemtracorps123', 'Augusto Vincent DelaTorre', 'MALE', 'Filipino', 'SINGLE', '2005-05-30', 'Abuno, Pajac LLC', 'What is your favorite movie?', 'Titanic'),
('augustojohnv11@gmail.com', 'Hahaha12345', 'Di Ko Alam', 'MALE', 'Pinoy', 'MARRIED', '2024-05-20', 'CTU', 'In what city were you born?', 'Secret'),
('justinaldevera@gmail.com', 'Aldevera11', 'Aldevera Justin Ian Rubin', 'MALE', 'Filipino', 'SINGLE', '2005-02-15', 'Sitio Tahna, Tisa, Cebu City', 'In what city were you born?', 'Cebu City');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
