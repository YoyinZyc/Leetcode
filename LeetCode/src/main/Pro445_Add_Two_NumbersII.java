package main;

import java.util.Stack;

/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月8日 下午3:36:56
 * 
 */
public class Pro445_Add_Two_NumbersII {
	ListNode centerNode;
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if ((l1 == null)||(l2==null)) return null;
		int length1 = 0,length2 = 0;
        ListNode node1 = l1;
		ListNode node2 = l2;
		while(node1!= null) {
			length1++;
			node1 = node1.next;
		}
		while(node2!= null) {
			length2++;
			node2 = node2.next;
		}
		if (length1 == length2) {
			ListNode head = new ListNode(1);
			int ret = add(head, l1, l2);
			if (ret == 0) return head.next;
			if (ret == 1) return head;
		}else if (length1 > length2) {
			ListNode head = l1;
			while(length1 > length2+1){
				l1 = l1.next;
				length1--;
			}
			centerNode = l1;
			int ret = add(l1, l1.next, l2);
			if (ret == 0) return head;
			if (ret == 1){
				if(addOne(head) == 1){
					ListNode node = new ListNode(1);
					node.next = head;
					return node;
				}else{
					return head;
				}
			}
		}else{
			ListNode head = l2;
			while(length2 > length1+1){
				l2 = l2.next;
				length2--;
			}
			centerNode = l2;
			int ret = add(l2, l2.next, l1);
			if (ret == 0) return head;
			if (ret == 1){
				if(addOne(head) == 1){
					ListNode node = new ListNode(1);
					node.next = head;
					return node;
				}else{
					return head;
				}
			}
		}
		return null;
		
	}
	private int add(ListNode head, ListNode l1,ListNode l2) {
		ListNode next = new ListNode(l1.val+l2.val);
		head.next = next;
		if (l1.next == null) {
			int ret = next.val >= 10 ? 1:0;
			next.val = ret == 1?next.val-10:next.val;
			return ret;
		}
		int carry = add(next, l1.next, l2.next);
		int ret = next.val + carry >= 10? 1 : 0;
		next.val = next.val+carry-ret*10;
		return ret;
	}
	
	private int addOne(ListNode node){
		if (node == centerNode) {
			int ret = centerNode.val + 1 >= 10?1:0; 
			centerNode.val = centerNode.val +1 - ret*10;
			return ret;
		}
		int carry = addOne(node.next);
		int ret = node.val + carry >= 10 ? 1:0;
		node.val = node.val + carry - ret*10;
		return ret;
	}
}
