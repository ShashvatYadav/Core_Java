class MainMethod
{
	int x = 10;
	//String x = "Overloaded";
	public static void main(String... ar)
	{
		System.out.println("Main method 1");
		for(String ele : ar){
			System.out.println(ele);
		}
		main(6);
		return;
	} 
	public static void main(int args){
		System.out.println(args);
		String[] str = new String[] {"Suresh"};
	} 
}
class Example extends MainMethod
{
	int x = 20;
	public static void main (String[] args)
	{
		MainMethod e1 = new Example();
		System.out.println(e1.x);
	}
}