class FiniteLoop
{

	public static void main(String[] args){

		int j = 1;
		while(j<=6){
			System.out.println(j);
			j++;
		}
		
		j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<7);

		j=1;
		for( ;j<7;j++){
			System.out.println(j);
		}

	}


}