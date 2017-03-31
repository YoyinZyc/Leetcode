package test;

import static org.junit.Assert.*;
import main.Pro525_Contiguous_Array;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月30日 下午3:45:56
 * 
 */
public class Pro525_Contiguous_ArrayTest {
	Pro525_Contiguous_Array test = new Pro525_Contiguous_Array();
	@Test
	public void test() {
		int []nums = {0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,1,1,0,0,0,1,1};
		test.findMaxLength(nums);
	}

}
