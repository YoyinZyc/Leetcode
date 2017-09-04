package main;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Cactus
 * @category DP_Medium
 * @version Create at: Sep 3, 2017 8:09:21 PM
 */
public class Pro494_Target_Number {
	public int findTargetSumWays(int[] nums, int S) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		int i = 1;
		map1.put(nums[0], 1);
		map1.put(0-nums[0], map1.getOrDefault(0-nums[0], 0) + 1);
		
		while (i < nums.length) {
			for (Iterator<Map.Entry<Integer, Integer>> iterator = map1.entrySet().iterator(); iterator.hasNext();) {
				Map.Entry<Integer, Integer> type = iterator.next();
				int k = type.getKey() + nums[i];
				map2.put(k, map2.getOrDefault(k, 0)+ type.getValue());
				k = type.getKey() - nums[i];
				map2.put(k, map2.getOrDefault(k, 0)+ type.getValue());
			}
			Map<Integer, Integer> temp = map1;
			map1.clear();
			map1 = map2;
			map2 = temp;
			i++;
		}
		return map1.getOrDefault(S, 0);
	}
}
