package main.Array;

import java.util.Arrays;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月13日 下午3:55:27
 * 
 */
public class Pro16_3Sum_Closest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closestSum = nums[0]+nums[1]+nums[2];
		for (int i = 0; i < nums.length-2; i++) {
			int startIndex = i+1;
			int endIndex = nums.length-1;
			while (startIndex < endIndex) {
				int threeSum = nums[i] + nums[startIndex] + nums[endIndex];
				closestSum = Math.abs(target-closestSum) > Math.abs(target-threeSum) ? threeSum : closestSum;
				if (threeSum == target) {
					return target;
				}else if (threeSum > target) {
					endIndex--;
				}else {
					startIndex++;
				}
			}
		}
		return closestSum;
		 
	}
}
