package com.tokbox.coupons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
	  
	  	@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer productId;
		@Column(name="name")
		private String name;
		@Column(name="product_desc")
		private String desc;

		@Column(name="category_name")
		private String category;

		@Column(name="price")
		private Double price;
		@Column(name="currency_code")
		private String currencyCode;
		
		public Product(){
			
		}

		public Product(Integer productId, String name, String desc, String category, Double price, String currencyCode) {
			super();
			this.productId = productId;
			this.name = name;
			this.desc = desc;
			this.category = category;
			this.price = price;
			this.currencyCode = currencyCode;
		}

		public Integer getProductId() {
			return productId;
		}
		public void setProductId(Integer productId) {
			this.productId = productId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public String getCurrencyCode() {
			return currencyCode;
		}
		public void setCurrencyCode(String currencyCode) {
			this.currencyCode = currencyCode;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((category == null) ? 0 : category.hashCode());
			result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((price == null) ? 0 : price.hashCode());
			result = prime * result + ((productId == null) ? 0 : productId.hashCode());
			return result;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", name=" + name + ", desc=" + desc + ", category=" + category
					+ ", price=" + price + ", currencyCode=" + currencyCode + "]";
		}
}
