package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月1日 下午9:12:28
 * 
 */
public class Pro98_Validate_BST {
	public boolean isValidBST(TreeNode root) {
		return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
	}
	
	private boolean helper(TreeNode node, long max, Long min) {
		if (node == null) {
			return true;
		}
		if (node.val > min && node.val < max) {
			return helper(node.left, new Long(max), min) && helper(node.right, max, new Long(min));
		}else {
			return false;
		}
	}
}
