package com.ProductService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.servlet.view.RedirectView;

@Document(collection = "product")
public class Product {
	@Id
	private int productid;
	private int productprice;
	private String productName;
	private String description;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product(int productid, int productprice, String productName, String description) {
		this.productid = productid;
		this.productprice = productprice;
		this.productName = productName;
		this.description = description;
	}
	public Product() {
	}
	
	
}