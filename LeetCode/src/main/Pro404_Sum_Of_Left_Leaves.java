package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月30日 下午2:52:54
 * 
 */
public class Pro404_Sum_Of_Left_Leaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}

		if (root.left != null && root.left.left == null 
				&& root.left.right == null) {
			return root.left.val + sumOfLeftLeaves(root.right);
		}

		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}
}

