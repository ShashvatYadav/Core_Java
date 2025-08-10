class FiniteLoop05
{

	public static void main(String[] args){

		int s = 0;
		char ch = 'A';
		for( ; s<4; s++)
		{
			System.out.println(ch);

			ch += 1;	
		}

		ch = 'A';
		s = 0;
		while(s<4){

			System.out.println(ch);
			s++;
			ch += 1;

		}
		ch = 'A';
		s = 0;
		do{

			System.out.println(ch);
			s++;
			ch += 1;
		}while(s<4);
			
		ch = 'a';
		int a = ch + 9;
		System.out.println(a);


	}
}