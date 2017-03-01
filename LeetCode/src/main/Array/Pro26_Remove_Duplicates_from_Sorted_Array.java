package main.Array;

import java.util.Arrays;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro26_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int index = 1;
		int temp = nums[0];
		int countLength = 1;
		
		while (index < nums.length) {
			if (temp != nums[index]) {
				nums[countLength] = nums[index];
				countLength++;
				
				temp = nums[index];
				
			}
			index++;
		}
		return countLength;
	}
}
