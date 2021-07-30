
INSERT INTO Student (student_name, add_ress, phone, status, class_id)
VALUES ('Hung', 'Ha Noi', 0912113, 1, 1);
INSERT INTO Student (student_name, add_ress, status, class_id)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (student_name, add_ress, phone, status, class_id)
VALUES ('Manh', 'HCM', 012312, 0, 2);
INSERT INTO class(class_name,start_date,status)
VALUES ( 'CF', '2010/11/11', '1'),
       ( 'C', '2010/11/11', '1'),
       ( 'HDJ', '2010/11/11', '1'),
       ( 'RDBMS', '2010/11/11', '1');
update class
set class_name='A4'
where class_id=4;
INSERT INTO Subject(sub_name,credit,status)
VALUES ( 'CF', 5, 1),
       ( 'C', 6, 1),
       ( 'HDJ', 5, 1),
       ( 'RDBMS', 10, 1);

delete from subject;
INSERT INTO Mark ( Student_Id,sub_id, Mark, Exam_Times)
VALUES ( 1,1, 8, 1),
       ( 2,2, 10, 2),
       ( 3,1, 12, 1);