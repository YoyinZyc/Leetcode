package test;

import static org.junit.Assert.*;
import main.ListNode;
import main.Pro234_Palindrome_List;

import org.junit.Test;

/**
 * @author Cactus
 * @category LinkedList-Easy
 * @version Create at: 2017年4月5日 下午1:21:58
 * 
 */
public class Pro234_Palindrome_ListTest {
	Pro234_Palindrome_List test = new Pro234_Palindrome_List();
	@Test
	public void test() {
		int []values = {1,2,3,3,2,1};
		ListNode node1 = new ListNode(values[0]);
		ListNode lastNode = node1;
		for (int i = 1; i < values.length; i++) {
			ListNode node = new ListNode(values[i]);
			lastNode.next = node;
			lastNode = node;
		}
		test.isPalindrome(node1);
	}

}
