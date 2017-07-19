package test;

import static org.junit.Assert.*;
import main.Pro394_Decode_String;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年7月18日 下午8:14:15
 * 
 */
public class Pro394_Decode_StringTest {
	Pro394_Decode_String test = new Pro394_Decode_String();
	@Test
	public void test() {
		test.decodeString("3[a]2[bc]");
	}

}
