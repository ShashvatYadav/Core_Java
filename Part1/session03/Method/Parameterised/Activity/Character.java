class Character
{
	public static void character(char ch)
	{
		if(ch >= 'A' && ch <= 'Z') System.out.println("UpperCase");
		else if(ch >= 'a' && ch <= 'z') System.out.println("LowerCase");
		else if(ch >= '0' && ch <= '9' ) System.out.println("Digit");
		else System.out.println("Special Character");
	}	
	public static void main(String[] args)
	{
		character('A');
		character('b');
		character('@');
		character('9');
	}
}