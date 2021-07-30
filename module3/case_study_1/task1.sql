create database case_study;
use case_study;
create table trinh_do_nhan_vien
(
id_trinh_do_nhan_vien  int primary key auto_increment,
trinh_do varchar(50)
);
create table bo_phan_nhan_vien
(
id_bo_phan_nhan_vien int primary key auto_increment,
bo_phan varchar(100)
);
create table vi_tri_lam_viec
(
id_vi_tri_lam_viec  int primary key auto_increment,
vi_tri varchar(50)
);
create table nhan_vien
(
id_nhan_vien varchar(50) primary key,
id_trinh_do_nhan_vien int,
id_vi_tri_lam_viec int,
id_bo_phan_nhan_vien int,
ten_nhan_vien varchar(50),
ngay_sinh date,
luong bigint,
gioi_tinh varchar(50),
so_CMND int,
so_DT varchar(50),
email varchar(50),
dia_chi varchar(50),
foreign key (id_trinh_do_nhan_vien) references trinh_do_nhan_vien(id_trinh_do_nhan_vien) on DELETE CASCADE,
foreign key (id_vi_tri_lam_viec) references vi_tri_lam_viec(id_vi_tri_lam_viec) on DELETE CASCADE,
foreign key (id_bo_phan_nhan_vien) references bo_phan_nhan_vien(id_bo_phan_nhan_vien)
on DELETE CASCADE
);
create table loai_khach
(
id_loai_khach int primary key auto_increment,
ten_loai_khach_hang varchar(45)
);
create table khach_hang
(
id_khach_hang varchar(50) primary key,
id_loai_khach int,
ten_khach_hang varchar(50),
ngay_sinh date,
gioi_tinh varchar(30),
so_CMND int,
so_DT varchar(50),
email varchar(50),
dia_chi varchar(50),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
on DELETE CASCADE
);
create table loai_dich_vu
(
id_loai_dich_vu int primary key auto_increment,
loai_dich_vu varchar(50)
);
create table kieu_thue
(
id_kieu_thue int primary key auto_increment,
kieu_thue varchar(50),
gia bigint
);
create table dich_vu
(
id_dich_vu varchar(50) primary key ,
id_loai_dich_vu int,
id_kieu_thue int,
ten_dich_vu varchar(50),
dien_tich_su_dung float,
chi_phi_thue double,
so_nguoi_toi_da int,
so_tang int,
tieu_chuan_phong varchar(50),
tien_nghi_khac varchar(50),
dien_tich_ho_boi float,

 
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)on DELETE CASCADE,
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue)
on delete CASCADE
);
-- insert into dich_vu(id_loai_dich_vu,id_kieu_thue,ten_dich_vu,dien_tich_su_dung,chi_phi_thue,so_nguoi_toi_da,so_tang,tieu_chuan_phong,tien_nghi_khac,dien_tich_ho_boi,dich_vu_mieng_phi) values(1,2,"VL111",36,36000,5,6,"Moi","Khong",36,"an");
 create table hop_dong
(
id_hop_dong int primary key auto_increment,
id_khach_hang varchar(50),
id_nhan_vien varchar(50),
id_dich_vu varchar(50),
ngay_lam_hop_dong date,
ngay_ket_thuc date,
so_tien_coc_truoc double,
tong_tien_thanh_toan double,
foreign key (id_khach_hang) references khach_hang(id_khach_hang) on DELETE CASCADE,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien)on DELETE CASCADE,
foreign key (id_dich_vu) references dich_vu(id_dich_vu)
on delete CASCADE
);
create table dich_vu_di_kem
(
id_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(50),
gia bigint,
don_vi int,
trang_thai varchar(50)
);
create table hop_dong_chi_tiet
(
id_hop_dong_chi_tiet int primary key auto_increment,
id_dich_vu_di_kem int,
id_hop_dong int,
so_luong int,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)on DELETE CASCADE,
foreign key (id_hop_dong) references hop_dong(id_hop_dong)
on delete CASCADE
);


insert into vi_tri_lam_viec (vi_tri) 
values("Le Tan"),
("Phuc Vu"),
("Chuyen Vien"),
("Giam Sat"),
("Giam Đoc");

insert into trinh_do_nhan_vien (trinh_do)
values("Trung Cap"),
("Cao Dang"),
("Dai Hoc"),
("Sau Dai Hoc");

insert into bo_phan_nhan_vien (bo_phan) 
values("Sale – Marketing"),
("Hanh Chinh"),
("Phuc Vu"),
("Quan Ly");

