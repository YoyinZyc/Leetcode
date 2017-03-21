package test;

import static org.junit.Assert.*;
import main.Pro438_Find_All_Anagrams;

import org.junit.Test;

/**
 * @author Cactus
 * @version Create at: 2017年3月21日 下午2:55:25
 * 
 */
public class Pro438_Find_All_AnagramsTest {
	
	Pro438_Find_All_Anagrams test = new Pro438_Find_All_Anagrams();
	@Test
	public void test() {
		test.findAnagrams("cbaebabacd","abc");
	}

}
