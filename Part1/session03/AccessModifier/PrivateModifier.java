class PrivateModifier
{
	private int data;
	private String name;
	public static void main(String[] args)
	{
		PrivateModifier pm = new PrivateModifier(20, "Shashvat");
		Accessibility ac = new Accessibility();
		ac.display();
		System.out.println(pm.data);
		System.out.println(pm.name);	
	}
	public PrivateModifier(int data, String name){
		this.data = data;
		this.name = name;
	}
	
}
class Accessibility extends PrivateModifier
{
	private int id;
	void display(){
		System.out.println(id);
	}
}
 