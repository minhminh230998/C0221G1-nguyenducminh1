use  quan_li_ban_hang;
-- thêm customer
insert into customer
values (1,"Minh Quan",10),
(2,"Ngoc Oanh",20),
(3,"Hong Ha",50);

-- thêm order
insert into `order`
values (1,1,'2006/3/26',null),
(2,2,'2006/3/21',null),
(3,1,'2006/3/27',null);

-- them product
insert into product
values (1,"May Giac",3),
(2,"Tu Lanh",5),
(3,"Dieu Hoa",7),
(4,"Quat",1),
(5,"Bep Dien",2);
insert into order_detail
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select *
from `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.c_name,product.p_name 
from customer
join `order`
on customer.c_id=`order`.c_id
join order_detail
on `order`.o_id=order_detail.o_id
join product
on order_detail.p_id=product.p_id;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.c_name-- ,product.p_name 
from customer
left join `order`
on customer.c_id=`order`.c_id
where `order`.c_id is null;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)

select `order`.o_id, `order`.o_date,sum(order_detail.od_qty*product.p_price) as gia_tien_cua_tung_hoa_don
from `order`
join order_detail
on `order`.o_id=order_detail.o_id
join product
on order_detail.p_id=product.p_id
group by `order`.o_id
