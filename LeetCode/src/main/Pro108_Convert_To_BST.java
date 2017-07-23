package main;
/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月23日 下午2:59:25
 * 
 */
public class Pro108_Convert_To_BST {
	public TreeNode sortedArrayToBST(int[] nums) {
		return toBST(nums, 0, nums.length-1);
	}
	private TreeNode toBST(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int valIndex = (start  + end) / 2; 
		TreeNode node = new TreeNode(nums[valIndex]);

		node.left = toBST(nums, start, valIndex-1);
		node.right = toBST(nums, valIndex+1, end);
		return node;
	}
}
