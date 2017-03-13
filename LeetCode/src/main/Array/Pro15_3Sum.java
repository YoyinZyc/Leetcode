package main.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Cactus
 * @category Array-Medium
 * @version Create at: 2017年3月13日 上午11:58:37
 * 
 */
public class Pro15_3Sum {
	//	public List<List<Integer>> threeSum(int[] nums) {
	//		List<List<Integer>> ret = new ArrayList<List<Integer>>();
	//		
	//		Arrays.sort(nums);
	//		if((nums[0] > 0) || (nums[nums.length-1] < 0) || (nums.length < 3)){
	//			return ret;
	//		}
	//		
	//		
	//		
	//		int zeroTag = 0;
	//		for (int i = 0; i < nums.length; i++) {
	//			if (nums[i] >= 0) {
	//				zeroTag = i;
	//				break;
	//			}
	//		}
	//		
	//		
	//		for (int i = 0; i < nums.length-2; i++) {
	//			if (nums[i]+nums[i+1] > 0) {
	//				return ret;
	//			}
	//			for (int j = i+1; j < nums.length-1; j++) {
	//				int sumTwo = nums[i] + nums[j];
	//				
	//				
	//				if(sumTwo + nums[j+1] > 0){
	//					break;
	//				}
	//				
	//				if (-sumTwo > nums[nums.length-1]) {
	//					continue;
	//				}
	//				for (int k = j+1 > zeroTag ? j+1 : zeroTag; k < nums.length; k++) {
	//					if (sumTwo == -nums[k]) {
	//						List<Integer> list = new ArrayList<Integer>();
	//						list.add(nums[i]);
	//						list.add(nums[j]);
	//						list.add(nums[k]);
	//						if (!ret.contains(list)) {
	//							ret.add(list);
	//						}
	//						break;
	//					}
	//					if (-sumTwo<nums[k]) {
	//						break;
	//					}
	//				}
	//				
	//			}
	//		}
	//		return ret;
	//	}

	List<List<Integer>> ret = new ArrayList<List<Integer>>();
	int [] nums;
    public List<List<Integer>> threeSum(int[] nums) {
        this.nums = nums;
			Arrays.sort(nums);
			if((nums.length < 3) || (nums[0] > 0) || (nums[nums.length-1] < 0)){
				return ret;
			}
			
			
			int lastNum = nums[0];
			
			for (int i = 0; i < nums.length-2; i++) {
				if (nums[i] > 0) {
					break;
				}
				if (i == 0){
				    twoSum(i+1, nums.length-1,0-nums[i]);
				    continue;
				}
				if(nums[i] != lastNum){
				     twoSum(i+1, nums.length-1,0-nums[i]);
				    lastNum = nums[i];
				}
			}
			return ret;
    }
    	 private void twoSum(int startIndex, int endIndex, int target) {
		 while(startIndex < endIndex){
			 int twoSum = nums[startIndex] + nums[endIndex]; 
			 if (twoSum == target) {
				 List<Integer> list = new ArrayList<Integer>();
				 list.add(0-target);
				 list.add(nums[startIndex]);
				 list.add(nums[endIndex]);
				 ret.add(list);
			while ((startIndex < endIndex) && (nums[startIndex] == nums[startIndex+1])) {
					startIndex++;
				}
				while ((startIndex < endIndex) && (nums[endIndex] == nums[endIndex-1])) {
					endIndex--;
				}
				 
				 startIndex++;
				 endIndex--;
			 }else if (twoSum > target) {
				endIndex--;
			}else if (twoSum < target) {
				startIndex++;
			}
			 
		 }
	 }
}
