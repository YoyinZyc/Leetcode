package test;

import static org.junit.Assert.*;

import java.awt.Label;

import main.ListNode;
import main.Pro141_Linked_List_Cycle;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月4日 下午1:52:47
 * 
 */
public class Pro141_Linked_List_CycleTest {
	Pro141_Linked_List_Cycle test = new Pro141_Linked_List_Cycle();
	@Test
	public void test() {
		ListNode node = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		node.next = node2;
		node2.next = node3;
		node3.next = node2;
		test.hasCycle(node);
	}

}
