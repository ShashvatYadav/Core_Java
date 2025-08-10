class IntArray
{
	public static void main(String[] args)
	{
		int[] arr = {20, 39, 'f', 20, 49, 294};
		System.out.println(arr);
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