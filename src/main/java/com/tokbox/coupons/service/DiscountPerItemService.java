package com.tokbox.coupons.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tokbox.coupons.exception.CouponApiException;
import com.tokbox.coupons.model.Coupons;
import com.tokbox.coupons.model.DiscountedOrder;
import com.tokbox.coupons.model.OrderDetails;
import com.tokbox.coupons.model.Product;
import com.tokbox.coupons.model.User;
import com.tokbox.coupons.repository.CouponsRepo;
import com.tokbox.coupons.repository.ProductRepo;
import com.tokbox.coupons.repository.UserRepository;

@Service(value="discountServicePerItem")
public class DiscountPerItemService implements DiscountService{

	@Autowired
	CouponsRepo couponRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	UserRepository userRepo;
	
	private Coupons coupon;
	
	private User user;
	
	public DiscountPerItemService(){
	} 
	@Override
	public  DiscountedOrder appplyDiscount(OrderDetails order) throws CouponApiException{
		System.out.println("Order details : "+order.toString());
		coupon=couponRepo.findOne(order.getCouponCode());
		if(coupon==null){
			throw new CouponApiException("coupon code does not exist");
		}
		user=userRepo.findOne(order.getUserId());
		if(user==null)
		{
			throw new CouponApiException("user does not exist");
		}
		
		if(!isCouponValidForUser(user,coupon.getCouponId())){
			throw new CouponApiException("coupon code is not valid for user: "+user.getUserId());
		}
		return applyToSubseItem(order);
		
	}
	
	private DiscountedOrder applyToSubseItem(OrderDetails order){
		Map<Integer,Double> discountedItemMap=new LinkedHashMap<Integer,Double>();
		Double total=00.00;
		Double discountedPrice=00.00;
		Double offsetValue=coupon.getOffsetValue();
		Double userCurrentBalance=user.getCurrentBalance();
		Integer itemDone=1;
		Double lastItemPrice=0.0;
		for (Integer productId : order.getProductList()) {
			Product product=productRepo.findOne(productId);
			
			if((total+getDiscountedPrice(lastItemPrice, coupon, offsetValue))>userCurrentBalance){
				break;
			}
			
			if(itemDone<=coupon.getExcludeFirst()){
				discountedPrice=product.getPrice();
				lastItemPrice=discountedPrice;
				total+=discountedPrice;
				discountedItemMap.put(productId,discountedPrice);
			}
			
			if(product!=null&&itemDone>coupon.getExcludeFirst()){
				lastItemPrice=getDiscountedPrice(lastItemPrice, coupon, offsetValue);
				total+=lastItemPrice;
				discountedItemMap.put(productId,lastItemPrice);
			}
			itemDone++;
		}
		DiscountedOrder discountedOrder=new DiscountedOrder();
		discountedOrder.setCouponCode(coupon.getCouponId());
		discountedOrder.setDiscountedTotal(total);
		discountedOrder.setDiscountedItem(discountedItemMap);
		discountedOrder.setBalanceRemain(userCurrentBalance-total);
		discountedOrder.setNoProductCanBuy(discountedItemMap.size());
		discountedOrder.setOrderId(order.getOrderId());
		return discountedOrder;
	}
	
	public boolean isApplicabelUser(){
		return true;
	}
	
	private boolean isCouponValidForUser(User user,String couponCode){
		return user.getCouponList().stream().filter(o -> o.getCouponId().equals(couponCode)).findFirst().isPresent();
	}
	
	private Double getDiscountedPrice(Double lastItemPrice,Coupons coupon,Double offsetValue){
		Double discountedPrice=lastItemPrice-coupon.getDiscount();
		return discountedPrice>offsetValue?discountedPrice:offsetValue;
	}
	
}
