package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年4月2日 下午6:38:57
 * 
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class Pro94_Binary_Tree_Inorder_Traversal {
	List<Integer> ret = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		addIntinList(root);
		return ret;
	}
	private void addIntinList(TreeNode root) {
		if(root == null) return;
		addIntinList(root.left);
		ret.add(root.val);
		addIntinList(root.right);
	}
}



