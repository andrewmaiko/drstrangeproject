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