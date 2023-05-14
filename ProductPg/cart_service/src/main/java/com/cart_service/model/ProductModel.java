package com.cart_service.model;

import java.util.ArrayList;
import java.util.List;
import com.cart_service.entity.*;

public class ProductModel {

	private List<Product> products;

	public ProductModel() {
		this.products = new ArrayList<Product>();
		this.products.add(new Product("1", "705 T-shirt", "thumb1.gif","Latest trendy fitted Black T-shirt in soft printed cotton with a 705 logo on the side which can be styled with blue jeans and converse shoes",600));
		this.products.add(new Product("2", "Pavillion blue Tshirt", "thumb2.gif","Oversized T-shirt in soft cotton jersey with a white paviliion print in square and rib-trimmed neckline with low dropped shoulders", 840));
		this.products.add(new Product("3", "Water is Life T-shirt", "thumb3.gif","Black fitted tshirt in soft material with a multicolour logo WATER is LIFE in trendy colours.", 740));
		this.products.add(new Product("4", "Out-Cast T-shirt", "thumb3.gif","White fitted tshirt in soft material with a red OUTCAST logo which complement the t-shirt", 650));
		this.products.add(new Product("5", "Relaxed-fit T-shirt", "thumb3.gif","Relaxed-fit T-shirt in heavy cotton jersey with a round neckline and printed logo of a hand in white", 600));
		this.products.add(new Product("6", "White T-shirt", "thumb3.gif","Round-necked T-shirt in a soft cotton blend. The T-shirt incorporates COOLMAX functional fabric, a unique, soft, comfortable and fast-drying polyester fibre that efficiently wicks moisture while regulating temperature.", 500));
	}

	public List<Product> findAll() {
		return this.products;
	}

	public Product find(String id) {
		for (Product product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}
}
