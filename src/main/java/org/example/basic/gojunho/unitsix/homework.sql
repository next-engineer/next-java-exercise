CREATE DATABASE mydata;
USE mydata;

CREATE TABLE customers(
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(100) NOT NULL
);

CREATE TABLE items(
	item_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE orders (
	order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE order_items(
	order_item_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    item_id INT,
    price INT,
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (item_id) REFERENCES items(item_id)
);

INSERT INTO items(name)
VALUES ('고준호'),('곽철용'),('곽두철');

INSERT INTO customers(country)
VALUES ('한국'),('중국'),('미국');

INSERT INTO orders(customer_id,order_date)
VALUE (1,'2023-08-10'),(2,'2024-10-05'),(3,'2025-01-10'),
(1,'2023-01-10'),(2,'2024-02-05'),(3,'2025-03-10');


INSERT INTO order_items(order_id,item_id,price,quantity)
VALUE (1,1,5000,10),(2,2,1000,30),(3,3,7000,40),
(1,3,4000,5);

SELECT c.customer_id, c.country, o.order_id, o.order_date
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id;

SELECT o.order_id, o.order_date, oi.order_item_id,oi.price,oi.quantity
FROM orders o
JOIN order_items oi ON o.order_id=oi.order_id;

SELECT i.item_id,oi.order_item_id,i.name,oi.price,oi.quantity
FROM order_items oi
JOIN items i ON oi.item_id=i.item_id;
