package com.ojas.mvc.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private double productPrice;
	private double productQuantity;
	
	

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(double productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Product(int productId, String productName, double productPrice, double productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	public Product() {
		
	}
}
