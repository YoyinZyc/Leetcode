package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月10日 下午2:59:11
 * 
 */
public class Pro106_Costruct_BT_From_Inorder_Postorder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0) {
			return null;
		}
		return helper(postorder.length-1, 0, inorder.length-1, postorder, inorder);
	}
	
	private TreeNode helper(int postStart, int postEnd, int inStart,int[] postOrder, int[] inOrder) {
        // System.out.println("preStart:"+preStart);
        // System.out.println("preEnd:"+preEnd);
        // System.out.println("inStart:"+inStart);
        // System.out.println("inEnd:"+inEnd);
		if(postStart < postEnd) return null;
		TreeNode node = new TreeNode(postOrder[postStart]);
		int i = 0;
		while(inOrder[inStart-i]!=postOrder[postStart]) i++;
		node.right = helper(postStart-1, postStart-i, inStart, postOrder, inOrder);
		node.left = helper(postStart-i-1, postEnd, inStart-i-1, postOrder, inOrder);
		return node;
	}
}
