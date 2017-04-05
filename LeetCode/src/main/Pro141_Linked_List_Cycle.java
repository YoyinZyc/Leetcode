package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月4日 下午1:20:50
 * 
 */
public class Pro141_Linked_List_Cycle {
	public boolean hasCycle(ListNode head) {
		ListNode tag = new ListNode(0);
        ListNode temp;
		while(true){
			if((head == null)||(head.next == null)) return false;
			if(head.next.equals(tag)) return true;
			temp = head;
			head = head.next;
			temp.next = tag;
		}
	}
}
