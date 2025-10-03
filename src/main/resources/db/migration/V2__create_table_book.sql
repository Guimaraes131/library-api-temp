CREATE TABLE tb_book (
    id UUID PRIMARY KEY,
    isbn VARCHAR(20) NOT NULL UNIQUE,
    title VARCHAR(64) NOT NULL,
    publish_date DATE NOT NULL,
    genre VARCHAR(32) NOT NULL,
    price NUMERIC(18,2),
    author_id UUID NOT NULL REFERENCES tb_author(id),
    CONSTRAINT chk_genre CHECK (genre in ('FICTION', 'ROMANCE', 'BIOGRAPHY', 'FANTASY', 'SCIENCE', 'MYSTERY'))
);