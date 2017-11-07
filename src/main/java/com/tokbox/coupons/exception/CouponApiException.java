package com.tokbox.coupons.exception;

public class CouponApiException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6968744875502952292L;
	public CouponApiException(){
		super();
	}
	
	public CouponApiException(String msg){
		super(msg);
	}
}
