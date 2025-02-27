import java.util.Arrays;
public class lowestNumber {
    public static void main(String[] args) {
        
        int[] nums = {1,4,5,6,9,7,10,9};
	System.out.print(Arrays.toString(arrayLowestNumber(nums)));
        
    }    
    public static int[] arrayLowestNumber(int[] nums){
        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        
	for(int count : nums){
		if(count < firstLowest){
			secondLowest = firstLowest;
			firstLowest = count;
		} else if(count < secondLowest){
			secondLowest = count;
		}
	}return new int[]{firstLowest,secondLowest};
	 
    }
}

