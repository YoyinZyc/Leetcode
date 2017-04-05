package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月4日 下午5:22:49
 * 
 */
public class Pro206_Reverse_Linked_List {
	
	public ListNode end;
	public ListNode reverseList(ListNode head) {
	    if(head == null) return head;
		reverse(head).next = null;
		return end;
	}
	private ListNode reverse(ListNode head){
		if(head.next == null){
			end = head;
			return end;		
		}
		ListNode node = reverse(head.next);
		node.next = head;
		return head;
	
	}
}
