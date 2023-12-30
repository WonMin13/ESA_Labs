DROP TABLE IF EXISTS album;
DROP TABLE IF EXISTS _army;

CREATE TABLE _army
(
    id SERIAL PRIMARY KEY,
    nameArmy VARCHAR(255)
);

CREATE TABLE album
(
    id SERIAL PRIMARY KEY,
    nameAlbum VARCHAR(255),
    song VARCHAR(255),
    price integer,
    army_id BIGINT REFERENCES _army
);