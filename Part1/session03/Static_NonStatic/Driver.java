class Driver
{
	public static void haveLicence()
	{
		System.out.println("Yes");
	}
	private static void vehicle(String v)
	{
		System.out.println(v);
	}
	public static void main(String[] args)
	{
		haveLicence();
		vehicle("car");
		Driver d = new Driver();
		d.old(8);
		d.details();
	}
	void old(int y)
	{
		System.out.println(y);
	}
	void details()
	{
		haveLicence();
		vehicle("Car");
		old(7);
	}
}