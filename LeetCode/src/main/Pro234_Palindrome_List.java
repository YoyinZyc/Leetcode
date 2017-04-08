package main;
/**
 * @author Cactus
 * @category 
 * @version Create at: 2017年4月5日 下午1:02:07
 * 
 */
public class Pro234_Palindrome_List {
	ListNode end;
	public boolean isPalindrome(ListNode head) {
	    if((head == null) || (head.next == null)) return true;
		end = head;
		ListNode center = head;
		while((end.next!=null)&&(end.next.next != null)) {
			end = end.next.next;
			center = center.next;
		}
		center = center.next;
		if(end.next!=null) end = end.next;
		reverseList(center).next = null;
		while(end != null) {
			if (end.val != head.val) {
				return false;
			}
			head = head.next;
			end = end.next;
		}
		return true;
	}
	
	private ListNode reverseList(ListNode head) {
		if(head.next == null){
			end = head;
			return end;		
		}
		ListNode node = reverseList(head.next);
		node.next = head;
		return head;
	}
}
