package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月9日 下午8:50:12
 * 
 */
public class Pro92_Reverse_Linked_ListII {
	ListNode nthNode;
	ListNode afterReverse;
	int n;
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m == n) return head;
		this.n = n;
		ListNode beforeReverse = head;
		int count = 1;
		while(count < m-1) {
			beforeReverse = beforeReverse.next;
			count++;
		}
		if (m == 1) {
			reverse(beforeReverse, m).next = afterReverse;
			return nthNode;
		}
		
		reverse(beforeReverse.next, m).next = afterReverse;
		beforeReverse.next = nthNode;
		return head;
		
	}
	private ListNode reverse(ListNode head, int count) {
		if (count == n) {
			nthNode = head;
			afterReverse = nthNode.next;
		}else {
			reverse(head.next, ++count).next = head;
		}
		return head;
	}
}
