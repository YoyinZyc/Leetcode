package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro25_Reverse_Nodes_KGroups;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月13日 下午3:18:01
 * 
 */
public class Pro25_Reverse_Nodes_KGroupsTest {
	Pro25_Reverse_Nodes_KGroups test = new Pro25_Reverse_Nodes_KGroups();
	@Test
	public void test() {
		int []values = {1,2};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.reverseKGroup(node1, 3);
	}	

}
