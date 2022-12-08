create table country
(
    id   serial primary key,
    name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE address
(
    id         serial PRIMARY KEY,
    city       varchar(50) not null,
    street     varchar(50) not null,
    house      varchar(10) not null,
    zip        integer     not null,
    country_id integer     not null,
    constraint FK_address_country foreign key (country_id) references country (id)
);

CREATE TABLE client
(
    id            serial PRIMARY KEY,
    name          varchar(50) not null,
    last_name     varchar(50) not null,
    year_of_birth integer     not null,
    address_id    integer     not null,
    constraint FK_client_address foreign key (address_id) references address (id)
);

ALTER TABLE country
  add COLUMN population integer;