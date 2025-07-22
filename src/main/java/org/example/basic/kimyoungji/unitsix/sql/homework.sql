-- 1. customers 테이블
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    country VARCHAR(50)
);

-- 2. orders 테이블
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- 3. items 테이블
CREATE TABLE items (
    item_id INT PRIMARY KEY,
    name VARCHAR(100)
);

-- 4. order_items 테이블
CREATE TABLE order_items (
    order_item_id INT PRIMARY KEY,
    order_id INT,
    item_id INT,
    price DECIMAL(10,2),
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (item_id) REFERENCES items(item_id)
);