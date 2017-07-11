package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月11日 下午11:32:38
 * 
 */
public class Pro86_Partition_List {
	public ListNode partition(ListNode head, int x) {
		ListNode lessNode = new ListNode(0);
		ListNode greaterNode = new ListNode(0);	
		ListNode tailLessNode = lessNode;
		ListNode tailGreaterNode = greaterNode;
		ListNode point1 = head;

		while(point1 != null) {
			if (point1.val < x) {
				tailLessNode.next = point1;
				tailLessNode = tailLessNode.next;
			}else {
				tailGreaterNode.next = point1;
				tailGreaterNode = tailGreaterNode.next;
			}
			point1 = point1.next;
		}
		tailLessNode.next = greaterNode.next;
		tailGreaterNode.next = null;
		return lessNode.next;
	}
}
