package test;

import static org.junit.Assert.*;
import main.Pro290_Word_Pattern;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月20日 下午8:11:04
 * 
 */
public class Pro290_Word_PatternTest {
	Pro290_Word_Pattern test = new Pro290_Word_Pattern();
	@Test
	public void test() {
		assertEquals(true,test.wordPattern("abba", "dog cat cat dog"));
	}

}
