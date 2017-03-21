package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 上午11:19:29
 * 
 */
public class Pro389_Find_the_Difference {
	public char findTheDifference(String s, String t) {
		char[] strs1 = s.toCharArray();
		char[] strs2 = t.toCharArray();
		Arrays.sort(strs1);
		Arrays.sort(strs2);
		
		int i = 0;
		while(i < strs1.length){
			if (strs2[i] != strs1[i]) {
				return strs2[i];
			}
			i++;
		}
		return strs2[i];
	}
}
