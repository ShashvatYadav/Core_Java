package com.Oops.IsARelationShip.MultiLevel;

interface Vehicale {
	int n = 12345;
	void start();
	static void manual() {
		System.out.println("Manual");
	}
	public static void main(String[] args) {
		Vehicale v = new ElectricCar();
		System.out.println(v.n);
		v.start();
		System.out.println();
		//v.manual();
	}
}


