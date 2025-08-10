class DayName
{
	public static String dayName(int d)
	{
		if(d > 0 && d <=7){
			if(d == 1) return "Sunday";
			else if(d==2) return "Monday";
			else if(d==3) return "Tuesday";
			else if(d==4) return "Wednesday";
			else if(d==5) return "Thursday";
			else if(d==6) return "Friday";
			else return "Saturday";
		}
		else return "Invalid DayNumber";
	}	
	public static void main(String[] args)
	{
		String day = dayName(5);
		System.out.println(day);
	}
}