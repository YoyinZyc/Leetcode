package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月20日 下午7:18:23
 * 
 */
public class Pro242_Valid_Anagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] str1 = s.toCharArray();
		char[] str2 = t.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		int i = 0;
		while (i < s.length()) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;
	}
}
