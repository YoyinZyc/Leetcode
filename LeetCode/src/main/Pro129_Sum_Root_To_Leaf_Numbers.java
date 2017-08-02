package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月2日 下午10:43:19
 * 
 */
public class Pro129_Sum_Root_To_Leaf_Numbers {
	int sum = 0;
	public int sumNumbers(TreeNode root) {
		helper(root, "");
		return sum;
	}
	
	private void helper(TreeNode node, String num) {
		if(node == null) return;
		if (node.left == null && node.right == null) {
			num+=node.val;
			sum+=Integer.parseInt(num);
			return;
		}
		if (node.left == null) {
			helper(node.right, num+node.val);
		}else if (node.right == null) {
			helper(node.left, num+node.val);
		}else {
			helper(node.left, num+node.val);
			helper(node.right, num+node.val);
		}		
	}
}
