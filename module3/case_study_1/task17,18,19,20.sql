-- task 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng
-- đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update  khach_hang
set khach_hang.id_loai_khach=1
where khach_hang.id_khach_hang in ( select kh.kh_id from 
(select khach_hang.id_khach_hang as kh_id,
sum(dich_vu.chi_phi_thue+hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia) tong_tien
from khach_hang 
join hop_dong
on khach_hang.id_khach_hang=hop_dong.id_khach_hang
join hop_dong_chi_tiet
on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem
on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
join dich_vu
on hop_dong.id_dich_vu=dich_vu.id_dich_vu
where year(hop_dong.ngay_lam_hop_dong)=2019 and khach_hang.id_loai_khach=2
group by hop_dong.id_khach_hang
having  tong_tien>10000000
  ) as kh);
  
-- task 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
delete from khach_hang
where id_khach_hang in (select hop_dong.id_khach_hang
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) <2016
group by hop_dong.id_khach_hang
);

-- task 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
update dich_vu_di_kem
set dich_vu_di_kem.gia=(dich_vu_di_kem.gia*2)
where dich_vu_di_kem.id_dich_vu_di_kem in(select dvdk.hdct from (select hop_dong_chi_tiet.id_dich_vu_di_kem as hdct,sum(hop_dong_chi_tiet.so_luong) 
from hop_dong_chi_tiet
join hop_dong
on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
where year(hop_dong.ngay_lam_hop_dong)=2019
group by hop_dong_chi_tiet.id_dich_vu_di_kem
having sum(hop_dong_chi_tiet.so_luong)>10 ) as dvdk);

-- task 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID
-- (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select nhan_vien.id_nhan_vien as id,nhan_vien.ten_nhan_vien ten, nhan_vien.email,nhan_vien.so_DT,nhan_vien.ngay_sinh,nhan_vien.dia_chi
from nhan_vien
union all
select khach_hang.id_khach_hang ,khach_hang.ten_khach_hang, khach_hang.email,khach_hang.so_DT,khach_hang.ngay_sinh,khach_hang.dia_chi
from khach_hang;


