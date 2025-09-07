package com.Oops.Abstraction;

public class Car extends Vehicale {
	String company_name;
	Car(String name, String company_name){
		super(name);
		this.company_name = company_name;
	}
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}

	@Override
	void manual() {
		// TODO Auto-generated method stub
		System.out.println("Car diriving manual");
	}
	public static void main(String[] args) {
		Vehicale v = new Car("Scorpio", "Mahindra");
		v.start();
		v.manual();
		System.out.println(v.name);
		Car c = new Car("Safari", "TATA");;
		c.m1();
	}
}
