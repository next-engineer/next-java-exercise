-- create orders
CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- create customers
CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(50)
);

-- create order_items
CREATE TABLE order_items (
    order_item_id INT PRIMARY KEY AUTO_INCREMENT,
    price DECIMAL(10,2),
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (item_id) REFERENCES items(item_id)
);

-- create items
CREATE TABLE items (
    item_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);

-- insert orders
INSERT INTO orders (order_date) VALUES
('2023-07-10'),
('2023-09-10');

-- insert customers
INSERT INTO customers (country) VALUES
('KOREA'),
('SINGAPORE');

-- insert order_items
INSERT INTO order_items (price, quantity) VALUES
(45.00, 2),
(25.00, 1);

-- insert items
INSERT INTO items (name) VALUES
('Alice'),
('Bob');
