package com.Oops.Initializer;

public class UseValue {
	public static void main(String[] args) {
		System.out.println(GiveValue.x);
		GiveValue gv = new GiveValue();
		System.out.println(GiveValue.x);
		System.out.println(gv.str);
	}
}
