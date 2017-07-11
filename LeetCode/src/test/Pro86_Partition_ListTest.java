package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro86_Partition_List;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月11日 下午2:34:23
 * 
 */
public class Pro86_Partition_ListTest {
	Pro86_Partition_List test = new Pro86_Partition_List();
	@Test
	public void test() {
		int []values = {2,1};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.partition(node1, 2);
	}

}
