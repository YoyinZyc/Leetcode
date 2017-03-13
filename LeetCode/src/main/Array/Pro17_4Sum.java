package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月13日 下午7:58:29
 * 
 */
public class Pro17_4Sum {
	

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		int i = 0;
		Arrays.sort(nums);
		while(i < nums.length-3){
			if ((i == 0) || (nums[i-1] != nums[i])) {
				int j = i+1;
				while (j < nums.length-2) {
					if ((j == i+1) || (nums[j-1] != nums[j])) {
						int startIndex = j+1;
						int endIndex = nums.length-1;
						
						while(startIndex < endIndex) {
							int fourSum = nums[i]+nums[j]+nums[startIndex]+nums[endIndex];
							if (fourSum == target) {
								List<Integer> list = new ArrayList<Integer>();
								list.add(nums[i]);
								list.add(nums[j]);
								list.add(nums[startIndex]);
								list.add(nums[endIndex]);
								ret.add(list);
								while ((startIndex<endIndex) && (nums[startIndex] == nums[startIndex+1]) ){
									startIndex++;
								}
								while((startIndex<endIndex) && nums[endIndex] == nums[endIndex-1]){
									endIndex--;
								}
								startIndex++;
								endIndex--;
							}else if (fourSum < target) {
								startIndex++;
							}else{
								endIndex--;
							}
							
						}
					}
					j++;
					
				}
			}
			i++;
		}
		return ret;
		
	}
}
