-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: remotemysql.com
-- Generation Time: Jul 05, 2021 at 09:03 AM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wx2j0z2kNU`
--

-- --------------------------------------------------------

--
-- Table structure for table `STUDENT`
--

CREATE TABLE `STUDENT` (
  `STUDENT_NO` int(3) NOT NULL,
  `STUDENT_NAME` text COLLATE utf8_unicode_ci NOT NULL,
  `STUDENT_DOB` date NOT NULL,
  `STUDENT_DOJ` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `STUDENT`
--

INSERT INTO `STUDENT` (`STUDENT_NO`, `STUDENT_NAME`, `STUDENT_DOB`, `STUDENT_DOJ`) VALUES
(1, 'test', '1996-10-03', '2019-10-10'),
(3, 'test', '1996-10-03', '2019-10-03'),
(7, 'kaustubh', '1998-06-05', '2013-03-03'),
(8, 'kaustubh', '1997-05-20', '2016-03-03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `STUDENT`
--
ALTER TABLE `STUDENT`
  ADD PRIMARY KEY (`STUDENT_NO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `STUDENT`
--
ALTER TABLE `STUDENT`
  MODIFY `STUDENT_NO` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
