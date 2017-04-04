package main;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年4月2日 下午7:04:47
 * 
 */
public class Pro451_Sort_Character_By_Frequency {
	public String frequencySort(String s) {
		String ret = "";
		char[] chars = s.toCharArray();
		String[] alphabets = new String[chars.length+1];
		Arrays.sort(chars);
		for (int i = 0; i < chars.length; i++) {
			int count = 1;
			int begin = i;
			while((i < chars.length-1) && (chars[i+1] == chars[i])) {
				i++;
				count++;
			}
			if(alphabets[count] != null){
				alphabets[count] += String.copyValueOf(chars, begin, count);	
			}else{
				alphabets[count] = String.copyValueOf(chars, begin, count);	
			}
			
		}
		int j = alphabets.length-1;
		while(j > 0) {
			if(alphabets[j] != null){
				ret+=alphabets[j];
			}
			j--;
		}
		return ret;
	}
}
