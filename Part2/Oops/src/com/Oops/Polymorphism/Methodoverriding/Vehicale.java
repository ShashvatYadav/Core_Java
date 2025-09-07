package com.Oops.Polymorphism.Methodoverriding;

abstract class Vehicale {
	String name;
	String brand;
	Vehicale(String name, String brand){
		this.name = name;
		this.brand = brand;
	}
	
	void engine() {
		System.out.println("Vehicale engine started");
	}
	static void manual() {
		System.out.println("Instructions");
	}
}

