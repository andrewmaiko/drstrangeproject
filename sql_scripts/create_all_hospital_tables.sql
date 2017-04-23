CREATE DATABASE IF NOT EXISTS hospital;
USE hospital;
CREATE TABLE IF NOT EXISTS `hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `doctor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `second_name` varchar(45) NOT NULL,
  `hospital_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`) 
);
CREATE TABLE IF NOT EXISTS `prescription` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `prescription_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`), 
  FOREIGN KEY (`prescription_id`) REFERENCES `prescription` (`id`)
) 

 


 