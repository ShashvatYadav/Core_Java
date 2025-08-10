class Student
{
	static void school()
	{
		System.out.println("GIC");
	}
	static void branch(String b)
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		school();
		branch("ComputerScience");
		Student s = new Student();
		s.sName("Suraj");
		s.passOut(5);
	}
	void sName(String n)
	{
		System.out.println(n);
	}
	void passOut(int y)
	{
		System.out.println(y);
	}
}