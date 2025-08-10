class StringArray
{
	public static void main(String[] args)
	{
		String[] arr = {"Shashvat", "void", "false", "Suresh", "ram"};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		for(int j=0; j<arr.length; j++){
			System.out.println(arr[j]);
		}
		int j=0; 
		while(j<arr.length){
			System.out.println(arr[j]);
			j++;
		}
		j=0;
		do{
			System.out.println(arr[j]);
			j++;
		}while(j<arr.length);
	}
}