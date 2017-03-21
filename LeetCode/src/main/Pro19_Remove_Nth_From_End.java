package main;
/**
 * @author Cactus
 * @category TwoPoint-Medium
 * @version Create at: 2017年3月21日 下午8:14:43
 * 
 */
public class Pro19_Remove_Nth_From_End {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		 int i = 0;
			
			ListNode node = head;
			while (node!=null){ 
				i++;
				node = node.next;
			}
			
			int j = 0;
			node =head;
			if(i-n == 0) return head.next;
//	 		System.out.println(i);
			while(node!=null) {
				if (j == i-n-1) {
				 //   System.out.println(node.val);
				    if(node.next != null){
				        node.next = node.next.next;
					    return head;
				    }else{
				        return null;
				    }
				}
				j++;
				node = node.next;
			}
			return head;
	}
	
	
	
	
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
