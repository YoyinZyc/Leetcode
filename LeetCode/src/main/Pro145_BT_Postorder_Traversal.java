package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Cactus
 * @category Tree-Hard
 * @version Create at: 2017年8月5日 下午4:36:59
 * 
 */
public class Pro145_BT_Postorder_Traversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		Stack<TreeNode> splitNodes = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		nodes.push(root);
		while (!nodes.isEmpty()) {
			TreeNode node = nodes.peek();
			if (node == null) {
				nodes.pop();
				continue;
			}
			if (splitNodes.isEmpty() || splitNodes.peek() != node) {
				nodes.push(node.right);
				nodes.push(node.left);
				splitNodes.push(node);
			}else {
				list.add(nodes.pop().val);
				splitNodes.pop();
			}
		}
		return list;

	}
}
