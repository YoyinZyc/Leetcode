package main;
/**
 * @author Cactus
 * @category LinkedList-Medium
 * @version Create at: 2017年4月11日 下午10:57:11
 * 
 */
public class Pro142_Linked_List_CycleII {
	public ListNode detectCycle(ListNode head) {
		if ((head == null) || (head.next == null)) return null;

		ListNode point1 = head;
		ListNode point2 = head;
		while ((point1!= null) && (point1.next != null)){
			point2 = point2.next;
			point1 = point1.next.next;
			if (point1 == point2) {
				while (head != point1) {
					point2 = point2.next;
					while(point2 != point1){
						if (point2 == head) return point2;
						point2 = point2.next;
					}
					head = head.next;
				}
				return head;
			}
		}
		return null;
	}
}
