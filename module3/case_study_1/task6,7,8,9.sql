-- task 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu,dich_vu.dien_tich_su_dung,
dich_vu.chi_phi_thue,loai_dich_vu.loai_dich_vu,hop_dong.id_hop_dong,hop_dong.ngay_lam_hop_dong
from loai_dich_vu
join dich_vu
on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
left join hop_dong
on hop_dong.id_dich_vu=dich_vu.id_dich_vu
where 
dich_vu.id_dich_vu not in(
 select hop_dong.id_dich_vu
 from hop_dong 
 where (year(hop_dong.ngay_lam_hop_dong)=2019 
 and month(hop_dong.ngay_lam_hop_dong) in (1,2,3)));
 
-- task 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue,
-- TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich_su_dung,
dich_vu.so_nguoi_toi_da,dich_vu.chi_phi_thue,loai_dich_vu.loai_dich_vu,hop_dong.ngay_lam_hop_dong
from loai_dich_vu
join dich_vu
on loai_dich_vu.id_loai_dich_vu=dich_vu.id_loai_dich_vu
join hop_dong
on dich_vu.id_dich_vu=hop_dong.id_dich_vu
where 
 hop_dong.ngay_lam_hop_dong
in 
	(select hop_dong.ngay_lam_hop_dong from hop_dong where year(hop_dong.ngay_lam_hop_dong) = 2018)
and hop_dong.id_dich_vu
not in
	(select hop_dong.id_dich_vu from hop_dong where year(hop_dong.ngay_lam_hop_dong) = 2019);
-- task 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- cách 1
select khach_hang.ten_khach_hang 
from khach_hang
group by khach_hang.ten_khach_hang;
-- cách 2
select distinct khach_hang.ten_khach_hang
from khach_hang;
-- cách 3
select DISTINCTROW khach_hang.ten_khach_hang 
from khach_hang;
-- cách 4
select khach_hang.ten_khach_hang
from khach_hang
union 
select khach_hang.ten_khach_hang
from khach_hang;

-- task 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng
-- trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hop_dong.ngay_lam_hop_dong) as so_luong_khach_dat_phong,
count(hop_dong.id_khach_hang) as so_luong_dat_phong
from hop_dong
where year(hop_dong.ngay_lam_hop_dong)=2019
group by month(hop_dong.ngay_lam_hop_dong);
