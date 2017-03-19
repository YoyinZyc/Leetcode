package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月19日 下午8:19:45
 * 
 */
public class Pro136_Single_Number {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i+1] == nums[i]) {
				i++;
			}else{
				return nums[i];
			}
		}
		return nums[nums.length-1];
	}
}
