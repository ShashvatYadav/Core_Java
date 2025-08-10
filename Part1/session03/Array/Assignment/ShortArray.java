class ShortArray
{
	public static void main(String[] args)
	{
		short[] arr = {2, 3, 9, 9, 'c', 20, 93};
		System.out.println(arr);
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