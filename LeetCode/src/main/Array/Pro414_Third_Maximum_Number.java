package main.Array;

import java.util.Arrays;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro414_Third_Maximum_Number {
	public int thirdMax(int[] nums) {
		 Arrays.sort(nums);
			int i = nums.length-2;
			int count = 1;
			int max = nums[nums.length-1];
			while((i >= 0)&&(count < 4)){
				if (nums[i] != nums[i+1]) {
					count++;
				}
				
				if (count == 3) {
					max = nums[i];
				}
				i--;
			}
			return max;
		
	}
}
