package com.Oops.Constructor;

public class Vehicale {
	int number;
	String name;
	String model;
	Vehicale(){
		System.out.println("No-args Constructor");
	}
	Vehicale(int number){
		this.number = number;
		System.out.println("Overloaded Constructor");
	}
	Vehicale(String n){
		name = n;
		System.out.println("Second Overloaded Custructor");
	}
	Vehicale(String name, String model){
		this.name = name;
		this.model = model;
		System.out.println("Third overloaded Constructor");
	}
	Vehicale(int n, String name, String model){
		number =n;
		this.name = name;
		this.model = model;
		System.out.println("Forth Overloaded Constructor");
	}
	public static void main(String[] args) {
		Vehicale v = new Vehicale();
		
		Vehicale v1 = new Vehicale(1234);
		System.out.println(v1.number);;;;
		
		Vehicale v2 = new Vehicale("Toyota");
		System.out.println(v2.name);
		
		Vehicale v3 = new Vehicale("Mahindra", "Scorpio");
		System.out.println(v3.name);
		System.out.println(v3.model);
		
		Vehicale v4 = new Vehicale(9876, "Maruti-Suzuki", "Alto");
		System.out.println(v4.number);
		System.out.println(v4.name);
		System.out.println(v4.model);
	}
}
