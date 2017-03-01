package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro485_Max_Consecutive_Ones {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				max = count > max?count:max;
				count = 0;
			}else {
				count++;
			}
			
		}
		max = count > max?count:max;
		return max;
	}
}
