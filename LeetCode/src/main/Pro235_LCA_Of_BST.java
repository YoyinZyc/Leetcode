package main;

import java.util.HashSet;

/**
 * @author Cactus
 * @category Tree-Easy
 * @version Create at: 2017年7月24日 下午4:43:57
 * 
 */
public class Pro235_LCA_Of_BST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		HashSet<TreeNode> nodes = new HashSet<TreeNode>();
		TreeNode node = root;		
		while(node != p) {
			System.out.println(node.val);
			nodes.add(node);
			if (node.val < p.val) {
				node = node.right;
			}else {
				node = node.left;
			}
		}
		nodes.add(p);
		node = root;
		while(node != q) {
			System.out.println(node.val);

			if (node.val < q.val) {
				if (nodes.add(node.right)) {
					return node;
				}
				node = node.right;

			}else {
				if (nodes.add(node.left)) {
					return node;
				}
				node = node.left;
			}
		}
		return q;
	}

}
