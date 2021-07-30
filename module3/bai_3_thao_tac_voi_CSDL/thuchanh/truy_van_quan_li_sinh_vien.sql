select * from student;
select * from student
where status=true;
select *from subject
where credit<10;
select* from student join class
on student.class_id=class.class_id
where class.class_name='A1';
select * from student join mark
 on student.student_id=mark.student_id
join subject
on mark.mark_id=subject.sub_id
where subject.sub_name='CF';