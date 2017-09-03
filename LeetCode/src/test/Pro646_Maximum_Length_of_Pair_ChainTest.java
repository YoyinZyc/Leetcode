package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro646_Maximum_Length_of_Pair_Chain;

/**
 * @author Cactus
 * @category
 * @version Create at: Sep 2, 2017 4:57:35 PM
 */
public class Pro646_Maximum_Length_of_Pair_ChainTest {
	
	Pro646_Maximum_Length_of_Pair_Chain test = new Pro646_Maximum_Length_of_Pair_Chain();
	@Test
	public void test() {
		int[][] a = {{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};
		test.findLongestChain(a);
	}

}
