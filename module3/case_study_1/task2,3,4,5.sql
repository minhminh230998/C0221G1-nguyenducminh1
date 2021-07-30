-- task2. 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
SELECT *
FROM nhan_vien
WHERE (ten_nha_vien LIKE "H%"  or ten_nha_vien LIKE "K%"or ten_nha_vien LIKE "T%") and length(ten_nha_vien)<=15 ;
-- task3. 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from khach_hang
where (YEAR(CURDATE()) - YEAR(ngay_sinh)>=18)and(YEAR(CURDATE()) - YEAR(ngay_sinh)<=50) and dia_chi like "Quang Nam";
-- task4. 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select khach_hang.ten_khach_hang,count(hop_dong.id_khach_hang) as so_lan_thue
from loai_khach
join khach_hang
on loai_khach.id_loai_khach=khach_hang.id_loai_khach
join hop_dong
on khach_hang.id_khach_hang=hop_dong.id_khach_hang
where loai_khach.id_loai_khach=1
group by hop_dong.id_khach_hang
order by so_lan_thue;


-- task5. 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong,
-- NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia,
-- với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng.
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.id_khach_hang,khach_hang.ten_khach_hang,
hop_dong.id_hop_dong,dich_vu.ten_dich_vu,hop_dong.ngay_bat_dau,
hop_dong.ngay_ket_thuc,
sum(dich_vu.chi_phi_thue+dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong) tong_tien
from khach_hang
left join hop_dong
on hop_dong.id_khach_hang=khach_hang.id_khach_hang
left join dich_vu
on hop_dong.id_dich_vu=dich_vu.id_dich_vu
left join hop_dong_chi_tiet
on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
left join dich_vu_di_kem
on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
group by khach_hang.id_khach_hang, hop_dong.id_hop_dong;

