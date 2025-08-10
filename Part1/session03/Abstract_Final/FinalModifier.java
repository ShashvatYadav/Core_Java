class FinalModifier
{
	// instance final
	final int x;
	FinalModifier(int x){
		this.x = x;
	}
	public static void main(String[] args)
	{
		FinalModifier fm = new FinalModifier(10);
		System.out.println(fm.x);
		FinalModifier fm2 = new FinalModifier(30);
		System.out.println(fm2.x);

		// local final
		final long PHONE_NO;
		PHONE_NO = 7459878091l; 
		System.out.println(PHONE_NO);
	}
}