package com.Oops.Abstraction;

abstract class Vehicale {
	String name;
	static void  m1() {
		System.out.println("Hello");
	}
	Vehicale(String name){
		this.name = name;
	}
	abstract void start();
	abstract void manual();
	
}
