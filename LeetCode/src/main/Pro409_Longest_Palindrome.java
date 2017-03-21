package main;

import java.util.function.IntPredicate;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 下午1:43:47
 * 
 */
public class Pro409_Longest_Palindrome {
	public int longestPalindrome(String s) {
		int[] alphabetCount = new int[58];
		int i = 0;
		int length = 0;
		while(i < s.length()) {
			int loc = s.charAt(i) - 'A';
			alphabetCount[loc]++;
			if (alphabetCount[loc] == 2) {
				length+=2;
				alphabetCount[loc] = 0;
			}
			i++;
		}
		if (length < s.length()) {
			length++;
		}
		return length;
	}
}
