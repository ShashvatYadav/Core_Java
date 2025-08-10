class Properties
{
	public static void main(String[] args)
	{
		property("Shashvat", 21, 'M', 5.9, 56.7, "B.Tech", 9026543006l, "Prayagraj", "QSpider", false);
	}
	public static void property(String name, int age, char gender, double h, double w, String course, long number, String city, String institute, boolean employeed){
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(h);
		System.out.println(w);
		System.out.println(course);
		System.out.println(number);
		System.out.println(city);
		System.out.println(institute);
		System.out.println(employeed);

	}
}