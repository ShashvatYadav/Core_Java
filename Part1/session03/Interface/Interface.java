interface Interface
{
	
	String name = "Lion";
	public static void main(String[] args){
		Interface chInt = new ChildOfInterface();
		Interface.display();
		System.out.println("Main method inside Interface");
	}
	public static void display(){
		System.out.println("Display method of interface");
	}
}

class ChildOfInterface implements Interface
{
	public static void display(){
		System.out.println("Display method of Child");
	} 	
}