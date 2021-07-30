-- hiển thị
SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.';
-- kiem tra
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.';
-- tạo index
ALTER TABLE customers ADD INDEX idx_customerName(customerName);
-- kiem tra sau khi index
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.';
-- xóa index
ALTER TABLE customers DROP INDEX  idx_customerName;