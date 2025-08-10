class CheckChar
{
	public static String charCase(char ch)
	{
		if(ch >= 'A' && ch <= 'Z') return "UpperCase";
		else if(ch >= 'a' && ch <= 'z') return "Lowercase";
		else if(ch >= '0' && ch <= '9') return "Digit";
		else return "Special Character";
	}
	public static void main(String[] args)
	{
		String c = charCase('A');
		System.out.println(c);
	}
}