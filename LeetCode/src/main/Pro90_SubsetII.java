package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 11, 2017 3:21:09 PM
 */
public class Pro90_SubsetII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		helper(lists, new ArrayList<Integer>(), 0, nums);
		return lists;
	}
	
	private void helper(List<List<Integer>> lists, List<Integer> list, int index, int nums[]) {
		lists.add(list);
		while(index < nums.length) {
			List<Integer> clone = new ArrayList<Integer>(list);
			clone.add(nums[index]);
//			lists.add(clone);
			helper(lists, clone, index+1, nums);
			while(++index < nums.length && nums[index] == nums[index-1]);
		}
	}
}
