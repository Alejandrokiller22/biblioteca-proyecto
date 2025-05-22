-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-05-2025 a las 12:50:39
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `devolver_libro` (IN `libro_id` VARCHAR(10))   BEGIN
    UPDATE libros
    SET Disponible = TRUE
    WHERE Id = libro_id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prestar_libro` (IN `libro_id` VARCHAR(10))   BEGIN
    UPDATE libros
    SET Disponible = FALSE
    WHERE Id = libro_id;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generos`
--

CREATE TABLE `generos` (
  `IdLibro` varchar(10) DEFAULT NULL,
  `Genero` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `generos`
--

INSERT INTO `generos` (`IdLibro`, `Genero`) VALUES
('L001', 'Realismo Mágico'),
('L002', 'Distopía'),
('L004', 'Terror'),
('L004', 'Ciencia Ficción'),
('L005', 'Ciencia Ficción'),
('L006', 'Terror'),
('L007', 'Ciencia Ficción');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_eliminaciones`
--

CREATE TABLE `historial_eliminaciones` (
  `Id` varchar(10) DEFAULT NULL,
  `Titulo` varchar(100) DEFAULT NULL,
  `FechaEliminacion` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `Id` varchar(30) NOT NULL,
  `Titulo` varchar(30) NOT NULL,
  `Autor` varchar(30) NOT NULL,
  `Editorial` varchar(30) NOT NULL,
  `Anio` int(30) NOT NULL,
  `Disponible` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`Id`, `Titulo`, `Autor`, `Editorial`, `Anio`, `Disponible`) VALUES
('L001', 'Cien Años de Soledad', 'Gabriel García Márquez', 'Sudamericana', 1967, 1),
('L002', 'Frankenstein', 'Mary Shelley', 'Lackington, Hughes, Harding, M', 1818, 1),
('L003', 'Breves respuestas a las grande', 'Stephen Hawking', 'Penguin Books', 2018, 1),
('L004', 'Drácula', 'Bram Stoker', 'Archibald Constable and Compan', 1897, 0),
('L005', 'Fahrenheit 451', 'Ray Bradbury', 'Ballantine Books', 1953, 1),
('L006', 'El mundo de Sofía', 'Jostein Gaarder', 'Siruela', 1991, 1),
('L007', 'Viaje al centro de la Tierra', 'Julio Verne', 'Pierre-Jules Hetzel', 1864, 0);

--
-- Disparadores `libros`
--
DELIMITER $$
CREATE TRIGGER `after_delete_libro` AFTER DELETE ON `libros` FOR EACH ROW BEGIN
    INSERT INTO historial_eliminaciones (Id, Titulo)
    VALUES (OLD.Id, OLD.Titulo);
END
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `generos`
--
ALTER TABLE `generos`
  ADD KEY `IdLibro` (`IdLibro`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`Id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `generos`
--
ALTER TABLE `generos`
  ADD CONSTRAINT `generos_ibfk_1` FOREIGN KEY (`IdLibro`) REFERENCES `libros` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
