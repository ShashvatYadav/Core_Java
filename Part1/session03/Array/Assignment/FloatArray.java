class FloatArray
{
	public static void main(String[] args)
	{
		float[] arr = {10.0f, 23, 29.0f, 20.f, 249, 29.9f};
		System.out.println(arr);	
		System.out.println(arr[4]);
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