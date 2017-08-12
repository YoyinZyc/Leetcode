package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category Tree-Medium
 * @version Create at: 2017年8月4日 下午8:44:33
 * 
 */
public class Pro449_Serialize_Deserialize_BST {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null) {
			return "#";
		}
		return root.val+"("+serialize(root.left)+","
		+serialize(root.right)+")";
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		if(data.equals("#")) return null;
		System.out.println(data);
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		int i = -1;
		TreeNode rootNode = null;
		while(i < data.length()) {
			if (i==-1 || data.charAt(i) == '(' ) {
				i++;
				boolean isFirstNode = false;
				if (i == 0) {
					isFirstNode = true;
				}
				if (data.charAt(i) != '#') {
					int num = 0;
					while(data.charAt(i) >= '0' && data.charAt(i) <= '9') {
						num = num * 10 + data.charAt(i)-'0';
						i++;
					}
					System.out.println("num:"+num);
					TreeNode node = new TreeNode(num);
					if (isFirstNode) {
						nodes.push(node);
					}else {
						nodes.peek().left = node;
						nodes.push(node);
					}
				}else{
					i++;
					nodes.push(new TreeNode('#'));
				}
			}else if (data.charAt(i) == ',') {
				nodes.pop();
				i++;
				if (data.charAt(i) != '#') {
					int num = 0;
					while(data.charAt(i) >= '0' && data.charAt(i) <= '9') {
						num = num * 10 + data.charAt(i)-'0';
						i++;
					}
					System.out.println("num:"+num);
					TreeNode node = new TreeNode(num);

					nodes.peek().right = node;
					nodes.push(node);
				}else{
					i++;
					nodes.push(new TreeNode('#'));
				}
			}else if (data.charAt(i) == ')') {
				nodes.pop();
				i++;
			}
		}
		return nodes.peek();
	}
}

