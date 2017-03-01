package main.Array;

import java.util.Arrays;
/**
 * 
 * @author Cactus
 * @category Array-Easy
 * 
 */
public class Pro88_Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		for (int i = m; i < m+n; i++) {
			nums1[i] = nums2[i-m];
		}
		
		Arrays.sort(nums1);
		
		int length = nums1.length;
		for (int i = 0; i < (m+n); i++) {
			nums1[i] = nums1[length-m-n+i];
		}
		for (int i = (m+n); i < nums1.length; i++) {
			nums1[i] = 0;
		}
	}
}

//可以考虑从后向前

