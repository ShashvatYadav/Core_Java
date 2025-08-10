class FiniteLoop02
{
	public static void main(String[] args)
	{

		int a = 0;
		while(a<30){
			a+=5;
			System.out.println(a);

		}
		a = 0;
		do{
			a += 5;
			System.out.println(a);

		}while(a<30);
		a = 0;
		for( ;a<30; ){
			a+=5;
			System.out.println(a);
		}

	}





}