CREATE TABLE coupons (
	id VARCHAR(10) PRIMARY KEY,
	coupon_desc VARCHAR(600),
	currency VARCHAR(6),
	valid VARCHAR(5),
	coupon_type VARCHAR(15),
	max_redemptions FLOAT,
	redeem_by DATE,
	used_count INTEGER,
	apply_type VARCHAR(10),
	exclude_first INTEGER,
	max_discount_per_item FLOAT,
	max_discount_on_total FLOAT,
	discount FLOAT,
	offset_value FLOAT
);


CREATE TABLE  product (
  id INTEGER PRIMARY KEY,
  name VARCHAR(30),
  product_desc  VARCHAR(200),
  price FLOAT,
  currency_code VARCHAR(50),
  category_name VARCHAR(50)
);

CREATE TABLE  user_table (
  id   INTEGER PRIMARY KEY,
  name VARCHAR(30),
  current_balance  FLOAT,
  currency_code VARCHAR(50)
);



/*CREATE TABLE carts(
 customer_id INTEGER,
 cart_id INTEGER,
 total_price DECIMAL(5,2),
 discounted_price DECIMAL(5,2),
 payment_mode VARCHAR(20),
 currency_code VARCHAR(6),
 product_quantity VARCHAR(10),
 order_date  DATE 
);*/

CREATE TABLE coupon_user(
	coupon_id VARCHAR(10),
	user_id INTEGER
);


CREATE TABLE coupon_product(
	coupon_id VARCHAR(10) ,
	product_id INTEGER,
);