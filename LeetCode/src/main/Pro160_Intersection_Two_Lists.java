package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月5日 下午2:11:31
 * 
 */
public class Pro160_Intersection_Two_Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode a = headA;
		ListNode b = headB;
		int countA = 0;
		int countB = 0;
		while (a != null) {
			countA++;
			a = a.next;
		}
		while (b != null) {
			countB++;
			b = b.next;
		}

		while(countA > countB){
			headA = headA.next;
			countA--;
		}
		while(countB > countA) {
			headB = headB.next;
			countB--;
		}
		while(headA != null){
			if(headA == headB) return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;



	}
}
