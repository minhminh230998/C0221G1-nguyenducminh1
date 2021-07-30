create database de_mo;
use de_mo;
create table product
(
id int primary key,
product_code varchar(50),
product_name varchar(50),
product_price bigint,
product_amount int,
product_description varchar(50),
product_status varchar(10)
);
insert into product
values(1,'PR1','Máy lạnh ',200000,5,'abc','1'),
(2,'PR2','Máy giặc ',500000,7,'abc','1'),
(3,'PR3','Máy quạt ',250000,3,'abc','1'),
(4,'PR4','Máy nước nóng ',200000,4,'abc','1');
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
alter table product
add unique uq_index(product_code);
select *
from product where product_code='PR1';
-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
alter table product
add index uq_index1(product_name,product_price);
select *
from product where product_name='Máy nước nóng '  and product_price=200000;
-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
EXPLAIN select *
from product where product_name='Máy nước nóng '  and product_price=200000;
-- So sánh câu truy vấn trước và sau khi tạo index

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create or replace view view_product as
select  product_code, product_name, product_price, product_status
from product ;
select * from view_product;

-- Tiến hành sửa đổi view
alter view view_product(product_code)
as select product_code
from product;
select * from view_product;

-- Tiến hành xoá view
drop view view_product;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //

CREATE PROCEDURE get_product

()

BEGIN

  SELECT * FROM product  ;

END //

DELIMITER ;
call get_product();

-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //

CREATE PROCEDURE add_new_productss

(p_id int,p_product_code varchar(50),p_product_name varchar(50),p_product_price bigint,p_product_amount int,p_product_description varchar(50),p_product_status varchar(50))

BEGIN

  insert into product values (p_id=id,p_product_code=product_code,p_product_name=product_name,p_product_price=product_price,p_product_amount=product_amount,p_product_description=product_description,p_product_status=product_status);

END //

DELIMITER ;
call add_new_productss(5,'PR5','Máy nước nóng',200000,4,'abc','1');
call add_new_productss(6,'PR6','Máy nước nóng',200000,4,'abc','1');
call get_product();

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //

CREATE PROCEDURE p_edit_products
(in id_product int,in p_product_price bigint)

BEGIN

 update product set product_price=p_product_price
 where id_product=id;

END //

DELIMITER ;
call p_edit_products(3,400000);

 -- Tạo store procedure xoá sản phẩm theo id
 DELIMITER //

CREATE PROCEDURE delete_products
(in id_product bigint)

BEGIN

delete from product
 where id_product=id;

END //

DELIMITER ;
call delete_product(3);
