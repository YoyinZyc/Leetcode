package test;

import static org.junit.Assert.*;
import main.Pro454_4Sum_II;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年4月3日 下午8:56:10
 * 
 */
public class Pro454_4Sum_IITest {
	Pro454_4Sum_II test = new Pro454_4Sum_II();
	@Test
	public void test() {
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		test.fourSumCount(A, B, C, D);
	}

}
