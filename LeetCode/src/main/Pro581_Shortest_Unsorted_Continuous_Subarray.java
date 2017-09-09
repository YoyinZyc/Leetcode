package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category TopLiked-Easy & Array
 * @version Create at: Sep 5, 2017 2:31:11 PM
 */
public class Pro581_Shortest_Unsorted_Continuous_Subarray {
	public int findUnsortedSubarray(int[] nums) {
		int numsCopy[] = new int[nums.length];
		for (int i = 0; i < numsCopy.length; i++) {
			numsCopy[i] = nums[i];
		}
		Arrays.sort(nums);
		int startIndex = 0;
		for (; startIndex < numsCopy.length && nums[startIndex] == numsCopy[startIndex]; startIndex++) {
		}
		int endIndex = nums.length-1;
		for(; endIndex >= startIndex && nums[endIndex] == numsCopy[endIndex]; endIndex--) {}
		return endIndex-startIndex+1;
	}
}

