CREATE TABLE patrocinio (
  id  int(10) DEFAULT NULL auto_increment PRIMARY KEY,
  idEquipo int(10),
  idPatrocinador int(10),
  created_at DATETIME,
  updated_at DATETIME
)ENGINE=InnoDB;