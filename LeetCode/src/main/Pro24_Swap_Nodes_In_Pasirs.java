package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月9日 下午10:02:43
 * 
 */
public class Pro24_Swap_Nodes_In_Pasirs {
	public ListNode swapPairs(ListNode head) {
		if ((head == null) || (head.next == null)) return head;
		ListNode afterNext = head.next.next;
		ListNode next = head.next;
		head.next.next = head;
		head.next = swapPairs(afterNext);
		return next;
	}
}
