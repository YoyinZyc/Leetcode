package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category TopLiked-Medium & Quickselect
 * @version Create at: Sep 9, 2017 5:41:28 PM
 */
public class Pro215_Kth_Largest_Element_in_an_Array {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
}
