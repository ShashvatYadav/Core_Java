class FiniteLoop04
{

	public static void main(String[] args)	

	{

		int num = 100;
		while(num>95){

			System.out.println(num);
			num--;
		}
		num = 100;
		do{
			System.out.println(num);
			num--;
		}while(num>=96);

		num = 100;
		for( ;num>=96; num--){
			System.out.println(num);
		}
	}
}