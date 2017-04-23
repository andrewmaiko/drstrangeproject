CREATE TABLE IF NOT EXISTS `hospital` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
