create database my_database2;
drop database my_database2;

-- gọi database
use my_database2;

-- thêm bảng 
create table class(
id int not null primary key auto_increment,
`name` varchar(45)
);
-- xóa bản
drop table class;
-- thêm 1 bảng tương tự 
create table `student-managemen`.class2
select id
from `student-managemen`.class;

-- thêm 1 bảng tương tự đầy đủ
create table `student-managemen`.class3
select *
from `student-managemen`.class;

-- thêm trường 
alter table `student-managemen`.class3
add sex varchar(45), add age int;

-- xóa cột(muốn xóa thêm thì giống dòng lệnh 2)
alter table  `student-managemen`.class3
drop column sex;

-- chỉnh sửa kiểu dữ liệu cột
alter table   `student-managemen`.class3
modify column name varchar(100);

--  chỉnh sửa tên cột
alter table `student-managemen`.class3
change `name` `Name` varchar(100);

-- thêm ràng buộc(contraints)
alter table `student-managemen`.class3
add unique(`Name`);

-- xóa ràng buộc
alter  table `student-managemen`.class3
drop index  `Name`;

-- khóa ngoại
 alter  table `student-managemen`.class3
 add foreign key (id) REFERENCES class(id)