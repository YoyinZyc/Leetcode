package main;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

/**
 * @author Cactus
 * @category TopLiked-Medium & String 
 * @version Create at: Sep 9, 2017 10:43:19 AM
 */
public class Pro583_Delete_Operation_for_Two_Strings {
	public int minDistance(String word1, String word2) {
		int maxSame = 0;
		int []loc = new int[word1.length()];
		for (int i = 0; i < loc.length; i++) {
			loc[i] = word2.length();
		}
		for (int i = 0; i < word1.length(); i++) {
			int j = 0;
			int k = 0;
			int max = 0;
			while(k < word1.length() && helper(loc, j, loc[k], word1.charAt(i), word2, i)) {
				j = loc[k]+1;
				max++;
				k++;
			}
			maxSame = Math.max(max, maxSame);
		}
		return maxSame;
	}
	
	private boolean helper(int loc[], int start, int end, char val, String word2, int index) {
		int i = start;
		while (i < end) {
			if(word2.charAt(i) == val) break;
			i++;
		}
		if(i != end) {
			loc[index] = i;
			return true;
		}else {
			return false;
		}
	}
}
