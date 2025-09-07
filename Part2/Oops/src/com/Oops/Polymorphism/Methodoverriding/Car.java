package com.Oops.Polymorphism.Methodoverriding;

class Car extends Vehicale{

	Car(String name, String brand) {
		super(name, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void engine() {
		// TODO Auto-generated method stub
		System.out.println("Car engine Started");
	}
	
	// Method Hidding
	static void manual() {
		System.out.println("Car manual");
	}
	public static void main(String[] args) {
		Vehicale v = new Car("Scorpio", "Mahindra");
		v.manual();
		v.engine();
	}
	
}