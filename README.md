# Proyecto Portfolio Back-End
Este proyecto consiste en la realización de un Portfolio como medio de aprobación para el curso de Desarrollador Web Full Stack dictado por Argentina Programa. En este repositorio se encuentra el Back-End del proyecto. El Front-End del mismo se encuantra en el siguiente repositorio: https://github.com/NicolasCesarini/Angular. Por último el portfolio web se enecuntra en la siguiente dirección: https://portfolio-frontend-nicolas.web.app/.

## DER
![image](https://i.ibb.co/TTLyHH8/DER.png)

## Script SQL
-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bsumm0gbdjmt33670n4k-mysql.services.clever-cloud.com:3306
-- Generation Time: Mar 25, 2023 at 06:45 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bsumm0gbdjmt33670n4k`
--
CREATE DATABASE IF NOT EXISTS `bsumm0gbdjmt33670n4k` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `bsumm0gbdjmt33670n4k`;

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` int(11) NOT NULL,
  `anio` varchar(255) DEFAULT NULL,
  `descripción_educación` varchar(800) DEFAULT NULL,
  `img_curso` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `titulo_curso` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `anio`, `descripción_educación`, `img_curso`, `institucion`, `titulo_curso`) VALUES
(6, '2013 - Actualidad', 'Tesista de la carrera Ingeniería de Sonido dictada por en la UNTREF.', 'https://i.ibb.co/yYyXRYT/U-nacional-tres-de-febrero.jpg', 'Universidad Nacional de Tres de Febrero', 'Ingeniería de Sonido'),
(7, '2023', 'Curso intensivo con una duración de 100 horas en el cuál se realizan 2 proyectos de páginas web escalables para ir aplicando los conocimientos que se adquieren en el trascurso de la capacitación.', 'https://i.ibb.co/ZcWnD9P/Logo-Mindhub.png', 'Argentina Programa + MindHub', 'Desarrollador Web Front-End'),
(8, '2022 - 2023', 'Estudio integrado por los cursos Se Programar y Yo Programo. Con la creación de un portfolio personal para la aprobación del último.', 'https://i.ibb.co/yRJ9wt7/Logo-Argentina-Programa.png', 'Argentina Programa\n', 'Desarrollador FullStack');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` int(11) NOT NULL,
  `anio` varchar(255) DEFAULT NULL,
  `descripcion_trabajo` varchar(800) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `img_experiencia` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `anio`, `descripcion_trabajo`, `empresa`, `img_experiencia`, `puesto`) VALUES
(9, '2021 - 2022', 'Pasantía en el Hospital Italiano en el desarrollo de la práctica profesional de Ingeniería de Sonido. En su transcurso se recolectaron, procesaron y analizaron datos de habla humana con el fin de desarrollar una herramienta para poder detectar y prevenir enfermedades degenerativas que afecten el habla.', 'Hospital Italiano', 'https://i.ibb.co/7j1MGBB/hospital-italiano.png', 'Pasante en el área de investigación');

-- --------------------------------------------------------

--
-- Table structure for table `habilidad`
--

CREATE TABLE `habilidad` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `porcentaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `habilidad`
--

INSERT INTO `habilidad` (`id`, `nombre`, `porcentaje`) VALUES
(3, 'HTML', 70),
(4, 'CSS', 60),
(5, 'Javascript', 70),
(6, 'Python', 70),
(7, 'Angular', 60),
(8, 'Vue', 30);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `acerca_de` varchar(800) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `clave` varchar(255) DEFAULT NULL,
  `edad` int(11) NOT NULL,
  `email` tinytext,
  `img_perfil` varchar(255) DEFAULT NULL,
  `linkcv` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `img_banner` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `acerca_de`, `apellido`, `clave`, `edad`, `email`, `img_perfil`, `linkcv`, `nombre`, `img_banner`) VALUES
(1, 'Hola. Mi nombre es Nicolás Cesarini y bienvenido a mi portfolio.', 'Cesarini', '123456789', 29, 'nicolascesarini94@hotmail.com', 'https://i.ibb.co/yWvp3F0/Imagen-de-Whats-App-2023-03-21-a-las-20-14-50.jpg', '-----', 'Nicolas', 'https://i.pinimg.com/736x/c5/3b/2d/c53b2ddeb7f7b998a559f9cf6fd55b43.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE `proyecto` (
  `id` int(11) NOT NULL,
  `anio` varchar(255) DEFAULT NULL,
  `descripción_proyecto` varchar(800) DEFAULT NULL,
  `img_proyecto` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `nombre_proyecto` varchar(255) DEFAULT NULL,
  `link_proyecto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyecto`
--

INSERT INTO `proyecto` (`id`, `anio`, `descripción_proyecto`, `img_proyecto`, `institucion`, `nombre_proyecto`, `link_proyecto`) VALUES
(5, '2022-2023', 'Front-End del Portfolio Web realizado como condición de aprobación del curso de Desarrollador Web Full-Stack de Argentina Programa.', 'https://i.ibb.co/yRJ9wt7/Logo-Argentina-Programa.png', 'Argentina Programa', 'Porfolio Web - FrontEnd', 'https://github.com/NicolasCesarini/Angular'),
(7, '2022-2023', 'Back-End del Portfolio Web realizado como condición de aprobación del curso de Desarrollador Web Full-Stack de Argentina Programa.', 'https://i.ibb.co/yRJ9wt7/Logo-Argentina-Programa.png', 'Argentina Programa', 'Porfolio Web - BackEnd', 'https://github.com/NicolasCesarini/porfolioBackEnd');

-- --------------------------------------------------------

--
-- Table structure for table `redes`
--

CREATE TABLE `redes` (
  `id` int(11) NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `red` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `redes`
--

INSERT INTO `redes` (`id`, `color`, `link`, `red`) VALUES
(10, '--', 'mailto:nicolascesarini94@hotmail.com', 'fa-solid fa-envelope'),
(11, '--', 'https://www.linkedin.com/in/nicolas-cesarini-a296a8139/', 'fa-brands fa-linkedin'),
(12, '--', 'https://github.com/NicolasCesarini', 'fa-brands fa-github');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `habilidad`
--
ALTER TABLE `habilidad`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `redes`
--
ALTER TABLE `redes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `educacion`
--
ALTER TABLE `educacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `experiencia`
--
ALTER TABLE `experiencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `habilidad`
--
ALTER TABLE `habilidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `redes`
--
ALTER TABLE `redes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


# :wave:Gracias por visitar mi Repositorio.