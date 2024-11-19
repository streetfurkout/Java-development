-- Question 1
-- ANSWER IS "PRODUCT"

-- Question 2
USE northwind;

SELECT ProductID, ProductName, UnitPrice
FROM products;

-- Question 3
USE northwind;

SELECT ProductID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice ASC;

-- Question 4
USE northwind;

SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice <= 7.50 ;

-- Question 5

USE northwind;

SELECT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products
WHERE UnitsInStock < 100 
ORDER BY UnitPrice DESC; 

-- Question 6

USE northwind;

SELECT DISTINCT ProductID, ProductName, UnitPrice, UnitsInStock
FROM products
WHERE UnitsInStock < 100 
ORDER BY UnitPrice DESC;

-- Question 7
USE northwind;

SELECT *
FROM products
WHERE UnitsInStock < 1 AND UnitsOnOrder > 1;

-- Question 8
SELECT *
FROM categories;

-- Question 9

SELECT *
FROM categories;

-- Question 10













