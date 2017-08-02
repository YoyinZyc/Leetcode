package main;

import java.util.Stack;

/**
 * @author Cactus
 * @version Create at: 2017年8月2日 下午5:47:47
 * 
 */
public class Pro114_Flatten_BT_To_LinkedList {
	public void flatten(TreeNode root) {
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		helper(root, nodes);
	}
	
	private TreeNode helper(TreeNode node, Stack<TreeNode> nodes) {
		if (node == null) {
			return null;
		}
		if (node.left == null && node.right == null) {
			nodes.push(node);
			return node;
		}
		TreeNode rightNode = helper(node.right,nodes);
		TreeNode leftNode = helper(node.left,nodes);
		
		if (leftNode == null) {
			node.right = rightNode;
			node.left = null;
			return node;
		}else if (rightNode == null) {
			node.right = leftNode;
			node.left = null;
			return node;
		}else {
			node.right = leftNode;
			nodes.pop().right = rightNode;
			node.left = null;
			return node;
		}
	}
}
