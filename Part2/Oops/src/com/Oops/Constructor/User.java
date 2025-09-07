package com.Oops.Constructor;

public class User {
	String user;
	int uId;
	private User(){
		System.out.println("Private constructor called");
	}
	protected User(int uId) {
		this();
		this.uId=uId;
	}
	public User(int uId, String user) {
		this(uId);
		this.user = user;
	}
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.uId);
		System.out.println(u1.user);
		
		User u2 = new User(40);
		System.out.println(u2.user);
		System.out.println(u2.uId);
		
		User u3 = new User(40, "Ram");
		System.out.println(u3.uId);
		System.out.println(u3.user);
	}
}
