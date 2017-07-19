package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Cactus
 * @category Stack-Medium
 * @version Create at: 2017年7月18日 下午11:52:08
 * 
 */
public class Pro503_Next_Greater_Element_II {
	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();
        int[] ret = new int[nums.length];
		int i = 0;
        int k = 0;
        while(k < 2) {
		while(i < nums.length) {
            if(k == 0) ret[i] = -1;
			while((!stack.isEmpty())&&(nums[i] > nums[stack.peek()])){
                ret[stack.pop()] = nums[i];
			}
			stack.push(i);
			i++;
		}
            k++;
            i = 0;
        }
		return ret;
	}
}
