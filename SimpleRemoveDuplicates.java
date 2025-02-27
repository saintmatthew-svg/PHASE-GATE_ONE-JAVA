import java.util.ArrayList;

public class SimpleRemoveDuplicates {

	public static void main(String[] args) {
        	int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8};
        	int[] result = removeDuplicates(numbers);
        	for (int number : result) {
            		System.out.print(number + " ");
        	}
	}

    public static int[] removeDuplicates(int[] numbers) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        int[] result = new int[uniqueNumbers.size()];
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            result[i] = uniqueNumbers.get(i);
        }
        return result;
    }

}
