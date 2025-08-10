class Assign05
{
	public static void main(String[] args)
	{
		int number = 8754;
		int sum = 0;
		int mul = 1;
		System.out.println(number % 10);
		sum += number % 10;
		mul *= number % 10;
		number /= 10;
		System.out.println(number % 10);
		sum += number % 10;
		mul *= number % 10;
		number /= 10;
		System.out.println(number % 10);
		sum += number % 10;
		mul *= number % 10;
		number /= 10;
		System.out.println(number % 10);
		sum += number % 10;
		mul *= number % 10;
		System.out.println(sum);
		System.out.println(mul);
		
		System.out.println("Square : " + 4 * 4 + " " + 7 * 7 + " " + 9 * 9);
		System.out.println("Cube : " + 5 * 5 * 5 + " " + 2 * 2 * 2 + " " + 15 * 15 * 15);
		
		System.out.println(5 * 5 * 5 * 5);
		System.out.println(3 * 3 * 3 * 3 * 3 * 3);
		System.out.println(6 * 6);
		System.out.println(8 * 8 * 8);
		
		System.out.println("Area of Rectangle : " + (4 * 5.6));
		System.out.println("Perimeter of Rectangle : " + 2 * (4.1 + 5.6));
		
		System.out.println("Area of Square : " + 6 * 6);
		System.out.println("Perimeter of Square : " + 4 * 6);

	}



}