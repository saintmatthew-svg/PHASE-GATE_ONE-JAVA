import java.util.Arrays;
public class SumOfUniqueElement {
 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumUniqueElements(nums));
    }

    public static int sumUniqueElements(int[] nums) {
        int[] counts = new int[1000];

        for (int num1 = 0; num1 < nums.length; num1++) {
            counts[nums[num1]]++;
        }

        int sum = 0;
        for (int num2 = 0; num2 < counts.length; num2++) {
            if (counts[num2] == 1) {
                sum += num2;
            }
        }

        return sum;
    }
}

