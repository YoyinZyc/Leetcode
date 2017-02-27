package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro35_Search_Insert_Position;

import org.junit.Test;

public class Pro35_Search_Insert_PositionTest {

	Pro35_Search_Insert_Position test = new Pro35_Search_Insert_Position();
	@Test
	public void test() {
		int[] nums = {1,3};
		assertEquals(2, test.searchInsert(nums, 4));
	}

}
