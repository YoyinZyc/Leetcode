package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 上午11:37:08
 * 
 */
public class Pro101_Symmetric_Tree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}else{
			return isSymmetricNode(root.left, root.right);
		}
	}

	private boolean isSymmetricNode(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null) {
			return true;
		}else if (leftNode != null && rightNode != null) {
			return leftNode.val == rightNode.val 
					&& isSymmetricNode(leftNode.right, rightNode.left) 
					&& isSymmetricNode(leftNode.left, rightNode.right);
		}else{
			return false;
		}
	}
}
