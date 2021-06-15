CREATE DATABASE siu;
USE siu;
-- -----------------------------------------------------
-- Table `educativo`.`Alumnos`
-- -----------------------------------------------------
CREATE TABLE alumnos
 (
  carnet_alumno VARCHAR(15),
  nombre_alumno VARCHAR(45),
  direccion_alumno VARCHAR(45),
  telefono_alumno VARCHAR(45),
  email_alumno VARCHAR(20),
  estatus_alumno VARCHAR(1),
  PRIMARY KEY (carnet_alumno)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;

-- -----------------------------------------------------
-- Table `educativo`.`Maestros`
-- -----------------------------------------------------
CREATE TABLE maestros
(
  codigo_maestro VARCHAR(5),
  nombre_maestro VARCHAR(45),
  direccion_maestro VARCHAR(45),
  telefono_maetro VARCHAR(45),
  email_maestro VARCHAR(20),
  estatus_maestro VARCHAR(1),
  PRIMARY KEY (codigo_maestro)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Facultades`
-- -----------------------------------------------------
CREATE TABLE facultades
(
  codigo_facultad VARCHAR(5),
  nombre_facultad VARCHAR(45),
  estatus_facultad VARCHAR(1),
  PRIMARY KEY (codigo_facultad)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Carreras`
-- -----------------------------------------------------
CREATE TABLE carreras
(
  codigo_carrera VARCHAR(5),
  nombre_carrera VARCHAR(45),
  codigo_facultad VARCHAR(5),
  estatus_carrera VARCHAR(1),
  PRIMARY KEY (codigo_carrera),
  FOREIGN KEY (codigo_facultad) REFERENCES facultades(codigo_facultad)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Cursos`
-- -----------------------------------------------------
CREATE TABLE cursos
(
  codigo_curso VARCHAR(5),
  nombre_curso VARCHAR(45),
  estatus_curso VARCHAR(1),
  PRIMARY KEY (codigo_curso)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Secciones`
-- -----------------------------------------------------
CREATE TABLE secciones
(
  codigo_seccion VARCHAR(5),
  nombre_seccion VARCHAR(45),
  estatus_seccion VARCHAR(1),
  PRIMARY KEY (codigo_seccion)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Sedes`
-- -----------------------------------------------------
CREATE TABLE sedes
(
  codigo_sede VARCHAR(5),
  nombre_sede VARCHAR(45),
  estatus_sede VARCHAR(1),
  PRIMARY KEY (codigo_sede)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Aulas`
-- -----------------------------------------------------
CREATE TABLE aulas
(
  codigo_aula VARCHAR(5),
  nombre_aula VARCHAR(45),
  estatus_aula VARCHAR(1),
  PRIMARY KEY (codigo_aula)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE jornadas
(
	codigo_jornada VARCHAR(5),
    nombre_jornada VARCHAR(45),
    estatus_jornada VARCHAR(1),
    PRIMARY KEY (codigo_jornada)
) ENGINE=INNODB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Asignacion_cursos_alumnos`
-- -----------------------------------------------------
CREATE TABLE asignacioncursosalumnos
(
  codigo_carrera VARCHAR(5),
  codigo_sede VARCHAR(5),
  codigo_jornada VARCHAR(5),
  codigo_seccion VARCHAR(5),
  codigo_aula VARCHAR(5),
  codigo_curso VARCHAR(5),
  carnet_alumno VARCHAR(15),
  nota_asignacioncursoalumnos FLOAT(10,2), 
  PRIMARY KEY (codigo_carrera, codigo_sede, codigo_jornada, codigo_seccion, codigo_aula, codigo_curso, carnet_alumno),
  FOREIGN KEY (codigo_carrera) REFERENCES carreras(codigo_carrera),
  FOREIGN KEY (codigo_sede) REFERENCES sedes(codigo_sede),
  FOREIGN KEY (codigo_jornada) REFERENCES jornadas(codigo_jornada),
  FOREIGN KEY (codigo_seccion) REFERENCES secciones(codigo_seccion),
  FOREIGN KEY (codigo_aula) REFERENCES aulas(codigo_aula),
  FOREIGN KEY (codigo_curso) REFERENCES cursos(codigo_curso),
  FOREIGN KEY (carnet_alumno) REFERENCES alumnos(carnet_alumno)
  ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
-- -----------------------------------------------------
-- Table `educativo`.`Asignacion_cursos_maestros`
-- -----------------------------------------------------
CREATE TABLE asignacioncursosmastros
(


  codigo_carrera VARCHAR(5),
  codigo_sede VARCHAR(5),
  codigo_jornada VARCHAR(5),
  codigo_seccion VARCHAR(5),
  codigo_aula VARCHAR(5),
  codigo_curso VARCHAR(5),
  codigo_maestro VARCHAR(5),
  PRIMARY KEY (codigo_carrera, codigo_sede, codigo_jornada, codigo_seccion, codigo_aula, codigo_curso),
  FOREIGN KEY (codigo_carrera) REFERENCES carreras(codigo_carrera),
  FOREIGN KEY (codigo_sede) REFERENCES sedes(codigo_sede),
  FOREIGN KEY (codigo_jornada) REFERENCES jornadas(codigo_jornada),
  FOREIGN KEY (codigo_seccion) REFERENCES secciones(codigo_seccion),
  FOREIGN KEY (codigo_aula) REFERENCES aulas(codigo_aula),
  FOREIGN KEY (codigo_curso) REFERENCES cursos(codigo_curso),
  FOREIGN KEY (codigo_maestro) REFERENCES maestros(codigo_maestro)
  ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
  
  CREATE TABLE IF NOT EXISTS `siu`.`tbl_usuario` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `nombre_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `username_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `password_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `correo_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `cambio_password` TINYINT NULL DEFAULT NULL,
  `estado_usuario` TINYINT NULL DEFAULT NULL,
  `ultima_conexion` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
  
  CREATE TABLE IF NOT EXISTS `siu`.`tbl_bitacora` (
  `PK_id_bitacora` INT NOT NULL AUTO_INCREMENT,
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `fecha` VARCHAR(25)  null DEFAULT NULL,
  `hora` VARCHAR(25) NULL DEFAULT NULL,
  `host1` VARCHAR(45) NULL DEFAULT NULL,
  `ip` VARCHAR(25) NULL DEFAULT NULL,
  `accion` VARCHAR(50) NULL DEFAULT NULL,
  `tabla` VARCHAR(45) NULL DEFAULT NULL,
`PK_id_Modulo` int (25) NULL DEFAULT NULL,
PRIMARY KEY (`PK_id_bitacora`),
 CONSTRAINT `fk_PK_id_Modulo`
 FOREIGN KEY (`PK_id_Modulo`)
REFERENCES `umg`.`tbl_modulo` (`PK_id_Modulo`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO `tbl_usuario` (`PK_id_usuario`, `nombre_usuario`, `apellido_usuario`, `username_usuario`, `password_usuario`, `correo_usuario`, `cambio_password`, `estado_usuario`, `ultima_conexion`) VALUES ('11', 'carlos', 'carlos', 'carlos', '8cb2237d0679ca88db6464eac60da96345513964', 'cflorezd@gmail.com', '1', '1', '2021-05-02 21:00:48');