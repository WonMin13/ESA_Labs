DROP TABLE IF EXISTS album;
DROP TABLE IF EXISTS army;
DROP TABLE IF EXISTS db_change;
DROP TABLE IF EXISTS notification;

CREATE TABLE army
(
    id SERIAL PRIMARY KEY,
    name_army VARCHAR(255)
);

create table db_change
(
    id bigint not null
        constraint db_change_pkey
            primary key,
    entity_id bigint,
    entity_simple_name varchar(255),
    new_entity_string varchar(255),
    old_entity_string varchar(255),
    type integer
);

create table notification
(
    id bigint not null
        constraint notification_pkey
            primary key,
    email_address varchar(255),
    notification_condition integer
);

CREATE TABLE album
(
    id SERIAL PRIMARY KEY,
    name_album VARCHAR(255),
    song VARCHAR(255),
    price integer,
    army_id BIGINT REFERENCES army
);