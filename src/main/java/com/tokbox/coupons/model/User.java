package com.tokbox.coupons.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user_table")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name="name")
	private String userName;
	
	@Column(name="current_balance")
	private Double currentBalance;
	  
	@Column(name="currency_code")
	private String currencyCode;
	
	@OneToMany(cascade = {CascadeType.PERSIST,
			CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinTable(name="coupon_user",joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="coupon_id"))
	private List<Coupons> couponList;

	
	public User(){
		
	}
	
	public List<Coupons> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<Coupons> couponList) {
		this.couponList = couponList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
