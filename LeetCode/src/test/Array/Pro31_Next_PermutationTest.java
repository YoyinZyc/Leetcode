package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro31_Next_Permutation;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月13日 下午9:24:50
 * 
 */
public class Pro31_Next_PermutationTest {
	
	Pro31_Next_Permutation test = new Pro31_Next_Permutation();
	@Test
	public void test() {
		int []nums = {1,5,1};
		test.nextPermutation(nums);
	}

}
