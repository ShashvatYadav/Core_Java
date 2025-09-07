package com.Oops.Practice;

public class B extends C implements A {
	public static void main(String[] args) {
		A a = new B();
		// a.m1();
		B b = new B();
		System.out.println(b.y);
		System.out.println(b.x);
		System.out.println(B.x);
		System.out.println(B.y);
		C c = new B();
		c.m2();
		b.m2();
	}
}
