package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年4月2日 下午6:18:29
 * 
 */
public class Pro274_H_Index {
	public int hIndex(int[] citations) {
		Arrays.sort(citations);
		int i = 0;
		while(i < citations.length) {
			if(citations[i] >= citations.length-i) break;
			i++;
		}
		return citations.length-i;
	}
}
