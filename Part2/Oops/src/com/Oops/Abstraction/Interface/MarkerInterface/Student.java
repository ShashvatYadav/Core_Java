package com.Oops.Abstraction.Interface.MarkerInterface;

import java.io.*;
import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1l;
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) throws Exception{
		Student st = new Student(2, "Kusum");
		// Serialization
		FileOutputStream fos = new FileOutputStream("Student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.close();
		System.out.println("Object Serialized");
	}
}
