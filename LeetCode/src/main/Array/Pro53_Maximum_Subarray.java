package main.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;


public class Pro53_Maximum_Subarray {
	
	
	
	public int maxSubArray(int[] nums) {
		
		if(nums.length == 0){
			return Integer.MIN_VALUE;
		}
		
		if (nums.length == 1) {
			return nums[0];
		}
		
		int max = nums[0];
		
		
		int sum = 0;
		HashMap<Integer, Integer> sumMap = new HashMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
				sum = sum + nums[i];
				max = sum > max? sum : max;
				System.out.println("i:"+i+"   sum:"+sum);
				sumMap.put(i, sum);
		}
		
		System.out.println(max);
		Iterator<HashMap.Entry<Integer, Integer>> iterator = sumMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() == max) {
				sum = 0;
				for (int i = entry.getKey(); i >= 0; i--) {
					sum = sum + nums[i];
					
					max = sum > max? sum : max;
				}
			}
		}
		return max;
				
		
	}
	
}
