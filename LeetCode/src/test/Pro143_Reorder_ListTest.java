package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro143_Reorder_List;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月8日 下午8:08:52
 * 
 */
public class Pro143_Reorder_ListTest {
	Pro143_Reorder_List test = new Pro143_Reorder_List();
	@Test
	public void test() {
		int []values = {1,2,3,4,5,6};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.reorderList(node1);
	}

}
