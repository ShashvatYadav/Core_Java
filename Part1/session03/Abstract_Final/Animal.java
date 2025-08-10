abstract class Animal
{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void makeSound();
	public static void main(String[] args){
		Dog dog = new Dog("Dog");
		System.out.println(dog.name);
		dog.makeSound();
		System.out.println("Abstract Class and method Created");
	}
}

class Dog extends Animal
{
	Dog(String name){
		super(name);
	}
	void makeSound(){
		System.out.println("Barks");
	}	
}