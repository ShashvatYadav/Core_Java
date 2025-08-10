class SchoolSeating
{
	public static void main(String[] args)
	{
		int total_seats = 40;
		seatingArrangement(total_seats);
	}
	public static void seatingArrangement(double seat)
	{
		while(seat>=1)
		{
			if(seat%2 == 0) System.out.println(seat + " : Girl");
			else System.out.println(seat + " : Boy");
			seat--;
		}
	}
}