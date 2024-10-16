-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 16 Okt 2024 pada 06.09
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental_mobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `isi`
--

CREATE TABLE `isi` (
  `idnota` varchar(6) NOT NULL,
  `kdmobil` varchar(6) NOT NULL,
  `hargamobil` int(11) NOT NULL,
  `idsupir` varchar(6) NOT NULL,
  `hargasupir` int(11) NOT NULL,
  `dp` int(11) NOT NULL,
  `lama` int(11) NOT NULL,
  `tunggakan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `kdmobil` varchar(6) NOT NULL,
  `merek` varchar(25) NOT NULL,
  `tahun` varchar(4) NOT NULL,
  `nopolisi` varchar(25) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`kdmobil`, `merek`, `tahun`, `nopolisi`, `harga`) VALUES
('01', 'Honda', '2001', 'B 1234  ABC', 500000),
('02', 'Mazda', '2002', 'B 1234  ABD', 550000),
('03', 'Bmw', '2003', 'B 1234  ABE', 600000),
('04', 'Nissan', '2004', 'B 1234  ABF', 650000),
('05', 'Suzuki', '2005', 'B 1234  ABG', 700000),
('06', 'Daihatsu', '2006', 'B 1234  ABH', 750000),
('07', 'Toyota', '2007', 'B 1234  ABI', 800000),
('08', 'Mercedes', '2008', 'B 1234  ABJ', 850000),
('09', 'Proton', '2009', 'B 1234  ABK', 900000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `nota`
--

CREATE TABLE `nota` (
  `idnota` varchar(6) NOT NULL,
  `tglnota` date NOT NULL,
  `idpelanggan` varchar(6) NOT NULL,
  `iduser` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idplgn` varchar(6) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `noidentitas` varchar(25) NOT NULL,
  `notelp` varchar(15) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`idplgn`, `nama`, `noidentitas`, `notelp`, `alamat`) VALUES
('01', 'Jainudin', '328000000000001', '081234567890', 'Jakarta'),
('02', 'Hayati', '328000000000002', '081234567891', 'Depok'),
('04', 'Jamal', '328000000000003', '081234567892', 'Karawang'),
('05', 'El Gasing', '328000000000004', '081234567893', 'Tanggerang');

-- --------------------------------------------------------

--
-- Struktur dari tabel `riwayat`
--

CREATE TABLE `riwayat` (
  `idnota` varchar(6) NOT NULL,
  `kdmobil` varchar(6) NOT NULL,
  `idsupir` varchar(6) NOT NULL,
  `idpelanggan` varchar(6) NOT NULL,
  `lama` int(11) NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supir`
--

CREATE TABLE `supir` (
  `idsupir` varchar(6) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `status` enum('Tersedia','Tidak Tersedia') NOT NULL,
  `notlp` varchar(15) NOT NULL,
  `harga` int(11) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `supir`
--

INSERT INTO `supir` (`idsupir`, `nama`, `status`, `notlp`, `harga`, `alamat`) VALUES
('01', 'Yosafat', 'Tersedia', '012345678910', 500000, 'Gunung Putri'),
('02', 'Ilyas', 'Tersedia', '012345678911', 550000, 'Depok'),
('03', 'Saldi', 'Tersedia', '012345678912', 600000, 'Jakarta'),
('04', 'Mahendra', 'Tersedia', '012345678913', 650000, 'Jakarta'),
('05', 'Nicholas', 'Tidak Tersedia', '012345678914', 700000, 'Jakarta'),
('06', 'Zikri', 'Tidak Tersedia', '012345678915', 750000, 'Jawa Barat'),
('07', 'Evi', 'Tersedia', '012345678916', 800000, 'Tanggerang'),
('08', 'Nova', 'Tidak Tersedia', '012345678917', 850000, 'Jakarta');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `iduser` varchar(6) NOT NULL,
  `nmuser` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `notlpn` varchar(15) NOT NULL,
  `lavel` enum('Kasir','Admin') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`iduser`, `nmuser`, `username`, `password`, `notlpn`, `lavel`) VALUES
('AB0001', 'M. Maulana Saldi', 'maulana', 'maulana22', '08880915503', 'Kasir'),
('AB0002', 'Muhammad Yosafat', 'yosafat', 'yosafat22', '081234567890', 'Kasir'),
('AB0003', 'Nova Eka', 'nova', 'nova22', '081234567891', 'Kasir'),
('AB0004', 'Evi Nur', 'evi', 'evi22', '081234567892', 'Kasir'),
('AB0005', 'Ilyas Cahyo', 'ilyas', 'ilyas22', '081234567893', 'Admin'),
('AB0006', 'Zikri Fattah', 'zikri', 'zikri22', '081234567894', 'Kasir'),
('AB0007', 'Mahendra Prayit', 'mahendra', 'mahendra22', '081234567895', 'Kasir'),
('AB0008', 'Muhammad Nicholas', 'nicholas', 'nicholas', '0812345678966', 'Kasir');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `isi`
--
ALTER TABLE `isi`
  ADD KEY `idnota` (`idnota`),
  ADD KEY `kdmobil` (`kdmobil`),
  ADD KEY `idsupir` (`idsupir`);

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`kdmobil`);

--
-- Indeks untuk tabel `nota`
--
ALTER TABLE `nota`
  ADD PRIMARY KEY (`idnota`),
  ADD KEY `idpelanggan` (`idpelanggan`),
  ADD KEY `iduser` (`iduser`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idplgn`);

--
-- Indeks untuk tabel `riwayat`
--
ALTER TABLE `riwayat`
  ADD KEY `idnota` (`idnota`);

--
-- Indeks untuk tabel `supir`
--
ALTER TABLE `supir`
  ADD PRIMARY KEY (`idsupir`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`iduser`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `isi`
--
ALTER TABLE `isi`
  ADD CONSTRAINT `isi_ibfk_1` FOREIGN KEY (`idnota`) REFERENCES `nota` (`idnota`),
  ADD CONSTRAINT `isi_ibfk_2` FOREIGN KEY (`idsupir`) REFERENCES `supir` (`idsupir`),
  ADD CONSTRAINT `isi_ibfk_3` FOREIGN KEY (`kdmobil`) REFERENCES `mobil` (`kdmobil`);

--
-- Ketidakleluasaan untuk tabel `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `nota_ibfk_1` FOREIGN KEY (`iduser`) REFERENCES `user` (`iduser`),
  ADD CONSTRAINT `nota_ibfk_2` FOREIGN KEY (`idpelanggan`) REFERENCES `pelanggan` (`idplgn`);

--
-- Ketidakleluasaan untuk tabel `riwayat`
--
ALTER TABLE `riwayat`
  ADD CONSTRAINT `riwayat_ibfk_1` FOREIGN KEY (`idnota`) REFERENCES `nota` (`idnota`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
