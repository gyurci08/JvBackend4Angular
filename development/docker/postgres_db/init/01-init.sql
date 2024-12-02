CREATE ROLE Application WITH
    LOGIN
    SUPERUSER
    CREATEDB
    CREATEROLE
    INHERIT
    REPLICATION
    CONNECTION LIMIT -1
    PASSWORD '12345678';

CREATE DATABASE SpringDbBackend
    OWNER Application;

\c SpringDbBackend

CREATE TABLE dogs
(
    id    serial PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

-- Insert sample data
INSERT INTO dogs (name) VALUES ('Buddy');
INSERT INTO dogs (name) VALUES ('Max');
INSERT INTO dogs (name) VALUES ('Bella');
