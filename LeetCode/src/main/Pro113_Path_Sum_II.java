package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月5日 下午11:54:21
 * 
 */
public class Pro113_Path_Sum_II {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<Integer> list = new ArrayList<Integer>();
		helper(root, sum, list);
		return lists;
	}
	
	private void helper(TreeNode node, int sum,List<Integer> list) {
		if (node == null) {
			return;
		}
		list.add(node.val);
		if (node.val == sum && node.left == null && node.right == null) {
			lists.add(list);
		}else {
			List<Integer> newList = new ArrayList<Integer>(list);
			
			helper(node.left, sum-node.val, newList);
			helper(node.right, sum-node.val, list);
		}
		
	}
}
