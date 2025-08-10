class Customer
{
	static String company;
	String name;
	static void regular() // Non-parameterized
	{
		System.out.println("Regular Customer");
	}
	static void id(int j) // parameterized
	{
		System.out.println("id is : " + j);
	}
	public static void main(String[] args)
	{
		Customer c = new Customer();
		c.name = "Deepak";
		company = "Zoho";
		c.details();
		c.wallet(4000);
		regular();
		id(5);
		
	}
	void details(){ // non-static non-parameterized
		System.out.println(company);
		System.out.println(name);
	}
	void wallet(int w) // non-static parameterized
	{
		System.out.println(w);
	}
	
}