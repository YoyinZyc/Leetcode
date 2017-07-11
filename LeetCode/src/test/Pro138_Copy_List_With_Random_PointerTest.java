package test;

import static org.junit.Assert.*;
import main.Pro138_Copy_List_With_Random_Pointer;
import main.RandomListNode;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月11日 下午6:46:38
 * 
 */
public class Pro138_Copy_List_With_Random_PointerTest {
	Pro138_Copy_List_With_Random_Pointer test = new Pro138_Copy_List_With_Random_Pointer();
	@Test
	public void test() {
		RandomListNode head = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		head.next = node2;
		node2.next = node3;
		node2.random = head;
		node3.random = head;
		test.copyRandomList(head);
		
	}

}
