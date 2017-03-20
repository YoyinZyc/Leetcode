package test;

import static org.junit.Assert.*;
import main.Pro202_Happy_Number;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月20日 下午12:16:28
 * 
 */
public class Pro202_Happy_NumberTest {
	Pro202_Happy_Number test = new Pro202_Happy_Number();
	@Test
	public void test() {
		assertEquals(test.isHappy(4), false);
	}

}
