class ScopeOfVariable
{
	int a; // non-static variable (Instance Variable)
	static int b; // Static variable (class variable)
	int x;
	public static void main(String[] args){
		int a;
		//System.out.println(a); // Compile Time Error	
		a = 5;
		System.out.println(a);
		
		// Accessing Static variable 
		System.out.println(b); // default value
		System.out.println(ScopeOfVariable.b); // default value
		
		System.out.println(a); //No error as there is a local variable a
		System.out.println(x); // Error
		
		display(); // error as display is non-static
		
	}
	void display(){
		System.out.println(a);
	}	
}