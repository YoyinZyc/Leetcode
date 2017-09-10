package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Cactus
 * @category TwoPoints_Medium
 * @version Create at: Sep 10, 2017 9:17:20 AM
 */
public class Pro567_Permutationin_String {
	public boolean checkInclusion(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		for (int i = 0; i < cs1.length; i++) {
			map.put(cs1[i], map.getOrDefault(cs1[i], 0)+1);
		}
		int count = 0;
		int j = 0;
		while(j < cs2.length && !map.containsKey(cs2[j])) j++;
		int i = j;
		
		while(j < cs2.length) {
			if(map.get(cs2[j]) != null && map.get(cs2[j]) > 0) {
				map.put(cs2[j], map.get(cs2[j])-1);
				
                count++;
			}else if(map.get(cs2[j]) != null &&map.get(cs2[j]) == 0){
				while(i < j && cs2[i] != cs2[j]) {
                    if(map.containsKey(cs2[i])){
				    map.put(cs2[i], map.get(cs2[i])+1);
                    count--;
                    }
					i++;
                    
				}
				i++;
			}else {			
				while(i < j) {
                    if(map.containsKey(cs2[i]))
					map.put(cs2[i], map.get(cs2[i])+1);
					i++;
				}
                count = 0;
			}
			j++;
            // System.out.println(j-i);
			if(count == cs1.length) return true;
		}
		return false;
	}
}
