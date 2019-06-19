package com.test.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product>{
	int productId;
	long price;
	String productName;
	public Product(int productId, long price, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", productName=" + productName + "]";
	}
	@Override
	public int compareTo(Product product) {
		return (int) (this.price-product.price);
	}
	
}
public class ComparableExample {

	public static void main(String[] args) {
		List<Product> products=new ArrayList<>();
		products.add(new Product(2, 20000, "TV"));
		products.add(new Product(3, 10000, "Woofer"));
		products.add(new Product(1, 32111, "Laptop"));
		
		Collections.sort(products);
		
		for (Product product : products) {
			System.out.println(product);
		}

	}

}
