CREATE TABLE IF NOT EXISTS `doctor` (
  `id` int(11) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `second_name` varchar(45) NOT NULL,
  `hospital_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`) 
) 
