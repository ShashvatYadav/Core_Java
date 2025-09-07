package com.Oops.Abstraction.Interface.MarkerInterface;

public class Employee implements Cloneable{
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee(231, "Scott");
		Employee emp2 = (Employee) emp.clone();
		System.out.println(emp.name + " " + emp2.id);
	}
}
