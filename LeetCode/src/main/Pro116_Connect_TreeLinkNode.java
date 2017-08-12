package main;
/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月4日 下午11:50:08
 * 
 */
public class Pro116_Connect_TreeLinkNode {
	public void connect(TreeLinkNode root) {
		if (root.left != null) {
			connect(root.left);
			connect(root.right);
		}
		TreeLinkNode left = root.left;
		TreeLinkNode right = root.right;
		while(left != null) {
			left.right = right;
			left = left.right;
			right = right.left;
		}
	}
	
	
}

class TreeLinkNode{
	TreeLinkNode left;
	TreeLinkNode right;
	TreeLinkNode next;
}