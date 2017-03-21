package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 下午2:08:08
 * 
 */
public class Pro438_Find_All_Anagrams {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> indexs = new ArrayList<Integer>();
		for (int i = 0; i < s.length()-p.length()+1; i++) {
			if(isAnagram(s.substring(i, i+p.length()),p)){
				indexs.add(i);
			}
		}
		return indexs;
	}
	private boolean isAnagram(String s, String p){
		int[] alphabet = new int[26];
		for(int i = 0; i < s.length();i++) alphabet[s.charAt(i)-'a']++;
		for(int i = 0; i < p.length();i++) alphabet[p.charAt(i)-'a']--;
		for(int i = 0; i < 26; i++){
			if(alphabet[i] != 0) return false;
		}
		return true;
	}
}
