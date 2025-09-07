package com.Oops.IsARelationShip.Single;

public class Dog extends Animal{
	Dog(){
		name = "Dog";
		System.out.println("Dog object Created");
	}
	void legs() {
		System.out.println("Have 4 legs");
	}
	void sound() {
		System.out.println("Barking");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.name);
		d.eating();
		d.sleep();
		
		Animal a = new Dog();
		System.out.println(a.name);;
		a.eating();
		a.sleep();
		
		Animal a1 = new Animal();
		
		System.out.println(a1 instanceof Dog );
		
		
	}
}
