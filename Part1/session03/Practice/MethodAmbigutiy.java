class MethodAmbigutiy
{
	public static int add(int a, double b){
		return (int) (a+b);
	}
	public static double add(double a, int b)
	{
		return a + b;
	}
	public static void main(String[] args)
	{
		add(5, 7);
	}
}