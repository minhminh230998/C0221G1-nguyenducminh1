use quan_li_sinh_vien;
-- Hiển thị số lượng sinh viên ở từng nơi
select count(student.student_id) so_luong_hoc_sinh, student.add_ress as noi_o
from student
group by noi_o;

-- Tính điểm trung bình các môn học của mỗi học viên
select mark.student_id,student.student_name,avg(mark.mark) diem_trung_binh
from mark
join student
on mark.student_id=student.student_id
group by mark.student_id,student.student_name;
-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select mark.student_id,student.student_name,avg(mark.mark) diem_trung_binh
from mark
join student
on mark.student_id=student.student_id
group by mark.student_id,student.student_name
having diem_trung_binh>15;
-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất
select mark.student_id,student.student_name,avg(mark.mark) diem_trung_binh
from mark
join student
on mark.student_id=student.student_id
group by mark.student_id,student.student_name
having diem_trung_binh>= all(
select avg(mark.mark)
from mark
group by mark.student_id
);

