package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro92_Reverse_Linked_ListII;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月9日 下午9:14:26
 * 
 */
public class Pro92_Reverse_Linked_ListIITest {
	
	Pro92_Reverse_Linked_ListII test = new Pro92_Reverse_Linked_ListII();
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
		test.reverseBetween(node1, 2, 3);
	}

}
