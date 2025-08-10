class Star
{
	static void luminious()
	{
		System.out.println("no");
	}
	static void noOfPlanet(int n)
	{
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		luminious();
		noOfPlanet(9);
		Star s = new Star();
		s.haveLife(true);
		s.life();
	}
	void haveLife(boolean l)
	{
		System.out.println(l);
	}
	void life()
	{
		System.out.println(302938394893d);
	}
}