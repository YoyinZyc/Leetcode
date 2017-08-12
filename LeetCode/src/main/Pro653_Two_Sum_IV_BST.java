package main;

import javax.swing.RootPaneContainer;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月9日 下午2:09:21
 * 
 */
public class Pro653_Two_Sum_IV_BST {
	public boolean findTarget(TreeNode root, int k) {
		return find(root, root, k);
	}
	
	private boolean find(TreeNode root, TreeNode node, int k) {
		if(node == null) return false;
		if (node.val * 2 != k) {
			if(helper(root, k-node.val)) return true;
		}
		return find(root, node.left, k) || find(root, node.right, k);
	}
	
	
	private boolean helper(TreeNode node, int val) {
		if (node == null) {
			return false;
		}
		if (node.val < val) {
			return helper(node.right, val);
		}else if (node.val > val) {
			return helper(node.left, val);
		}else {
			return true;
		}
	}
	
}
