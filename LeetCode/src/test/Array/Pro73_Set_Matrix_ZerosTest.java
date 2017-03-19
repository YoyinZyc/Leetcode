package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro73_Set_Matrix_Zeros;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月17日 下午8:38:16
 * 
 */
public class Pro73_Set_Matrix_ZerosTest {

	Pro73_Set_Matrix_Zeros test = new Pro73_Set_Matrix_Zeros();
	@Test
	public void test() {
		int nums[][] = {{1,2,3,4,5},{1,2,0,4,5},{1,0,3,0,5},{1,2,3,4,5}};
		test.setZeroes(nums);
	}

}
