CREATE TABLE equipo (
  id  int(11) DEFAULT NULL auto_increment PRIMARY KEY,
  nombreEquipo VARCHAR(128),
  cantidadJugadores int(10),
  created_at DATETIME,
  updated_at DATETIME
)ENGINE=InnoDB;