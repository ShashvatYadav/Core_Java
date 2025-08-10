class AllMethod
{
	public static void login(int a, int b){
		System.out.println("Parameterised");
	}
	
	public static void main(String[] args)
	{
		int a = 19;
		int b = 20;
		login(a, b);
		add(4, 6);
		char ch = 'z' ;
		double dd = 983984948;
		long l = 49583938l;
		signUp(ch, dd, l);
		ch = 'C';
		double d = 45834.484;
		login(ch, b);
	  	a = 50;
		b=0;
		ch = 'A';
		l = 98495039;
		dd = 948934.9484;
		power(a, b, ch, l, dd);
	}
	public static void power(int a, int b, char ch, long l, double dd){
		System.out.println(a + " " + b + " " + ch + " " + l + " " + dd);
	}
	static void login(char ch, double d)
	{
		System.out.println("Char and Double " + ch + " , " + d);
	}
	static void signUp (char ch, double dd, long l)
	{
		System.out.println("Output : " + ch + " " + dd + " " + l);
	}
	static void add(int a, int b)
	{
		System.out.println("Add : " + (a + b));
	}
}