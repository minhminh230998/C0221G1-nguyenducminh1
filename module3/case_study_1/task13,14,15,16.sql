-- task 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các 
-- Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select sum(hop_dong_chi_tiet.so_luong) so_lan, dich_vu_di_kem.ten_dich_vu_di_kem
from hop_dong_chi_tiet
join dich_vu_di_kem
on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong_chi_tiet.id_dich_vu_di_kem
 having sum(hop_dong_chi_tiet.so_luong)>=
 all(select sum(hop_dong_chi_tiet.so_luong)
 from hop_dong_chi_tiet
 group by hop_dong_chi_tiet.id_dich_vu_di_kem)
 ;
 
 -- task 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
 -- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
 select hop_dong.id_hop_dong,loai_dich_vu.loai_dich_vu,dich_vu_di_kem.ten_dich_vu_di_kem,
 count(hop_dong_chi_tiet.id_dich_vu_di_kem)
 from hop_dong_chi_tiet
 join dich_vu_di_kem
 on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
 join hop_dong
 on hop_dong_chi_tiet.id_hop_dong=hop_dong.id_hop_dong
 join dich_vu
 on hop_dong.id_dich_vu=dich_vu.id_dich_vu
 join loai_dich_vu
 on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
group by hop_dong_chi_tiet.id_dich_vu_di_kem
having count(hop_dong_chi_tiet.id_dich_vu_di_kem)=1;
-- task 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo,
-- TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhan_vien.id_nhan_vien,nhan_vien.ten_nhan_vien,trinh_do_nhan_vien.trinh_do,bo_phan_nhan_vien.bo_phan,
nhan_vien.so_DT,nhan_vien.dia_chi,count(hop_dong.id_nhan_vien) so_hop_dong,hop_dong.ngay_lam_hop_dong,hop_dong.id_hop_dong
from nhan_vien
join trinh_do_nhan_vien
on nhan_vien.id_trinh_do_nhan_vien=trinh_do_nhan_vien.id_trinh_do_nhan_vien
join bo_phan_nhan_vien
on nhan_vien.id_bo_phan_nhan_vien=bo_phan_nhan_vien.id_bo_phan_nhan_vien
left join hop_dong
on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
where hop_dong.id_hop_dong in(
select hop_dong.id_hop_dong
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) =2018 or year(hop_dong.ngay_lam_hop_dong)=2019)  
group by hop_dong.id_nhan_vien
having count(hop_dong.id_nhan_vien)<=3 ;

-- task 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

delete from nhan_vien
where id_nhan_vien not in (select hop_dong.id_nhan_vien
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019
group by hop_dong.id_nhan_vien
);


