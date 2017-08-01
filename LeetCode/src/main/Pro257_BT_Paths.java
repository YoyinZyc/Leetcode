package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月24日 下午5:36:22
 * 
 */
public class Pro257_BT_Paths {
	
	List<String> ret = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
		
		helper(root, "");
		return ret;
	}
	
	private void helper(TreeNode node,String path) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null)  {
			path += node.val;
			ret.add(path);
		}else {
			helper(node.left, path+node.val+"->");
			helper(node.right, path+node.val+"->");
		}
		
		
	}
}
