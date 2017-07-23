package main;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午8:48:31
 * 
 */
public class Pro111_Minimum_Depth_BT {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}else if (root.left == null && root.right == null) {
			return 1;
		}else if (root.left == null && root.right != null) {
			return minDepth(root.right) + 1;
		}else if (root.left != null && root.right == null) {
			return minDepth(root.left) + 1;
		}else{
			int left = minDepth(root.left);
			int right = minDepth(root.right);
			return Math.min(left, right)+1;
		}
	}
	
	
}
