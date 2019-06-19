package com.test.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products{
	int productId;
	long price;
	String productName;
	

	public Products(int productId, long price, String productName) {
		super();
		this.productId = productId;
		this.price = price;
		this.productName = productName;
	}


	@Override
	public String toString() {
		return "ComparatorExample [productId=" + productId + ", price=" + price + ", productName=" + productName + "]";
	}
	
}

class classProductPrice implements Comparator<Products>{

	@Override
	public int compare(Products o1, Products o2) {
		return (int) (o1.price-o2.price);
	}
	
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Products> products=new ArrayList<>();
		products.add(new Products(2, 20000, "TV"));
		products.add(new Products(3, 10000, "Woofer"));
		products.add(new Products(1, 32111, "Laptop"));
		
		Collections.sort(products, new classProductPrice());
		
		for (Products product : products) {
			System.out.println(product);
		}

	}

}
