package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月20日 下午8:41:11
 * 
 */
public class Pro349_Intesection_Two_Array {
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		if (nums1.length>nums2.length) {
			return calIntersect(nums2, nums1);
		}else{
			return calIntersect(nums1, nums2);
		}
	}
	
	private int[] calIntersect(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int ret[] = new int[nums1.length];
		while((i < nums1.length) && (j < nums2.length)) {
			if (nums1[i] == nums2[j]) {
				while((i+1 < nums1.length) && (nums1[i+1] == nums1[i])) i++;
				while((j+1 < nums2.length) && (nums2[j+1] == nums2[j])) j++;
				ret[k] = nums1[i];
				i++;
				j++;
				k++;
			}else if(nums1[i] < nums2[j]){
				i++;
			}else{
				j++;
			}
				
		}
		return Arrays.copyOf(ret, k+1);
	}
}
