package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category TopLiked-Medium & Backtracking
 * @version Create at: Sep 9, 2017 11:53:23 AM
 */
public class Pro46_Permulations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		backtrack(new ArrayList<>(), 0, nums, lists);
		return lists;
	}
	
	private void backtrack(ArrayList<Integer> list, int length, int[] nums, List<List<Integer>> lists) {
		if(length == nums.length) {
			lists.add(list);
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
			if(!list2.contains(nums[i])) {
				list2.add(nums[i]);
				backtrack(list2, length+1, nums, lists);
			}
		}
	}
	
}
