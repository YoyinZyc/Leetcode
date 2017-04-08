package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月8日 下午7:42:48
 * 
 */
public class Pro143_Reorder_List {
	ListNode end;
	public void reorderList(ListNode head) {
		if((head == null) || (head.next == null)) return;
		ListNode headNode = head;
		ListNode centerNode = head;
		ListNode endNode = head;
		while((endNode!=null) && (endNode.next !=null)) {
			centerNode = centerNode.next;
			endNode = endNode.next.next;
		}
		reverse(centerNode).next = null;
		while((headNode!=null) && (headNode.next != null) && (end != null)){
			ListNode leftNode = headNode;
			ListNode rightNode = end;
			headNode = headNode.next;
			end = end.next;
			leftNode.next = rightNode;
			if (rightNode.next != null) {
				rightNode.next = headNode;
			}
		}
	}
	private ListNode reverse(ListNode node){
		if (node.next != null) {
			reverse(node.next).next = node;	
		}else {
			end = node;
		}
		return node;
	}
}
