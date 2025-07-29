CREATE SCHEMA sales_db;


USE sales_db;


-- 고객 테이블
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    country VARCHAR(100)
);

-- 주문테이블
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- 제품 테이블
CREATE TABLE items (
    item_id INT PRIMARY KEY,
    name VARCHAR(100)
);


-- 주문제품 테이블

CREATE TABLE order_items (
    order_item_id INT PRIMARY KEY,
    order_id INT,
    item_id INT,
    price DECIMAL(10, 2),
    quantity INT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (item_id) REFERENCES items(item_id)
);

-- 주문 고객 연결
ALTER TABLE orders
ADD CONSTRAINT fk_orders_customer
FOREIGN KEY (customer_id)
REFERENCES customers(customer_id);

-- 주문항목 주문 연결

ALTER TABLE order_items
ADD CONSTRAINT fk_order_items_order
FOREIGN KEY (order_id)
REFERENCES orders(order_id);

-- 주문 상품 주문 연결
ALTER TABLE order_items
ADD CONSTRAINT fk_order_items_item
FOREIGN KEY (item_id)
REFERENCES items(item_id);
