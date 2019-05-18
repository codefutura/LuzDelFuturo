-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.25-MariaDB - Source distribution
-- SO del servidor:              osx10.6
-- HeidiSQL Versión:             9.5.0.5196
-- CODEFUTURA                    1.0
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_asignatura
CREATE TABLE IF NOT EXISTS `tbl_asignatura` (
  `id_asignatura` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_asignatura`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_asignatura: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_asignatura` DISABLE KEYS */;
INSERT INTO `tbl_asignatura` (`id_asignatura`, `descripcion`) VALUES
	(1, 'Matematica'),
	(2, 'Ciencia Sociales'),
	(3, 'Ciencia Naturales'),
	(4, 'Lengua Espanola'),
	(5, 'Educacion Artistica'),
	(6, 'Educacion Fisica');
/*!40000 ALTER TABLE `tbl_asignatura` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_asignatura_curso
CREATE TABLE IF NOT EXISTS `tbl_asignatura_curso` (
  `id_asignatura_curso` int(11) NOT NULL AUTO_INCREMENT,
  `id_curso` int(11) NOT NULL,
  `id_asignatura` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_asignatura_curso`),
  KEY `FK_tbl_asignatura_curso_tbl_asignatura` (`id_asignatura`),
  KEY `FK_tbl_asignatura_curso_tbl_curso` (`id_curso`),
  CONSTRAINT `FK_tbl_asignatura_curso_tbl_asignatura` FOREIGN KEY (`id_asignatura`) REFERENCES `tbl_asignatura` (`id_asignatura`),
  CONSTRAINT `FK_tbl_asignatura_curso_tbl_curso` FOREIGN KEY (`id_curso`) REFERENCES `tbl_curso` (`id_curso`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_asignatura_curso: ~29 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_asignatura_curso` DISABLE KEYS */;
INSERT INTO `tbl_asignatura_curso` (`id_asignatura_curso`, `id_curso`, `id_asignatura`) VALUES
	(1, 1, 1),
	(2, 1, 2),
	(3, 1, 3),
	(4, 1, 4),
	(5, 1, 5),
	(6, 1, 6),
	(7, 2, 1),
	(8, 2, 2),
	(9, 2, 3),
	(10, 2, 4),
	(11, 2, 5),
	(12, 2, 6),
	(13, 3, 1),
	(14, 3, 2),
	(15, 3, 3),
	(16, 3, 4),
	(17, 3, 5),
	(18, 4, 1),
	(19, 4, 2),
	(20, 4, 3),
	(21, 4, 4),
	(22, 4, 5),
	(23, 4, 6),
	(24, 5, 1),
	(25, 5, 2),
	(26, 5, 3),
	(27, 5, 4),
	(28, 5, 5),
	(29, 5, 6);
/*!40000 ALTER TABLE `tbl_asignatura_curso` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_curso
CREATE TABLE IF NOT EXISTS `tbl_curso` (
  `id_curso` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleado_doc` int(11) DEFAULT NULL,
  `aula` varchar(50) DEFAULT NULL,
  `tanda` tinyint(4) DEFAULT NULL,
  `nombre_tanda` varchar(20) DEFAULT NULL,
  `grado` tinyint(3) DEFAULT NULL,
  `nombre_grado` varchar(20) DEFAULT NULL,
  `anio_escolar` varchar(50) DEFAULT NULL,
  `capacidad` int(5) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_curso`),
  UNIQUE KEY `idx_curso` (`aula`,`tanda`,`grado`,`anio_escolar`),
  KEY `FK_tbl_curso_tbl_empleado` (`id_empleado_doc`),
  KEY `anio_escolar` (`anio_escolar`),
  CONSTRAINT `FK_tbl_curso_tbl_empleado` FOREIGN KEY (`id_empleado_doc`) REFERENCES `tbl_empleado` (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_curso: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_curso` DISABLE KEYS */;
INSERT INTO `tbl_curso` (`id_curso`, `id_empleado_doc`, `aula`, `tanda`, `nombre_tanda`, `grado`, `nombre_grado`, `anio_escolar`, `capacidad`) VALUES
	(1, 1, '1A', 0, 'Matutina', 0, 'Nivel Inicial', '2018-2019', 25),
	(2, 1, '1B', 1, 'Vespertina', 1, 'Primario', '2019-2020', 30),
	(3, 1, '3C', 0, 'Matutina', 2, 'Secundario', '2018-2019', 50),
	(4, 1, '1F', 0, 'Matutina', 1, 'Primario', '2019-2020', 45),
	(5, 1, '1H', 0, 'Matutina', 2, 'Secundario', '2018-2019', 20);
/*!40000 ALTER TABLE `tbl_curso` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_cxc
CREATE TABLE IF NOT EXISTS `tbl_cxc` (
  `id_cxc` int(11) NOT NULL AUTO_INCREMENT,
  `id_padre` int(11) NOT NULL,
  `id_estudiante` int(11) DEFAULT NULL,
  `nombre_padre` varchar(50) NOT NULL DEFAULT '0.00',
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(180) DEFAULT NULL,
  `vence` date DEFAULT NULL,
  `pago` decimal(10,2) NOT NULL DEFAULT '0.00',
  `tdtos` decimal(10,2) NOT NULL DEFAULT '0.00',
  `importe` decimal(10,2) NOT NULL DEFAULT '0.00',
  `estado_pagado` char(2) NOT NULL DEFAULT 'N',
  `mensualidad` decimal(10,2) DEFAULT '0.00',
  `anulada` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_cxc`),
  KEY `FK_tbl_cxc_tbl_padres` (`id_padre`),
  KEY `nombre_padre` (`nombre_padre`),
  KEY `FK_tbl_cxc_tbl_estudiante` (`id_estudiante`),
  CONSTRAINT `FK_tbl_cxc_tbl_estudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `tbl_estudiante` (`id_estudiante`),
  CONSTRAINT `FK_tbl_cxc_tbl_padres` FOREIGN KEY (`id_padre`) REFERENCES `tbl_padres` (`id_padre`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_cxc: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_cxc` DISABLE KEYS */;
INSERT INTO `tbl_cxc` (`id_cxc`, `id_padre`, `id_estudiante`, `nombre_padre`, `fecha`, `descripcion`, `vence`, `pago`, `tdtos`, `importe`, `estado_pagado`, `mensualidad`, `anulada`) VALUES
	(1, 1, 1, 'MANUEL LOPEZ', '2019-05-16', 'AÑO ESCOLAR', '2019-05-16', 7000.00, 0.00, 17000.00, 'N', 1700.00, 0);
/*!40000 ALTER TABLE `tbl_cxc` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_deduccion
CREATE TABLE IF NOT EXISTS `tbl_deduccion` (
  `id_deduccion` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(98) DEFAULT NULL,
  `monto` decimal(10,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id_deduccion`),
  KEY `FK_tbl_deducion_tbl_empleado` (`id_empleado`),
  CONSTRAINT `FK_tbl_deducion_tbl_empleado` FOREIGN KEY (`id_empleado`) REFERENCES `tbl_empleado` (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_deduccion: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_deduccion` DISABLE KEYS */;
INSERT INTO `tbl_deduccion` (`id_deduccion`, `id_empleado`, `fecha`, `descripcion`, `monto`) VALUES
	(1, 1, '2019-04-17', 'SEGURO', 5000.00),
	(2, 1, '2019-04-17', 'IMPUESTO', 1500.00),
	(3, 2, '2019-05-17', 'IMPUESTO', 1200.00);
/*!40000 ALTER TABLE `tbl_deduccion` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_detalle_nomina
CREATE TABLE IF NOT EXISTS `tbl_detalle_nomina` (
  `id_detalle_nomina` int(11) NOT NULL AUTO_INCREMENT,
  `id_nomina` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `deduciones` decimal(10,2) NOT NULL DEFAULT '0.00',
  `sueldo_neto` decimal(10,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id_detalle_nomina`),
  KEY `FK_tbl_detalle_nomina_tbl_empleado` (`id_empleado`),
  KEY `FK_tbl_detalle_nomina_tbl_nomina` (`id_nomina`),
  CONSTRAINT `FK_tbl_detalle_nomina_tbl_empleado` FOREIGN KEY (`id_empleado`) REFERENCES `tbl_empleado` (`id_empleado`),
  CONSTRAINT `FK_tbl_detalle_nomina_tbl_nomina` FOREIGN KEY (`id_nomina`) REFERENCES `tbl_nomina` (`id_nomina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_detalle_nomina: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_detalle_nomina` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_detalle_nomina` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_empleado
CREATE TABLE IF NOT EXISTS `tbl_empleado` (
  `id_empleado` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `cedula` varchar(14) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `puesto` int(6) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `sueldo` decimal(10,2) DEFAULT '0.00',
  `tipo_empleado` int(4) DEFAULT '0',
  `area_trabajo` int(4) DEFAULT '0',
  PRIMARY KEY (`id_empleado`),
  KEY `nombre` (`nombre`),
  KEY `tipo_empleado` (`tipo_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_empleado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_empleado` DISABLE KEYS */;
INSERT INTO `tbl_empleado` (`id_empleado`, `nombre`, `direccion`, `cedula`, `telefono`, `puesto`, `fecha_inicio`, `sueldo`, `tipo_empleado`, `area_trabajo`) VALUES
	(1, 'SAMUEL DIAZ', 'C/ LUPERON 74', '071-0040231-7', '809-458-7845', 1, '2019-05-16', 30000.00, 0, 1),
	(2, 'JOSEFINA DUARTE', 'NAGUA', '402-2537043-2', '809-458-8541', 2, '1980-10-08', 10000.00, 1, 0);
/*!40000 ALTER TABLE `tbl_empleado` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_estudiante
CREATE TABLE IF NOT EXISTS `tbl_estudiante` (
  `id_estudiante` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `telefono` varchar(18) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `id_padre` int(11) DEFAULT NULL,
  `id_madre` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_estudiante`),
  KEY `FK_tbl_estudiante_tbl_padres` (`id_padre`),
  KEY `FK_tbl_estudiante_tbl_padres_2` (`id_madre`),
  CONSTRAINT `FK_tbl_estudiante_tbl_padres` FOREIGN KEY (`id_padre`) REFERENCES `tbl_padres` (`id_padre`),
  CONSTRAINT `FK_tbl_estudiante_tbl_padres_2` FOREIGN KEY (`id_madre`) REFERENCES `tbl_padres` (`id_padre`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_estudiante: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_estudiante` DISABLE KEYS */;
INSERT INTO `tbl_estudiante` (`id_estudiante`, `nombre`, `direccion`, `telefono`, `fecha_nacimiento`, `email`, `id_padre`, `id_madre`) VALUES
	(1, 'JAVIER MARTES', 'C/ PROGRESO 89', '809-458-7454', '2018-01-01', 'DEMO@GMAIL.COM', 1, NULL),
	(2, 'JOSE MARIA DIAZ', 'C/ MARIANO PEREZ', '829-458-6455', '2017-01-01', 'info@gmail.com', NULL, 2),
	(17, 'MARIA ALTAGRACIA', 'C/ Altagracias NRO. 14', '809-475-1223', '2010-01-11', 'INFO@GMAIL.COM', NULL, 3),
	(18, 'SAUL MARTE DIAZ', 'C/ JULIO LAMPLE', '829-423-1012', '2014-01-01', '', 4, NULL),
	(19, 'ALEXANDER PEREZ', 'SOLDADO ARRIBA', '829-475-7854', '1997-01-18', 'ALEXANDER@GMAIL.COM', 5, 6),
	(20, 'JUANJO LOPEZ', 'C/ LUPERON', '849-458-9874', '2014-01-02', '', 7, NULL);
/*!40000 ALTER TABLE `tbl_estudiante` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_estudiante_curso
CREATE TABLE IF NOT EXISTS `tbl_estudiante_curso` (
  `id_estudiante_curso` int(11) NOT NULL AUTO_INCREMENT,
  `id_curso` int(11) DEFAULT NULL,
  `id_estudiante` int(11) DEFAULT NULL,
  `nota_final` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_estudiante_curso`),
  KEY `FK_tbl_estudiante_curso_tbl_estudiante` (`id_estudiante`),
  KEY `FK_tbl_estudiante_curso_tbl_curso` (`id_curso`),
  CONSTRAINT `FK_tbl_estudiante_curso_tbl_curso` FOREIGN KEY (`id_curso`) REFERENCES `tbl_curso` (`id_curso`) ON DELETE CASCADE,
  CONSTRAINT `FK_tbl_estudiante_curso_tbl_estudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `tbl_estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_estudiante_curso: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_estudiante_curso` DISABLE KEYS */;
INSERT INTO `tbl_estudiante_curso` (`id_estudiante_curso`, `id_curso`, `id_estudiante`, `nota_final`) VALUES
	(1, 1, 1, 0),
	(2, 1, 17, 0),
	(3, 2, 2, 0),
	(4, 3, 19, 0),
	(5, 4, 20, 0),
	(6, 5, 20, 0);
/*!40000 ALTER TABLE `tbl_estudiante_curso` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_nomina
CREATE TABLE IF NOT EXISTS `tbl_nomina` (
  `id_nomina` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `descripcion` varchar(80) DEFAULT NULL,
  `total_deducion` decimal(10,2) DEFAULT '0.00',
  `total` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`id_nomina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_nomina: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_nomina` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_nomina` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_nota
CREATE TABLE IF NOT EXISTS `tbl_nota` (
  `id_nota` int(11) NOT NULL AUTO_INCREMENT,
  `id_estudiante` int(11) DEFAULT NULL,
  `id_asignatura` int(11) DEFAULT NULL,
  `id_curso` int(11) DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `calificacion` int(4) NOT NULL DEFAULT '0',
  `observacion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_nota`),
  UNIQUE KEY `idx_nota_publica` (`id_estudiante`,`id_asignatura`,`id_curso`),
  KEY `FK_tbl_nota_tbl_asignatura` (`id_asignatura`),
  KEY `fecha_publicacion` (`fecha_publicacion`),
  KEY `FK_tbl_nota_tbl_curso` (`id_curso`),
  CONSTRAINT `FK_tbl_nota_tbl_asignatura` FOREIGN KEY (`id_asignatura`) REFERENCES `tbl_asignatura` (`id_asignatura`),
  CONSTRAINT `FK_tbl_nota_tbl_curso` FOREIGN KEY (`id_curso`) REFERENCES `tbl_curso` (`id_curso`) ON DELETE CASCADE,
  CONSTRAINT `FK_tbl_nota_tbl_estudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `tbl_estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_nota: ~29 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_nota` DISABLE KEYS */;
INSERT INTO `tbl_nota` (`id_nota`, `id_estudiante`, `id_asignatura`, `id_curso`, `fecha_publicacion`, `calificacion`, `observacion`) VALUES
	(1, 1, 1, 1, '2019-05-17', 78, ''),
	(2, 1, 2, 1, '2019-05-17', 90, 'Buen Trabajo'),
	(3, 1, 3, 1, '2019-05-17', 81, ''),
	(4, 1, 4, 1, '2019-05-17', 77, ''),
	(5, 1, 5, 1, '2019-05-17', 78, ''),
	(6, 1, 6, 1, '2019-05-17', 90, ''),
	(7, 17, 1, 1, '2019-05-17', 70, ''),
	(8, 17, 2, 1, '2019-05-17', 87, 'Buen Trabajo'),
	(9, 17, 3, 1, '2019-05-17', 88, ''),
	(10, 17, 4, 1, '2019-05-17', 90, ''),
	(11, 17, 5, 1, '2019-05-17', 60, ''),
	(12, 17, 6, 1, '2019-05-17', 77, ''),
	(15, 2, 1, 2, '2019-05-17', 78, ''),
	(16, 2, 2, 2, '2019-05-17', 70, ''),
	(17, 2, 3, 2, '2019-05-17', 90, ''),
	(18, 2, 4, 2, '2019-05-17', 100, 'Excelente'),
	(19, 2, 5, 2, '2019-05-17', 85, ''),
	(20, 2, 6, 2, '2019-05-17', 74, ''),
	(22, 20, 1, 5, '2019-05-17', 84, ''),
	(23, 20, 2, 5, '2019-05-17', 77, ''),
	(24, 20, 3, 5, '2019-05-17', 85, ''),
	(25, 20, 4, 5, '2019-05-17', 94, ''),
	(26, 20, 5, 5, '2019-05-17', 97, ''),
	(27, 20, 6, 5, '2019-05-17', 78, ''),
	(39, 19, 1, 3, '2019-05-18', 78, ''),
	(40, 19, 2, 3, '2019-05-18', 80, 'Buen trabajo'),
	(41, 19, 3, 3, '2019-05-18', 80, ''),
	(42, 19, 4, 3, '2019-05-18', 74, ''),
	(43, 19, 5, 3, '2019-05-18', 71, '');
/*!40000 ALTER TABLE `tbl_nota` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_padres
CREATE TABLE IF NOT EXISTS `tbl_padres` (
  `id_padre` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `telefono` varchar(24) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `cedula` varchar(50) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `titular_pago` tinyint(2) DEFAULT '0',
  `sexo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_padre`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_padres: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_padres` DISABLE KEYS */;
INSERT INTO `tbl_padres` (`id_padre`, `nombre`, `direccion`, `telefono`, `fecha_nacimiento`, `cedula`, `email`, `titular_pago`, `sexo`) VALUES
	(1, 'MANUEL LOPEZ', 'C/ MARIANO NO.78', '829-555-4574', '2001-01-02', '001-45700001-4', 'MANUEL001@GMAIL.COM', 1, 0),
	(2, 'RAMONA DIAZ', 'C/ MARIANO PEREZ', '849-544-5621', '2012-01-03', '001-4445411-44', '', 1, 1),
	(3, 'MARTINA LOPEZ', 'C/ Altagracia Nro. 14', '829-475-4578', '1980-01-07', '071-0012450-1', '', 1, 1),
	(4, 'ALBERT MARTE', 'C/ JULIO LAMPLE', '', '1984-01-16', '071-004215-8', '', 1, 0),
	(5, 'SEBASTIAN', 'SOLDADO ARRIBA', '802-457-6811', '1970-01-01', '071-004241-8', '', 1, 0),
	(6, 'ALEXANDRA', 'SOLDADO', '', NULL, '71114444444', '', 0, 1),
	(7, 'ROBERTO LOPEZ', 'NAGUA', '', NULL, '0011244425', '', 1, 0);
/*!40000 ALTER TABLE `tbl_padres` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_recibo
CREATE TABLE IF NOT EXISTS `tbl_recibo` (
  `id_recibo` int(11) NOT NULL AUTO_INCREMENT,
  `id_cxc` int(11) DEFAULT NULL,
  `id_padre` int(11) DEFAULT NULL,
  `id_estudiante` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `concepto` varchar(80) DEFAULT NULL,
  `descuento` decimal(10,2) DEFAULT '0.00',
  `Importe` decimal(10,2) DEFAULT '0.00',
  `numero_recibo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_recibo`),
  KEY `FK_tbl_recibo_tbl_padres` (`id_padre`),
  KEY `FK_tbl_recibo_tbl_estudiante` (`id_estudiante`),
  KEY `FK_tbl_recibo_tbl_cxc` (`id_cxc`),
  CONSTRAINT `FK_tbl_recibo_tbl_cxc` FOREIGN KEY (`id_cxc`) REFERENCES `tbl_cxc` (`id_cxc`),
  CONSTRAINT `FK_tbl_recibo_tbl_estudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `tbl_estudiante` (`id_estudiante`),
  CONSTRAINT `FK_tbl_recibo_tbl_padres` FOREIGN KEY (`id_padre`) REFERENCES `tbl_padres` (`id_padre`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_recibo: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_recibo` DISABLE KEYS */;
INSERT INTO `tbl_recibo` (`id_recibo`, `id_cxc`, `id_padre`, `id_estudiante`, `fecha`, `concepto`, `descuento`, `Importe`, `numero_recibo`) VALUES
	(1, 1, 1, 1, '2019-05-17', 'PAGO DE 4 MESES ', 350.00, 7000.00, '0000001');
/*!40000 ALTER TABLE `tbl_recibo` ENABLE KEYS */;

-- Volcando estructura para tabla dbLuzDelFuturo.tbl_usuario
CREATE TABLE IF NOT EXISTS `tbl_usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `clave` varchar(20) DEFAULT NULL,
  `usuario_web` tinyint(4) NOT NULL DEFAULT '0',
  `id_estudiante` int(11) DEFAULT NULL,
  `tipo` int(4) DEFAULT '0',
  PRIMARY KEY (`id_usuario`),
  KEY `FK_tbl_usuario_tbl_estudiante` (`id_estudiante`),
  CONSTRAINT `FK_tbl_usuario_tbl_estudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `tbl_estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla dbLuzDelFuturo.tbl_usuario: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` (`id_usuario`, `nombre`, `clave`, `usuario_web`, `id_estudiante`, `tipo`) VALUES
	(1, 'ADMIN', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 0),
	(2, 'JOSE', '2000', 1, 2, 2),
	(3, 'JAVIER', '1000', 1, 1, 2),
	(5, 'Secretaria', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 1),
	(6, 'profesor', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 3),
	(7, 'coordinador', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 5),
	(8, 'registro', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 6),
	(9, 'nomina', 'Ô\0Oß‹%ºOQVf/bDÅ', 0, NULL, 4),
	(10, 'MARIA', '17000', 1, 17, 2),
	(11, 'SAUL', '18000', 1, 18, 2),
	(12, 'ALEXANDER', '19000', 1, 19, 2),
	(13, 'JUANJO', '20000', 1, 20, 2);
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;

-- Volcando estructura para disparador dbLuzDelFuturo.tbl_estudiante_after_insert
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tbl_estudiante_after_insert` AFTER INSERT ON `tbl_estudiante` FOR EACH ROW BEGIN
INSERT INTO tbl_usuario (nombre, clave,tipo,id_estudiante,usuario_web) VALUES ( ltrim(replace(substring(substring_index(new.nombre, " ", 1), length(substring_index(new.nombre, " ", 1 - 1)) + 1), " ", '')), CONCAT(new.id_estudiante,"000"),2,new.id_estudiante,1);
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador dbLuzDelFuturo.tbl_recibo_before_insert
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION';
DELIMITER //
CREATE TRIGGER `tbl_recibo_before_insert` AFTER INSERT ON `tbl_recibo` FOR EACH ROW BEGIN
UPDATE tbl_cxc SET pago=pago+new.Importe WHERE id_cxc=new.id_cxc ;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
