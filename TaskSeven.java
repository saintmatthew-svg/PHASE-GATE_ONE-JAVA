import java.util.Scanner;
public class TaskSeven{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.print("ENTER NUMBER TO CHECK THE FACTOR: ");
		int factor = input.nextInt();
		for(int count = 1; count  < factor; count++){
			if(factor % count == 0){
				System.out.print(count + " ");
			}
		} System.out.print(factor);
	}
}