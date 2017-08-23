package main;
/**
 * @author Cactus
 * @category DP_Easy
 * @version Create at: 2017年8月23日 上午9:57:45
 * 
 */
public class Pro198_House_Robber {
	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}else if (nums.length == 1) {
			return nums[0];
		}
		int[] amounts = new int[nums.length];
		amounts[0] = nums[0];
		amounts[1] = Math.max(amounts[0], nums[1]);
		int i = 2;
		while(i < nums.length) {
			amounts[i] = Math.max(amounts[i-1], amounts[i-2]+nums[i]);
			i++;
		}
		return amounts[i-1];
		
		
		
	}
	private int helper (int[] nums, int index) {
		if(index >= nums.length) return 0;
		return Math.max(nums[index] + helper(nums, index+2), helper(nums, index+1));
	}
}
