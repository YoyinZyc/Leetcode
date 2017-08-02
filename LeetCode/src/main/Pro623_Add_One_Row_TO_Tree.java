package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月1日 下午4:50:45
 * 
 */
public class Pro623_Add_One_Row_TO_Tree {
	int v = 0;
	int d = 0;
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		this.v = v;
		this.d = d;
		if(d == 1) {
			TreeNode newHead = new TreeNode(v);
			newHead.left = root;
			return newHead;
		}
		helper(root, 1);
		return root;
	}
	
	private void helper (TreeNode node, int level) {
		if (node == null) {
			return;
		}
		if (level == d-1) {
			TreeNode leftNode = node.left;
			TreeNode rightNode = node.right;
			node.left = new TreeNode(v);
			node.right = new TreeNode(v);
			node.left.left = leftNode;
			node.right.right = rightNode;
		}else {
			helper(node.left, ++level);
			helper(node.right, ++level);
		}
	}
}
 