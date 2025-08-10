package com.Demo.Dog;
import com.Demo.Animal.*;
class Dog {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "Dog";
		System.out.println(a1.name);
		System.out.println(Animal.leg);
		a1.sound();
		Animal.canWalk();
	}
}
