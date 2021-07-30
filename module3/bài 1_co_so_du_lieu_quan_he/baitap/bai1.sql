create database  `student-managemen`;
use `student-managemen`;
create table `student-managemen`.`teacher`
(
`id` int(10)not null primary key auto_increment,
`name` varchar(45),
age int,
country varchar(45)
);
alter table teacher add country varchar(50);
drop table class;
create table class(
id int not null primary key auto_increment,
`name` varchar(45)
)
