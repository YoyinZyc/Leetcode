package main;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * @author Cactus
 * @category HashTable-Medium unsolved
 * @version Create at: 2017年3月21日 下午8:08:15
 * 
 */
public class Pro525_Contiguous_Array {
	
	public int findMaxLength(int[] nums) {
		int a = 0;
		System.out.println(nums.length);
		for(int i = 0; i < nums.length;i++) {
			a+=nums[i] == 1?1:-1;
		}
		if(a == 0) return nums.length;
		if(Math.abs(a) == nums.length) return 0;
		
		int leftIndex = 0;
		int rightIndex = nums.length-1;
		while(leftIndex < rightIndex) {
			if(a == 0) {
				System.out.println("Right:"+rightIndex+" "+"Left:"+leftIndex);
				return rightIndex-leftIndex+1;
			}
			if(a < 0){
				if ((nums[leftIndex] == 0) && (nums[rightIndex] == 0)) {
					
				}
				else if(nums[leftIndex] == 0) {
					leftIndex++;
					a++;
				}else if (nums[rightIndex] == 0) {
					rightIndex--;
					a++;
				}else{
//					int tempLeft = leftIndex;
//					int countLeft = 0;
//					int tempRight = rightIndex;
//					int countRight = 0;
//					while(nums[tempLeft++] == 1) countLeft++;
//					while(nums[tempRight--] == 1) countRight++;
//					if(countLeft > countRight){
//						rightIndex = tempRight+1;
//						a-=countRight;
//					}else if(countLeft < countRight){
//						leftIndex = tempLeft-1;
//						a-=countLeft;
//					}else{
						int cutRight = findMaxLength(Arrays.copyOfRange(nums, leftIndex, rightIndex));
						int cutLeft = findMaxLength(Arrays.copyOfRange(nums, leftIndex+1, rightIndex+1));
						if (cutRight>cutLeft) {
							return cutRight;
						}else {
							return cutLeft;
						}
						
//					}
				}
			}else{
				if(nums[leftIndex] == 1){
					leftIndex++;
					a--;
				}else if (nums[rightIndex] == 1) {
					rightIndex--;
					a--;
				}else{
					int tempLeft = leftIndex;
					int countLeft = 0;
					int tempRight = rightIndex;
					int countRight = 0;
					while(nums[tempLeft++] == 0) countLeft++;
					while(nums[tempRight--] == 0) countRight++;
//					if(countLeft > countRight){
//						rightIndex = tempRight+1;
//						a+=countRight;
//					}else if(countLeft<countRight){
//						leftIndex = tempLeft-1;
//						a+=countLeft;
//					}else{
						int cutRight = findMaxLength(Arrays.copyOfRange(nums, leftIndex, tempRight+1));
						int cutLeft = findMaxLength(Arrays.copyOfRange(nums, tempLeft, rightIndex+1));
//						if (cutRight>cutLeft) {
//							return cutRight;
//						}else {
//							return cutLeft;
//						}
//						
//					}
//					int cutRight = findMaxLength(Arrays.copyOfRange(nums, leftIndex, rightIndex));
//					int cutLeft = findMaxLength(Arrays.copyOfRange(nums, leftIndex+1, rightIndex+1));
					if (cutRight>cutLeft) {
						return cutRight;
					}else {
						return cutLeft;
					}
				}
			}
		}
		return 0;
	}
}
