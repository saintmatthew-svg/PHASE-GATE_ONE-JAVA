import java.util.Arrays;
public class HigestNumber {
    public static void main(String[] args) {
        
        int[] nums = {1,4,5,6,9,7,10,9};
	System.out.print(Arrays.toString(arrayHigestNumber(nums)));
        
    }    
    public static int[] arrayHigestNumber(int[] nums){
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
	for(int count : nums){
		if(count > firstHighest){
			secondHighest = firstHighest;
			firstHighest = count;
		} else if(count > secondHighest){
			secondHighest = count;
		}
	}return new int[]{firstHighest,secondHighest};
	 
    }
}

