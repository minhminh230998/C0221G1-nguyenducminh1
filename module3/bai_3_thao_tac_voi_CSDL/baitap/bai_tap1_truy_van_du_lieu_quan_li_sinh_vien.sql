use quan_li_sinh_vien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select student.student_name
from student
where student.student_name like 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select *
from class
where month(start_date)=12;
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5
select *
from subject
where credit between 3 and 5;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student
set student.class_id=2
where student.student_name='Hung';
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
update mark
set sub_id=3
where mark_id=4;
select student.student_name,subject.sub_name,mark.mark
from mark
join student
on student.student_id=mark.student_id
join subject
on mark.sub_id=subject.sub_id
order by mark desc , student.student_name asc
