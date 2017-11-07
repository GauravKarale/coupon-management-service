# coupon-management-service
Coupon management service
# Technologies

JDK 1.8.0

Maven 4.0

SpringBoot 1.4.0.RELEASE

H2 DB


cd coupon-management-service

Then run 

mvn clean package

Then run the jar

java -jar target/coupons-management-service-0.0.1-SNAPSHOTjar

Application will start running on port 8080


# Calling API Service

POST http://localhost:8080/coupons-management-service/coupon/apply

Request Body

{
	"couponCode": "VFRT5T",
	"orderId": 1,
	"productList": [
		1,
		2,
		3,
		4,
		5,
		6,
		7,
		8,
		9,
		10,
		11,
		12
	],
	"userId": 1
}

Response Body

{
    "couponCode": "VFRT5T",
    "orderId": 1,
    "discountedTotal": 276,
    "discountedItem": {
        "1": 50,
        "2": 50,
        "3": 50,
        "4": 46,
        "5": 42,
        "6": 38
    },
    "noProductCanBuy": 6,
    "balanceRemain": 24,
    "totalDiscountOffered": null
}


GET http://localhost:8080/coupons-management-service/coupon/get

Response Body 
{
    "couponId": "VFRT5T",
    "couponDesc": "Haloween offer",
    "currency": "USD",
    "coupon_type": "APPLYPERITEM",
    "max_redemptions": 4,
    "redeemBy": 1509865200000,
    "usedCount": 0,
    "isValid": true,
    "productList": [
        {
            "productId": 1,
            "name": "The Whistler",
            "desc": " The best thriller writer alive by Ken Follett",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 2,
            "name": "The Testament: A Novel",
            "desc": "NEW YORK TIMES BESTSELLER",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 3,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 4,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 5,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 6,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 7,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 8,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 9,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 10,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 11,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        },
        {
            "productId": 12,
            "name": "The Partner: A Novel",
            "desc": "They watched Danilo Silva for days before they finally grabbed him. He was living alone, a quiet life on a shady street in Brazil; ",
            "category": "Book",
            "price": 50,
            "currencyCode": "USD"
        }
    ],
    "applyType": "ITEM",
    "excludeFirst": 1,
    "maxDiscountPerItem": 4,
    "maxDiscountOnTotal": 0,
    "discount": 4,
    "offsetValue": 25
}

Get http://localhost:8080/coupons-management-service/coupon/GRTYUP

Response Body

{
    "couponId": "GRTYUP",
    "couponDesc": "Haloween offer",
    "currency": "USD",
    "coupon_type": "APPLYONTOTAL",
    "max_redemptions": 4,
    "redeemBy": 1509955200000,
    "usedCount": 0,
    "isValid": true,
    "productList": [],
    "applyType": "PERCENT",
    "excludeFirst": 1,
    "maxDiscountPerItem": 4,
    "maxDiscountOnTotal": 0,
    "discount": 4,
    "offsetValue": 25
}

# Test case reports are present in :-
coupon-management-service/target/site/jacoco/index.html



