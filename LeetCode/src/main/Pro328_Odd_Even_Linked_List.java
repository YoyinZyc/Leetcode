package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月8日 下午5:26:41
 * 
 */
public class Pro328_Odd_Even_Linked_List {
	public ListNode oddEvenList(ListNode head) {
		if((head == null) || (head.next == null)) return head;
		ListNode oddHead = head;
		ListNode temp = head.next;
		ListNode evenHead = head.next;
		while(evenHead != null) {
			if (evenHead.next != null) {
				oddHead.next = evenHead.next;
				oddHead = oddHead.next;
				evenHead.next = oddHead.next;
				evenHead = evenHead.next;
			}else{
				break;
			}


		}
		oddHead.next = temp;
		return head;

	}
}
