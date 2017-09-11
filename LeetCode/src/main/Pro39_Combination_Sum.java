package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 10, 2017 11:04:22 PM
 */
public class Pro39_Combination_Sum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		helper(lists, new ArrayList<Integer>(), candidates, 0, target, 0);
		return lists;
	}
	
	private void helper(List<List<Integer>> lists, ArrayList<Integer> list, int[] candidates, int sum, int target,int index) {
		if(sum == target) {
			lists.add(list);
			return;
		}else if (sum > target) {
			return;
		}
		
		while(index < candidates.length) {
			ArrayList<Integer> clone = new ArrayList<Integer>(list);
			clone.add(candidates[index]);
			helper(lists, clone, candidates, sum+candidates[index], target, index);
			index++;
		}
		
	}
}
