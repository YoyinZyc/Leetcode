package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro448_All_Num_Disappeared;

import org.junit.Test;

public class Pro448_All_Num_DisappearedTest {
	
	Pro448_All_Num_Disappeared test = new Pro448_All_Num_Disappeared();
	@Test
	public void test() {
		int nums[] = {4,3,2,7,8,2,3,1};
		test.findDisappearedNumbers(nums);
	}

}
