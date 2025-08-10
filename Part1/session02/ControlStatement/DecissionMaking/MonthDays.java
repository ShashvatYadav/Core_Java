class MonthDays
{
	public static void main(String[] args)
	{
		int mno = 4;
		/*if(mno == 1) System.out.println(31);
		else if(mno == 2) System.out.println(28 + " or " + 29);
		else if(mno == 3) System.out.println(31);
		else if(mno == 4) System.out.println(30);
		else if(mno == 5) System.out.println(31);
		else if(mno == 6) System.out.println(30);
		else if(mno == 7) System.out.println(31);
		else if(mno == 8) System.out.println(31);
		else if(mno == 9) System.out.println(30);
		else if(mno == 10) System.out.println(31);
		else if(mno == 11) System.out.println(30);
		else if(mno == 12) System.out.println(31);
		else System.out.println("Invalid month number"); */
		
		switch(mno)
		{
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
			{
				System.out.println("31 Days");
			}
			break;
			case 2 :
				System.out.println("28 or 29 Days");
			break;
			case 4:
			case 6 :
			case 9 :
			case 11 :
				System.out.println("30 Days");
				break;
			default:
				System.out.println("Invalid Month number");
		
		}
	}

}