create database productos;

use productos;

create table pais(
    id int auto_increment primary key ,
    nombre varchar(40)
);

create table producto(
    id int auto_increment primary key,
    code varchar(10),
    nombre varchar(50),
    fecha_embarque date,
    fecha_llegada date,
    cantidad numeric(7),
    pais_origen_id int,
    pais_destino_id int,
    foreign key (pais_destino_id) references pais(id),
    foreign key (pais_origen_id) references pais(id)
);