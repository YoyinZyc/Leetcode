package test;

import static org.junit.Assert.*;
import main.Pro14_Longest_Common_Prefix;

import org.junit.Test;

public class Pro14_Longest_Common_PrefixTest {
	
	Pro14_Longest_Common_Prefix p = new Pro14_Longest_Common_Prefix();
	@Test
	public void test1() {
		String[] strs = {"abc","aed"}; 
		assertEquals("a",p.longestCommonPrefix(strs));
	}
	
	@Test
	public void test2() {
		String[] strs = {"abc",""}; 
		assertEquals("",p.longestCommonPrefix(strs));
	}
	
	@Test
	public void test3() {
		String[] strs = {"abc"}; 
		assertEquals("abc",p.longestCommonPrefix(strs));
	}

}
