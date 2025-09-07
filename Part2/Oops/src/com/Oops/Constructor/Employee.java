package com.Oops.Constructor;

public class Employee {
	int empId;
	String eName;
	Employee(){
		System.out.println("Constructer Called");;
	}
	Employee(int empId){
		this();
		this.empId = empId;
	}
	Employee(int empId, String ename) {
		this(empId);
		this.eName = ename;
	} 
	// can not make constructor final, static and abstract
	Employee(String eName){
		this();
		this.eName = eName;
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(501);
		System.out.println(e1.empId);
//		System.out.println(e1.eName);
		
		Employee e2 = new Employee(121, "Deepak");
		System.out.println(e2.empId);
		System.out.println(e2.eName);
		
		Employee e3 = new Employee(10, "Jatin");
		System.out.println(e3.empId);
		System.out.println(e3.eName);
	}
}
