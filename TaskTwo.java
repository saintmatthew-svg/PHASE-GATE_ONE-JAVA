public class TaskTwo {
	public static void main(String[] args) {
		int[] nums = {1,4,6,1};
			if (nums[0] == nums[1]){
				System.out.println(nums[2] + nums[3]);
			} else if (nums[0] == nums[2]){
				System.out.println(nums[1] + nums[3]);
			}else if (nums[0] == nums[3]) {
				System.out.println(nums[1] + nums[2]);
			} else if (nums[1] == nums[0]){
				System.out.println(nums[2] + nums[3]);
			} else if (nums[1] == nums[2]){
				System.out.println(nums[0] + nums[3]);
			}else if (nums[1] == nums[3]) {
				System.out.println(nums[0] + nums[2]);
			} else if (nums[2] == nums[0]){
				System.out.println(nums[1] + nums[3]);
			} else if (nums[2] == nums[1]){
				System.out.println(nums[2] + nums[3]);
			}else if (nums[2] == nums[3]) {
				System.out.println(nums[0] + nums[1]);
			} 
	}
}