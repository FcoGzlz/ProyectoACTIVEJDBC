
CREATE TABLE patrocinador (
  id  int(11) DEFAULT NULL auto_increment PRIMARY KEY,
  nombrePatrocinador VARCHAR(128),
  created_at DATETIME,
  updated_at DATETIME
)ENGINE=InnoDB;



