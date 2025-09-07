package com.Oops.Non_Primitive_TypeCasting.Upcasting_DownCasting.User;

public class User extends Person {
	String user_name;
	String pass;
	void active() {
		System.out.println("No");
	}
	public static void main(String[] args) {
		Person p1 = new User();
		// System.out.println(p1.active()); /CTE
		System.out.println(p1.name);
		System.out.println(p1.height);
		p1.account();
		
		p1 = new Employee();
		System.out.println(p1.name);
		System.out.println(p1.weight);
		p1.employed();
		
		
		p1 = new Student();
		System.out.println(p1.name);
		System.out.println(p1.height);
		// System.out.println(p1.roll); / CTE
		
		((Student)p1).marks();
		// downcasting
		Student s1 = (Student) p1;
		System.out.println(s1.height);
		System.out.println(s1.roll);
		s1.marks();
		
		// ClassCastException
		if(p1 instanceof Employee) {
			Employee e1 = (Employee) p1;
		} else {
			System.out.println("Actual Object is not instance of Employee");
		}
		
	}
}
