package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category
 * @version Create at: Sep 2, 2017 9:08:30 PM
 */
public class Pro95_Unique_Binary_Search_Trees_II {
//	public static List<TreeNode> generateTrees(int n) {
//	    List<TreeNode>[] result = new List[n + 1];
//	    result[0] = new ArrayList<TreeNode>();
//	    if (n == 0) {
//	        return result[0];
//	    }
//
//	    result[0].add(null);
//	    for (int len = 1; len <= n; len++) {
//	        result[len] = new ArrayList<TreeNode>();
//	        for (int j = 0; j < len; j++) {
//	            for (TreeNode nodeL : result[j]) {
//	                for (TreeNode nodeR : result[len - j - 1]) {
//	                    TreeNode node = new TreeNode(j + 1);
//	                    node.left = nodeL;
//	                    node.right = clone(nodeR, j + 1);
//	                    result[len].add(node);
//	                }
//	            }
//	        }
//	    }
//	    return result[n];
//	}
//
//	private static TreeNode clone(TreeNode n, int offset) {
//	    if (n == null) {
//	        return null;
//	    }
//	    TreeNode node = new TreeNode(n.val + offset);
//	    node.left = clone(n.left, offset);
//	    node.right = clone(n.right, offset);
//	    return node;
//	}
//	public List<TreeNode> generateTrees(int n) {
//		List<List<TreeNode>> lists = new ArrayList<List<TreeNode>>();
//		lists.add(null);
//
//		TreeNode one = new TreeNode(1);
//		List<TreeNode> listOne = new ArrayList<TreeNode>();
//		listOne.add(one);
//		lists.add(listOne);
//
//		int i = 2;
//		while(i <= n) {
//			int j = 1;
//			while(j <= n) {
//				List<TreeNode> nodes = new ArrayList<TreeNode>();
//				List<TreeNode> copyNodes = new ArrayList<TreeNode>();
//				if (j != 1) {
//					for (int k = 0; k < lists.get(j-1).size(); k++) {
//						TreeNode node = new TreeNode(j);
//						node.left = lists.get(j-1).get(k);
//						nodes.add(node);
//					}
//				}
//				if (j != n) {
//					for (int k = 0; k < lists.get(i-j).size(); k++) {
//						TreeNode right = formatTree(lists.get(i-j).get(k), j);
//						for (int k2 = 0; k2 < nodes.size(); k2++) {
//							TreeNode copyNode = new TreeNode(j);
//							copyNode.left = nodes
//						}
//					}
//				}
//			}
//		}
//
//	}
//
//	private TreeNode formatTree(TreeNode format,int differ) {
//		if (format == null) {
//			return null;
//		}
//		TreeNode node = new TreeNode(format.val + differ);
//		node.left = formatTree(format.left, differ);
//		node.right = formatTree(format.right, differ);
//		return node;
//	}
}
