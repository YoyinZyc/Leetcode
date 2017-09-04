package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Pro221_Maximal_Square;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 1:26:04 PM
 */
public class Pro221_Maximal_SquareTest {
	Pro221_Maximal_Square test = new Pro221_Maximal_Square();
	@Test
	public void test() {
		char[][] matrix = {
			{'1','1','1','0','0'},
			{'1','1','1','0','0'},
			{'1','1','1','1','1'},
			{'0','1','1','1','1'},
			{'0','1','1','1','1'},
			{'0','1','1','1','1'}
//				{'1'}
		};
		test.maximalSquare(matrix);
		
	}

}
