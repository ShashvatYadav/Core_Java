package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Vegetables;

public class Potato extends Vegetables {
	int weight;
	void setWeight(int weight) {
		this.weight = weight;
		System.out.println("Weight Sets");
	}
	void nutrients() {
		System.out.println("Have Carbs");
	}
}
