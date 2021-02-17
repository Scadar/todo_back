CREATE TABLE usr (
    id INT PRIMARY KEY,
    username varchar(100) NOT NULL UNIQUE,
    email varchar(255) UNIQUE,
    password varchar(255) NOT NULL,
    created timestamp NOT NULL default CURRENT_TIMESTAMP,
    update timestamp NOT NULL default CURRENT_TIMESTAMP,
    status varchar(25) NOT NULL default 'ACTIVE'
);

CREATE TABLE roles (
    id INT PRIMARY KEY,
    name varchar(100) NOT NULL UNIQUE,
    created timestamp NOT NULL default CURRENT_TIMESTAMP,
    update timestamp NOT NULL default CURRENT_TIMESTAMP,
    status varchar(25) NOT NULL default 'ACTIVE'
);

CREATE TABLE usr_roles (
    usr_id BIGINT REFERENCES usr(id),
    role_id BIGINT REFERENCES roles(id)
);

INSERT INTO roles (id, name) VALUES (1, 'USER'),(2, 'ADMIN');


