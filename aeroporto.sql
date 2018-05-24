CREATE DATABASE IF NOT EXISTS aeroporto;
USE aeroporto;


CREATE TABLE IF NOT EXISTS aeronave (
'numLicenca' INT NOT NULL,
'marca' VARCHAR(45) NULL,
'modelo' VARCHAR(45) NULL,
PRIMARY KEY ('numLicenca')
);

CREATE TABLE IF NOT EXISTS piloto (
`numRegistro` INT NOT NULL,
`pilotoNome` VARCHAR(45) NULL,
`validadeRegistro` DATE NULL,
PRIMARY KEY (`numRegistro`)
);

CREATE TABLE IF NOT EXISTS voo (
`numVoo` INT NOT NULL,
`horaPartida` VARCHAR(45) NULL,
`horachegada` VARCHAR(45) NULL,
`origem` VARCHAR(45) NULL,
`destino` VARCHAR(45) NULL,
`aeronave_numLicenca` INT NOT NULL,
`piloto_numRegistro` INT NOT NULL,
PRIMARY KEY (`numVoo`),
FOREIGN KEY (`aeronave_numLicenca`) REFERENCES `aeronave` (`numLicenca`)
FOREIGN KEY (`piloto_numRegistro`) REFERENCES `piloto` (`numRegistro`)
);

CREATE TABLE IF NOT EXISTS passageiro (
`CPF` INT NOT NULL,
`nome` VARCHAR(45) NULL,
`telefone` VARCHAR(45) NULL,
`endereco` VARCHAR(45) NULL,
PRIMARY KEY (`CPF`)
);

CREATE TABLE IF NOT EXISTS passagem (
`numPassagem` INT NOT NULL,
`numPoltrona` VARCHAR(45) NULL,
`pesoBagagem` VARCHAR(45) NULL,
`voo_numVoo` INT NOT NULL,
`passageiro_CPF` INT NOT NULL,
PRIMARY KEY (`numPassagem`),
FOREIGN KEY (`voo_numVoo`) REFERENCES `voo` (`numVoo`)
FOREIGN KEY (`passageiro_CPF`) REFERENCES `passageiro` (`CPF`)
);


INSERT INTO*FROM 'aeronave'VALUES
('123','x','a'),
('321','y','b');

INSERT INTO*FROM 'piloto' VALUES
('1234','Carlos','2019'),
('4321','Alberto','2020');

INSERT INTO*FROM 'voo' VALUES
('715','12:30','14:00','São Paulo','Curitiba'),
('716','11:00','13:00','São Paulo','Brasilia');

INSERT INTO*FROM 'passageiro' VALUES
('123.123.123-12','Johnny Be Goode','11-94536 3545','Av. Paulista 1470'),
('321.321.321-32','Silvio Santos','11-98473 6423','Rua Augusta 820');

INSERT INTO*FROM 'passagem' VALUES
('3563','12a',13KG'),
('4312','14b',20KG');


SELECT * FROM passagem;

SELECT origem, destino FROM voo;

SELECT validadeRegistro, pilotoNome, numRegistro
FROM piloto
WHERE validadeRegistro >= '2019';

SELECT nome, telefone, endereco
FROM passageiro
WHERE telefone LIKE '%11-';

SELECT marca, modelo, pilotoNome
FROM aeronave
INNER JOIN piloto
	ON aeronave.numLicenca = piloto.numLicenca;



