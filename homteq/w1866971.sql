-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jul 16, 2023 at 04:23 PM
-- Server version: 5.7.26
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `w1866971`
--

-- --------------------------------------------------------

--
-- Table structure for table `Product`
--

CREATE TABLE `Product` (
  `prodId` int(4) NOT NULL,
  `prodName` varchar(30) NOT NULL,
  `prodPicNameSmall` varchar(100) NOT NULL,
  `prodPicNameLarge` varchar(100) NOT NULL,
  `prodDescripShort` varchar(1000) DEFAULT NULL,
  `prodDescripLong` varchar(3000) DEFAULT NULL,
  `prodPrice` decimal(6,2) NOT NULL,
  `prodQuantity` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Product`
--

INSERT INTO `Product` (`prodId`, `prodName`, `prodPicNameSmall`, `prodPicNameLarge`, `prodDescripShort`, `prodDescripLong`, `prodPrice`, `prodQuantity`) VALUES
(1, 'Samsung 870 EVO', 'samsung-870-evo-sata-ssd-primary-100873962-orig.jpg', 'samsung-870-evo-sata-ssd-primary-100873962-orig.jpg', 'If you’re looking to add some storage via a traditional 2.5-inch SATA drive rather than a tiny M.2 “gumstick,” Samsung’s spectacular 870 EVO is your best bet. ', 'If you’re looking to add some storage via a traditional 2.5-inch SATA drive rather than a tiny M.2 “gumstick,” Samsung’s spectacular 870 EVO is your best bet. It’s the fastest SATA SSD we’ve tested, it’s available in up to 4TB of capacity, and it’s exceedingly affordable given its speed. Enough said, really—though Samsung’s killer Magician SSD management software and long warranty period also deserve a shout-out. The EVO series is a legend among SSDs for a reason.', '89.99', 10),
(2, 'Crucial BX500', '41eXT6YT+jL._SL500_.jpg', '41eXT6YT+jL._SL500_.jpg', 'The Samsung 870 EVO offers an intoxicating blend of performance and affordable pricing, but if you want as much capacity as possible for as cheaply as possible, consider the Crucial BX500.', 'The Samsung 870 EVO offers an intoxicating blend of performance and affordable pricing, but if you want as much capacity as possible for as cheaply as possible, consider the Crucial BX500. You can get its 1TB model for $80, a whopping $30 less than the equivalent EVO, while a 480GB version costs just $45. 240GB and 2TB versions are also available.', '144.99', 15),
(3, 'Crucial P3', 'Crucial-P3-hero.webp', 'Crucial-P3-hero.webp', 'Sure, PCIe 4.0 SSDs scream during big file transfers, but if you’re still using an older system with PCIe 3.0, upgrading to an NVMe SSD still provides substantial benefits to your PC’s speed and overall responsiveness. ', 'Sure, PCIe 4.0 SSDs scream during big file transfers, but if you’re still using an older system with PCIe 3.0, upgrading to an NVMe SSD still provides substantial benefits to your PC’s speed and overall responsiveness. Better yet, you don’t need to break the bank to take advantage. The Crucial P3 is a very good daily performer, but it’s available for a bargain rate of just $44 for a 500GB model or $84 for a 1TB model. Though it doesn’t have top-tier PCIe 4 performance and the TBW rating is pretty low, the P3 does have excellent real-world write times and unless you really stress the drive you shouldn’t notice much of a difference anyhow.', '34.55', 2),
(4, 'WD Black SN850X ', 'WD_BLACK-SN850X-NVMe-SSD-flat.webp', 'WD_BLACK-SN850X-NVMe-SSD-flat.webp', 'The WD Black SN850X is one of the fastest drives we have ever tested and ranks right up at the top next to the FireCuda 530 in terms of speed. The reason that the WD Black SN850X takes our top spot for PCIe 4.0 is that it offers the same great speed for a slightly lower price, meaning better value for your money.\r\n ', 'The WD Black SN850X is one of the fastest drives we have ever tested and ranks right up at the top next to the FireCuda 530 in terms of speed. The reason that the WD Black SN850X takes our top spot for PCIe 4.0 is that it offers the same great speed for a slightly lower price, meaning better value for your money.\r\n\r\nAlso, in terms of overall performance, the SN850X is not only fast, but it provides outstanding real world transfer rates and top-notch random write performance. ', '109.99', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `userId` int(11) NOT NULL,
  `userType` varchar(1) DEFAULT NULL,
  `userFName` varchar(100) NOT NULL,
  `userSName` varchar(100) NOT NULL,
  `userAddress` varchar(200) NOT NULL,
  `userPostCode` varchar(20) NOT NULL,
  `userTelNo` varchar(20) NOT NULL,
  `userEmail` varchar(100) NOT NULL,
  `userPassword` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`userId`, `userType`, `userFName`, `userSName`, `userAddress`, `userPostCode`, `userTelNo`, `userEmail`, `userPassword`) VALUES
(1, NULL, 'Kumuditha', 'Karunarathna', '199, Thittapajjala Werellagama', '20080', '0770431507', 'kumudithaudaya@gmail.com', '20020322');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Product`
--
ALTER TABLE `Product`
  ADD PRIMARY KEY (`prodId`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`userId`),
  ADD UNIQUE KEY `userEmail` (`userEmail`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Product`
--
ALTER TABLE `Product`
  MODIFY `prodId` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
