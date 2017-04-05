package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月4日 上午11:03:33
 * 
 */
public class Pro83_Remove_Duplicate_Form_Sorted_List {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return head;
		ListNode temp = head;
		while(temp.next!=null){
			if(temp.next.val == temp.val){
				temp.next = temp.next.next;
			}else{
				temp = temp.next;						
			}
		}
		return head;
	}
}
