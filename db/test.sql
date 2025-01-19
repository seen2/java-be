CREATE DATABASE record_company;
USE record_company;

CREATE TABLE bands(
  id INTEGER AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE albums(
  id INTEGER AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NOT NULL,
  release_year INTEGER,
  band_id INTEGER NOT NULL,
  PRIMARY KEY(id),
  FOREIGN KEY(band_id) REFERENCES bands(id)
);

INSERT INTO bands(name) VALUES('Iron Maiden');
INSERT INTO bands(name) VALUES('Deuce'),('Aveneged Sevenfold'),('Ankor');

SELECT * FROM bands LIMIT 2;

SELECT id as 'ID',name FROM bands;
SELECT id as 'ID',name FROM bands ORDER BY name;
SELECT id as 'ID',name FROM bands ORDER BY name desc;

INSERT INTO albums(name,release_year,band_id) 
VALUES('The Number of the Beast',1985,1),('Power Slave',1984,1),('Nightmare',2018,2),('Nightmare',2010,3),('TEST',NULL,3);

SELECT DISTINCT name from albums;

SELECT * FROM albums;

UPDATE albums SET release_year= 1982 WHERE id=1;


SELECT * FROM albums WHERE release_year>2000;

SELECT * from albums WHERE name LIKE '%er%';

SELECT * from albums WHERE name LIKE '%er%' OR band_id=2;

SELECT * from albums WHERE release_year BETWEEN 2000 AND 2018;

DELETE from albums WHERE release_year IS NULL;

SELECT * FROM albums;

SELECT * FROM albums JOIN bands ON albums.band_id=bands.id;
SELECT * FROM albums LEFT JOIN bands ON albums.band_id=bands.id;
SELECT * FROM albums RIGHT JOIN bands ON albums.band_id=bands.id;


