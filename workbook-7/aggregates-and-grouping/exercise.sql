-- Question 1
USE northwind;

SELECT *
FROM suppliers;

-- Question 2

USE northwind;

SELECT sum(salary)
FROM employees;

-- Question 3

USE northwind;

SELECT *
FROM products
ORDER BY UnitPrice ASC;

-- Question 4

USE northwind;

SELECT AVG(UnitPrice)
FROM products;

-- Question 5

USE northwind;

SELECT MAX(UnitPrice)
FROM products;

-- Question 6

USE northwind;

SELECT *
FROM products;

-- Question 7

USE northwind;

SELECT 