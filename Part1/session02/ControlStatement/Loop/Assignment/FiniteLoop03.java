class FiniteLoop03
{

	public static void main(String[] args){
		
		int odd = 1;
		while(odd<=9){
			System.out.println(odd);
			odd += 2;
		}
		
		odd = 1;
		do{

			System.out.println(odd);
			odd += 2;
		}while(odd<=9);

		for(int j = 1; j<=9; j+=2){
			System.out.println(j);
		}
	
	}
}