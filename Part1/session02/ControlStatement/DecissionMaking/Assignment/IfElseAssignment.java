class IfElseAssignment
{
	public static void main(String[] args){
		
		// 1
		int num_1 = 79;
		int num_2 = 84;	
		if(num_1 > num_2) System.out.println(num_1 + " is greater");
		else System.out.println(num_2 + " is greater");
	
		// 2
		int num_3 = 80;
		if(num_1 > num_2 && num_1 > num_3) System.out.println(num_1 + " is Greatest");
		else {
			if(num_2 > num_1 && num_2 > num_3) System.out.println(num_2 + " is Greatest");
			else System.out.println(num_3 + " is greatest");
		}
		
		// 3
		char ch = 'a';
		if(ch >= 65 && ch <= 90) System.out.println("Uppercase");
		else System.out.println("Not a Uppercase");

		// 4
		ch = 'A';
		if(ch >= 97 && ch <= 122) System.out.println("Lowercase");
		else System.out.println("Not a lowercase");
		
		// 5
		ch = '0';
		if(ch >= 48 && ch <= 57) System.out.println("A digit");
		else System.out.println("Not a Digit");


		//6
		ch = 'A';
		if((ch >= 'A' && ch <= 122) && (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) System.out.println(ch + " is a Uppercase vowel");
		else System.out.println(ch + " is not a Uppercase vowel");

		// 7
		int num = 21;
		if((num / 2) * 2 == num) System.out.println(num + " is even");
		else System.out.println(num + " is odd"); 
		
		System.out.println(num / 2);

		// 8
		num = 28;
		if(num % 7 == 0) System.out.println(num + " is divisible by 7");
		else System.out.println(num + " is not divisible by 7");
	
		// 9
		int option = 5;
		if(option == 1) System.out.println("Pizza");
		if(option == 2) System.out.println("Burger");
		if(option == 3) System.out.println("Momos");
		if(option == 4) System.out.println("Roll");
		if(option == 5) System.out.println("Drinks");
	}




}