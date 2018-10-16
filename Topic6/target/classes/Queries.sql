create table ShoppingCart (
cart_id int not null primary key,
totalPrice double,
products_quantity int
)

create table Product (
product_id int not null primary key,
product_name varchar(40),
price double,
quantity int
)

create table Users (
user_id int not null primary key,
user_name varchar (30),
pass varchar (30),
real_name varchar(30)
)