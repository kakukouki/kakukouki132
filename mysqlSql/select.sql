
CREATE TABLE student (
	id INT NOT NULL DEFAULT 1,
	`name` VARCHAR ( 20 ) NOT NULL DEFAULT '',
	chinese FLOAT NOT NULL DEFAULT 0.0,
	english FLOAT NOT NULL DEFAULT 0.0,
	math FLOAT NOT NULL DEFAULT 0.0
);
INSERT INTO student
VALUES
	( 1, 'jack', 89, 78, 90 ),
	( 2, 'john', 67, 98, 56 ),
	( 3, 'may', 87, 78, 77 ),
	( 4, 'marry', 88, 98, 90 ),
	( 5, 'tom', 82, 84, 67 ),
	( 6, 'dad', 55, 85, 45 ),
	( 7, 'aurora', 75, 65, 30 );

	SELECT * FROM student
	SELECT `name`, math FROM student;
	SELECT DISTINCT math FROM student;
	SELECT DISTINCT math , `name` FROM student;

	SELECT `name` , (chinese + english + math ) FROM student;
	SELECT `name`, (chinese + english + math + 10) FROM student;
	SELECT `name`, (chinese + english + math + 10)  AS total_score FROM student;


	SELECT `name` , (chinese + english + math )  AS total_score FROM student
		WHERE `name` LIKE 'm%'
		ORDER BY total_score DESC;

	SELECT * FROM student

	SELECT CONCAT(UPPER(SUBSTRING(`name`, 1, 1)), SUBSTRING(`name` ,2 )) AS new_name
		FROM student
