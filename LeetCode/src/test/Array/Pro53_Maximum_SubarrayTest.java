package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro53_Maximum_Subarray;

import org.junit.Test;

public class Pro53_Maximum_SubarrayTest {
	
	Pro53_Maximum_Subarray test = new Pro53_Maximum_Subarray();
 	
	@Test
	public void test1() {
		int nums[] = {};
		assertEquals(Integer.MIN_VALUE, test.maxSubArray(nums));
	}
	
	@Test
	public void test2() {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		assertEquals(6, test.maxSubArray(nums));
	}
	
	@Test
	public void test3() {
		int nums[] = {-2,1};
		assertEquals(1, test.maxSubArray(nums));
	}
	
	@Test
	public void test4() {
		int nums[] = {-2,-1};
		assertEquals(-1, test.maxSubArray(nums));
	}

}
