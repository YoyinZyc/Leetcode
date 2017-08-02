package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月2日 下午12:06:08
 * 
 */
public class Pro199_BT_Right_Side_View {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		helper(root, list, 0);
		return list;
	}
	private void helper(TreeNode node, List<Integer> list, int level) {
		if (node == null) {
			return;
		}
		if (list.size()-1<level) {
			list.add(level, node.val);
		}else {
			list.set(level, node.val);
		}
		helper(node.left, list, level+1);
		helper(node.right, list, level+1);
	}
}
