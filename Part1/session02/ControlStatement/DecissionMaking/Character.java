class Character
{
	public static void main(String[] args)
	{

		char ch = '0';
		/*if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') System.out.println("Vowel");
		else if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch =='h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch  == 'y' || ch == 'z') System.out.println("Consonant");
		else System.out.println("Not a English small letter"); */
		
		switch(ch){
			case 'a', 'e', 'i', 'o', 'u' :
			{
				System.out.println("Vowel");
				break;
			}
			case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' :
			{
				System.out.println("Consonant");
				break;
			}
			default :
			{
				System.out.println("Not a English lower case character");
			}
			
		}

	}
}