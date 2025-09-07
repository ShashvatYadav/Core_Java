package com.Oops.Constructor;

public class Product {
	int unit;
	String pName;
	Product(){
		System.out.println("Constructor Called");
	}
	Product(int unit){
		this();
		this.unit = unit;
	}
	Product(int unit, String  pName){
		this(unit);
		this.pName = pName;
	}
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.unit);
		System.out.println(p1.pName);
		
		Product p2 = new Product(10);
		System.out.println(p2.unit);
		
		Product p3 = new Product(10, "Rice");
		System.out.println(p3.unit);
		System.out.println(p3.pName);
		
		
	}
}
