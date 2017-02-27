package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro167_Two_SumII;

import org.junit.Test;

public class Pro167_Two_SumIITest {
	Pro167_Two_SumII test = new Pro167_Two_SumII();
	@Test
	public void test() {
		int []nums = {1,2,3,4,4,9,56,90};
				
		int []twoIndexs = {4,5};
		assertEquals(twoIndexs[0], test.twoSum(nums, 8)[0]);
		assertEquals(twoIndexs[1], test.twoSum(nums, 8)[1]);
	}

}
