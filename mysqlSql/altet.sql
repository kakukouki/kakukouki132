
UPDATE employee SET salary = 5000
UPDATE employee
		SET salary = 3000
		WHERE user_name = 'モンスター'
INSERT INTO employee
		VALUES(90, '化け物', '1998-02-07', '2008-04-16 21:34:56', 'マッサージマン', 5000, '王様にマッサージする', 'ghj', 'jhg');
UPDATE employee
		SET salary = salary + 1000
		WHERE user_name = '化け物'
SELECT * FROM employee;
DELETE FROM employee
		WHERE user_name = '化け物'
UPDATE employee
		SET image = 'ghj' WHERE user_name = 'モンスター'
DROP TABLE t4

