package main;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月20日 下午1:18:43
 * 
 */
public class Pro205_Isomorphic_Strings {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		HashSet<Character> str1 = new HashSet<Character>();
		HashSet<Character> str2 = new HashSet<Character>();
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		int i = 0;
		while(i < s.length()) {
			boolean isAdd1 = str1.add(s.charAt(i));
			boolean isAdd2 = str2.add(t.charAt(i));
//			boolean temp = isAdd1^isAdd2;
			if ((isAdd1^isAdd2)) { //注意这里要用括套括号
				 return false;
			}
			
			if (!(isAdd1 && isAdd2)) {
				if (charMap.get(s.charAt(i)) != t.charAt(i)) return false;
			}else {
				charMap.put(s.charAt(i), t.charAt(i));
			}
			i++;
		}
		return false;
	}
}
