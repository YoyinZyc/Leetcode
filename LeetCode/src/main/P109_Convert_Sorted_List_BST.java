package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.naming.NoPermissionException;

/**
 * @author Cactus
 * @category DFS_Medium
 * @version Create at: Sep 4, 2017 9:28:38 AM
 */
public class P109_Convert_Sorted_List_BST {
	public TreeNode sortedListToBST(ListNode head) {
		List<Integer> list = new ArrayList<Integer>();
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		return helper(list,0,list.size()-1);
	}
	private TreeNode helper(List<Integer> nums, int start, int end) {
		if(start > end) return null;
		int index = (start+end) /2;
		TreeNode node = new TreeNode(nums.get(index));
		node.left = helper(nums, start, index-1);
		node.right = helper(nums, index+1, end);
		return node;
	}
}
