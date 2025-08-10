class Assignment03{

	public static void main(String[] args){

		// 1
		int num = 1432;
		while(num>0){
			System.out.println(num%10);
			num /= 10;
		}

		// 2
		num = 1432;
		while(num>0){
			int a = num % 10;
			if(a % 2 == 0) System.out.println("even " + a);
			num /= 10;
		}
			
		// 3
		num = 1432;
		while(num>0){
			int a = num % 10;
			if(a % 2 != 0) System.out.println("odd " + a);
			num /= 10;
		}

		// 4
		num = 1432;
		while(num>0){
			int a = num % 10;
			if(a % 2 == 0) System.out.println(a + " even");
			else System.out.println(a + " odd");
			num /= 10;
		}
		
		// 5
		num = 1432;
		int sum = 0;
		while(num > 0){
			int a = num % 10;
			sum += a;
			num /= 10;
		}
		System.out.println(sum);
		

		// 6
		num = 1432;
		int mul = 1;
		while(num > 0){
			int a = num % 10;
			mul *= a;
			num /= 10;
		}
		System.out.println(		


		// 7
		for(int j=10; j<100; j++){
			int temp = j;
			int first_digit = temp%10;
			temp /= 10;
			int second_digit = temp%10;
			sum = first_digit + second_digit;
			mul = first_digit * second_digit;
			if(sum+mul == j) System.out.println(j + " is Special two digit number");
		}
	
	}



}