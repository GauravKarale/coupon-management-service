package com.tokbox.coupons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tokbox.coupons.exception.CouponApiException;
import com.tokbox.coupons.model.Coupons;
import com.tokbox.coupons.model.DiscountedOrder;
import com.tokbox.coupons.model.OrderDetails;
import com.tokbox.coupons.repository.CouponsRepo;

@Service(value="couponService")
public class CouponServiceImpl implements CouponService{
	
	@Autowired
	@Qualifier(value="discountServicePerItem")
	DiscountService discountService;
	
	@Autowired
	CouponsRepo couponRepo;
	
	DiscountedOrder discountDetails;
	
	@Override
	public DiscountedOrder applyCoupon(OrderDetails orderDetails) throws CouponApiException {
		return discountService.appplyDiscount(orderDetails);
	}

	@Override
	public Coupons getCouponDetails(String id) {
		return couponRepo.getOne(id);
	}

	@Override
	public List<Coupons> getCouponDetails() {
		return couponRepo.findAll();
	}

	@Override
	public void modifyCoupon(Coupons coupon) throws IllegalArgumentException {
		 couponRepo.save(coupon);
	}

	@Override
	public void addCoupon(Coupons coupon) throws IllegalArgumentException {
		couponRepo.save(coupon);
	}
}
