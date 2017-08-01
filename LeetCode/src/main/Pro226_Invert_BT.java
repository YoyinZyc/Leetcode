package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月24日 下午3:26:40
 * 
 */
public class Pro226_Invert_BT {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}else {
			TreeNode leftNode = invertTree(root.left);
			TreeNode rightNode = invertTree(root.right);
			root.left = rightNode;
			root.right = leftNode;
			return root;
		}
		
	}
}
