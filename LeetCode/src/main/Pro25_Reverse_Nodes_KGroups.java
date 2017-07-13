package main;
/**
 * @author Cactus
 * @category LinkedList-Hard
 * @version Create at: 2017年7月13日 下午2:19:39
 * 
 */
public class Pro25_Reverse_Nodes_KGroups {
	ListNode beforeNewHead = new ListNode(0);
	ListNode groupTail = beforeNewHead;
	ListNode groupHead;
	int findNewHeadIndex = 0;
	int count = 1;
	int k = 0;
	public ListNode reverseKGroup(ListNode head, int k) {
		this.k = k;
		if ((k ==0) || (head == null)) {
			return head;
		}
		
		groupHead = head;
		beforeNewHead.next = head;
		while(groupHead != null) {
			ListNode afterReverse = reverse(groupHead);
			if (afterReverse == null) {
				groupTail.next = groupHead;
				break;
			}else {
				groupTail = afterReverse;
				afterReverse.next = null;
			}
		}
		
		return beforeNewHead.next;
	}
	
	private ListNode reverse(ListNode node) {
		if (count == k) {
			if (findNewHeadIndex == 0) {
				beforeNewHead.next = node;
				findNewHeadIndex = 1;
			}else {
				groupTail.next = node;
			}
			groupHead = node.next;
			count = 1;
		}else {
			if (node.next == null) {
				return null;
			}
			count++;
			ListNode afterReverse = reverse(node.next);
			if(afterReverse != null){
				afterReverse.next = node;
			}else{
				return null;
			}
		}
		return node;
	}
}
