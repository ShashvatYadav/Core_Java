class LongArr
{
	public static void main(String[] args)
	{
		long[] arr = {24293, 292048304, 2084024820480l, 9028402, (long)20.02, 'f'};
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