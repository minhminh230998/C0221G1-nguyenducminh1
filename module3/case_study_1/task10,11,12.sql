-- task 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc,
-- SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hop_dong.id_hop_dong,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,hop_dong.so_tien_coc_truoc,
count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem
from hop_dong
join hop_dong_chi_tiet
on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem
on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong_chi_tiet.id_hop_dong;
-- task 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có
-- TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dich_vu_di_kem.ten_dich_vu_di_kem as ten_dich_vu,khach_hang.dia_chi,loai_khach.ten_loai_khach_hang
from dich_vu_di_kem
join hop_dong_chi_tiet
on dich_vu_di_kem.id_dich_vu_di_kem=hop_dong_chi_tiet.id_dich_vu_di_kem
join hop_dong
on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
join khach_hang
on hop_dong.id_khach_hang=khach_hang.id_khach_hang
join loai_khach
on khach_hang.id_loai_khach=loai_khach.id_loai_khach
where loai_khach.ten_loai_khach_hang='Diamond'
and (khach_hang.dia_chi='vinh' or khach_hang.dia_chi='quảng ngãi');
-- task 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang,
-- TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa 
-- từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hop_dong.id_hop_dong,nhan_vien.ten_nhan_vien,khach_hang.ten_khach_hang,khach_hang.so_DT,
dich_vu.ten_dich_vu,count(hop_dong_chi_tiet.id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, hop_dong.so_tien_coc_truoc
from hop_dong 
join nhan_vien  
on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
join khach_hang 
on khach_hang.id_khach_hang = hop_dong.id_khach_hang
join dich_vu 
on dich_vu.id_dich_vu = hop_dong.id_dich_vu
join hop_dong_chi_tiet 
on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where (hop_dong.ngay_lam_hop_dong between '2019/09/01' and '2019/12/31' )
and hop_dong.id_dich_vu not in (
        select hop_dong.id_dich_vu
        from hop_dong 
        where hop_dong.ngay_lam_hop_dong between '2019/01/01' and '2019/06/30' )
group by hop_dong.id_hop_dong;