insert into nhan_vien(id_nhan_vien,ten_nhan_vien,id_vi_tri_lam_viec,id_trinh_do_nhan_vien,id_bo_phan_nhan_vien,ngay_sinh,so_CMND,gioi_tinh,luong,so_DT,email,dia_chi)
values("NV-0001","Đoan Minh Duc",5,4,4,"1995-06-05","090909090","nam","50000000","09699999999","ducdoan@gmail.com","Duong Thuong"),
("NV-0002","Đang Anh Toan",4,3,4,"1993-07-20","012345678","nu","30000000","0988888888","toandang@gmail.com","Cho Con"),
("NV-0003","Nguyen Duc Minh",2,2,3,"1997-08-25","545454545","nam","8000000","0977777777","ducminh@gmail.com","Quang Nam"),
("NV-0004","Nguyen Anh Tan",3,3,2,"1980-04-15","365365365","nam","20000000","0966666666","anhtan@gmail.com","Hoa Khanh"),
("NV-0005","Tran Nhu Tam",3,3,2,"1985-07-05","656565656","nu","20000000","0955555555","nhutam@gmail.com","Hoa Khanh"),
("NV-0006","Hoàng Thị Diệu Thúy",1,2,1,"1996-08-12","787878787","nam","10000000","0944444444","dieuthuy@gmail.com","Son Tra"),
("NV-0007","Tran Anh Túu",5,4,4,"1995-06-05","090909090","nu","50000000","09699999999","ducdoan@gmail.com","Duong Thuong");

insert into loai_khach(ten_loai_khach_hang)
values("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");

insert into khach_hang(id_khach_hang,id_loai_khach,ten_khach_hang,ngay_sinh,gioi_tinh,so_CMND,so_DT,email,dia_chi)
values("KH-0001",1,"Nguyen Van Teo","1890-05-25","nam","030604050","0936363636","vanteo@gmail.com","Phan Huy Ich"),
("KH-0002",1,"Tran Nguyen Vu","1996-07-15","nam","036587452","0966121451","nguyenvu@gmail.com","Da Nang"),
("KH-0003",2,"Nguyen Ngoc Lan","1991-08-26","nam","052458755","0978458784","lannguyen@gmail.com","Quang Tri"),
("KH-0004",3,"Ho Mau Tung","1988-12-22","nam","065452547","0983214512","tungho@gmail.com","Banh Van Tran"),
("KH-0005",4,"Le Van Minh","1978-08-10","nu","012132102","0931232121","minhvan@gmail.com","Hai Phong"),
("KH-0006",1,"Huynh Van Ty","1956-01-15","nu","565423653","0933123123","tyvan@gmail.com","Nha Trang"),
("KH-0007",1,"Huynh Vu Vo","1990-01-16","nam","0530303542","0933123321","vuvo@gmail.com","Vinh"),
("KH-0008",1,"Tran Tam Khuc","1990-01-16","nu","0530303542","0933123321","vuvo@gmail.com","Quang Ngai"),
("KH-0009",1,"Huynh Van Ty","1986-02-20","nam","527894527","0975487878","tyvanhuynh@gmail.com","Vinh");


insert into kieu_thue(kieu_thue,gia)
values("Theo Nam","20000000"),
("Theo Thang","20000000"),
("Theo Ngay","1000000"),
("Theo Gio","200000");

insert into loai_dich_vu(loai_dich_vu)
values("Villa"),
("Room"),
("House");

 


insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai)
values("Massage","200000","1","Kha Dung"),
("Karaoke","80000","1","Kha Dung"),
("Thức Ăn","100000","1","Kha Dung"),
("Nước Uống","50000","1","Kha Dung"),
("Thuê Xe","500000","1","Kha Dung");
 
 create view v_khach_hang_dich_vu as
  select khach_hang.ten_khach_hang,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,dich_vu.ten_dich_vu,hop_dong.id_hop_dong
  from hop_dong 
  join khach_hang
  on hop_dong.id_khach_hang=khach_hang.id_khach_hang
  join dich_vu
  on hop_dong.id_dich_vu=dich_vu.id_dich_vu
  left join hop_dong_chi_tiet
  on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
  where now() between hop_dong.ngay_lam_hop_dong and hop_dong.ngay_ket_thuc
  group by hop_dong.id_khach_hang;
  select * from v_khach_hang_dich_vu ;
  drop view v_khach_hang_dich_vu;
  
create view v_hop_dong_dich_vu_di_kem as
select  hop_dong_chi_tiet.id_hop_dong,hop_dong_chi_tiet.id_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem
from hop_dong
join hop_dong_chi_tiet
on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem
on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong_chi_tiet.id_dich_vu_di_kem;
select * from v_hop_dong_dich_vu_di_kem;
drop view v_hop_dong_dich_vu_di_kem;
update hop_dong set hop_dong.id_dich_vu=? where id_hop_dong=?;
select * from khach_hang;

  

