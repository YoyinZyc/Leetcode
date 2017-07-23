package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午1:36:29
 * 
 */
public class Pro107_Level_Order_Traversal_II {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		addNode(root, 0);
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		for (int i = lists.size()-1;i >= 0; i--) {
			ret.add(lists.get(i));
		}
		return ret;
	}
	
	private void addNode(TreeNode node, int level) {
		if (node != null) {
			if (level >= lists.size() ) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(node.val);
				lists.add(list);
			}else {
				lists.get(level).add(node.val);
			}
			level++;
			addNode(node.left, level);
			addNode(node.right, level);
		}else{
			return;
		}
	}
}
