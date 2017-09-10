package main;

/**
 * @author Cactus
 * @category TwoPoints_Easy
 * @version Create at: Sep 9, 2017 7:22:04 PM
 */
public class Pro125_Valid_Palindrome {
	public boolean isPalindrome(String s) {
		if(s.length() <= 1) return true;
		s = s.toLowerCase();
		char[] cs = s.toCharArray();
		int i = 0;
		int j = cs.length-1;
		while(i < j) {
			while(i < j && !isAlphanumeric(cs[i])) i++;
			while(i < j && !isAlphanumeric(cs[j])) j--;
			if(cs[i] != cs[j] ) return false;
			i++;
			j--;
		}
		return true;
	}
	
	private boolean isAlphanumeric(char c) {
		
		return (c >= 'a' && c <= 'z') || (c >= '1' && c <= '9');
	}
}
