package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月1日 下午6:09:04
 * 
 */
public class Pro102_BT_Level_Order_Traversal {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		helper(root, 0);
		return lists;
	}
	private void helper(TreeNode node, int level) {
		if (node == null) {
			return;
		}
		if (lists.size()-1<level) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(node.val);
			lists.add(level, list);
		}else {
			List<Integer> list = lists.get(level);
			list.add(node.val);
			lists.set(level,list);
			
		}
		helper(node.left, level+1);
		helper(node.right, level+1);
	}
}
