package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category TopLiked-Medium & Two-Point
 * @version Create at: Sep 9, 2017 2:25:31 PM
 */
public class Pro287_Find_the_Duplicate_Number {
	public int findDuplicate(int[] nums) {
		int i = nums[0];
		int j = nums[0];
		while (true) {
			i = nums[i];
			j = nums[nums[j]];
			if(i == j) break;
		}
		
		j = nums[0];
		while(true) {
			if(i == j) break;
			j = nums[j];
			i = nums[i];
		}
		return j;
				
	}

	
}
