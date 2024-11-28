create database demo_c0824g1;

use demo_c0824g1;

create table students(
	id int auto_increment,
    name_student varchar(100) not null,
    address varchar(200),
    score double,
    check (score >= 0 and score <= 10),
    primary key (id)
);

insert into students(name_student, score) values("HaiTT", 9);

select * from students;

SET SQL_SAFE_UPDATES = 0;
update students set name_student = "Hai" where name_student ="HaiTT";
SET SQL_SAFE_UPDATES = 1;