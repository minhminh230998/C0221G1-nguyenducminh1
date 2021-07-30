create database chuyen_doi_mo_hinh;
use chuyen_doi_mo_hinh;
create table so_dien_thoai(
ma_nha_cung_cap int,
so_dien_thoai varchar(20) primary key,
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);
create table nha_cung_cap
(
ma_nha_cung_cap int primary key,
ten_nha_cung_cap varchar(50),
dia_chi varchar(50)
);
create table phieu_xuat(
so_phieu_xuat int primary key,
ngay_xuat date
);
create table phieu_nhap(
so_phieu_nhap int primary key,
ngay_nhap date
);
create table don_dat_hang(
so_don_hang int primary key,
ngay_don_hang date,
ma_nha_cung_cap int,
foreign key (ma_nha_cung_cap) references nha_cung_cap( ma_nha_cung_cap)
);
create table vat_tu(
ma_vat_tu int primary key,
ten_vat_tu varchar(50)
);
create table ma_vat_tu_don_dac_hang(
so_don_hang int,
ma_vat_tu int,
primary key(so_don_hang,ma_vat_tu),
foreign key (so_don_hang) references don_dac_hang(so_don_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu)
);
create table phieu_xuat_vat_tu(
ma_vat_tu int,
so_phieu_xuat int,
don_gia_xuat varchar(50),
so_luong_xuat varchar(50),
primary key (ma_vat_tu,so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat)
);
create table phieu_nhap_vat_tu(
ma_vat_tu int,
so_phieu_nhap int,
don_gia_xuat varchar(50),
so_luong_xuat varchar(50),
primary key (ma_vat_tu,so_phieu_nhap),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);