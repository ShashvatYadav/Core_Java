class MonthsDaysOpt
{
	public static void main(String[] args)
	{
		int mno = 2;
		if(mno == 1 || mno == 3 || mno == 5 || mno == 7 || mno == 8 || mno == 10 || mno == 12) System.out.println("31 Days");
		else if(mno == 4 || mno == 6 || mno == 9 || mno == 11) System.out.println("30 Days");
		else if (mno == 2) System.out.println("28 or 29 Days");
		else System.out.println("Invalid month number");
	
	}
}