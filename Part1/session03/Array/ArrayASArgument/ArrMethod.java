class ArrMethod
{
	public static void main(String[] args)
	{
		main(5, new int[]{5,6,7,'x'}, new boolean[]{true, false, true});
		main(new double[]{5.0,7.09,8}, "String", new char[] {'a', '1', '`'});
		main(new float[]{5, 5.9f, 3.5f}, 598394839);
		main(args, false);	

	}
	public static void main(int a, int[] arr, boolean[] brr){
		System.out.println("First method created");
	}
	public static void main(double d[], String str, char ch[])
	{

		System.out.println("Second method created");
	}
	public static void main(float frr[], long l)
	{
		System.out.println("Third method created");
	}
	public static void main(String[] args, boolean b)
	{
		System.out.println("Fourth method created");
	}
}