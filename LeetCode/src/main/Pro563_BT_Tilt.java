package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月1日 上午11:53:40
 * 
 */
public class Pro563_BT_Tilt {
	int tilt = 0;
	public int findTilt(TreeNode root) {
		helper(root);
		return tilt;
	}
	private int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftSum = helper(node.left);
		int rightSum = helper(node.right);
		tilt+=Math.abs(leftSum-rightSum);
		return leftSum+rightSum+node.val;
	}
}
