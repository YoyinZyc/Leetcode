package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 11, 2017 10:33:36 AM
 */
public class Pro47_Permutations_II {
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		helper(lists, new ArrayList<Integer>(), nums, new int[nums.length], 0);
		return lists;
	}
	
	private void helper(List<List<Integer>> lists, List<Integer> list, int[] nums, int[] index, int count) {
		if(count == nums.length) {
			lists.add(list);
			return;
		}
		
		int i = 0;
		while(i < nums.length) {
			if(index[i] != 1) {
				List<Integer> clone = new ArrayList<Integer>(list);
				clone.add(nums[i]);
				int[] indexClone = index.clone();
				indexClone[i] = 1;
				helper(lists, clone, nums, indexClone, count+1);
				while(++i < nums.length &&index[i] != 1&& nums[i] == nums[i-1]) ;
			}
			i++;
			
		}
	}
}
