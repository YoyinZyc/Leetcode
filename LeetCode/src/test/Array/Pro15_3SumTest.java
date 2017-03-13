package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro15_3Sum;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月13日 下午1:33:46
 * 
 */
public class Pro15_3SumTest {
	Pro15_3Sum test = new Pro15_3Sum();
	@Test
	public void test() {
		int nums[] = {-2,-1,0,1,2,3};
		test.threeSum(nums);
	}

}
