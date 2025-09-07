package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Vegetables;

public class Vegetables {
	String name;
	String shape;
	void setName(String name) {
		this.name = name;
	}
	void setShape(String shape) {
		this.shape = shape;
	}
	void fresh() {
		System.out.println("Fresh");
	}
	void nutrients() {
		System.out.println("Have some Nutrients");
	}
	public static void main(String[] args) {
		
		Vegetables v = new Brinjal(); // upcasting
		v.setName("Brinjal");
		v.setShape("Cyclendrical");
		System.out.println(v.name);
		System.out.println(v.shape);
		
		//v.setWeight(40); /CTE
		
		v.nutrients(); //accessing child property
		
		v = new Potato(); // upcasting
		v.fresh();
		v.nutrients(); // potato nutrients
		
		// downcasting
		if(v instanceof Brinjal) {
			Brinjal b = (Brinjal) v;
		} else {
			System.out.println("Object is not an instance of Brinjal");
		}
		if(v instanceof Potato) {
			Potato p = (Potato) v;
			p.setWeight(4);
			System.out.println(p.weight);
			p.nutrients();
		} else {
			System.out.println("ClassCastException");
		}
		
	}
}
