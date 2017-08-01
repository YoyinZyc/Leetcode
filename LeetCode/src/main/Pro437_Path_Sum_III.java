package main;

import java.util.HashSet;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月30日 下午6:28:09
 * 
 */
public class Pro437_Path_Sum_III {
	HashSet<TreeNode> nodes = new HashSet<TreeNode>();
	int numOfPaths = 0;
	int sum = 0;
	public int pathSum(TreeNode root, int sum) {
		this.sum = sum;
		helper(root, sum);
		return numOfPaths;
	}
	
	private void helper(TreeNode node, int num) {
		if (node == null) {
			if (num == 0) {
				numOfPaths++;
			}
			return;
		}
		if (node.val == num) {
			numOfPaths++;
		}
		helper(node.left, num-node.val);
		helper(node.right, num-node.val);
		if (nodes.add(node)) {
			helper(node.left, sum-node.val);
			helper(node.right, sum-node.val);
		}
	}
}
