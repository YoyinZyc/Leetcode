package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月9日 下午9:32:37
 * 
 */
public class Pro82_Remove_Duplicate_From_Sorted_ListII {
	public ListNode deleteDuplicates(ListNode head) {
		if((head == null) || (head.next == null)) return head;
		ListNode dummyHead = new ListNode(head.val+1);
		dummyHead.next = head;
		ListNode preDuplicate = dummyHead;
		while ((head != null) && (head.next != null)) {
			if (head.val == head.next.val) {
				while((head.next != null) && (head.next.val == head.val)) head = head.next;
				head = head.next;
				preDuplicate.next = head;
			}else{
				preDuplicate = head;
				head = head.next;
			}
		}
		return dummyHead.next;
	}
}
