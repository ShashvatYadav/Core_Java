class ReturnType
{
	public static void m1()
	{
		int x = 5;
		return; // cts
	}
	public static void main(String[] args)
	{
		m1();
		m2();
		m3();
	}
	public static void m2()
	{
		int x = 10;
		return 0;
	}
	public static void m3()
	{
		int j = 20;
		return null;
	}
}