public class TasTen{
	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		int target = 9;
		if(nums[0] + nums[1] == target){
			System.out.print("[0,1]");
		} else if (nums[0] + nums[2] == target){
			System.out.print("[0,2]");
		} else if (nums[0] + nums[3] == target){
			System.out.print("[0,3]");
		} else if (nums[1] + nums[2] == target){
			System.out.print("[1,2]");
		} else if (nums[1] + nums[3] == target){
			System.out.print("[1,3]");
		} else if (nums[2] + nums[3] == target){
			System.out.print("[2,3]");
		}
	
	}
}