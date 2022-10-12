
select current_date();

-- SQL - Structured Query Language  -- 
-- MySQL, SQL Server, Oracle, DB2, Postgre

-- CRUD
-- Create -  INSERT - DML
-- Update - UPDATE - DML
-- Delete - DELETE - DML
-- Retrieve -  SELECT - DRL / DQL 

-- CREATE - DDL 
-- DROP - DDL 
-- ALTER - DDL 


CREATE TABLE emp_table (eid INT, first_name VARCHAR(10), salary DECIMAL);

SELECT * FROM emp_table; 

INSERT INTO emp_table (eid, first_name, salary) VALUES (101, 'Sonu', 90000);
INSERT INTO emp_table (eid, first_name, salary) VALUES (102, 'Monu', 95000);
INSERT INTO emp_table (eid, first_name, salary) VALUES (103, 'Tonu', 85000);
INSERT INTO emp_table (eid, first_name, salary) VALUES (104, 'Ponu', 80000);
INSERT INTO emp_table (eid, first_name, salary) VALUES (105, 'Gonu', 99000);

SELECT * FROM emp_table ORDER BY first_name; 

SELECT * FROM emp_table WHERE salary > 90000 ORDER BY salary; 

SELECT first_name FROM emp_table ORDER BY first_name; 

UPDATE emp_table SET salary = 86000 WHERE eid = 103;

SELECT * FROM emp_table;

DELETE FROM emp_table WHERE eid = 103;

INSERT INTO emp_table (eid, first_name, salary) VALUES (105, 'Gonu', 99000);

CREATE TABLE emp2 (eid INT PRIMARY KEY, first_name VARCHAR(10), salary DECIMAL);

INSERT INTO emp2 (eid, first_name, salary) VALUES (101, 'Sonu', 90000);
INSERT INTO emp2 (eid, first_name, salary) VALUES (102, 'Monu', 95000);
INSERT INTO emp2 (eid, first_name, salary) VALUES (102, 'Monu', 95000);

SELECT * FROM emp2;
