class IfAssignment{
	public static void main(String[] args){
		// 1
		int age = 12;
		if(age>=18){
			
			System.out.println("Eligible");
		}
		if(age<18){
			System.out.println("Not Eligible");
		}

		//2
		int num = 20;
		if(num>0){
			System.out.println("Number is Positive");
		}
		
		//3
		if(num<0){
			System.out.println("Number is negative");
		}


		// 4
		if(num % 2 == 0){
			System.out.println("Even");
		}
		
		// 5
		if(num % 2 != 0){
			System.out.println("Odd");
		}

		// 6
		if(num % 5 == 0){
			System.out.println("Divisable by 5");
		}
		
		// 7
		if(num > 5 && num < 200){
			System.out.println("In between 5 & 200");
		}

		// 8
		String pass = "123";
		if(pass == "123"){
			System.out.println("Correct");
		}
		if(pass != "123") System.out.println("Incorrect");
		
		// 9
		int room_no = 3;
		if(room_no == 4) System.out.println("Room No. Is Correct");
		if(room_no != 4) System.out.println("Incorrect Room No.");
		
		// 10
		char ch = 'a';
		if(ch >= 65 && ch <= 90) System.out.println("Uppercase");
	
		// 11
		if((ch >=97 && ch <= 122) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) System.out.println(ch + " is Lowercase vowel");

		
	}


}