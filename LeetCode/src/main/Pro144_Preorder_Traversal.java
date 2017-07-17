package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月17日 下午3:42:16
 * 
 */
public class Pro144_Preorder_Traversal {
//	Solution with Stack
//	public List<Integer> preorderTraversal(TreeNode root) {
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		List<Integer> list = new ArrayList<Integer>();
//		if(root == null) return list;
//		stack.push(root);
//		while(!stack.isEmpty()){
//			TreeNode node = stack.pop();
//			list.add(node.val);
//			if (node.right != null) {
//				stack.push(node.right);
//			}
//			if (node.left != null) {
//				stack.push(node.left);
//			}
//		}
//		return list;
//	}
	
//	Solution with traversal
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
		preOrder(root);
		return list;
	}
	
	
	private void preOrder(TreeNode node) {
		if (node == null) {
			return ;
		}
		list.add(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}
}
