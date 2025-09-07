package com.Oops.IsARelationShip.MultiLevel;

public class Car implements Vehicale {
	int CarN;
	public void start() {
		System.out.println("Car is Starting");
	}
	public static void main(String[] args) {
		Vehicale v = new Car();
		System.out.println(v.n);
		Car c = new Car();
	}
}
