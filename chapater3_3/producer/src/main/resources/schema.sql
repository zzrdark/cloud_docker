drop table user if EXISTS;
create table user (
    id bigint generated by DEFAULT as IDENTITY,
    username varchar(40),
    name varchar(20),
    age int(3),
    balance decimal(10,2),
    PRIMARY key(id)
);

