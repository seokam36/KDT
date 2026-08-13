drop database if exists mydb0813;
CREATE DATABASE mydb0813;
use mydb0813;
create table board(
    no int AUTO_INCREMENT,
    content varchar(255),
    writer varchar(30),
    constraint primary key (no)
);
insert into board(content, writer) VALUE ("안녕하세요", "유재석"),
    ("하하","강호동");

drop table board;