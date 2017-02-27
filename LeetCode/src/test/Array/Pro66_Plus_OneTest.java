package test.Array;

import static org.junit.Assert.*;
import main.Array.Pro66_Plus_One;

import org.junit.Test;

public class Pro66_Plus_OneTest {
	Pro66_Plus_One test = new Pro66_Plus_One();
	
	@Test
	public void test() {
		int digits[] = {9};
		int newDigits[] = {1,2,4};
		assertEquals(newDigits, test.plusOne(digits));
	}

}
