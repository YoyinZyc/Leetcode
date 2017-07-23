package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午4:55:18
 * 
 */
public class Pro110_Balanced_BT {
	int maxDiffer = 0;
	public boolean isBalanced(TreeNode root) {
		helper(root);
		if (maxDiffer >= 2) {
			return false;
		}
		return true;
	}
	
	private int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}else {
			int left = helper(node.left);
			int right = helper(node.right);
			maxDiffer = Math.max(maxDiffer, Math.abs(left-right)); 
			return Math.max(left, right)+1;
		}
	}
}
