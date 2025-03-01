public class IntegersDivisibleByThree {
	public static void main(String[] args){
	
	int number = 30;
	System.out.print(IntegersDivisible(number));	
	
	}

	public static int IntegersDivisible (int number){
		int divisible = 0;
		int sum = 0;
		for (int count = 1; count <= number; count++){
			if(count % 3 == 0){
				divisible = count;
				System.out.println(divisible);
				System.out.println();
				sum += count;
			}
		} return sum;
	
	}

} 