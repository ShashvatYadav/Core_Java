class Animal
{
	private static void noLeg()
	{
		System.out.println(4);	
	}
	public static void makeSound(String sound)
	{
		System.out.println(sound);
	}
	public static void main(String[] args)
	{
		noLeg();
		makeSound("Bark");
		Animal a1 = new Animal();
		a1.haveTale();
		a1.name("Dog");
	}
	private void haveTale()
	{
		System.out.println(true);
	}
	private void name(String n)
	{
		System.out.println(n);
	}
}