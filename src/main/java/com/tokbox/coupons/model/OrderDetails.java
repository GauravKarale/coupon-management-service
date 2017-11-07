package com.tokbox.coupons.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OrderDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9009968312200185845L;
	private String couponCode;
	private Integer orderId;
	private List<Integer> productList;
	private Integer userId;
	
	
	public OrderDetails(){
	}
	
	@Override
	public String toString() {
		return "OrderDetails [couponCode=" + couponCode + ", orderId=" + orderId + ", productList=" + productList
				+ ", userId=" + userId + "]";
	}

	public OrderDetails(String couponCode, Integer orderId, List<Integer> productList, Integer userId,
			List<String> discountType, Double discountPerItem, Double discountedTotal,
			Map<Integer, Double> discountedItem) {
		super();
		this.couponCode = couponCode;
		this.orderId = orderId;
		this.productList = productList;
		this.userId = userId;
		
	}
	
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public List<Integer> getProductList() {
		return productList;
	}
	public void setProductList(List<Integer> productList) {
		this.productList = productList;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
