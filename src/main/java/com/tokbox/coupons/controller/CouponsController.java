package com.tokbox.coupons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tokbox.coupons.exception.CouponApiException;
import com.tokbox.coupons.model.Coupons;
import com.tokbox.coupons.model.DiscountedOrder;
import com.tokbox.coupons.model.OrderDetails;
import com.tokbox.coupons.service.CouponService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/coupons-management-service/coupon")
@Api(tags="coupons-management-service")
public class CouponsController {

	@Autowired
	private CouponService couponService;
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="coupon code",notes = "coupon code")
	public List<Coupons> getCouponCode(){
		return couponService.getCouponDetails();
	}
	
	@RequestMapping(value="/apply",method=RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value="apply coupon",notes = "apply coupon")
	public DiscountedOrder applyCouponCode(@RequestBody OrderDetails orderDetails) throws CouponApiException{
		return couponService.applyCoupon(orderDetails);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="get coupon code",notes = "get coupon code")
	public Coupons getCouponCode(@PathVariable String id){
		return couponService.getCouponDetails(id);
	}
	

	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ApiOperation(value=" update coupon code",notes = " update coupon code")
	public void modifyCoupon(Coupons coupon){
		 couponService.modifyCoupon(coupon);
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ApiOperation(value="create coupon code",notes = "create coupon code")
	public void createCoupon(Coupons coupon){
		 couponService.modifyCoupon(coupon);
	}
}
