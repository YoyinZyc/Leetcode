package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 2, 2017 6:04:12 PM
 */
public class Pro139_Word_Break {
	List<String> trueList = new ArrayList<String>();
	public boolean wordBreak(String s, List<String> wordDict) {
		if (trueList.contains(s)) {
			return true;
		}
		if(wordDict.contains(s)) {
			trueList.add(s);
			return true;
		}
		int i = 0;
		
		while(i < s.length()) {
			if (wordDict.contains(s.substring(0, i))) {
//				trueList.add(s.substring(0,i));
				if(wordBreak(s.substring(i), wordDict)) {
					trueList.add(s);
					return true;
				}
			}
			i++;
		}
		return false;
		
	}
}
