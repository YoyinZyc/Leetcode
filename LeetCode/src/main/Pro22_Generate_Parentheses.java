package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cactus
 * @category TopLiked-Medium & String
 * @version Create at: Sep 8, 2017 2:51:23 PM
 */
public class Pro22_Generate_Parentheses {
	public List<String> generateParenthesis(int n) {
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list.add("()");
		int i = 1;
		while (i < n) {
			for (int j = 0; j < list.size(); j++) {
				for (int j2 = 0; j2 <= list.get(j).length(); j2++) {
					String newS = list.get(j).substring(0, j2) + "()" + list.get(j).substring(j2);
					if(!list2.contains(newS)) list.add(newS);
				}
			}
			List<String> temp = list;
			list = list2;
			temp.clear();
			list2 = temp;
			i++;
		}
		return list;
	}
}
