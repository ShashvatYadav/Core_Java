class MonthName
{
	public static void main(String[] args)
	{
		int mno = 12;
		/* if(mno == 1) System.out.println("January");
		else if(mno == 2) System.out.println("February");
		else if(mno == 3) System.out.println("March");
		else if(mno == 4) System.out.println("April");
		else if(mno == 5) System.out.println("May");
		else if(mno == 6) System.out.println("June");
		else if(mno == 7) System.out.println("July");
		else if(mno == 8) System.out.println("August");
		else if(mno == 9) System.out.println("September");
		else if(mno == 10) System.out.println("October");
		else if(mno == 11) System.out.println("November");
		else if(mno == 12) System.out.println("December");
		else  System.out.println("Invalid month number"); */

		switch(mno){
			case 1 :
				System.out.println("Jan");
				break;
			case 2 :
				System.out.println("Feb");
			break;
			case 3 :
				System.out.println("Mar");
			break;
			case 4 :
				System.out.println("Apr");
				break;
			case 5 :
				System.out.println("May");
				break;
			case 6 :
				System.out.println("Jun");
				break;
			case 7 :
				System.out.println("Jul");
				break;
			case 8 :
				System.out.println("Aug");
				break;
			case 9 :
				System.out.println("Sep");
				break;
			case 10 :
				System.out.println("Oct");
			break;
			case 11 :
				System.out.println("Nov");
				break;
			case 12 : 
				System.out.println("Dec");
			break;
			default :
			{
				System.out.println("Invalid MonthNo");
			}
		}

	}

}