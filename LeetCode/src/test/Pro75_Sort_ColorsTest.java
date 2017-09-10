package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro75_Sort_Colors;

/**
 * @author Cactus
 * @category
 * @version Create at: Sep 10, 2017 11:50:01 AM
 */
public class Pro75_Sort_ColorsTest {
	Pro75_Sort_Colors test = new Pro75_Sort_Colors();
	@Test
	public void test() {
		int[] nums = {2,1};
		test.sortColors(nums);
	}

}
