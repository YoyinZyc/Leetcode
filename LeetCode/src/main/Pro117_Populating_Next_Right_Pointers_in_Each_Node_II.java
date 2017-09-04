package main;

/**
 * @author Cactus
 * @category DSP_Medium
 * @version Create at: Sep 4, 2017 9:52:20 AM
 */
public class Pro117_Populating_Next_Right_Pointers_in_Each_Node_II {
	public void connect(TreeLinkNode root) {
		if(root == null) return;
		TreeLinkNode next = root.next;
		if(root.left!=null && root.right!=null) {
			root.left.next = root.right;
			findNext(root.right, next);
		}else if (root.left != null && root.right == null) {
			findNext(root.left, next);
		}else if (root.left == null && root.right!=null) {
			findNext(root.right, next);
		}
		connect(root.right);
		connect(root.left);
		
	}
	private void findNext(TreeLinkNode node, TreeLinkNode lastNext) {
		while(lastNext != null) {
			if(lastNext.left != null) {
				node.next = lastNext.left;
				break;
			}else if (lastNext.right != null) {
				node.next = lastNext.right;
			}
			lastNext = lastNext.next;
		}
	}
	

}
