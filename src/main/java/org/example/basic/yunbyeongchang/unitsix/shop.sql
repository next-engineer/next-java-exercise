-- customers table
CREATE TABLE customers {
    customer_id INT PRIMARY KEY,
    country VARCHAR(100)
};

-- orders table
CREATE TABLE orders {
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE
    FOREIGN KEY(customer_id) REFERENCES customers(customer_id)
};

-- items table
CREATE TABLE items {
  item_id INT PRIMARY KEY,
  name VARCHAR(100)
};

-- order_items table
CREATE TABLE order_items {
    order_item_id INT PRIMARY KEY,
    order_id INT,
    item_id INT,
    price INT,
    quantity INT,
    FOREIGN KEY(order_id) REFERENCES orders(order_id),
    FOREIGN KEY(item_id) REFERENCES items(item_id)
};
