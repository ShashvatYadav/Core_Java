class DayName
{
	public static void main(String[] args)
	{
		dayName();
	}
	private static void dayName()
	{
		int day_no = 5;
		if(day_no == 1) System.out.println("Monday");
		else if(day_no == 2) System.out.println("Tuesday");
		else if(day_no == 3) System.out.println("Wednesday");
		else if(day_no == 4) System.out.println("Thursday");
		else if(day_no == 5) System.out.println("Friday");
		else if(day_no == 6) System.out.println("Saturday");
		else if(day_no == 7) System.out.println("Sunday");
		else System.out.println("Wrong Day No. ");
	}
}