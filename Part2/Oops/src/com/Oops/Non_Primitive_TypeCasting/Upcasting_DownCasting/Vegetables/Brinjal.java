package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Vegetables;

public class Brinjal extends Vegetables {
	int weight;
	void setWeight(int weight) {
		this.weight = weight;
		System.out.println("Weight set");
	}
	void nutrients() {
		System.out.println("Iron");
	}
}
