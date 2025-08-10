class Employee
{
	String name;
	static String location;
	static void work()
	{
		System.out.println("Working");
	}
	static void retired(boolean r)
	{
		System.out.println("Is retained : " + r);
	}
	public static void main(String[] args)
	{
		// static
		location = "Noida";
		work();
		retired(false);
		// non - static
		Employee emp = new Employee();
		emp.name = "Aman";
		emp.role("Clerk");
		emp.details();
		
	}
	void role(String r)
	{
		System.out.println("Role is : " + r);
	}
	void details()
	{
		System.out.println(name);
		System.out.println(location);
	}
}