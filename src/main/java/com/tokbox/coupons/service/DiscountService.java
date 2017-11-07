package com.tokbox.coupons.service;

import com.tokbox.coupons.exception.CouponApiException;
import com.tokbox.coupons.model.DiscountedOrder;
import com.tokbox.coupons.model.OrderDetails;

public interface DiscountService {

	public DiscountedOrder appplyDiscount(OrderDetails orderDetails) throws CouponApiException;
}
