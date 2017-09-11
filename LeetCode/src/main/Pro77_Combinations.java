package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 11, 2017 3:48:37 PM
 */
public class Pro77_Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		helper(lists, new ArrayList<Integer>(), n, k, 0, 0);
		return lists;
	}
	
	private void helper(List<List<Integer>> lists, List<Integer> list, int n, int k, int startIndex, int count) {
		if(count == k) {
			lists.add(list);
			return;
		}
		while(startIndex < n) {
			List<Integer> clone = new ArrayList<Integer>(list);
			clone.add(startIndex+1);
			helper(lists, clone, n, k, startIndex+1, count+1);
			startIndex++;
		}
	}
}
