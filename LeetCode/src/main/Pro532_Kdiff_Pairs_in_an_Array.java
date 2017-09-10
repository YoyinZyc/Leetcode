package main;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Cactus
 * @category TwoPoints_Easy
 * @version Create at: Sep 9, 2017 7:57:33 PM
 */
public class Pro532_Kdiff_Pairs_in_an_Array {
	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		int j = 1;
		int count = 0;
		while(j < nums.length) {
			if(nums[j]- nums[i] == k) {
				count++;
				int numi = nums[i];
				int numj = nums[j];
				while(j < nums.length && nums[j] == numj) j++;
				while(i < j && nums[i] == numi) i++;
				
			}else if (nums[j]-nums[i] < k) {
				int numj = nums[j];
				while(j < nums.length && nums[j] == numj) j++;
			}else {
				int numi = nums[i];
				while(i < j && nums[i] == numi) i++;
			}
			if(i == j) j++;
		}
		return count;
		
	}
}
