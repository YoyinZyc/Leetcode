package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月19日 下午2:44:14
 * 
 */
public class Pro173_BSTInterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();
	public Pro173_BSTInterator(TreeNode root) {
		// TODO Auto-generated constructor stub
		if(root != null) 
			stack.push(root);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		}
		TreeNode node = stack.pop();
		
		while(node != null) {
			TreeNode left = node.left;
			node.left = null;
			stack.push(node);
			node = left;
		}

		if (stack.peek().right != null) {
			node = stack.pop();
			stack.push(node.right);
			stack.push(node);
		}
		return true;
	}

	/** @return the next smallest number */
	public int next() {
		return stack.pop().val;
	}
}
