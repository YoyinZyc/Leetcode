package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月2日 下午5:19:17
 * 
 */
public class Pro450_Delete_Node_In_BST {
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) return null;
		if (root.val == key) {
			if(root.right == null){
				if(root.left == null) return null;
				return root.left;
			}else {
				if (root.left == null)  return root.right;
				TreeNode leftNode = root.left;
				TreeNode rightNode = root.right;
				while(rightNode.left != null) {
					rightNode = rightNode.left;
				}
				rightNode.left = leftNode;
				return root.right;
			}
		}else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		}else {
			root.left = deleteNode(root.left, key);
		}
		return root;
	}
	
}
