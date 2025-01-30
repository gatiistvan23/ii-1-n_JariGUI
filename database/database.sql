create database jarigui;

use jarigui;

create table cars(
    id int not null primary key auto_increment,
    plate varchar(50),
    brand varchar(50),
    carYear int,
    fuel varchar(50),
    price double,
    climate boolean,
    carCert date
);

grant all privileges
on jarigui.*
to jarigui@localhost
identified by 'titok';
