package com.Oops.Initializer;

public class GiveValue {
	static int x = 20;
	String str = "Krishna";
	static {
		x = 50;
		System.out.println("Static intializer gets call");
	}
	{
		x = 90;
		str = "Ram";
		System.out.println("Non Static intializer Object created : ");
	}
}
