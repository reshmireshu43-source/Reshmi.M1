CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    roll_no INT,
    name VARCHAR(50) NOT NULL,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(100)
);

INSERT INTO Students
VALUES
(1, 101, 'Rahul', 20, '2006-05-10', 'rahul@gmail.com', '9876543210', 'Bengaluru');

INSERT INTO Students
VALUES
(2, 102, 'Priya', 19, '2007-02-15',
