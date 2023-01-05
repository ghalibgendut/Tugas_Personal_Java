CREATE TABLE Mahasiswa (
	IdMahasiswa numeric PRIMARY KEY,
	NamaMahasiswa VARCHAR (50) NOT NULL,
	Alamat VARCHAR (255) NOT NULL,
	Email VARCHAR (255) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL
);

SELECT * FROM Mahasiswa;

ALTER TABLE Mahasiswa
ADD COLUMN telp numeric;

DROP COLUMN telp;



INSERT INTO Mahasiswa (IdMahasiswa, NamaMahasiswa, Alamat, Email, created_on)
values (1120, 'Budiman', 'Jakarta Selatan', 'budiman@gmail.com', '12/17/2022');

INSERT INTO Mahasiswa (IdMahasiswa, NamaMahasiswa, Alamat, Email, created_on)
values (1121, 'Jaka', 'Jakarta Timur', 'jaka@gmail.com', '12/17/2022');