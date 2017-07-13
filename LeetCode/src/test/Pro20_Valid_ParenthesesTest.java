package test;

import static org.junit.Assert.*;
import main.Pro20_Valid_Parentheses;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月13日 下午10:45:06
 * 
 */
public class Pro20_Valid_ParenthesesTest {

	Pro20_Valid_Parentheses test = new Pro20_Valid_Parentheses();
	@Test
	public void test() {
		test.isValid("{}[]()");
	}

}
