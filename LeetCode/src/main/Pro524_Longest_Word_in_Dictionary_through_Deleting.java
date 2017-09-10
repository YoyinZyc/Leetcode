package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Cactus
 * @category TwoPoints_Medium
 * @version Create at: Sep 10, 2017 12:01:35 PM
 */
public class Pro524_Longest_Word_in_Dictionary_through_Deleting {
	public String findLongestWord(String s, List<String> d) {
		if(d.size() == 0) return "";
		Collections.sort(d);
		Collections.sort(d, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o2.length()-o1.length();
				}
			}

		});
		char[] cs = s.toCharArray();
		for (int i = 0; i < d.size(); i++) {
			char[] cd = d.get(i).toCharArray();
			if (cd.length <= cs.length) {
				int k = 0;
				int j = 0;
				while(k < cs.length) {
					if(cs[k] == cd[j]) j++;
					if(j == cd.length) return d.get(i);
					k++;
				}

			}

		}
		return "";
	}
}
