package com.tokbox.coupons.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="coupons")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Coupons implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String couponId;
	
	@Column(name="coupon_desc")
	private String couponDesc;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="coupon_type")
	private String coupon_type;
	
	@Column(name="max_redemptions")
	private Integer max_redemptions;
	
	@Column(name="redeem_by")
	private Date redeemBy;
	
	@Column(name="used_count")
	private Integer usedCount;
	
	@Column(name="valid")
	private Boolean isValid;
	
	@OneToMany(cascade = {CascadeType.PERSIST,
			CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinTable(name="coupon_product",joinColumns=@JoinColumn(name="coupon_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))
	private List<Product> productList;
	
	@Column(name="apply_type")
	private String applyType;
	
	@Column(name="exclude_first")
	private Integer excludeFirst;
	
	@Column(name="max_discount_per_item")
	private Double maxDiscountPerItem;
	
	@Column(name="max_discount_on_total")
	private Double maxDiscountOnTotal;
	
	@Column(name="discount")
	private Double discount;
	
	
	@Column(name="offset_value")
	private Double offsetValue;
	
	public Double getOffsetValue() {
		return offsetValue;
	}

	public void setOffsetValue(Double offsetValue) {
		this.offsetValue = offsetValue;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public String getApplyType() {
		return applyType;
	}


	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}


	public Integer getExcludeFirst() {
		return excludeFirst;
	}


	public void setExcludeFirst(Integer excludeFirst) {
		this.excludeFirst = excludeFirst;
	}


	public Double getMaxDiscountPerItem() {
		return maxDiscountPerItem;
	}


	public void setMaxDiscountPerItem(Double maxDiscountPerItem) {
		this.maxDiscountPerItem = maxDiscountPerItem;
	}


	public Double getMaxDiscountOnTotal() {
		return maxDiscountOnTotal;
	}


	public void setMaxDiscountOnTotal(Double maxDiscountOnTotal) {
		this.maxDiscountOnTotal = maxDiscountOnTotal;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Coupons(){
		
	}
	
	
	

	public Coupons(String couponId, String couponDesc, String currency, String coupon_type, Integer max_redemptions,
			Date redeemBy, Integer usedCount, Boolean isValid, List<Product> productList, String applyType,
			Integer excludeFirst, Double maxDiscountPerItem, Double maxDiscountOnTotal, Double discount,
			Double offsetValue) {
		super();
		this.couponId = couponId;
		this.couponDesc = couponDesc;
		this.currency = currency;
		this.coupon_type = coupon_type;
		this.max_redemptions = max_redemptions;
		this.redeemBy = redeemBy;
		this.usedCount = usedCount;
		this.isValid = isValid;
		this.productList = productList;
		this.applyType = applyType;
		this.excludeFirst = excludeFirst;
		this.maxDiscountPerItem = maxDiscountPerItem;
		this.maxDiscountOnTotal = maxDiscountOnTotal;
		this.discount = discount;
		this.offsetValue = offsetValue;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getCouponDesc() {
		return couponDesc;
	}

	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCoupon_type() {
		return coupon_type;
	}

	public void setCoupon_type(String coupon_type) {
		this.coupon_type = coupon_type;
	}

	public Integer getMax_redemptions() {
		return max_redemptions;
	}

	public void setMax_redemptions(Integer max_redemptions) {
		this.max_redemptions = max_redemptions;
	}

	public Date getRedeemBy() {
		return redeemBy;
	}

	public void setRedeemBy(Date redeemBy) {
		this.redeemBy = redeemBy;
	}

	public Integer getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
}
