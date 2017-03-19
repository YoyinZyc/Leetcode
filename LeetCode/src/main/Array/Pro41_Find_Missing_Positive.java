package main.Array;

import java.util.Arrays;

/**
 * @author Cactus
 * @category Array-Hard
 * @version Create at: 2017年3月19日 下午5:20:49
 * 
 */
public class Pro41_Find_Missing_Positive {
	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int missingNum = 1;
		
		int i = 0;
		for (; i < nums.length; i++) {
			if(nums[i] > 0) break;
		}
		
		for (; i < nums.length; i++) {
			if (nums[i] != missingNum) {
				return missingNum;
			}else{
				while(i+1 < nums.length){
					if (nums[i+1] == nums[i]) {
						i++;
					}else{
						break;
					}
				}
			}
			missingNum++;
		}
		return missingNum;
	}
}
