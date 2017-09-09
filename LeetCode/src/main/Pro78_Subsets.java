package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category TopLiked-Medium & Backtracking
 * @version Create at: Sep 8, 2017 2:39:51 PM
 */
public class Pro78_Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		lists.add(new ArrayList<Integer>());
		
		
		
		int i = 0;
		while(i < nums.length) {
			int length = lists.size();
			int j = 0;
			while(j < length) {
				ArrayList<Integer> list = (ArrayList<Integer>) lists.get(j);
				ArrayList<Integer> listClone = (ArrayList<Integer>) list.clone();
				listClone.add(nums[i]);
				lists.add(listClone);
				j++;
			}
			i++;
		}
		return lists;
	}
}
