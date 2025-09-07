package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Products;

public class Laptop extends Product {
	String category;
	int warrenty;
	void setWarrenty(int warrenty) {
		if(warrenty>0) {
			this.warrenty = warrenty;
		} else {
			System.out.println("Warrenty is not valid");
		}
	}
	void setCategory(String category) {
		this.category = category;
	}
	void showDetails() {
		System.out.println(category);
		System.out.println(warrenty);
		System.out.println(name);
		System.out.println(unit);
		System.out.println(price);
	}
}
