-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *  
from subject
where  subject.credit=
(select max(subject.credit)
from subject
);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select *  
from student
join mark
on student.student_id=mark.student_id
where  mark.mark=
(select max(mark.mark)
from mark
);
 -- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
 select student.student_id,student.student_name,avg(mark.mark) diem_trung_binh
from student
left join mark
on student.student_id=mark.student_id
group by student.student_id
order by mark.mark desc;

