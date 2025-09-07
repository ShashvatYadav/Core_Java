package com.Oops.Polymorphism.MethodOverloading;

import java.util.Scanner;

public class Login {
	String name;
	String user_name;
	String email;
	long phone;
	String password;
	
	// Constructor Overloading
	Login(String email, String password){
		this.email = email;
		this.password = password;
		System.out.println("Login Successful");
	}
	Login(long phone, String password){
		this.phone = phone;
		this.password = password;
		System.out.println("Login Successful");
	}
	Login(String email){
		this.email = email;
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		String otp = "";
		for(int i=0; i<4; i++) {
			otp += num[(int) (Math.random()*4)];
		}
		
		System.out.println("OTP Sended");
		System.out.println(otp);
		System.out.println("Enter OTP : ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		userInput = String.valueOf(userInput);
		if(otp.equals(userInput)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Wrong OTP");
		}
		 
	}
	Login(long phone){
		this.phone = phone;
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		String otp = "";
		for(int i=0; i<4; i++) {
			otp += num[(int) (Math.random()*4)];
		}
		
		System.out.println("OTP Sended");
		System.out.println(otp);
		System.out.println("Enter OTP : ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		userInput = String.valueOf(userInput);
		if(otp.equals(userInput)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Wrong OTP");
		}
		
	}
	void setUserName(String user_name) {
		this.user_name = user_name;
	}
	void setPassword(String password) {
		this.password = password;
	}
	void setName(String name) {
		this.name = name;
	}
	void setEmail(String email) {
		this.email = email;
	}
	
	//Method OverLoading
	void showDetails(String passWord) {
		if(this.password.equals(passWord)) {
			System.out.println(this.user_name);
			System.out.println(this.email);
			System.out.println(this.phone);
		} else {
			System.out.println("Wrong Password");
		}
	}
	void shwoDetails(long phone) {
		if(this.phone==phone) {
			int[] num = {0,1,2,3,4,5,6,7,8,9};
			String otp = "";
			for(int i=0; i<4; i++) {
				otp += num[(int) (Math.random()*4)];
			}
			
			System.out.println("OTP Sended");
			System.out.println(otp);
			System.out.println("Enter OTP : ");
			Scanner sc = new Scanner(System.in);
			String userInput = sc.next();
			userInput = String.valueOf(userInput);
			if(otp.equals(userInput)) {
				System.out.println(this.user_name);
				System.out.println(this.email);
				System.out.println(this.phone);
			} else {
				System.out.println("Wrong OTP");
			}
		} else {
			System.out.println("Phone number did not Match");
		}
	}
	
	public static void main(String[] args) {
		//Login ac = new Login("Shadlfdsfhsdfs");
		Login kapil = new Login(6264109489l);
		kapil.setName("Kapil");
		kapil.setEmail("kapil");
		kapil.setUserName("kpil321");
		kapil.setPassword("12345678");
		kapil.shwoDetails(6264109489l);
	}
}
