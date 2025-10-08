CREATE TABLE tb_authors (
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL
);

CREATE TABLE tb_books (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    isbn VARCHAR(255) UNIQUE NOT NULL,
    author_id BIGINT,
    CONSTRAINT fk_books_author
        FOREIGN KEY (author_id)
        REFERENCES tb_authors(id)
        ON DELETE SET NULL
);
