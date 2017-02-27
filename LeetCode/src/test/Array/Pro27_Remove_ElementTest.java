package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro27_Remove_Element;

import org.junit.Test;

public class Pro27_Remove_ElementTest {
	
	Pro27_Remove_Element test = new Pro27_Remove_Element();
	@Test
	public void test() {
		int[] nums = {3,2,2,3};
		assertEquals(2, test.removeElement(nums, 3));
	}

}
