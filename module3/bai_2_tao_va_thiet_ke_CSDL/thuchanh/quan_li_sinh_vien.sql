create database quan_li_sinh_vien;
create table class
(
class_id int primary key auto_increment,
class_name varchar(60),
start_date date,
`status` varchar(255)
);

create table student
(
student_id int primary key auto_increment,
student_name varchar(30),
add_ress varchar(50),
phone varchar(20),
`status` bit,
class_id int,
foreign key(class_id) references class(class_id)
);
create table `subject`
(
sub_id int primary key auto_increment,
sub_name varchar(30),
credit tinyint default(1) ,
`status` bit,
check(credit>=1)
);
create table mark
(
mark_id int primary key auto_increment,
sub_id int,
student_id int,
mark float default(0)check(mark>0 and mark<100),
exam_times tinyint default(1),
foreign key(sub_id) references `subject`(sub_id),
foreign key(student_id) references `student`(student_id)
)