create database internship; 
use internship ;
create table du_an
(
id_du_an int primary key,
ten_du_an varchar(50),
kinh_phi int,
noi_thuc_tap varchar(50)
);
create table khoa
(
id_khoa int primary key,
ten_khoa varchar(50),
so_dt varchar(50)
);
create table nguoi_huong_dan
(
id_nguoi_huong_dan int primary key,
ten_nguoi_huong_dan varchar(50),
tien_luong double,
id_khoa int,
foreign key (id_khoa) references khoa(id_khoa) on delete cascade 
);
create table sinh_vien
(
id_sinh_vien int primary key ,
ten_sinh_vien varchar(50),
id_khoa int,
ngay_sinh date,
noi_sinh varchar(50)
);
create table nguoi_huong_dan_sinh_vien
(
id_sinh_vien int,
id_du_an int,
id_nguoi_huong_dan int,
cap double,
primary key(id_sinh_vien,id_du_an,id_nguoi_huong_dan),
foreign key (id_sinh_vien) references sinh_vien(id_sinh_vien) on delete cascade,
foreign key (id_du_an) references du_an(id_du_an) on delete cascade,
foreign key (id_nguoi_huong_dan) references nguoi_huong_dan(id_nguoi_huong_dan) on delete cascade
);
insert into du_an
values(1,'pj1',1000,'Da Nang'),
(2,'pj2',2000,'Quang Nam'),
(3,'pj3',3000,'Hue');
 insert into khoa
 values(1,'khoa dia ly','121212121'),
 (2,'khoa cong nghe sinh hoc','121212122'),
(3,'khoa quan li tai nguyen','221212122'),
(4,'khoa toan','12312122');
insert into sinh_vien
values(1,"Nguyễn Văn Tèo",1,"1990-05-25","Phan Huy Ích"),
(2,"Trần Nguyên Vũ",2,"1996-07-15","Đà Nẵng"),
(3,"Nguyễn Ngọc Lân",3,"1997-08-26","Quảng Trị"),
(4,"Hồ Mậu Tùng",4,"1998-12-22","Bành Văn Trân"),
(5,"Lê Văn Minh",5,"1999-08-10","Hải Phòng"),
(6,"Huỳnh Văn Tý",1,"2000-01-15","Nha Trang"),
(7,"Huỳnh Vũ Võ",2,"1990-01-16","Vinh"),
(8,"Trần Tam Khúc",3,"1990-01-16","Quảng Ngãi"),
(9,"Huỳnh Văn Tý",3,"1986-02-20","Vinh");
insert into nguoi_huong_dan
values (1,"Đoàn Minh Đức","50000000",1),
(2,"Đặng Anh Toàn","30000000",2),
(3,"Nguyễn Đức Minh","8000000",3),
(4,"Nguyễn Anh Tấn","20000000",4),
(5,"Trần Như Tâm","20000000",3),
(6,"Hoàng Thị Diệu Thúy","10000000",4),
(7,"Trần Anh Tú","50000000",4);
insert into nguoi_huong_dan_sinh_vien
values(1,1,1,123),
(2,2,2,234),
(3,3,3,345),
(4,1,4,456),
(5,2,4,246),
(6,3,5,135);

