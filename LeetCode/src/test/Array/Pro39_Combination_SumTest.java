package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro39_Combination_Sum;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月3日 下午3:53:21
 * 
 */
public class Pro39_Combination_SumTest {
	
	Pro39_Combination_Sum test = new Pro39_Combination_Sum();
 	@Test
	public void test() {
 		int candidates[] = {2,3,6,7};
 		test.combinationSum(candidates, 7);
 	}

}
