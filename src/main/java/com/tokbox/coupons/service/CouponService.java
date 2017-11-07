package com.tokbox.coupons.service;

import java.util.List;

import com.tokbox.coupons.exception.CouponApiException;
import com.tokbox.coupons.model.Coupons;
import com.tokbox.coupons.model.DiscountedOrder;
import com.tokbox.coupons.model.OrderDetails;

public interface CouponService {
	public DiscountedOrder applyCoupon(OrderDetails orderDetails) throws CouponApiException;
	public Coupons getCouponDetails(String id);
	public List<Coupons> getCouponDetails();
	public void modifyCoupon(Coupons coupon) throws IllegalArgumentException;
	public void addCoupon(Coupons coupon) throws IllegalArgumentException;
}
