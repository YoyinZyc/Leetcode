package main;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 下午6:36:14
 * 
 */
public class Pro500_Keyboard_Row {
	public String[] findWords(String[] words) {
		char[] firstLine = {'q','Q','w','W','e','E','r','R','t','T','y','Y','u','U','i','I','o','O','p','P'};
		char[] secondLine = {'a','A','s','S','d','D','f','F','g','G','h','H','j','J','k','K','l','L'};
		char[] thirdLine = {'z','Z','x','X','c','C','v','V','b','B','n','N','m','M'};
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < firstLine.length; i++) {
			map.put(firstLine[i], 1);
		}
		for (int i = 0; i < secondLine.length; i++) {
			map.put(secondLine[i], 2);
		}
		for (int i = 0; i < thirdLine.length; i++) {
			map.put(thirdLine[i], 3);
		}
		String[] ret = new String[words.length];
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			char[] wordSequence = words[i].toCharArray();
			int j = 0;
			for (; j < wordSequence.length-1; j++) {
				if (map.get(wordSequence[j+1]) != map.get(wordSequence[j])) {

					break;
				}
			}
			if(j == wordSequence.length-1){
				ret[count] = words[i];
				count++;
			}
		}
		return Arrays.copyOf(ret, count);
	}
}
