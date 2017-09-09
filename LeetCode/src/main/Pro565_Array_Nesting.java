package main;

/**
 * @author Cactus
 * @category TopLiked-Medium & Array
 * @version Create at: Sep 7, 2017 7:39:05 PM
 */
public class Pro565_Array_Nesting {
	public int arrayNesting(int[] nums) {
		int[] numsRecord = new int[nums.length];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numsRecord[i] == 0) {
				max = Math.max(max, findMax(nums, numsRecord, i));
			}
		}
		return max;
	}
	
	private int findMax(int[] nums, int[] numsRecord, int i) {
		int count = 0;
		while (numsRecord[i] != 1) {
			numsRecord[i] = 1;
			count++;
			i = nums[i]; 
		}
		return count;
	}
}
