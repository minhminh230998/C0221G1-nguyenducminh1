-- 21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã từng
-- lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”
create view v_nhan_vien as
select nhan_vien.id_nhan_vien,nhan_vien.ten_nhan_vien,nhan_vien.dia_chi
from nhan_vien 
join hop_dong
on nhan_vien.id_nhan_vien=hop_dong.id_nhan_vien
where nhan_vien.dia_chi='Hòa Khánh' and hop_dong.ngay_lam_hop_dong='2019-12-12'
group by hop_dong.id_nhan_vien;
select * from v_nhan_vien;
drop view v_nhan_vien;

-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu”
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
update nhan_vien
set nhan_vien.dia_chi='Liên Chiểu'
where nhan_vien.id_nhan_vien in 
	(	
		select v_nhan_vien.id_nhan_vien
		from v_nhan_vien
	);

-- 23.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với Id Khách hàng được
-- truyền vào như là 1 tham số của Sp_1
 DELIMITER //

CREATE PROCEDURE delete_khach_hang
(in id_khach bigint)

BEGIN

delete from khach_hang
 where id_khach=khach_hang.id_khach_hang;

END //

DELIMITER ;
call delete_khach_hang(3);
drop PROCEDURE delete_khach_hang;
SET SQL_SAFE_UPDATES = 1;
 -- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu
 -- bổ sung, với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
 DELIMITER //
 CREATE PROCEDURE them_hop_dong
 (p_id_nhan_vien int,p_id_khach_hang int,p_id_dich_vu int,p_ngay_lam_hop_dong date,
 p_ngay_ket_thuc date,p_so_tien_coc_truoc double)
 BEGIN

  insert into hop_dong (id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,so_tien_coc_truoc)
  values (p_id_nhan_vien=hop_dong.id_nhan_vien,p_id_khach_hang=hop_dong.id_khach_hang,p_id_dich_vu=hop_dong.id_dich_vu,p_ngay_lam_hop_dong=hop_dong.ngay_lam_hop_dong,
  p_ngay_ket_thuc=hop_dong.ngay_ket_thuc,p_so_tien_coc_truoc=hop_dong.so_tien_coc_truoc);

END //

DELIMITER ;
drop PROCEDURE them_hop_dong;

call them_hop_dong(2,2,2,"2021/12/03","2021/12/10","1000000");

-- 25.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong thì hiển thị tổng số lượng bản ghi còn lại có trong
-- bảng HopDong ra giao diện console của database
delete from hop_dong
where hop_dong.id_hop_dong=5;
DELIMITER //
CREATE TRIGGER delele_hop_dong
before delete on hop_dong
for each row
begin
set @so_luong=(select count(hop_dong.id_hop_dong)from hop_dong);
(select @so_luong as log into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log.txt');
end //
DELIMITER ;
drop TRIGGER delele_hop_dong;

-- 26.	Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng, cần kiểm tra xem thời gian cập nhật có phù hợp hay không,
-- với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày. Nếu dữ liệu hợp lệ thì cho phép
-- cập nhật, nếu dữ liệu không hợp lệ thì in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng
-- ít nhất là 2 ngày” trên console của database
update hop_dong
set ngay_ket_thuc='2019-12-5'
where id_hop_dong=4;
DELIMITER //
CREATE TRIGGER tr_2
before update on hop_dong
for each row
begin
if(select datediff(new.ngay_ket_thuc,old.ngay_lam_hop_dong)<2) then 
(select concat('Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng
 ít nhất là 2 ngày')  as log into outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/log2.txt');
 end if;
end //
DELIMITER ;
drop TRIGGER tr_2;
 
-- 27.	Tạo user function thực hiện yêu cầu sau:
-- a.	Tạo user function func_1: Đếm các dịch vụ đã được sử dụng với Tổng tiền là > 2.000.000 VNĐ.
DELIMITER //
create function func_1()
returns int
DETERMINISTIC
begin
declare count_dich_vu int;
set count_dich_vu=(select count(x.chi_phi)
from (select sum(dich_vu.chi_phi_thue) chi_phi
from dich_vu
join hop_dong
on dich_vu.id_dich_vu=hop_dong.id_dich_vu
group by dich_vu.id_dich_vu
having sum(dich_vu.chi_phi_thue)>2000000)x);
return count_dich_vu;
end //

 DELIMITER ;
 drop function func_1;
 select func_1();
