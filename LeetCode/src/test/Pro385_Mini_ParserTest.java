package test;

import static org.junit.Assert.*;
import main.Pro385_Mini_Parser;

import org.junit.Test;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月18日 下午2:52:40
 * 
 */
public class Pro385_Mini_ParserTest {

	Pro385_Mini_Parser test = new Pro385_Mini_Parser();
	@Test
	public void test() {
		test.deserialize("[123,456,[788,799,833],[[]],10,[]]");
	}

}
