package test;

import static org.junit.Assert.*;

import java.util.Locale;

import main.ListNode;
import main.Pro203_Remove_Element;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月4日 下午3:39:10
 * 
 */
public class Pro203_Remove_ElementTest {
	Pro203_Remove_Element test = new Pro203_Remove_Element();
	@Test
	public void test() {
		int []values = {1,2,6,3,4,5,6};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.removeElements(node1, 6);
	}

}
