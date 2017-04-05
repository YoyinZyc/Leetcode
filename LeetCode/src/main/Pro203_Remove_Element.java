package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月4日 下午3:30:04
 * 
 */
public class Pro203_Remove_Element {
	public ListNode removeElements(ListNode head, int val) {
		ListNode node = new ListNode(val);
		node.next = head;
		ListNode temp = node;
		while((node!=null)&&(node.next != null)){
			if(node.next.val == val) {
				node.next = node.next.next;
				continue;
			}
			node = node.next;
		}
		return temp.next;
	}
}
