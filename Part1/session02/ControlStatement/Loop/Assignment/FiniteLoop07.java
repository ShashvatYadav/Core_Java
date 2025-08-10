class FiniteLoop07
{

	public static void main(String[] args)
	{

		int t = 0;
		char ch = 'Z';
		while(t<6){
			System.out.println(ch);
			ch--;
			t++;
		}
		ch = 'Z';
		t = 0;
		do{
			System.out.println(ch);
			ch--;
			t++;
		}while(t<6);
		ch = 'Z';
		t = 0;
		for( ;t<6;t++){
			System.out.println(ch);
			ch--;
		}
	}
}