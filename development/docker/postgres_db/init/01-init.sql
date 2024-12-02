CREATE ROLE appuser WITH
    LOGIN
    SUPERUSER
    CREATEDB
    CREATEROLE
    INHERIT
    REPLICATION
    CONNECTION LIMIT -1
    PASSWORD '12345678';


CREATE DATABASE springdbbackend
    OWNER appuser;


\c springdbbackend


CREATE TABLE dog
(
    id    serial PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);


-- Insert sample data
INSERT INTO dog (name) VALUES ('Buddy');
INSERT INTO dog (name) VALUES ('Max');
INSERT INTO dog (name) VALUES ('Bella');
