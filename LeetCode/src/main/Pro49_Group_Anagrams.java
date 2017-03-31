package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author Cactus
 * @category HashTable-Medium(Time Limit Exceeded)
 * @version Create at: 2017年3月22日 下午2:00:36
 * 
 */
public class Pro49_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> anagrams = new ArrayList<List<String>>();
		HashMap<Integer, ArrayList<String>> lengthMap = new HashMap<Integer,ArrayList<String>>();
		for (int i = 0; i < strs.length; i++) {
			if (lengthMap.get(strs[i].length()) == null) {
				ArrayList<String> list = new ArrayList<String>();
				list.add(strs[i]);
				lengthMap.put(strs[i].length(), list);
			}else{
				lengthMap.get(strs[i].length()).add(strs[i]);
			}
		}
		for (Iterator iterator = lengthMap.entrySet().iterator(); iterator.hasNext();) {
			ArrayList<String> list = ((Entry<Integer, ArrayList<String>>) iterator.next()).getValue();
			while(list.size()!=0){
				ArrayList<String> anagram = new ArrayList<String>();
				anagram.add(list.get(0));
				list.remove(list.get(0));
				for (Iterator iterator2 = list.iterator(); iterator2
						.hasNext();) {
					String string = (String) iterator2.next();
					if(isAnagram(string,anagram.get(0))) {
						iterator2.remove();
						anagram.add(string);
					}
				}
				anagrams.add(anagram);
			}
		}
		return anagrams;
	}
	
	private boolean isAnagram (String str1, String str2) {
		int []counts = new int[26];
		for (int i = 0; i < str1.length(); i++) counts[str1.charAt(i) - 'a']++;
		for (int i = 0; i < str2.length(); i++) counts[str2.charAt(i) - 'a']--;
		for (int i = 0; i < 26; i++) if (counts[i] != 0) return false;	
		return true;
	}
}
