 class Num
{
	public static void main(String[] args)
	{
		int a = 5;
		/*while(a>0){
			int digit = a%10;
			System.out.println(digit);
			a /= 10;
		} */
		/*int j=0;
		for(; j<10; ){
			System.out.println(j);
			j++;
		} */
		
		if(a%2==0) System.out.println("Even");
		else System.out.println("odd");

		int dayN = 7;
		if(dayN==1){
			System.out.println("Sunday");
		} else if(dayN==2) {
			System.out.println("Monday");	
		} else if(dayN==3){ System.out.println("Tuesday");
		}else if(dayN==4) {System.out.println("Thursday");
                }else if(dayN==5) {System.out.println("Friday");
                }else if(dayN==6){ System.out.println("Saturday");
                }else if(dayN==7){ System.out.println("sunday");
		else System.out.println("invalid DayNo");

	}}
}