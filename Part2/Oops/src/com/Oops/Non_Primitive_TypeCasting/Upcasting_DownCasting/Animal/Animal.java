package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.Animal;

class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
	void foods() {
		System.out.println("Eating");
	}
	public static void main(String[] args) {
		Animal a = new Animal(); // general container
		Cat c = new Cat();
		Dog d = new Dog();
		a = c; // cat child
		a = d; // dog child
		c.foods();
		//a.jump(); // compile time error
		// 
		 
		
		Animal ct = new Cat();
		
		
		Cat c2 = (Cat)ct; // downcasting
		System.out.println(ct);
		System.out.println(c2);
		c2.jump();
		
		d = (Dog) a; // downcasting
		d.breed();
		System.out.println(a instanceof Dog);
		
	}
}
