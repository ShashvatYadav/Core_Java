class ProtectedModifier
{
	private boolean access;
	public static void main(String[] args)
	{
		CheckAccesbility ca = new CheckAccesbility();
		ca.display();
	}
	public ProtectedModifier(boolean access){
		this.access = access;
	}
	public boolean getter(){
		return access;
	}
}
class	CheckAccesbility
{
	
	public void display(){
		ProtectedModifier pm = new ProtectedModifier(false);
		System.out.println(pm.getter());

	}
} 