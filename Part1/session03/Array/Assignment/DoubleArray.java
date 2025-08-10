class DoubleArray
{
	public static void main(String[] args)
	{
		double[] arr = {40, 49.029, 24.94, 'a', 'A', 'S', 242.0249};
		System.out.println(arr);
		System.out.println(arr[0]);
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