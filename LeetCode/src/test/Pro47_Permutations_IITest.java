package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro47_Permutations_II;

/**
 * @author Cactus
 * @category Backtracking_Medium
 * @version Create at: Sep 11, 2017 11:41:21 AM
 */
public class Pro47_Permutations_IITest {
	Pro47_Permutations_II test = new Pro47_Permutations_II();
	@Test
	public void test() {
		int nums[] = {1,1,2};
		test.permuteUnique(nums);
	}

}
