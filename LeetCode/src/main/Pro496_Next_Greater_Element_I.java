package main;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Easy
 * @version Create at: 2017年7月15日 下午5:19:56
 * 
 */
public class Pro496_Next_Greater_Element_I {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
//		ArrayList<Integer> findList = new ArrayList<Integer>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] ret = new int[findNums.length];
		for (int i = 0; i < findNums.length; i++) {
			index.add(i);			
			ret[i] = -1;
		}
		
		for (int i = nums.length-1; i >= 0; i--) {
			for (int j = 0; j < index.size(); j++) {
				if (findNums[index.get(j)] == nums[i]) {
					index.remove(index.get(j));
					j--;
				}else if (findNums[index.get(j)] < nums[i]) {
					ret[index.get(j)] = nums[i];
				}
			}
		}
		return ret;
		
	}
}
