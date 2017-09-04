package main;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 11:05:33 AM
 */
public class Pro213_House_Robber_II {
	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		int prevYes = 0;
		int prevNo = 0;
		int i = 1;
		while (i < nums.length) {
			int temp = prevNo;
			prevNo = Math.max(prevNo, prevYes);
			prevYes = temp + nums[i];
			i++;
		}
		int noOne = Math.max(prevNo, prevYes);
		
		prevNo = nums[0];
		prevYes = 0;
		i = 2;
		while(i < nums.length-1) {
			int temp = prevNo;
			prevNo = Math.max(prevNo, prevYes);
			prevYes = temp + nums[i];
			i++;
		}
		int withOne = Math.max(prevNo, prevYes);
		return Math.max(withOne, noOne);
			
	}
}
