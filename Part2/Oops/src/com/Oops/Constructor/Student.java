package com.Oops.Constructor;

public class Student<syncronized> {
	int id;
	String name="Name";
	Student(){
		System.out.println("Constructor Called");
	}
	Student(int id){
		this();
		this.id = id;
	}
	Student(int id, String name){
		this(id);
		this.name = name;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		Student s2 = new Student(10);
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		Student s3 = new Student(11, "Shashvat");
		System.out.println(s3.id);
		System.out.println(s3.name);
	}
}
