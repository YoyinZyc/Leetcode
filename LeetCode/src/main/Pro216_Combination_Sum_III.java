package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 11, 2017 10:17:19 AM
 */
public class Pro216_Combination_Sum_III {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		helper(lists, new ArrayList<Integer>(), 0, n, k, 1);
		return lists;
	}
	
	private void helper(List<List<Integer>> lists, ArrayList<Integer> list, int index, int n, int k, int start) {
		if(index == k) {
			if(n == 0) lists.add(list);
			return;
		}
		while(start < 10) {
			ArrayList<Integer> clone = new ArrayList<Integer>(list);
			clone.add(start);
			helper(lists, clone, index+1, n-start, k, start+1);
			start++;
		}
	}
}
