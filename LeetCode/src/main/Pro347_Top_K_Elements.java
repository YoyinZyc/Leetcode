package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category HashTable-Medium
 * @version Create at: 2017年4月3日 下午6:11:24
 * 
 */
public class Pro347_Top_K_Elements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		String[] ints = new String[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			while((i < nums.length-1) && (nums[i+1] == nums[i])){
				count++;
				i++;
			}
			if(ints[count] != null) {
				ints[count]+=("/"+nums[i]);
			}else {
				ints[count] = nums[i]+"";
			}
		}
		
		int i = nums.length;
		while((i > 0) && (k > 0)) {
			if(ints[i] != null){
				String[] intsAtLength = ints[i].split("/");
				int j = 0;
				while((k>0) && (j < intsAtLength.length)) {
					list.add(Integer.parseInt(intsAtLength[j]));
					j++;
					k--;
				}
			}
			i--;
		}
		
		return list;
	}
}
