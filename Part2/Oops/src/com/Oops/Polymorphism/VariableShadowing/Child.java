package com.Oops.Polymorphism.VariableShadowing;

public class Child extends A{
	int x=20;
	public static void main(String[] args) {
		A a = new Child();
		System.out.println(a.x);
	}
}
