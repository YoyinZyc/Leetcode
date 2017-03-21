package main;

import java.util.Arrays;

/**
 * @author Cactus
 * @category HashTable-Easy
 * @version Create at: 2017年3月21日 上午11:06:19
 * 
 */
public class Pro350_Intersection_Of_Two_Array {
	public int[] intersect(int[] nums1, int[] nums2) {
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
		return Arrays.copyOf(ret, k);
	}
}
