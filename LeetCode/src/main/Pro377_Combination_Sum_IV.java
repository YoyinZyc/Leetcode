package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 5:10:08 PM
 */
public class Pro377_Combination_Sum_IV {
	public int combinationSum4(int[] nums, int target) {
		Arrays.sort(nums);
		if(target < nums[0]) return 0;
		int[] record = new int[target+1];
		record[0] = 1;
		
//		int i = ;
		int i = nums[0];
		while (i <= target) {
//			for(int j = Math.min(i, nums[nums.length-1]); j >= nums[0]; j--) {
//				record[i] += record[i-j];
//			}
			for (int j = 0; j < nums.length && i-nums[j]>=0; j++) {
				record[i] += record[i-nums[j]];
			}
			i++;
		}
		return record[target];
	}
}
