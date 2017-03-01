package main.Array;

import java.util.Arrays;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro219_Contains_DuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums.length<=1) {
			return false;
		}
	int []nums2 = new int[nums.length];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = nums[i];
		}
		Arrays.sort(nums2);
		
		for (int i = 0; i < nums2.length-1; i++) {
			if (nums2[i] == nums2[i+1]) {
				int nearbyIndex = -1;
				for (int j = 0; j < nums2.length; j++) {
					if (nums[j] == nums2[i]) {
						if (nearbyIndex != -1) {
							if (j-nearbyIndex <= k) {
								return true;
							}else{
							    nearbyIndex = j;
							}
						}else{
							nearbyIndex = j;
						}
					}
				}
			}
		}
		
		return false;

		}
	}
//Set<Integer> set = new HashSet<Integer>();
//for(int i = 0; i < nums.length; i++){
//    if(i > k) set.remove(nums[i-k-1]);
//    if(!set.add(nums[i])) return true;
//}
//return false;
//		可以利用set的特性来解决，但是慢一些