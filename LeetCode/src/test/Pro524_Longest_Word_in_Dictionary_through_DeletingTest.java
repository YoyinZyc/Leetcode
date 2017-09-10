package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.Pro524_Longest_Word_in_Dictionary_through_Deleting;

/**
 * @author Cactus
 * @category TwoPoints_Medium
 * @version Create at: Sep 10, 2017 1:57:12 PM
 */
public class Pro524_Longest_Word_in_Dictionary_through_DeletingTest {
	Pro524_Longest_Word_in_Dictionary_through_Deleting test = new Pro524_Longest_Word_in_Dictionary_through_Deleting();
	@Test
	public void test() {
		String s = "abpcplea";
		List<String> d = new ArrayList<String>();
		d.add("ale");
		d.add("apple");
		d.add("monkey");
		d.add("plea");
		d.add("ekymon");
		test.findLongestWord(s, d);
	}

}
