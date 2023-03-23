-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 23 mars 2023 à 11:33
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tp_interface`
--

-- --------------------------------------------------------

--
-- Structure de la table `bac`
--

CREATE TABLE `bac` (
  `idBac` int(11) NOT NULL,
  `libelle` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bac`
--

INSERT INTO `bac` (`idBac`, `libelle`) VALUES
(1, 'Bac1'),
(2, 'Bac2'),
(3, 'Bac3'),
(4, 'Bac4');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `idEtud` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `dateNaiss` date NOT NULL,
  `LieuNaiss` varchar(20) NOT NULL,
  `sexe` varchar(20) NOT NULL,
  `nationalite` varchar(25) NOT NULL,
  `rue` varchar(25) NOT NULL,
  `cp` varchar(15) NOT NULL,
  `ville` varchar(25) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `mail` varchar(25) NOT NULL,
  `niveau` varchar(20) NOT NULL,
  `idFil` int(11) NOT NULL,
  `idBac` int(11) NOT NULL,
  `loisir` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`idEtud`, `nom`, `prenom`, `dateNaiss`, `LieuNaiss`, `sexe`, `nationalite`, `rue`, `cp`, `ville`, `telephone`, `mail`, `niveau`, `idFil`, `idBac`, `loisir`) VALUES
(18, 'erge', 'erg', '2003-07-18', 'erg', 'Homme', 'erg', 'rgerg', '78330', 'erg', 'erggre', 'erger', 'confirme', 10, 11, 'sport'),
(3, 'qerg', 'ergerg', '2003-07-18', 'sefzef', 'Femme', 'zefzef', 'zefzef', '78330', 'zefzef', 'zefzef', 'zefzef', 'Intermediaire', 2, 3, 'sport'),
(3, 'Vidil', 'Titouan', '2003-07-18', 'Neuilly-sur-Seine', 'Homme', 'Francaise', '6 Beaudin', '94000', 'Ivry-sur-Seine', '0783234563', 'titouan.vidil.esme.fr', 'Confimé', 2, 4, 'sport'),
(3, 'Vidil', 'Titouan', '2003-07-18', 'ergezrg', 'Homme', 'rgerg', 'ergerg', 'erge', 'erger', 'erg', 'erg', 'Confimé', 2, 4, 'sport'),
(3, 'ZERG', 'RGERG', '2003-07-18', 'zeff', 'Homme', 'ezfzef', 'zefzef', 'zef', 'zef', 'zef', 'zef', 'Débutant', 1, 1, 'sport'),
(3, 'ZEF', 'ZEF', '2003-07-18', 'zef', 'Femme', 'ZEFzef', 'ZEF', 'ZEF', 'zef', 'zef', 'ZEF', 'Débutant', 1, 1, 'sport'),
(3, 'qerg', 'erg', '2003-07-18', 'qerg', 'Femme', 'erg', 'erg', 'qerg', 'qerg', 'qerg', 'qerg', 'Intermediaire', 2, 3, 'sport'),
(3, 'zefzef', 'zefzef', '2003-07-18', 'zefzef', '', 'zefzef', 'efzef', 'zefzefzef', 'zefze', 'zefzef', 'zefz', 'Débutant', 1, 1, 'sport'),
(3, 'fezfz', 'zefze', '2003-07-18', 'zefze', '', 'zef', 'ef', 'efzefezf', 'zefze', 'zef', 'zef', 'Débutant', 1, 1, 'sport'),
(3, 'wdfgdf', 'fdgdfg', '2003-07-18', '', '', '', '', '', '', '', '', 'Débutant', 1, 1, 'sport'),
(3, 'fzef', 'ezf', '2003-07-18', 'zefze', '', 'fzef', 'zef', 'fzefzef', 'zefze', 'zefze', 'fzef', 'Débutant', 1, 1, 'sport'),
(3, 'zefe', 'fzef', '2003-07-18', 'zad', 'Femme', 'azd', 'azdza', 'azdaz', 'dzad', 'dazd', 'azdazd', 'Intermediaire', 2, 3, 'sport'),
(3, 'zefe', 'fzef', '2003-07-18', 'zad', 'Femme', 'azd', 'azdza', 'azdaz', 'dzad', 'dazd', 'azdazd', 'Intermediaire', 2, 3, 'sport'),
(3, 'zfzef', 'zefzef', '2003-07-18', 'fzefzef', 'Femme', 'zef', 'fze', 'ezeze', 'ezzefz', 'zeze', 'zeze', 'Débutant', 1, 1, 'sport'),
(3, 'zfzef', 'zefzef', '2003-07-18', 'fzefzef', 'Femme', 'zef', 'fze', 'ezeze', 'ezzefz', 'zeze', 'zeze', 'Débutant', 1, 1, 'sport'),
(3, 'Pagezy', 'Gauthier', '1998-08-21', 'Levallois', 'Femme', 'Francaise', 'gergrg', '92300', 'rgerg', '786786786', 'segsegeszgfertg', 'Débutant', 2, 4, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'Dupont', 'Albert', '1950-10-11', 'Versailles', 'Homme', 'Francaise', 'Avenue de la Reine', '78000', 'Versailles', '21564848', 'albert.dupont@gmail.com', 'Confimé', 1, 1, 'sport'),
(3, 'erger', 'gerg', '2003-07-18', 'tytyy', 'Homme', 'tyjty', 'yuk', 'yktyj', 'yukyuk', '+33 7 83 23 45 63', 'gerg', 'Débutant', 1, 1, 'Musique Voyages ');

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `idFil` int(11) NOT NULL,
  `nom` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`idFil`, `nom`) VALUES
(1, 'Fil1'),
(2, 'Fil2');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `mail`, `login`, `password`) VALUES
(123456, 'titouan.vidil@esme.fr', 'Titouan', 'root');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123457;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
