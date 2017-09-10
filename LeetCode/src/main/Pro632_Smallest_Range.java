package main;

import java.util.List;

/**
 * @author Cactus
 * @category TwoPoints_Hard
 * @version Create at: 2017年9月10日 下午2:43:06
 * 
 */
public class Pro632_Smallest_Range {
	public int[] smallestRange(List<List<Integer>> nums) {
		int []index = new int[nums.size()];
		int []lengths = new int[nums.size()];
		int range = Integer.MAX_VALUE;
		int[] ret = new int[2];
		for (int i = 0; i < nums.size(); i++) {
			lengths[i] = nums.get(i).size();
		}
		while(true) {
			int []rangeValue = findRange(index, nums);
			int min = rangeValue[0];
			int max = rangeValue[1];
			if(max-min < range){
				range = max-min;
				ret[0] = min;
				ret[1] = max;

			}
			for (int i = 0; i < index.length; i++) {
				if(nums.get(i).get(index[i]) == min){
					index[i] += 1;
					if (index[i]>=lengths[i]) {
						return ret;
					}
				}
			}

		}
		//		return ret;

	}

	private int[] findRange(int[] index, List<List<Integer>> nums) {
		int min = nums.get(0).get(index[0]);
		int max = nums.get(0).get(index[0]);
		for (int i = 1; i < index.length; i++) {
			min = Math.min(min, nums.get(i).get(index[i]));
			max = Math.max(max, nums.get(i).get(index[i]));
		}
		return new int[]{min,max};
	}
	//	
	//	private int findMax(int[] index, List<List<Integer>> nums) {
	//		int max = Integer.MIN_VALUE;
	//		for (int i = 0; i < index.length; i++) {
	//			max = Math.max(max, nums.get(i).get(index[i]));
	//		}
	//		return max;
	//	}
}

