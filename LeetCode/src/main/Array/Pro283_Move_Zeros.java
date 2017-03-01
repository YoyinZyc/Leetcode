package main.Array;

import java.util.ArrayList;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro283_Move_Zeros {
	public void moveZeroes(int[] nums) {
		
		int index = 0;
		for(;index<nums.length;index++){
			if (nums[index] == 0) {
				break;
			}
		}
		
		for (int i = index+1; i < nums.length; i++) {
			if (nums[i]!=0) {
				nums[index] = nums[i];
				nums[i] = 0;
				index++;
			}
		}
		
		
		for(;index<nums.length;index++){
			nums[index] = 0;
		}
		
	}
}
