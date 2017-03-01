package main.Array;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro35_Search_Insert_Position {
	public int searchInsert(int[] nums, int target) {
		if (target <= nums[0]) {
			return 0;
		}
		
		if (nums.length == 1) {
			return 1;
		}
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == target) {
				return i;
			}
			
			if ((nums[i] < target) && (nums[i+1] >=
					target)){
				return ++i;
			}
		}
		return nums.length;
	}
}
