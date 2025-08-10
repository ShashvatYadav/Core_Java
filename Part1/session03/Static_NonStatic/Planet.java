class Planet
{
	public static void luminious()
	{
		System.out.println("no");
	}
	static void starName(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		luminious();
		starName("Sun");
		Planet p = new Planet();
		p.haveLife();
		p.weight(12933822.838);
	}
	void haveLife()
	{
		System.out.println("yes");
	}
	void weight(double w)
	{
		System.out.println(w);
	}
}