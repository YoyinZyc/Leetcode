package main.Array;

import java.util.Arrays;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月13日 下午8:53:40
 * 
 */
public class Pro31_Next_Permutation {
	public void nextPermutation(int[] nums) {
		int i = nums.length -1;
		for (; i > 0; i--) {
			if (nums[i-1] < nums[i]) {
				break;
			}
		}

		if(i == 0){
			Arrays.sort(nums);
			return;
		}

		int num = nums[i-1];
		int start = i;
		int end = nums.length-1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

		int index = i;
		while (nums[index] <= num) {
			index++;
		}
		nums[i-1] = nums[index];
		nums[index] = num;

	}
}
