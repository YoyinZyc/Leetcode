package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年8月1日 上午11:17:44
 * 
 */
public class Pro543_Diameter_Of_BT {
	int diameter = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		helper(root);
		return diameter;
	}
	
	private int helper(TreeNode root) {
		if (root == null) {
			return -1;
		}
		int maxLeft = helper(root.left);
		int maxRight = helper(root.right);
		diameter = Math.max(maxLeft+maxRight+2, diameter);
		return maxLeft>maxRight?++maxLeft:++maxRight;
	}
}
