class FiniteLoop06
{

	public static void main(String[] args)

	{

		char ch = 'A';
		int s = 0;
		while(s<4){
			System.out.println(ch);
			ch += 2;
			s++;
		}
		ch = 'A';
		s = 0;
		for( ;s<4;s++){
			System.out.println(ch);	

			ch += 2;
		}
		ch = 'A';
		s = 0;
		do{
			System.out.println(ch);
			ch += 2;
			s++;
		}while(s<4);
	}
}