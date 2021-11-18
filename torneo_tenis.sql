-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2021 a las 00:56:48
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo_tenis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadio`
--

CREATE TABLE `estadio` (
  `Id_estadio` int(11) NOT NULL,
  `numero_ident` int(11) NOT NULL,
  `ciudad` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `largo` double NOT NULL,
  `ancho` double NOT NULL,
  `cantidad_espectadores` int(11) NOT NULL,
  `categoria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estadio`
--

INSERT INTO `estadio` (`Id_estadio`, `numero_ident`, `ciudad`, `direccion`, `estado`, `largo`, `ancho`, `cantidad_espectadores`, `categoria`) VALUES
(2, 200, 'Villa Mercedes', 'San Martin', 'Sin Usar', 1, 1, 55000, 'Cesped'),
(3, 777, 'Bueno Aires', 'Boca', 'Sin Usar', 1, 1, 20000000, 'Ladrillo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores`
--

CREATE TABLE `jugadores` (
  `Id_jugador` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `dni` int(8) NOT NULL,
  `fecha_nac` date NOT NULL,
  `altura` double(3,2) NOT NULL,
  `peso` double(3,2) NOT NULL,
  `estilo` varchar(255) NOT NULL,
  `diestro` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `jugadores`
--

INSERT INTO `jugadores` (`Id_jugador`, `nombre`, `apellido`, `dni`, `fecha_nac`, `altura`, `peso`, `estilo`, `diestro`) VALUES
(1, 'Pedro', 'Picapiedra', 1244301, '2012-12-12', 1.00, 1.00, 'Voleadores', 1),
(2, 'Carlos', 'Menen', 44360075, '1990-01-01', 1.00, 1.00, 'Agresivo', 1),
(3, 'Juan', 'Carlos', 44360273, '2001-09-19', 1.00, 1.00, 'Toda la cancha', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `Id_partido` int(11) NOT NULL,
  `Id_torneo` int(11) NOT NULL,
  `Id_estadio` int(11) NOT NULL,
  `id_jugador1` int(11) NOT NULL,
  `id_jugador2` int(11) NOT NULL,
  `id_ganador` int(11) NOT NULL DEFAULT 0,
  `fechayhora` datetime NOT NULL,
  `estado` varchar(255) NOT NULL,
  `resultado` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`Id_partido`, `Id_torneo`, `Id_estadio`, `id_jugador1`, `id_jugador2`, `id_ganador`, `fechayhora`, `estado`, `resultado`) VALUES
(2, 2, 2, 1, 2, 0, '2021-11-17 17:22:05', 'Por jugar', '0-0 0-0 0-0'),
(3, 2, 3, 2, 1, 0, '2021-11-19 15:30:00', 'Por Jugar', '0-0 0-0 0-0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patrocinador`
--

CREATE TABLE `patrocinador` (
  `Id_patrocinador` int(11) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `indumentaria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `patrocinador`
--

INSERT INTO `patrocinador` (`Id_patrocinador`, `marca`, `indumentaria`) VALUES
(1, 'Nike', 'Vermudas'),
(2, 'Puma', 'Remera');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patrocinio`
--

CREATE TABLE `patrocinio` (
  `Id_patrocinio` int(11) NOT NULL,
  `Id_jugador` int(11) NOT NULL,
  `Id_patrocinador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `patrocinio`
--

INSERT INTO `patrocinio` (`Id_patrocinio`, `Id_jugador`, `Id_patrocinador`) VALUES
(4, 1, 1),
(13, 1, 2),
(12, 2, 2),
(14, 3, 1),
(15, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ranking`
--

CREATE TABLE `ranking` (
  `Id_Ranking` int(11) NOT NULL,
  `Id_Torneo` int(11) NOT NULL,
  `Id_Jugador` int(11) NOT NULL,
  `Puntaje` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ranking`
--

INSERT INTO `ranking` (`Id_Ranking`, `Id_Torneo`, `Id_Jugador`, `Puntaje`) VALUES
(1, 2, 1, 0),
(2, 2, 2, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `torneo`
--

CREATE TABLE `torneo` (
  `Id_torneo` int(11) NOT NULL,
  `nombre_torneo` varchar(255) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `torneo`
--

INSERT INTO `torneo` (`Id_torneo`, `nombre_torneo`, `fecha_inicio`, `fecha_fin`) VALUES
(2, 'Torneo1', '2021-11-17', '2021-11-25'),
(3, 'Toneo Mundial', '2021-11-17', '2021-11-30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estadio`
--
ALTER TABLE `estadio`
  ADD PRIMARY KEY (`Id_estadio`);

--
-- Indices de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD PRIMARY KEY (`Id_jugador`);

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`Id_partido`),
  ADD UNIQUE KEY `id_jugador1_2` (`id_jugador1`,`id_jugador2`),
  ADD KEY `Id_torneo` (`Id_torneo`) USING BTREE,
  ADD KEY `Id_estadio` (`Id_estadio`),
  ADD KEY `id_jugador1` (`id_jugador1`,`id_jugador2`),
  ADD KEY `id_jugador2` (`id_jugador2`);

--
-- Indices de la tabla `patrocinador`
--
ALTER TABLE `patrocinador`
  ADD PRIMARY KEY (`Id_patrocinador`);

--
-- Indices de la tabla `patrocinio`
--
ALTER TABLE `patrocinio`
  ADD PRIMARY KEY (`Id_patrocinio`),
  ADD UNIQUE KEY `Id_jugador_2` (`Id_jugador`,`Id_patrocinador`),
  ADD KEY `Id_jugador` (`Id_jugador`),
  ADD KEY `Id_patrocinador` (`Id_patrocinador`);

--
-- Indices de la tabla `ranking`
--
ALTER TABLE `ranking`
  ADD PRIMARY KEY (`Id_Ranking`),
  ADD KEY `Id_Torneo` (`Id_Torneo`,`Id_Jugador`),
  ADD KEY `Id_Jugador` (`Id_Jugador`);

--
-- Indices de la tabla `torneo`
--
ALTER TABLE `torneo`
  ADD PRIMARY KEY (`Id_torneo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estadio`
--
ALTER TABLE `estadio`
  MODIFY `Id_estadio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  MODIFY `Id_jugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `Id_partido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `patrocinador`
--
ALTER TABLE `patrocinador`
  MODIFY `Id_patrocinador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `patrocinio`
--
ALTER TABLE `patrocinio`
  MODIFY `Id_patrocinio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `ranking`
--
ALTER TABLE `ranking`
  MODIFY `Id_Ranking` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `torneo`
--
ALTER TABLE `torneo`
  MODIFY `Id_torneo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `partido_ibfk_2` FOREIGN KEY (`Id_estadio`) REFERENCES `estadio` (`Id_estadio`),
  ADD CONSTRAINT `partido_ibfk_3` FOREIGN KEY (`id_jugador1`) REFERENCES `jugadores` (`Id_jugador`),
  ADD CONSTRAINT `partido_ibfk_4` FOREIGN KEY (`id_jugador2`) REFERENCES `jugadores` (`Id_jugador`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `partido_ibfk_5` FOREIGN KEY (`Id_torneo`) REFERENCES `torneo` (`Id_torneo`);

--
-- Filtros para la tabla `patrocinio`
--
ALTER TABLE `patrocinio`
  ADD CONSTRAINT `patrocinio_ibfk_1` FOREIGN KEY (`Id_jugador`) REFERENCES `jugadores` (`Id_jugador`),
  ADD CONSTRAINT `patrocinio_ibfk_2` FOREIGN KEY (`Id_patrocinador`) REFERENCES `patrocinador` (`Id_patrocinador`);

--
-- Filtros para la tabla `ranking`
--
ALTER TABLE `ranking`
  ADD CONSTRAINT `ranking_ibfk_1` FOREIGN KEY (`Id_Torneo`) REFERENCES `torneo` (`Id_torneo`),
  ADD CONSTRAINT `ranking_ibfk_2` FOREIGN KEY (`Id_Jugador`) REFERENCES `jugadores` (`Id_jugador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
