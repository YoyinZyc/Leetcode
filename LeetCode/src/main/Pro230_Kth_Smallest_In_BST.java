package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月4日 下午6:04:29
 * 
 */
public class Pro230_Kth_Smallest_In_BST {
	int kth = 0;
	public int kthSmallest(TreeNode root, int k) {
		helper(root, k);
		return kth;
	}

	private int helper(TreeNode node,int k) {
		if (node == null) {
			return 0;
		}

		int fromLeft = helper(node.left , k);
		int fromRight = 0;
		if (fromLeft+1 == k) {
			kth = node.val;
		}else if (fromLeft + 1 < k) {
			fromRight = helper(node.right, k - fromLeft - 1);
		}
		return fromLeft+1+fromRight;
	}

}
