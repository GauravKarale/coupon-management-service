package com.tokbox.coupons.model;

import java.io.Serializable;
import java.util.Map;

public class DiscountedOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5243208147989967601L;
	
	private String couponCode;
	private Integer orderId;
	private Double discountedTotal;
	private Map<Integer,Double>discountedItem;
	private Integer noProductCanBuy;
	private Double balanceRemain;
	
	public DiscountedOrder() {
		super();
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
	public Double getDiscountedTotal() {
		return discountedTotal;
	}
	public void setDiscountedTotal(Double discountedTotal) {
		this.discountedTotal = discountedTotal;
	}
	public Map<Integer, Double> getDiscountedItem() {
		return discountedItem;
	}
	public void setDiscountedItem(Map<Integer, Double> discountedItem) {
		this.discountedItem = discountedItem;
	}
	public Integer getNoProductCanBuy() {
		return noProductCanBuy;
	}
	public void setNoProductCanBuy(Integer noProductCanBuy) {
		this.noProductCanBuy = noProductCanBuy;
	}
	public Double getBalanceRemain() {
		return balanceRemain;
	}
	public void setBalanceRemain(Double balanceRemain) {
		this.balanceRemain = balanceRemain;
	}
}
