package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 10, 2017 11:20:35 PM
 */
public class Pro40_Combination_Sum_II {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		helper(lists, new ArrayList<Integer>(), candidates, 0, target);
		return lists;
	}

	private void helper(List<List<Integer>> lists, ArrayList<Integer> list, int[] candidates, int index, int target) {
		if(target == 0) {
			lists.add(list);
		}else if (target > 0) {
			while(index < candidates.length) {
				ArrayList<Integer> clone = new ArrayList<Integer>(list);
				clone.add(candidates[index]);
				helper(lists, clone, candidates, index+1, target-candidates[index]);
				while(++index < candidates.length && candidates[index] == candidates[index-1]); 
			}
		}
	}
}
