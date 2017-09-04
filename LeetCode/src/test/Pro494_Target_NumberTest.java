package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro494_Target_Number;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 8:56:28 PM
 */
public class Pro494_Target_NumberTest {

	Pro494_Target_Number test = new Pro494_Target_Number();
	@Test
	public void test() {
		int[] nums = {1,1,1,1,1};
		int S = 3;
		test.findTargetSumWays(nums, S);
	}

}
