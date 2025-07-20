create schema homework;
use homework;
select * from customers;
select * from items;
select * from orders;
select * from order_items;

create table customers
    (customer_id int primary key auto_increment,
     country varchar(20));

create table items
    (item_id int primary key auto_increment,
     name varchar(100));

create table orders
    (order_id int primary key auto_increment,
     customer_id int,
     order_date date,
     foreign key(customer_id) references customers(customer_id)
    );

create table order_items
    (order_item_id int primary key auto_increment,
     order_id int,
     item_id int,
     price int,
     quantity int,
     foreign key(order_id) references orders(order_id),
     foreign key(item_id) references items(item_id)
    );

insert into customers(country) values
                            ('Korea'),
                            ('Japan'),
                            ('USA'),
                            ('China'),
                            ('Spain');
insert into items(name) values
                            ('아이패드'),
                            ('모니터'),
                            ('마우스'),
                            ('스피커');
insert into orders(customer_id, order_date) values
                                                (1, '2025-07-19'),
                                                (3, '2025-07-18'),
                                                (2, '2025-07-16');
insert into orders(customer_id, order_date) values
                                                (2, '2025-06-11'),
                                                (2, '2025-06-12'),
                                                (2, '2025-06-13'),
                                                (3, '2025-05-11');
insert into order_items(order_id, item_id, price, quantity) values
                                                                (2, 3,15000, 2),
                                                                (1, 1, 500000, 1),
                                                                (3, 2, 50000, 3);
insert into order_items(order_id, item_id, price, quantity) values
                                                                (4,5, 650000, 3),
                                                                (5, 1, 500000, 1),
                                                                (6, 3, 15000, 6),
                                                                (7, 2, 50000, 1);

update order_items set quantity = 4 where order_item_id = 2;
update items set name = '무선 마우스' where item_id = 3;

-- delete는 생략
delete from items where name='스피커';
insert into items (name) values ('노트북');

-- SQL 연습
-- customer_id가 3인 사람이 구매한 item 총 갯수
select i.name AS '제품명', sum(oi.quantity) AS '구매량'
    from orders o
    join customers c on c.customer_id = o.customer_id
    join order_items oi on o.order_id = oi.order_id
    join items i on oi.item_id = i.item_id
where c.customer_id = 3
group by i.name;

-- 한번이라도 '무선 마우스'를 구매한 회원 조회
select c.customer_id AS '구매ID'
from orders o
         join customers c on c.customer_id = o.customer_id
         join order_items oi on o.order_id = oi.order_id
         join items i on oi.item_id = i.item_id
where i.name='무선 마우스'
group by c.customer_id;

-- 고객별 주문 횟수
select c.customer_id AS '구매ID', count(o.order_id) AS '구매횟수'
from orders o
         join customers c on c.customer_id = o.customer_id
         join order_items oi on o.order_id = oi.order_id
         join items i on oi.item_id = i.item_id
group by c.customer_id;
