package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Products;

public class Product {
	String name;
	int unit;
	double price;
	void setName(String name) {
		this.name = name;
	}
	void setUnit(int unit) {
		this.unit = unit;
	}
	void setPrice(int price) {
		if(price>0) this.price = price;
		else System.out.println("Invalid price");
	}
	public static void main(String[] args) {
		Product p = new Laptop(); // downCasting
		p.setName("Laptop");
		p.setUnit(20);
		p.setPrice(50000);
		
		// p.setWarrenty(3); / CTE
		// p.warrenty(); /CTE
		
		// downCasting
		Laptop mac = (Laptop) p;
		mac.setWarrenty(3);
		mac.setCategory("Electronics");
		mac.showDetails();
	}
}
