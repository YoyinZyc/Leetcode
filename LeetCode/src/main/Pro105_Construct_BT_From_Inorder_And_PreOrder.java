package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月5日 下午3:20:20
 * 
 */
public class Pro105_Construct_BT_From_Inorder_And_PreOrder {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0) {
			return null;
		}
		return helper(0, 0, preorder.length-1, inorder.length-1, preorder, inorder);
	}
	
	private TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preOrder, int[] inOrder) {
		if(preStart > preEnd) return null;
		TreeNode node = new TreeNode(preOrder[preStart]);
		int i = 0;
		while(inOrder[i+inStart]!=preOrder[preStart]) i++;
		node.left = helper(preStart+1, preStart+i, inStart, inStart+i-1, preOrder, inOrder);
		node.right = helper(preStart+i+1, preEnd, inStart+i+1, inEnd, preOrder, inOrder);
		return node;
	}
}
