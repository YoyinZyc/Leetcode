package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年7月11日 下午5:51:47
 * 
 */
public class Pro61_Rotate_List {
	public ListNode rotateRight(ListNode head, int k) {
		if ((head == null) || (head.next == null) || (k == 0)) {
			return head;
		}
		ListNode node1 = head;
		ListNode node2 = head;
		int length = 0;
		int newK = 0;
		int countK = k;
		while(k > 0){
			if (node1 == null) {
				node1 = head;
				newK = k % length;
				if (newK == 0) {
					return head;
				}
				while(newK > 0){
					node1 = node1.next;
					newK--;
				}
				break;
			}
			node1 = node1.next;
			countK--;
			length++;
		}


		while(node1.next != null){
			node1 = node1.next;
			node2 = node2.next;
		}
		node1.next = head;
		ListNode newHead = node2.next;
		node2.next = null;
		return newHead;


	}
}

