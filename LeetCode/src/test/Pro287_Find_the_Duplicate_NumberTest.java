package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro287_Find_the_Duplicate_Number;

/**
 * @author Cactus
 * @category
 * @version Create at: Sep 9, 2017 2:45:52 PM
 */
public class Pro287_Find_the_Duplicate_NumberTest {
	Pro287_Find_the_Duplicate_Number test = new Pro287_Find_the_Duplicate_Number();
	@Test
	public void test() {
		int nums[] = {1,2,2};
		test.findDuplicate(nums);
	}

}
