class CharArray
{
	public static void main(String[] args)
	{
		char[] arr = {'A', '0', '9', 's', 'z', ';', ' '};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		arr[4] = 'g';
		System.out.println(arr[9]); // exception not compile time error
		System.out.println(arr[3]);
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