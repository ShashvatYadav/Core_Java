package com.Oops.Constructor;

public class Customer {
	int custId;
	String cName;
	Customer(){
		System.out.println("Constructor Called");
	}
	private Customer(int custId, String cName) {
		this(custId);
		this.cName = cName;
	}
	public Customer(int c) {
		this();
		custId = c;
	}
	protected Customer(String cName) {
		this();
		this.cName = cName;
	}
	Customer(String s, int id){
		this(id);
		custId = id;
		System.out.println("Constructor Overloaded");;
	}
	public static void main(String[] args) {
//		Customer c1 = new Customer();
//		System.out.println(c1.custId);
//		System.out.println(c1.cName);
		
		Customer c2 = new Customer(30, "Ramu");
		System.out.println(c2.custId);
		System.out.println(c2.cName);
		
//		Customer c3 = new Customer(30);
//		System.out.println(c3.custId);
//		System.out.println(c3.cName);
//		
//		Customer c4 = new Customer("Suresh");
//		System.out.println(c4.cName);
//		
//		Customer c5 = new Customer("Ramesh", 54);
//		System.out.println(c5.cName);
//		System.out.println(c5.custId);
//		
	}
	
}
