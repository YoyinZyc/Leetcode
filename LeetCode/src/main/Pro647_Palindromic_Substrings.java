package main;

import java.util.function.IntPredicate;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 2, 2017 3:36:26 PM
 */
public class Pro647_Palindromic_Substrings {
	public int countSubstrings(String s) {
		int sum = 1;
		int i = 1;
		while(i < s.length() ) {
			int j = 1;
			sum++;
			while (i-j>=0 && i+j<s.length()) {
				if(s.charAt(i-j) != s.charAt(i+j)) break;
				sum++;
				j++;
			}
			if(s.charAt(i) == s.charAt(i-1)) {
				sum++;
				j = 1;
				while (i-1-j>=0 && i+j<s.length()) {
					if(s.charAt(i-j-1) != s.charAt(i+j)) break;
					sum++;
					j++;
				}
			}
			i++;
		}
		return sum;
	}
}
