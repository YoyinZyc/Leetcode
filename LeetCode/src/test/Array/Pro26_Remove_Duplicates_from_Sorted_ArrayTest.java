package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro26_Remove_Duplicates_from_Sorted_Array;

import org.junit.Test;

public class Pro26_Remove_Duplicates_from_Sorted_ArrayTest {
	Pro26_Remove_Duplicates_from_Sorted_Array p = new Pro26_Remove_Duplicates_from_Sorted_Array();
	@Test
	public void test1() {
		int[] nums = {1,1,2};
		assertEquals(2, p.removeDuplicates(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = {1,1,2};
		assertEquals(2, p.removeDuplicates(nums));
	}

}
