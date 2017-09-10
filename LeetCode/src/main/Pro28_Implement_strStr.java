package main;

/**
 * @author Cactus
 * @category TwoPoint_Easy
 * @version Create at: Sep 9, 2017 6:48:14 PM
 */
public class Pro28_Implement_strStr {
	public int strStr(String haystack, String needle) {
		if(needle.equals("")) return 0;
		if(haystack.equals("")) return -1;

		int i = 0;
		char[] cs1 = haystack.toCharArray();
		char[] cs2 = needle.toCharArray();
		while(i <= haystack.length()-needle.length()) {
			int j = 0;
			while(j < cs2.length && cs1[i+j] == cs2[j]) j++;
			if(j == cs2.length) return i;
			i++;
		}
		return -1;
	}
}

