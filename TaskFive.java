import java.util.Scanner;
public class TaskFive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if((number % number == 1) && (number % 1 == number)){
			System.out.println("true");
		} else if (number % number != 0){
			System.out.println("false");
		}
		
	}
}