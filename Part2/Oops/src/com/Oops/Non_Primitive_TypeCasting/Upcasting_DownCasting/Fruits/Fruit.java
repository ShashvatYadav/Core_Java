package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Fruits;

interface Fruit {
	 void vitamins();
	 void freshness();
	 void test();
	 public static void main(String[] args) {
		Fruit f = new Apple(); // upcasting
		f.vitamins();
		Apple a = new Apple();
		a = (Apple) f; // downcasting
		a.color();
		
		Fruit f2 = new Orange();
		if(f2 instanceof Apple) {
			Apple a2 = (Apple) f2;
		}
		else {
			System.out.println("ClassCastException");
		}
		
	}
}
