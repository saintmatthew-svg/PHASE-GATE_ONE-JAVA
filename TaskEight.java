public class TaskEight {
	public static void main(String[] args) {
		int[] numbers = {3,10,2,8,15,4};
		if (numbers[0] >= numbers[1] && numbers[0] >= numbers[2] && numbers[0] >= numbers[3] && numbers[0] >= numbers[4] && numbers[0] >= numbers[5]) {
			System.out.print(numbers[0] + " " + "= index[0]");
		} else if (numbers[1] >= numbers[0] && numbers[1] >= numbers[2] && numbers[1] >= numbers[3] && numbers[1] >= numbers[4] && numbers[1] >= numbers[5]) {
			System.out.print(numbers[1] + " " + "= index[1]");
		} else if (numbers[2] >= numbers[0] && numbers[2] >= numbers[1] && numbers[2] >= numbers[3] && numbers[2] >= numbers[4] && numbers[2] >= numbers[5]) {
			System.out.print(numbers[2] + " " + "= index[2]");
		} else if (numbers[3] >= numbers[0] && numbers[3] >= numbers[1] && numbers[3] >= numbers[2] && numbers[3] >= numbers[4] && numbers[3] >= numbers[5]) {
			System.out.print(numbers[3] + " " + "= index[3]");		
		} else if (numbers[4] >= numbers[0] && numbers[4] >= numbers[1] && numbers[4] >= numbers[2] && numbers[4] >= numbers[3] && numbers[4] >= numbers[5]) {
			System.out.print(numbers[4] + " " + "= index[4]");	
		} else if (numbers[5] >= numbers[0] && numbers[5] >= numbers[1] && numbers[5] >= numbers[2] && numbers[5] >= numbers[3] && numbers[5] >= numbers[4]) {
			System.out.print(numbers[5] + " " + "= index [5]");
		}
	}
}