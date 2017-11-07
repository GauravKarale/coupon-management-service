INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (1,'The Whistler',' The best thriller writer alive by Ken Follett',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (2,'The Testament: A Novel','NEW YORK TIMES BESTSELLER',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (3,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (4,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (5,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (6,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (7,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (8,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (9,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (10,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (11,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO PRODUCT (ID,NAME,PRODUCT_DESC,PRICE,CURRENCY_CODE,CATEGORY_NAME) VALUES (12,'The Partner: A Novel','They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ',50.00,'USD','Book');

INSERT INTO COUPONS(ID ,
	COUPON_DESC ,
	CURRENCY ,
	VALID ,
	COUPON_TYPE ,
	MAX_REDEMPTIONS,
	REDEEM_BY,
	USED_COUNT,
	APPLY_TYPE,
	EXCLUDE_FIRST,
	MAX_DISCOUNT_PER_ITEM,
	MAX_DISCOUNT_ON_TOTAL,
	DISCOUNT,
	OFFSET_VALUE
)
VALUES('VFRT5T','Haloween offer','USD','true','APPLYPERITEM',4,CURRENT_DATE()+1,0,'ITEM',1,4,0,4,25);

INSERT INTO COUPONS(ID ,
	COUPON_DESC ,
	CURRENCY ,
	VALID ,
	COUPON_TYPE ,
	MAX_REDEMPTIONS,
	REDEEM_BY,
	USED_COUNT, 
	APPLY_TYPE,
	EXCLUDE_FIRST,
	MAX_DISCOUNT_PER_ITEM,
	MAX_DISCOUNT_ON_TOTAL,
	DISCOUNT,
	OFFSET_VALUE
)
VALUES('GRTYUP','Haloween offer','USD','true','APPLYONTOTAL',4,CURRENT_DATE(),0,'PERCENT',1,4,0,4,25);

INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',1);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',2);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',3);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',4);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',5);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',6);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',7);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',8);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',9);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',10);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',11);
INSERT INTO COUPON_PRODUCT(coupon_id,product_id) VALUES('VFRT5T',12);

INSERT INTO COUPON_USER(coupon_id,user_id) VALUES('VFRT5T',1);
INSERT INTO COUPON_USER(coupon_id,user_id) VALUES('VFRT5T',2);

INSERT INTO USER_TABLE(
  ID,
  NAME,
  CURRENT_BALANCE,
  CURRENCY_CODE 
)
VALUES(1,'Tim',300.00,'USD');

INSERT INTO USER_TABLE(
  ID,
  NAME,
  CURRENT_BALANCE,
  CURRENCY_CODE 
)
VALUES(2,'Jeremy',200.00,'USD');

