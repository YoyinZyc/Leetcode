package main;
/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月4日 上午10:30:58
 * 
 */
public class Pro21_Merge_Two_Sorted_List {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode node;
		if(l1 == null){
			if(l2 != null) return l2;
			return null;
		}else if(l2 == null){
			return l1;
		}

		if(l1.val < l2.val){
			node = new ListNode(l1.val);
			l1 = l1.next;
		}else{
			node = new ListNode(l2.val);
			l2 = l2.next;
		}
		ListNode temp = node;

		while((l1 != null) && (l2 != null)){
			if (l1.val < l2.val) {
				temp.next = new ListNode(l1.val);
				l1 = l1.next;
			}else{
				temp.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if((l1 == null) && (l2!=null)) temp.next = l2;
		if((l1 != null) && (l2 == null)) temp.next = l1;
		return node;
	}
}
