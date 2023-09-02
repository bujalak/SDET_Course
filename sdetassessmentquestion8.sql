
CREATE TABLE EMP_Data (
    EMP_No INT PRIMARY KEY,
    EMP_Name VARCHAR(100),
    EMP_Exp INT,
    EMP_Department VARCHAR(50),
    EMP_Salary INT
);


INSERT INTO EMP_Data (EMP_No, EMP_Name, EMP_Exp, EMP_Department, EMP_Salary)
VALUES
    (1, 'John Doe', 5, 'HR', 50000),
    (2, 'Jane Smith', 3, 'IT', 60000),
    (3, 'Michael Johnson', 8, 'Finance', 75000),
    (4, 'Emily Brown', 2, 'IT', 55000),
    (5, 'Robert Williams', 6, 'Finance', 70000);


SELECT EMP_No, EMP_Name, EMP_Exp, EMP_Department, EMP_Salary
FROM EMP_Data
WHERE EMP_Department = 'IT';
