class EvenOdd
{
	public static String evenOdd(int n)
	{
		return n % 2==0 ? "Even" : "Odd";
	}
	public static void main(String[] args)
	{
		String ans = evenOdd(18);
		System.out.println(ans);
	}
}