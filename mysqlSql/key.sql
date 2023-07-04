CREATE TABLE stu (
	id INT,
	`name` VARCHAR(32));
INSERT INTO stu
	VALUES (1, 'jack'), (2, 'tom'), (3, 'kity'), (4, 'nono');
SELECT * FROM stu ;
CREATE TABLE exam(
	id INT,
	grade INT);
INSERT INTO exam
	VALUES (1, 56), (2, 76), (11, 8);
SELECT * FROM exam ;

SELECT `name`, stu.id , grade
	FROM stu, exam
	WHERE stu.id = exam.id;

SELECT `name`, stu.id, grade
	FROM stu LEFT JOIN exam
	ON stu.id = exam.id;

SELECT `name`, stu.id, grade
	FROM stu RIGHT JOIN exam
	ON stu.id = exam.id;

CREATE TABLE t17(
	id INT PRIMARY KEY,
	`name` VARCHAR(32),
	email VARCHAR(32));
INSERT INTO t17
	VALUES (1,'jack', 'jack@gmail.com');
INSERT INTO t17
	VALUES (2,'tom', 'tom@gmail.com');
INSERT INTO t17
	VALUES (3,'ghj', 'ghj@gmail.com');
SELECT * FROM t17;

CREATE TABLE t18(
	id INT ,
	`name` VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY(id , `name`));
INSERT INTO t18
	VALUES (1,'jack', 'jack@gmail.com');
INSERT INTO t18
	VALUES (2,'tom', 'tom@gmail.com');
INSERT INTO t18
	VALUES (1,'ghj', 'ghj@gmail.com');
SELECT * FROM t18;

DESC t18;

