package com.Oops.Abstraction.Interface.FunctionalInterface;

@FunctionalInterface
interface Greeting {
	void syaHello(String name);
}
@FunctionalInterface
interface Calculator{
	int calculate(int a, int b);
}
public class Main {
	public static void main(String[] args) {
		Greeting g = (name) -> System.out.println("Hello " + name);
		g.syaHello("Krishna");
		Calculator add = (a, b) -> a+b;
		Calculator mul = (a, b) -> a*b;
		System.out.println(add.calculate(5, 90));
		System.out.println(mul.calculate(4, 3));
	}
}