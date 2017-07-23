package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午12:57:27
 * 
 */
public class Pro104_Maxmium_Depth {
	public int maxDepth(TreeNode root) {
		return max(root, 0);
	}

	private int max(TreeNode root, int lastLevel) {
		if (root == null) {
			return lastLevel;
		}
		lastLevel++;
		return Math.max(max(root.left, lastLevel), max(root.right, lastLevel));
	}
}
