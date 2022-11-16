DROP DATABASE hibernate_relacion_1an;
CREATE DATABASE hibernate_relacion_1an;
USE hibernate_relacion_1an;

CREATE TABLE IF NOT EXISTS departamentos (
  id_dpto integer unsigned NOT NULL AUTO_INCREMENT,
  nombre varchar(500) NOT NULL,

  PRIMARY KEY (id_dpto)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;


INSERT INTO departamentos (id_dpto, nombre) VALUES
(1, 'RRHH'),
(2, 'Contabilidad'),
(3, 'Logistica');



CREATE TABLE IF NOT EXISTS empleados (
  id_empleado integer unsigned NOT NULL AUTO_INCREMENT,
  nombre varchar(500) NOT NULL,
  PRIMARY KEY (id_personaje)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;



INSERT INTO personaje (id_personaje, nombre, id_dpto) VALUES
(1, 'Jorge',1),
(2, 'Chema',2),
(3, 'Samuel',3),
(4, 'Pedro',2),
(5, 'Juan',1),
(6, 'Guillerno',1),
(7, 'David',3);
