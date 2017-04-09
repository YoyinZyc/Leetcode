package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro82_Remove_Duplicate_From_Sorted_ListII;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月9日 下午9:52:29
 * 
 */
public class Pro82_Remove_Duplicate_From_Sorted_ListIITest {
	Pro82_Remove_Duplicate_From_Sorted_ListII test = new Pro82_Remove_Duplicate_From_Sorted_ListII();
	@Test
	public void test() {
		int []values = {1,2};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
		}
		test.deleteDuplicates(node1);
	}

}
