package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro46_Permulations;

/**
 * @author Cactus
 * @category TopLiked-Medium & Backtracking
 * @version Create at: Sep 9, 2017 12:25:17 PM
 */
public class Pro46_PermulationsTest {
	Pro46_Permulations test = new Pro46_Permulations();
	@Test
	public void test() {
		int []nums = {1,2};
		test.permute(nums);
	}

}
