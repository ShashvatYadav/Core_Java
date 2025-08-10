import java.util.*;
class Array
{
	public static void main(String[] args)
	{
		//int[] arr = new int[5]; // default value is 0
		int[] arr = {10, 49, 9, 1, 29, 10};
		System.out.println(arr);
		System.out.println(arr[0]);
		Arrays.sort(arr);
		// Arrays.fill(arr, 10);
		for(int num : arr){
			System.out.print(num + " " );
		}
		
		String str = Arrays.toString(arr);
		System.out.println(str);

		Arrays.stream(arr)
      			.filter(n -> n % 2 == 0)  // keep only even numbers
      			.forEach(System.out::println);  // print each
	}
}