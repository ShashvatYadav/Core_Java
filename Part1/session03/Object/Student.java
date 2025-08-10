class Student
{
	int roll = 5;
	private void m1()
	{
		System.out.println("Hey");
	}
	public static void main(String[] args)
	{
		System.out.println(new Student().roll);
		System.gc();
		new Student().m1();
		Student s = new Student();
		System.out.println(s.roll);
		s.m1();
	}
}