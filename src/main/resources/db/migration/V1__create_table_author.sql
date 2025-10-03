CREATE TABLE tb_author (
    id UUID PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    birth_date DATE NOT NULL,
    nationality VARCHAR(32) NOT NULL
);