class AllMethods
{
	private static void add(){
		System.out.println("Add");
	}
	private static void login()
	{
		System.out.println("Login");
	}
	public static void main(String[] args)
	{
		add();
		login();
		logOut();
		power();
		signUp();
	}
	private static void logOut()
	{
		System.out.println("Log Out");
	}
	private static void power()
	{
		System.out.println("Power");
	}
	private static void signUp()
	{
		System.out.println("Sign Up");
	}
}