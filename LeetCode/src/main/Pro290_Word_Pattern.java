package main;

import java.util.HashSet;

/**
 * @author Cactus
 * @category HashTable_Easy
 * @version Create at: 2017年3月20日 下午7:52:11
 * 
 */
public class Pro290_Word_Pattern {
	public boolean wordPattern(String pattern, String str) {
		String[] patterns = new String[26];
		String[] strs = str.split(" ");
		HashSet<String> strSet = new HashSet<String>();
		
		if (pattern.length() != strs.length) return false;	
		
		int i = 0;
		while(i < pattern.length()){
			int loc = pattern.charAt(i)-'a';
			boolean isAdd = strSet.add(strs[i]);
			boolean empty = patterns[loc] == null?true:false;
			if((isAdd^empty)){
				return false;
			}
			if(isAdd&&empty){
				patterns[loc] = strs[i];
			}else if(!patterns[loc].equals(strs[i])) return false;
			i++;
		}
		return true;
	}
}
