package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro189_Rotate_Array;

import org.junit.Test;

public class Pro189_Rotate_ArrayTest {
	
	Pro189_Rotate_Array test = new Pro189_Rotate_Array();
	@Test
	public void test() {
		int nums[] = {1,2,3,4,5,6,7};
		test.rotate(nums, 3);
	}

}
