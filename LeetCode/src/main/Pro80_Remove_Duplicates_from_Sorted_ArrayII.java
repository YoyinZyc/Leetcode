package main;

/**
 * @author Cactus
 * @category TwoPoints_Medium
 * @version Create at: Sep 9, 2017 11:20:55 PM
 */
public class Pro80_Remove_Duplicates_from_Sorted_ArrayII {
	public int removeDuplicates(int[] nums) {
		if(nums.length <= 2) return nums.length;
		int i = 0;
		int j = 1;
		int count = 0;
		while (j < nums.length) {
			if(nums[j] == nums[i]) {
				if(count == 0) {
					nums[++i] = nums[j];
					count = 1;
					j++;
				}else {
					j++;
					while(j < nums.length && nums[j] == nums[i]) j++;
					count = 0;
				}
			}else {
				count = 0;
				nums[++i] = nums[j];
				j++;
			}
		}
		return i+1;
	}
}
