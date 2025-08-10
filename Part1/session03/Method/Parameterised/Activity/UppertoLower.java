class UppertoLower
{
	public static void main(String[] args)
	{
		upperToLower('A');
		upperToLower('z');
	}
	public static void upperToLower(char ch)
	{
		if(ch >= 'A' && ch <= 'Z') {
			int acc = ch;
			char c = (char) (acc + 32);
			System.out.println(c);
		}
		else if(ch >= 'a' && ch <= 'z'){
			int acc = ch;
			char c = (char) (acc - 32);
			System.out.println(c);
		}
		else System.out.println("Not a English alphabet");
	}
}