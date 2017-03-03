package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro209_Minimum_Size_Subarray_Sum;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月3日 下午5:21:35
 * 
 */
public class Pro209_Minimum_Size_Subarray_SumTest {
	Pro209_Minimum_Size_Subarray_Sum test = new Pro209_Minimum_Size_Subarray_Sum();
	@Test
	public void test() {
		int []nums = {2,3,1,2,4,3};
		assertEquals(2, test.minSubArrayLen(7, nums));
	}

}
