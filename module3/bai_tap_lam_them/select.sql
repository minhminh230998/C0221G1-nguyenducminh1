-- 1.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên
select nhd.id_nguoi_huong_dan,nhd.ten_nguoi_huong_dan,k.ten_khoa
from nguoi_huong_dan nhd
left join khoa k
on nhd.id_khoa=k.id_khoa;
 
 -- 2.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va QLTN’
 select nhd.id_nguoi_huong_dan,nhd.ten_nguoi_huong_dan,k.ten_khoa
from nguoi_huong_dan nhd
join khoa k
on nhd.id_khoa=k.id_khoa 
where k.id_khoa=1 or k.id_khoa=2;

-- 3.	Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’
select count(sinh_vien.id_khoa)
from sinh_vien
where sinh_vien.id_khoa=2
group by sinh_vien.id_khoa;

-- 4.	Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN’
select sv.id_sinh_vien,sv.ten_sinh_vien, (year(CURDATE())-year(sv.ngay_sinh)) tuoi
from sinh_vien sv
where sv.id_khoa=4;

-- 5.	Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’
select count(nhd.id_khoa) so_gian_vien
from nguoi_huong_dan nhd
where nhd.id_khoa=2
group by nhd.id_khoa;

-- 6.	Cho biết thông tin về sinh viên không tham gia thực tập
select sv.id_sinh_vien
from sinh_vien sv
left join nguoi_huong_dan_sinh_vien nhdsv
on nhdsv.id_sinh_vien=sv.id_sinh_vien
where nhdsv.id_sinh_vien is null;

-- 7.	Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa
select k.id_khoa,k.ten_khoa,count(nhd.id_khoa) so_giang_vien
from khoa k
left join nguoi_huong_dan nhd
on k.id_khoa=nhd.id_khoa
group by nhd.id_khoa;

-- 8.	Cho biết số điện thoại của khoa mà sinh viên có tên ‘Trần Nguyên Vũ’ đang theo học
select k.so_dt
from khoa k
join sinh_vien sv
on k.id_khoa=sv.id_khoa
where sv.id_sinh_vien=1;

-- 1.	Cho biết mã số và tên của các đề tài do giảng viên ‘Đoàn Minh Đức’ hướng dẫn
select da.ten_du_an,da.id_du_an
from du_an da
join nguoi_huong_dan_sinh_vien nhdsv
on da.id_du_an=nhdsv.id_du_an
where nhdsv.id_nguoi_huong_dan=1;

-- 2.	Cho biết tên đề tài không có sinh viên nào thực tập
select da.ten_du_an,da.id_du_an
from du_an da
left join nguoi_huong_dan_sinh_vien nhdsv
on da.id_du_an=nhdsv.id_du_an
where nhdsv.id_sinh_vien is null;

-- 3.	Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên.
select nhd.id_nguoi_huong_dan,nhd.ten_nguoi_huong_dan, k.ten_khoa, count(nhdsv.id_sinh_vien)
from nguoi_huong_dan nhd
join khoa k
on nhd.id_khoa=k.id_khoa
join nguoi_huong_dan_sinh_vien nhdsv
on nhd.id_nguoi_huong_dan=nhdsv.id_nguoi_huong_dan
group by nhdsv.id_nguoi_huong_dan
having count(nhdsv.id_sinh_vien)>=3;

-- 4.	Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất
select da.id_du_an,da.ten_du_an
from du_an da
where da.kinh_phi=(select max(da.kinh_phi)
from du_an da)
