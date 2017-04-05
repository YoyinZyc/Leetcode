package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro206_Reverse_Linked_List;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月4日 下午5:30:52
 * 
 */
public class Pro206_Reverse_Linked_ListTest {
	Pro206_Reverse_Linked_List test = new Pro206_Reverse_Linked_List();
	@Test
	public void test() {
		int []values = {1,2,3};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.reverseList(node1);
//		System.out.println(test.reverseList(node1).next.next.val);
	}

}
