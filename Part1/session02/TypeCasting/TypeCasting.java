class Star{
	static void star(){
		System.out.println('*');
	}
}
class TypeCasting
{
	static void star(){
		System.out.println('#');
	}
	static void hash(){
		System.out.println('#');
	}
	public static void main(String[] args)
	{
		// byte to short
		byte a = 10;
		short b = a;
		System.out.println(b);

		// byte<short, char<int<long<float<double

		// explicit typecasting double to float
		double d = 3;
		float f = (float)d;
		System.out.println(f);

		char ch = 'b';
		int by = ch;
		System.out.println(by);
		
		/* Star s1 = new Star();
		s1.star(); */
		
		Star.star();

		star();
		hash();

	}

}