create database quan_li_diem_thi;
use quan_li_diem_thi;
create table hoc_sinh
(
`ma_hoc_sinh` int primary key ,
`ten_HS` nvarchar(255) not null ,
`ngay_sinh` date not null,
`lop` varchar(255) not null,
`gioi_tinh` varchar(10)
);
alter table quan_li_diem_thi.hoc_sinh
MODIFY COLUMN ma_hoc_sinh INT AUTO_INCREMENT;
create table mon_hoc
(
`ma_mon_hoc` int primary key,
`ten_mon_hoc` nvarchar(255) not null ,
`ma_giao_vien` int
);
alter table quan_li_diem_thi.mon_hoc
MODIFY COLUMN ma_mon_hoc INT AUTO_INCREMENT;
alter table quan_li_diem_thi.mon_hoc
change `ma_giao_vien` `ma_GV` int;
create table quan_li_diem_thi.giao_vien
(
`ma_GV` int primary key,
`ten_GV` nvarchar(255) not null ,
`SDT` int
);
alter table quan_li_diem_thi.giao_vien
MODIFY COLUMN ma_GV INT AUTO_INCREMENT;
create table quan_li_diem_thi.bang_diem
(
`ma_hoc_sinh` int  ,
`ma_mon_hoc` int ,
`diem_thi` int,
`ngay_thi` date,
primary key(ma_hoc_sinh,ma_mon_hoc),
foreign key(ma_hoc_sinh) REFERENCES hoc_sinh(ma_hoc_sinh),
foreign key(ma_mon_hoc) references mon_hoc(ma_mon_hoc)
);
alter table quan_li_diem_thi.mon_hoc
add foreign key(ma_GV) references giao_vien(ma_GV);

