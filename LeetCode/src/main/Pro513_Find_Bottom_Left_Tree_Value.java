package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月1日 下午5:47:40
 * 
 */
public class Pro513_Find_Bottom_Left_Tree_Value {
	int lastRow = 0;
	int value = 0;
	public int findBottomLeftValue(TreeNode root) {
		helper(root, 1);
		return value;
	}
	private void helper(TreeNode node, int level) {
		if (node == null) {
			return;
		}
		if (level > lastRow) {
			value = node.val;
			lastRow = level;
		}
		helper(node.left, level+1);
		helper(node.right, level+1);
		
	}
}
