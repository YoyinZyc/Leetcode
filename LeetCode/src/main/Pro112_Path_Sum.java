package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午9:16:12
 * 
 */
public class Pro112_Path_Sum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}else {
			return helper(root, sum);
		}
		
	}
	
	private boolean helper(TreeNode root, int sum) {
		if (root.left == null && root.right == null) {
			if (sum == root.val) {
				return true;
			}else {
				return false;
			}
		}else if (root.left == null && root.right != null) {
			return hasPathSum(root.right, sum-root.val);
		}else if (root.left != null && root.right == null) {
			return hasPathSum(root.left, sum-root.val);
		}else{
			return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
		}
	}
}
