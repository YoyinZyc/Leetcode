package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro377_Combination_Sum_IV;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 5:44:53 PM
 */
public class Pro377_Combination_Sum_IVTest {
	Pro377_Combination_Sum_IV test = new Pro377_Combination_Sum_IV();
	@Test
	public void test() {
		int nums[] = {1,2};
		int target = 10;
		test.combinationSum4(nums, target);
	}

}
